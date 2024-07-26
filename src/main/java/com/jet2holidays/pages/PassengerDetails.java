package com.jet2holidays.pages;

import com.jet2holidays.base.BasePage;
import io.appium.java_client.AppiumBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.concurrent.TimeUnit;

public class PassengerDetails extends BasePage {

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.view.View[3]/android.view.View[2]/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View/android.view.View")
    WebElement clickSelectPassengerDropdown;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[3]")
    WebElement clickMyName;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.Button")
    WebElement addPassengerContinueButton;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View")
    WebElement leadPassengerDropdown;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[2]")
    WebElement clickMyNamePassenger;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.Button")
    WebElement essentialContinueButton;

    public void setClickSelectPassengerDropdown(){
        clickSelectPassengerDropdown.click();
    }

    public void setClickMyName(){
        clickMyName.click();
    }

    public void setAddPassengerContinueButton(){
        addPassengerContinueButton.click();
    }

    public void setLeadPassengerDropdown(){
        leadPassengerDropdown.click();
    }

    public void setClickMyNamePassenger(){
        clickMyNamePassenger.click();
    }

    public void setEssentialContinueButton(){
        essentialContinueButton.click();
    }

    public void addPassengerDetails() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        setClickSelectPassengerDropdown();
        setClickMyName();
        driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Assisted travel\").instance(0))"));
//        driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Assisted travel\"));"));
        setLeadPassengerDropdown();
        setClickMyNamePassenger();
        driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Pay in 3 interest-free payments on purchases from £30-£2,000.Learn more\").instance(0))"));
//        driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Pay in 3 interest-free payments on purchases from £30-£2,000.Learn more\"));"));
        setAddPassengerContinueButton();
        Thread.sleep(5000);
        driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Pay in 3 interest-free payments on purchases from £30-£2,000.Learn more\").instance(0))"));
//        driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Pay in 3 interest-free payments on purchases from £30-£2,000.Learn more\"));"));
        setEssentialContinueButton();

    }
}
