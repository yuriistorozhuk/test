package ui.pageobjects;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.switchTo;

public class PreviewPage extends HomePage{

    public String getTitle() {
        switchTo().frame($(".preview-iframe"));
        return $x("//h3[@class = 'text-viewer-component in-view']").getText();
    }

    public String getTextContent(int cardNumber) {
        return $x(String.format("(//div[contains(@class , 'text-container')])[%d]", cardNumber)).getText();
    }

    public boolean isFlipped(int cardNumber) {
        return $x(String.format("(//div[contains(@class , 'in-view flipped')])[%d]", cardNumber)).isDisplayed();
    }

    public PreviewPage flip(int cardNumber) {
        $x(String.format("(//button[contains(@class , 'pb-flip-card-content')])[%d]", cardNumber)).click();

        return this;
    }

    public FlipCardCreatingPage closePreview() {
        switchTo().defaultContent();
        $(".close-preview").click();

        return new FlipCardCreatingPage();
    }
}
