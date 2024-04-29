package Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.safari.SafariOptions;

public class PageLoadStrategy {
    public final static String Chrome = "chrome";
    public final static String Edge = "edge";
    public final static String Safari = "safari";

    //TODO WebDriver waits until the load event fire is returned.
    public static WebDriver setPageLoadStrategyNormal(String browserType) {
        switch (browserType){
            case Chrome:
                ChromeOptions chromeOptions = new ChromeOptions();
                chromeOptions.setPageLoadStrategy(org.openqa.selenium.PageLoadStrategy.NORMAL);
                return new ChromeDriver(chromeOptions);
            case Edge:
                EdgeOptions edgeOptions = new EdgeOptions();
                edgeOptions.setPageLoadStrategy(org.openqa.selenium.PageLoadStrategy.NORMAL);
                return new EdgeDriver(edgeOptions);
            case Safari:
                SafariOptions safariOptions = new SafariOptions();
                safariOptions.setPageLoadStrategy(org.openqa.selenium.PageLoadStrategy.NORMAL);
                return new SafariDriver(safariOptions);
            default:
                return null;
        }//end switch
    }//end method setPageLoadStrategyNormal

    //TODO WebDriver waits until DOMContentLoaded event fire is returned.
    public static WebDriver setPageLoadStrategyEager(String browserType) {
        switch (browserType){
            case Chrome:
                ChromeOptions chromeOptions = new ChromeOptions();
                chromeOptions.setPageLoadStrategy(org.openqa.selenium.PageLoadStrategy.EAGER);
                return new ChromeDriver(chromeOptions);
            case Edge:
                EdgeOptions edgeOptions = new EdgeOptions();
                edgeOptions.setPageLoadStrategy(org.openqa.selenium.PageLoadStrategy.EAGER);
                return new EdgeDriver(edgeOptions);
            case Safari:
                SafariOptions safariOptions = new SafariOptions();
                safariOptions.setPageLoadStrategy(org.openqa.selenium.PageLoadStrategy.EAGER);
                return new SafariDriver(safariOptions);
            default:
                return null;
        }//end switch
    }//end method setPageLoadStrategyEager
    //TODO WebDriver only waits until the initial page is downloaded.
    public static WebDriver setPageLoadStrategyNone(String browserType) {
        switch (browserType){
            case Chrome:
                ChromeOptions chromeOptions = new ChromeOptions();
                chromeOptions.setPageLoadStrategy(org.openqa.selenium.PageLoadStrategy.NONE);
                return new ChromeDriver(chromeOptions);
            case Edge:
                EdgeOptions edgeOptions = new EdgeOptions();
                edgeOptions.setPageLoadStrategy(org.openqa.selenium.PageLoadStrategy.NONE);
                return new EdgeDriver(edgeOptions);
            case Safari:
                SafariOptions safariOptions = new SafariOptions();
                safariOptions.setPageLoadStrategy(org.openqa.selenium.PageLoadStrategy.NONE);
                return new SafariDriver(safariOptions);
            default:
                return null;
        }//end switch
    }//end method setPageLoadStrategyNone

} //end class PageLoadStrategy
