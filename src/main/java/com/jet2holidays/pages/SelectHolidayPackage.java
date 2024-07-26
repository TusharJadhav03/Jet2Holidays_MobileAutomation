package com.jet2holidays.pages;

import com.jet2holidays.base.BasePage;
import io.appium.java_client.AppiumBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.jet2holidays.utilities.Utilities;

import java.util.concurrent.TimeUnit;


public class SelectHolidayPackage extends BasePage {

    Utilities utilities;

    @FindBy(xpath = "//android.view.View[@content-desc=\"Hotel Morgana\"]/android.widget.TextView")
    WebElement clickHolidayPackage;

    @FindBy(xpath = "//android.view.View[@content-desc=\"Apply discount\"]")
    WebElement applyDiscountButton;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View[1]/android.view.View[3]/android.widget.Button")
    WebElement HotelContinueButton;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.Button")
    WebElement HolidayPackageContinueButton;

    @FindBy(xpath = "//android.widget.ImageView[@content-desc=\"Close\"]")
    public WebElement closeSignInPopup;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.Button")
    public  WebElement tailorContinueButton;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View[2]/android.view.View[4]/android.view.View/android.view.View")
    public WebElement selectLowPriceHolidays;

    public void setSelectLowPriceHolidays(){
        selectLowPriceHolidays.click();
    }

    public void setCloseSignInPopup(){
        closeSignInPopup.click();
    }


    public void setMoreInfoButton(){
        driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Hotel Morgana\"));"));
        clickHolidayPackage.click();
//        driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Hotel Morgana\").instance(0))"));
    }

    public void setApplyDiscountButton(){
        applyDiscountButton.click();
    }


    public void setRomeLifeHotelContinueButton(){
        HotelContinueButton.click();
    }

    public void setHolidayPackageContinueButton(){
//        driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Additional holiday / flight supplement may apply\"));"));
        driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Additional holiday / flight supplement may apply\").instance(0))"));
        HolidayPackageContinueButton.click();
    }

    public void setTailorContinueButton(){
//        driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Additional holiday / flight supplement may apply\"));"));
        driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Additional holiday / flight supplement may apply\").instance(0))"));
        tailorContinueButton.click();
    }

    public void SelectHolidaysFromList() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        setCloseSignInPopup();
        Thread.sleep(7000);
        setMoreInfoButton();
        setApplyDiscountButton();
        setRomeLifeHotelContinueButton();
        Thread.sleep(5000);
        setHolidayPackageContinueButton();
        Thread.sleep(5000);
        setTailorContinueButton();
    }

    public void SelectLowPriceHolidaysFromList() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        setCloseSignInPopup();
        Thread.sleep(7000);
        setSelectLowPriceHolidays();
        setApplyDiscountButton();
        setRomeLifeHotelContinueButton();
        Thread.sleep(5000);
        setHolidayPackageContinueButton();
        Thread.sleep(5000);
        setTailorContinueButton();
    }

}
