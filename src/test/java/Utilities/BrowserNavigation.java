package Utilities;

import org.openqa.selenium.WebDriver;

public class BrowserNavigation {
    public static void openUrl (WebDriver driver, String urlAddress){
        driver.get(urlAddress);
    }

    public static void navigateTo(WebDriver driver, String url){
        driver.navigate().to(url);
    }

    public static void navigateForward(WebDriver driver){
        driver.navigate().forward();
    }
    public static void navigateBackward(WebDriver driver){
        driver.navigate().back();
    }
    public static void refreshCurrentPage(WebDriver driver){
        driver.navigate().refresh();
    }

}
