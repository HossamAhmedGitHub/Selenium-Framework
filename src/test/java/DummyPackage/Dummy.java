package DummyPackage;

import Utilities.BrowserNavigation;
import Utilities.Utils;
import Utilities.WaitsUtils;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.lang.String;

public class Dummy {

    private final String url = "https://pdfroom.com/";
    @Test
    public void TC() throws InterruptedException {
        WebDriver driver = Utils.initializeDriver(Utils.CHROME);
        BrowserNavigation.openUrl(driver,url);
        Utils.maximizeWindow(driver);
        WaitsUtils.waitUntilUrlMatches(driver,url,10L);
        BrowserNavigation.navigateTo(driver,"https://pdfroom.com/category/comic-books");
        Assert.assertTrue(Utils.isCurrentUrlMatches(driver,"https://pdfroom.com/category/comic-books"));
        Utils.quitDriver(driver);
    }
}
