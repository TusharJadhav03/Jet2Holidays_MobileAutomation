package com.jet2holidays.testcases;

import com.jet2holidays.pages.HomePage;
import com.jet2holidays.pages.LoginPage;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;

public class HomeTest extends HomePage {
    LoginPage loginPage;
    HomePage homePage;

    @BeforeMethod
    public void setUp() throws IOException {
        initialization();
        loginPage = new LoginPage();
        homePage = new HomePage();
    }


    @Test
    public void Home() throws InterruptedException {
        loginPage.loginUser();
        homePage.homePageAction();
    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(2000);
    }
}
