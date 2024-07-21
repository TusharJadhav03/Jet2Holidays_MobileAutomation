package com.jet2holidays.base;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;
import java.io.IOException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class BasePage {

    public static AndroidDriver driver;

    public BasePage(){
        PageFactory.initElements(driver,this);
    }

    public void initialization() throws IOException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName","Android");
        capabilities.setCapability("PlatformVersion", "13.0");
        capabilities.setCapability("deviceName","dd454927347a");
        capabilities.setCapability("app","C:\\Users\\tusha\\OneDrive\\Pictures\\Bridgelabz\\ApplicationsMobile\\com.jet2.holidays.apk");
        capabilities.setCapability("autoGrantPermissions", true);
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        System.out.println("Start automation.......");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }
}
