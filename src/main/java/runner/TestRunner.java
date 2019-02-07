package runner;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import static com.codeborne.selenide.WebDriverRunner.getWebDriver;
import static java.lang.System.getProperty;
import static java.util.concurrent.TimeUnit.SECONDS;
import static org.openqa.selenium.chrome.ChromeOptions.CAPABILITY;

public abstract class TestRunner {

    protected void setUpBrowser() {
        Configuration.timeout = 90 * 1000;
        Configuration.browser = getProperty("browser", "chrome");
        Configuration.browserSize = "1920x1080";
        Configuration.screenshots = false;
        Configuration.savePageSource = false;

        final ChromeOptions chromeOptions = new ChromeOptions()
                .addArguments("--disable-browser-side-navigation")
                .addArguments("--disable-gpu")
                .addArguments("--dns-prefetch-disable")
                .addArguments("--disable-impl-side-painting");

        final DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        Selenide.open("https://www.playbuzz.com");
        desiredCapabilities.setCapability(CAPABILITY, chromeOptions);
        Configuration.browserCapabilities = desiredCapabilities;

        getWebDriver()
                .manage()
                .timeouts()
                .pageLoadTimeout(120, SECONDS)
                .setScriptTimeout(120, SECONDS);
    }

    protected void closeWebDriver() {
        WebDriverRunner.closeWebDriver();
    }
}
