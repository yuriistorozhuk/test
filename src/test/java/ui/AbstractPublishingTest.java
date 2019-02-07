package ui;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import runner.TestRunner;

public abstract class AbstractPublishingTest extends TestRunner {

    @BeforeMethod(alwaysRun = true)
    public void setUpBrowser() {
        super.setUpBrowser();
    }

    @AfterTest
    public void closeWebDriver() {
        super.closeWebDriver();
    }
}
