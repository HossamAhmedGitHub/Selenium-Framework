package Utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WaitsUtils {
    public static void implicitWait(WebDriver driver, Long duration){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(duration));
    }

    //TODO Wait till the element is present on the DOM of the page.
    public static void waitUntilElementPresent(WebDriver driver, By locator, Long duration){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(duration));
        wait.until(ExpectedConditions.presenceOfElementLocated(locator));
    }

    //TODO Wait till the element is present on the DOM of a page plus being visible.
    public static void waitUntilElementVisible(WebDriver driver, By locator, Long duration){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(duration));
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    public static void waitUntilAlertPresent(WebDriver driver, Long duration){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(duration));
        wait.until(ExpectedConditions.alertIsPresent());
    }

    //TODO Wait till the element is visible and enabled such that you can click it
    public static void waitUntilElementClickable(WebDriver driver, By locator, Long duration){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(duration));
        wait.until(ExpectedConditions.elementToBeClickable(locator));
    }
    //TODO explicit wait for the URL of the current page to be a specific url.
    public static void waitUntilUrlToBe(WebDriver driver, String  url, Long duration){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(duration));
        wait.until(ExpectedConditions.urlToBe(url));
    }
    public static void waitUntilTitleContains(WebDriver driver, String  url, Long duration){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(duration));
        wait.until(ExpectedConditions.urlContains(url));
    }

    //TODO wait till the given text is present in the element that matches the given locator.
    public static void waitUntilTextInElementPresent(WebDriver driver, By locator, String  text, Long duration){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(duration));
        wait.until(ExpectedConditions.textToBePresentInElementLocated(locator, text));
    }

} //end class WaitsUtils
