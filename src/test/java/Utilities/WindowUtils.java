package Utilities;

import org.openqa.selenium.WebDriver;

import java.util.Iterator;
import java.util.Set;

public class WindowUtils {
    public static String getCurrentWindowID(WebDriver driver){
        return driver.getWindowHandle();
    }//end method getCurrentWindowID

    //TODO get windows IDs opend in the session using the current driver
    public static Set<String> getWindowsIDs(WebDriver driver){
        return driver.getWindowHandles();
    }//end method getWindowsIDs

    public static void switchToWindow(WebDriver driver, String windowID){
        driver.switchTo().window(windowID);
    }//end method switchToWindow
    public static void closeCurrentWindow(WebDriver driver){
        driver.close();
    }//end method closeCurrentWindow
    public static void switchToParentWindow(WebDriver driver){
        Set<String> windowsIDs = getWindowsIDs(driver);
        Iterator<String> iterator = windowsIDs.iterator();
        switchToWindow(driver, iterator.next());
    }

}
