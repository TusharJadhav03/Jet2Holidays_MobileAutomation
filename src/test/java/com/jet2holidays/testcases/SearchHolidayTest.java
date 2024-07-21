package com.jet2holidays.testcases;

import com.jet2holidays.pages.HomePage;
import com.jet2holidays.pages.LoginPage;
import com.jet2holidays.pages.SearchHolidayPage;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;

public class SearchHolidayTest extends SearchHolidayPage {
    LoginPage loginPage;
    HomePage homePage;
    SearchHolidayPage searchHolidayPage;

    @BeforeMethod
    public void setUp() throws IOException {
        initialization();
        loginPage = new LoginPage();
        homePage = new HomePage();
        searchHolidayPage = new SearchHolidayPage();
    }


    @Test
    public void SearchHolidays() throws InterruptedException {
        loginPage.loginUser();
        homePage.homePageAction();
        searchHolidayPage.SearchHolidays();
    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(2000);
    }
}
