package com.komi.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;


public class Driver {

    //create a driver instance
    private static WebDriver driver;
    private static final int timeout = 3;
    private static String mainWindowHandle;

    //What?=>It is just to create, initialize the driver instance.(Singleton driver)
    //Why?=>We don't want to create and initialize the driver when we don't need
    //We will create and initialize the driver when it is null
    //We can use Driver class with different browser(chrome,firefox,headless)
    private Driver() {
        //we don't want to create another object. Singleton pattern
    }

    public static WebDriver getDriver() {
        if (driver == null) {
//            String browser = ConfigurationReader.getProperty("browser");
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
            driver.manage().window().maximize();
            mainWindowHandle = driver.getWindowHandle();
        }
        return driver;
    }

    public static void closeDriver() {
        if (driver != null) {// if the driver is pointing chrome
            driver.quit();// quit the driver
            driver = null;// set it back to null to make sure driver is null
            // so I can initialize it again
            // This is important especially you do cross browser testing(testing with
            // multiple browser like chrome, firefox, ie etc.)
        }
    }

    public static void openApp() {
        getDriver().get(ConfigurationReader.getProperty("env_test"));
    }

    // MISC

    public static void acceptCookies() {
        getDriver().findElement(By.cssSelector(".accept-cookies-button")).click();
    }

    public static void scrollToTheBottom() {
        jsExecutor().executeScript("window.scrollTo({top:document.body.scrollHeight, behavior: 'smooth'})");
    }

    public static void scrollToElement(WebElement element) {
        jsExecutor().executeScript("arguments[0].scrollIntoView(true);", element);
        waitFor(1);
    }

    // WAIT

    public static void waitFor(int seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void waitAndClick(WebElement element, int timeout) {
        for (int i = 0; i < timeout; i++) {
            try {
                element.click();
                return;
            } catch (WebDriverException e) {
                waitFor(1);
            }
        }
    }

    public static void waitAndSendText(WebElement element, String text) {
        for (int i = 0; i < timeout; i++) {
            try {
                element.sendKeys(text);
                return;
            } catch (WebDriverException e) {
                waitFor(1);
            }
        }
    }

    public static WebElement waitForVisibility(WebElement element, int timeToWaitInSec) {
        WebDriverWait wait = new WebDriverWait(driver, timeToWaitInSec);
        return wait.until(ExpectedConditions.visibilityOf(element));
    }

    // TABS

    public static void switchToTheNewTab() {
        waitFor(1);
        String newHandle = driver.getWindowHandles().stream().filter(s -> !s.equals(mainWindowHandle)).findFirst().orElseThrow();
        driver.switchTo().window(newHandle);
    }

    public static void returnBackToMainTab() {
        driver.close();
        driver.switchTo().window(driver.getWindowHandles().stream().findFirst().orElseThrow());
    }

    // JS

    public static JavascriptExecutor jsExecutor() {
        return (JavascriptExecutor) Driver.getDriver();
    }
}