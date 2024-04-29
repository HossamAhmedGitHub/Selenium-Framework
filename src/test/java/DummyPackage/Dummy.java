package DummyPackage;

import Utilities.BrowserUtils;
import Utilities.DriverUtils;
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
        WebDriver driver = DriverUtils.initializeDriver(DriverUtils.CHROME);
        BrowserUtils.openUrl(driver,url);
        DriverUtils.maximizeWindow(driver);
        WaitsUtils.waitUntilUrlMatches(driver,url,10L);
        BrowserUtils.navigateTo(driver,"https://pdfroom.com/category/comic-books");
        Assert.assertTrue(DriverUtils.isCurrentUrlMatches(driver,"https://pdfroom.com/category/comic-books"));
        DriverUtils.quitDriver(driver);
    }
}
