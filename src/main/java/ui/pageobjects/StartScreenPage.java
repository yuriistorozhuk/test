package ui.pageobjects;

import static com.codeborne.selenide.Selenide.$x;

public class StartScreenPage {

    public FlipCardCreatingPage startCreatingFlipCard() {
        startCreatingFeature("Flip Card");

        return new FlipCardCreatingPage();
    }

    private void startCreatingFeature(String featureName) {
        $x(String.format("//span[contains(text(), '%s')]", featureName)).click();
    }
}
