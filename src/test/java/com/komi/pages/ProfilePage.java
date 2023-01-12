package com.komi.pages;

import com.komi.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ProfilePage {

    public ProfilePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "(//*[.='Subscribe'])[2]")
    public WebElement subscribeSection;

    @FindBy(xpath = "//*[.='Sign up for my newsletter']")
    public WebElement signUpBtn;

    @FindBy(css = "#INPUT")
    public WebElement nameBox;

    @FindBy(css = "#EMAIL_ADDRESS")
    public WebElement emailBox;

    @FindBy(css = ".ant-form-item:nth-child(1) [role=\"alert\"]")
    public WebElement nameErrorMsg;

    @FindBy(css = ".ant-form-item:nth-child(2) [role=\"alert\"]")
    public WebElement emailErrorMsg;

    @FindBy(xpath = "//*[.='Submit']")
    public WebElement submitButton;

    @FindBy(xpath = "//*[text()='The form was submitted successfully. Thank you!']")
    public WebElement successMsg;

    @FindBy(css = ".image-skeleton__image.thumb")
    public List<WebElement> thumbnails;

    //parent child css
    @FindBy(css = ".youtube-player button")
    public WebElement youtubePlayBtn;

    @FindBy(css = ".ant-col.text__align--center.flex--1 button")
    public WebElement singleMoreBtn;

    @FindBy(css = "div[data-testid='music-item'] button")
    public List<WebElement> singleMusicMoreOptions;

    @FindBy(css = "[id=\"0a4b6f76-79a3-4f01-8505-2671d340d17a\"] .music-card")
    public List<WebElement> musicModule_musicCard;

    private static String SECTION_BUTTON = "//*[contains(@class, 'talent-detail-tab_swiper')]//button/span[text()='%s']";
    private static String SECTION_TITLE = "//*[contains(@class, 'my-swiper__title') and text()='%s']";

    public static WebElement findSectionButton(String title) {
        Driver.waitFor(1);
        return Driver.getDriver().findElement(By.xpath(String.format(SECTION_BUTTON, title)));
    }

    public static WebElement findModuleTitle(String title) {
        if (title.equals("Pre-Save Music")) title += " ";
        Driver.waitFor(1);
        return Driver.getDriver().findElement(By.xpath(String.format(SECTION_TITLE, title)));
    }

    public static WebElement findModuleParent(String title) {
        WebElement element = findModuleTitle(title);
        return (WebElement) Driver.jsExecutor().executeScript("return arguments[0].parentNode.parentNode.parentNode;", element);
    }

    public static WebElement findModuleSwiperButtons(String moduleTitle, String button) {
        switch (button.toLowerCase()) {
            case "right":
                return findModuleParent(moduleTitle).findElement(By.cssSelector(".btn-swiper__wrapper button:nth-child(2)"));
            case "left":
                return findModuleParent(moduleTitle).findElement(By.cssSelector(".btn-swiper__wrapper button:nth-child(1)"));
            default:
                throw new RuntimeException();
        }
    }
}