package Utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FrameUtils {
    public static void switchToFrame(WebDriver driver, By frameLocator){
        WebElement iframe = driver.findElement(frameLocator);
        driver.switchTo().frame(iframe);
    }
    public static void switchToFrame(WebDriver driver, String nameOrID){
        driver.switchTo().frame(nameOrID);
    }
    //TODO  Return one step back to parent frame
    public static void leaveCurrentFrame(WebDriver driver) throws Exception {
        driver.switchTo().parentFrame();
    }
    //TODO  Return to the top level
    public static void leaveAllFrames(WebDriver driver) throws Exception {
        driver.switchTo().defaultContent();
    }

} // end class FrameUtils
