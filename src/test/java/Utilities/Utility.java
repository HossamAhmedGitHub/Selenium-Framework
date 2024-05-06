package Utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Utility {
    public static boolean verifyElementVisibility(WebDriver driver, By Locator, long duration){
        try {
            WaitsUtils.waitUntilElementVisible(driver,Locator,duration);
            return true;
        }catch (TimeoutException e){
            System.out.println("Time's out for the element to be visible");
            return false;
        }
    }//end method verifyElementVisible
    
    public static String getElementText(WebDriver driver, By locator){
        return driver.findElement(locator).getText();
    }//end method getElementString()

    public static WebElement findElement(WebDriver driver, By locator){
            return driver.findElement(locator);
    }

}
