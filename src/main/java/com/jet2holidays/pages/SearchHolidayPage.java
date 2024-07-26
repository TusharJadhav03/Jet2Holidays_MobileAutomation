package com.jet2holidays.pages;

import com.jet2holidays.base.BasePage;
import io.appium.java_client.AppiumBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchHolidayPage extends BasePage {

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.RelativeLayout[1]/android.widget.RelativeLayout")
    public WebElement departureAirport;

    @FindBy(xpath = "//android.view.ViewGroup[@content-desc=\"Unselected, Manchester(MAN), \"]/android.widget.CheckBox")
    public WebElement manchesterCheckbox;

    @FindBy(id = "com.jet2.holidays:id/btnDone")
    public WebElement departureDoneButton;

    @FindBy(id = "com.jet2.holidays:id/txtSearch")
    public WebElement destinationSearch;

    @FindBy(id = "com.jet2.holidays:id/checkboxAllRegion")
    public WebElement romeCheckbox;

    @FindBy(id = "com.jet2.holidays:id/btnDone")
    public WebElement destinationDoneButton;

    @FindBy(xpath = "//android.widget.TextView[@content-desc=\"Available,SATURDAY Third August 2024\"]")
    public WebElement departureDate;

    @FindBy(xpath = "//android.widget.LinearLayout[@content-desc=\"Unselected,15,nights\"]/android.widget.RadioButton")
    public WebElement duration;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.RelativeLayout[3]/android.widget.RelativeLayout")
    public WebElement guests;

    @FindBy(xpath = "//android.widget.ImageButton[@content-desc=\"Reduce number of adults\"]")
    public WebElement adultsMinus;

    @FindBy(id = "com.jet2.holidays:id/btnDone")
    public WebElement guestsDoneButton;

    @FindBy(id = "com.jet2.holidays:id/btnSearchPanel")
    public WebElement searchButton;

    @FindBy(xpath = "//android.widget.TextView[contains(@text,'Advanced Search')]")
    public WebElement advancedSearchClick;

    @FindBy(xpath = "//android.widget.TextView[contains(@text,'Price - low to high')]")
    public WebElement lowToHighPrice;

    @FindBy(xpath = "//android.widget.Button[contains(@text,'Done')]")
    public WebElement doneButton;

    public void setDoneButton(){
        doneButton.click();
    }

    public void setLowToHighPrice(){
        driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Price - low to high\").instance(0))"));
        lowToHighPrice.click();
    }

    public void setAdvancedSearchClick(){
        advancedSearchClick.click();
    }

    public void setDepartureAirport(){
        departureAirport.click();
    }

    public void setManchesterCheckbox(){
        manchesterCheckbox.click();
    }

    public void setDepartureDoneButton(){
        departureDoneButton.click();
    }

    public void setDestinationSearch(){
        destinationSearch.sendKeys("Rome");
    }

    public void setRomeCheckbox(){
        romeCheckbox.click();
    }

    public void setDestinationDoneButton(){
        destinationDoneButton.click();
    }

    public void setDepartureDate(){
        departureDate.click();
    }

    public void setDuration(){
        duration.click();
    }

    public void setGuests(){
        guests.click();
    }

    public void setAdultsMinus(){
        adultsMinus.click();
    }

    public void setGuestsDoneButton(){
        guestsDoneButton.click();
    }

    public void setSearchButton(){
        searchButton.click();
    }

    public void SearchHolidays() throws InterruptedException {
        setDepartureAirport();
        Thread.sleep(2000);
        setManchesterCheckbox();
        setDepartureDoneButton();
        setDestinationSearch();
        setRomeCheckbox();
        setDestinationDoneButton();
        setDepartureDate();
        setDuration();
        setGuests();
        setAdultsMinus();
        setGuestsDoneButton();
        setSearchButton();
    }

    public void SearchLowPriceHolidays() throws InterruptedException {
        setDepartureAirport();
        Thread.sleep(2000);
        setManchesterCheckbox();
        setDepartureDoneButton();
        setDestinationSearch();
        setRomeCheckbox();
        setDestinationDoneButton();
        setDepartureDate();
        setDuration();
        setGuests();
        setAdultsMinus();
        setGuestsDoneButton();
        setAdvancedSearchClick();
        setLowToHighPrice();
        setDoneButton();
        setSearchButton();
    }

}
