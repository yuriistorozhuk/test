package ui.pageobjects;

import static com.codeborne.selenide.Selenide.$x;

public class HomePage {

    public LoginPage openLoginPage() {
        $x("//button[text() = 'LOG IN']").click();

        return new LoginPage();
    }

    public ItemsPage openItemsPage() {
        $x("//div[@class = 'channel']").click();

        return new ItemsPage();
    }
}
