package Utilities;

import org.openqa.selenium.WebDriver;

import java.security.PublicKey;

public class AlertUtils {
    //TODO alert ok
    public static void acceptAlert(WebDriver driver){
        driver.switchTo().alert().accept();
    }
    public static void getAlertText(WebDriver driver){
        driver.switchTo().alert().getText();
    }
    public static void sendTextToAlert(WebDriver driver, String text){
        driver.switchTo().alert().sendKeys(text);
    }
    public static void dismissAlert(WebDriver driver){
        driver.switchTo().alert().dismiss();
    }

}//end class AlertUtils
