package ui.pageobjects;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class LoginPage {

    public StartScreenPage logIn(String email, String password) {
        $(By.id("elogin_email_field")).setValue(email);
        $(By.id("elogin_pass_field")).setValue(password);
        $(By.id("submitLogin")).click();

        return new StartScreenPage();
    }

    public StartScreenPage logIn() {
        return logIn("valid@email.com", "testplaybuzz");
    }
}
