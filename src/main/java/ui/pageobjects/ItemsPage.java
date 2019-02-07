package ui.pageobjects;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class ItemsPage {

    public ItemsPage openItem(String storyTitle) {
        $x(String.format("//div[text() = '%s']/parent::div/parent::a", storyTitle)).click();

        return this;
    }

    public ItemsPage shareToFacebook(){
        $(".pb-share-button.facebook").click();

        return this;
    }
}
