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

    //TODO Wait till Expectation for the current URL to match a specific regular expression
    public static void waitUntilUrlMatches(WebDriver driver, String  regex, Long duration){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(duration));
        wait.until(ExpectedConditions.urlMatches(regex));
    }

    public static void waitUntilUrlToBe(WebDriver driver, String  url, Long duration){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(duration));
        wait.until(ExpectedConditions.urlToBe(url));
    }
    public static void waitUntilTitleContains(WebDriver driver, String  url, Long duration){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(duration));
        wait.until(ExpectedConditions.urlContains(url));
    }




} //end class WaitsUtils
