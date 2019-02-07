package utils;

import com.codeborne.selenide.Selenide;

import java.util.ArrayList;
import java.util.List;

import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

public class WindowHelper {

    /**
     * @return Actual titles
     */
    public List<String> getAllTitles() {
        final List<String> titles = new ArrayList<>();

        getWebDriver().getWindowHandles().forEach(window
                -> titles.add(Selenide
                .switchTo()
                .window(window)
                .getTitle()));

        Selenide.switchTo().defaultContent();

        return titles;
    }
}
