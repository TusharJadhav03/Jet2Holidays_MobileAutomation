package com.jet2holidays.testcases;

import com.jet2holidays.base.BasePage;
import com.jet2holidays.pages.*;
import com.jet2holidays.utilities.Utilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class Tests extends BasePage {

    LoginPage loginPage;
    HomePage homePage;
    SearchHolidayPage searchHolidayPage;
    SelectHolidayPackage selectHolidayPackage;
    Utilities utilities;
    PassengerDetails passengerDetails;
    PaymentPage paymentPage;

    @BeforeMethod
    public void setUp() throws IOException {
        initialization();
        loginPage = new LoginPage();
        homePage = new HomePage();
        searchHolidayPage = new SearchHolidayPage();
        selectHolidayPackage = new SelectHolidayPackage();
        passengerDetails = new PassengerDetailsTest();
        utilities = new Utilities();
        paymentPage = new PaymentPage();
    }

    @Test
    public void BookHolidayPackageWithUserAccount() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        loginPage.loginUser();
        homePage.homePageAction();
        searchHolidayPage.SearchHolidays();
        selectHolidayPackage.SelectHolidaysFromList();
        passengerDetails.addPassengerDetails();
        paymentPage.makePayment();
    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(2000);
    }

}
