package Utilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
public class DriverUtils {
    public final static String CHROME = "chrome";
    public final static String FIREFOX = "firefox";
    public final static String EDGE = "edge";
    public final static String SAFARI = "safari";

    public static WebDriver initializeDriver(String browser){
        if(browser == CHROME)
            return new ChromeDriver();
        else if (browser == EDGE)
            return new EdgeDriver();
        else if(browser == SAFARI)
            return new SafariDriver();
        else if(browser == FIREFOX) return new FirefoxDriver();
        else return null;
    }
    public static void quitDriver(WebDriver driver){
        driver.quit();
    }
    public static void maximizeWindow(WebDriver driver){
        driver.manage().window().maximize();
    }
}
