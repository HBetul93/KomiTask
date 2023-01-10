package com.komi.pages;

import com.komi.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ProfilePage {

    public ProfilePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(css = ".image-skeleton__image.thumb")
    public List<WebElement> thumbnails;

    @FindBy(css = "ant-typography text text--regular20 opacity--08")
    public List<WebElement> sectionNames;

    @FindBy(xpath = "(//*[.='Single Music'])[2]")
    public WebElement singleMusicSection;

    @FindBy(xpath = "(//*[.='Single Music'])[4]")
    public WebElement SingleMusicTitle;

    @FindBy(xpath = "(//*[.='Music Tracks'])[2]")
    public WebElement musicTracksSection;

    @FindBy(xpath = "(//*[.='Music Tracks'])[4]")
    public WebElement musicTracksTitle;

    @FindBy(xpath = "(//*[.='Pre-Save Music'])[2]")
    public WebElement preSaveSection;

    @FindBy(xpath = "//*[.='Pre-Save Music ']")
    public WebElement preSaveTitle;

    @FindBy(xpath = "(//*[.='Subscribe'])[2]")
    public WebElement subscribeSection;

    @FindBy(xpath = "(//*[.='Subscribe'])[4]")
    public WebElement subscribeTitle;

    @FindBy(xpath = "(//*[.='Latest Singles'])[2]")
    public WebElement latestSingleSection;

    @FindBy(xpath = "(//*[.='Latest Singles'])[4]")
    public WebElement latestSingleTitle;

    @FindBy(xpath = "(//*[.='New Video'])[2]")
    public WebElement newVideoSection;

    @FindBy(xpath = "(//*[.='New Video'])[4]")
    public WebElement newVideoTitle;


    @FindBy(xpath = "//*[contains(@class,'my-swiper__title')]")
    public List<WebElement> sectionTitles;

    @FindBy(xpath = "//div[contains(@class, \"talent-detail__music\")][2]//*[contains(@class, \"btn-play-full\")] ")
    public List<WebElement> musicTrackPlayBtns;

    @FindBy(xpath = "(//div[contains(@class, 'ant-modal')]//button[@aria-label='spotify-pre-release-button']")
    public WebElement modalPreSaveButton;

    //parent child css
    @FindBy(css = "(.youtube-player button")
    public WebElement youTubePlayBtn;

    @FindBy(css = ".ant-col.text__align--center.flex--1 button")
    public WebElement singleMoreBtn;

    @FindBy(css = "div[data-testid='music-item']:nth-child(1)")
    public WebElement spotifyButton;

    @FindBy(css = "div[data-testid='music-item']")
    public List<WebElement> singleMusicMoreOptions;

    @FindBy(xpath = "//*[.='Sign up for my newsletter']")
    public WebElement signUpBtn;

    @FindBy(css = "#INPUT")
    public WebElement nameBox;

    @FindBy(css = "#EMAIL_ADDRESS")
    public WebElement emailBox;

    @FindBy(xpath = "//*[.='Submit']")
    public WebElement submitButton;

    //public By noPracticeNote(){return By.xpath("//*[contains(@class,'css-ttjgc1')]");}
}
