package ui.pageobjects;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;
import utils.Waiter;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class FlipCardCreatingPage extends HomePage {

    public FlipCardCreatingPage setFrontSide(int cardNumber) {
        setSide("FRONT", cardNumber);

        return this;
    }

    public FlipCardCreatingPage setBackSide(int cardNumber) {
        setSide("BACK", cardNumber);

        return this;
    }

    public FlipCardCreatingPage addMedia(int cardNumber, boolean isFrontSide) {
        addData(cardNumber, isFrontSide);

        return this;
    }

    public FlipCardCreatingPage addText(int cardNumber, boolean isFrontSide) {
        addData(cardNumber, !isFrontSide);

        return this;
    }

    private FlipCardCreatingPage addData(int cardNumber, boolean isRevertedButtonsOrder) {
        Waiter.waitForJQueryExecution();
        $x(String.format("(//div[@class = 'media-provider'])[%d]//button[%d]", cardNumber, isRevertedButtonsOrder ? 2 : 1)).doubleClick();

        return this;
    }

    public FlipCardCreatingPage pasteLink(String url) {
        $x("//input[@placeholder = 'Search or paste a link...']").setValue(url);

        return this;
    }

    public FlipCardCreatingPage setTextContent(String textContent) {
        $(By.id("text-editor")).setValue(textContent);

        return this;
    }

    public FlipCardCreatingPage setTitle(String title) {
        $x("(//div[@class = 'ql-editor ql-blank'])").setValue(title);

        return this;
    }

    public FlipCardCreatingPage setHeader(String storyTitle, String storyDescription) {
        $x("//button[contains(@class, 'story-add-header')]").click();
        $x("//input[contains(@class, 'story-title')]").setValue(storyTitle);
        $x("//textarea[contains(@class, 'story-description')]").setValue(storyDescription);

        return this;
    }

    public FlipCardCreatingPage publish() {
        clickPrimaryButton("Publish");
        $x("//button[@class = 'close-btn']")
                .shouldBe(Condition.enabled)
                .doubleClick();

        return this;
    }

    public PreviewPage preview() {
        clickPrimaryButton("Preview");

        return new PreviewPage();
    }

    private void setSide(String cardSide, int cardNumber) {
        $x(String.format("(//div[@class = 'caption pull-left' and text() = '%s'])[%d]", cardSide, cardNumber)).click();
    }

    private void clickPrimaryButton(String buttonName) {
        $x(String.format("//span[text() = '%s']/parent::button", buttonName)).click();
    }
}
