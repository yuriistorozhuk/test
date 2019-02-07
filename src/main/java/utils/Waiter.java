package utils;

import com.codeborne.selenide.Selenide;

public class Waiter {

    public static void waitForJQueryExecution() {
        for (int attempts = 5; attempts >= 0; attempts--) {
            Selenide.sleep(1000);
            if (Selenide.executeJavaScript("return jQuery.active==0")) {
                return;
            }
        }
    }
}
