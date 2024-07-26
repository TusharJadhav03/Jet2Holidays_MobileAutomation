package com.jet2holidays.pages;

import com.jet2holidays.base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/androidx.appcompat.widget.LinearLayoutCompat[1]/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[1]/androidx.appcompat.widget.LinearLayoutCompat")
    public WebElement holidays;

    @FindBy(id = "com.jet2.holidays:id/ivMenu")
    public WebElement menuButton;


    public void setHolidays(){
        holidays.click();
    }

    public void setMenuButton(){
        menuButton.click();
    }



    public void homePageAction() throws InterruptedException {
        Thread.sleep(2000);

        setMenuButton();
        setHolidays();
    }
}
