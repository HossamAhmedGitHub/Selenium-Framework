package Utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;

public class Utility {
    public static boolean verifyElementVisibility(WebDriver driver, By Locator){
        Long duration = 0L;
        try {
            WaitsUtils.waitUntilElementVisible(driver,Locator,duration);
            return true;
        }catch (TimeoutException e){
            System.out.println("Time's out for the element to be visible");
            return false;
        }
    }//end method verifyElementVisible
}
