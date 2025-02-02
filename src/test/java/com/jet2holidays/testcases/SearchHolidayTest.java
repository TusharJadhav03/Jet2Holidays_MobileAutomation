package com.jet2holidays.testcases;

import com.jet2holidays.pages.HomePage;
import com.jet2holidays.pages.LoginPage;
import com.jet2holidays.pages.SearchHolidayPage;
import com.jet2holidays.utilities.Utilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.concurrent.TimeUnit;


public class SearchHolidayTest extends SearchHolidayPage {
    LoginPage loginPage;
    HomePage homePage;
    SearchHolidayPage searchHolidayPage;
    Utilities utilities = new Utilities();

    @BeforeMethod
    public void setUp() throws IOException {
        initialization();
        loginPage = new LoginPage();
        homePage = new HomePage();
        searchHolidayPage = new SearchHolidayPage();
    }


    @Test
    public void SearchHolidays() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        loginPage.loginUser();
        Thread.sleep(10000);
        utilities.scrollUp();
        Thread.sleep(5000);
        homePage.homePageAction();
        searchHolidayPage.SearchHolidays();
    }

    @Test
    public void SearchLowPriceHolidays() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        loginPage.loginUser();
        Thread.sleep(10000);
        utilities.scrollUp();
        Thread.sleep(5000);
        homePage.homePageAction();
        searchHolidayPage.SearchLowPriceHolidays();
    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(2000);
    }
}
