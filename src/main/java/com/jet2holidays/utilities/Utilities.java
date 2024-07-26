package com.jet2holidays.utilities;

import com.jet2holidays.base.BasePage;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.Dimension;

import java.time.Duration;

public class Utilities extends BasePage {

    public void scrollUp() {
        Dimension dimension = driver.manage().window().getSize();
        int startX = (int) (dimension.width * 0.5);
        int startY = (int) (dimension.height * 0.8);
        int endY = (int) (dimension.height * 0.2);

        TouchAction action = new TouchAction(driver);
        action.press(PointOption.point(startX, startY))
                .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                .moveTo(PointOption.point(startX, endY))
                .release()
                .perform();
    }

    public void scrollDown() {
        Dimension dimension = driver.manage().window().getSize();
        int startX = (int) (dimension.width * 0.5);
        int startY = (int) (dimension.height * 0.2);
        int endY = (int) (dimension.height * 0.8);

        TouchAction action = new TouchAction(driver);
        action.press(PointOption.point(startX, startY))
                .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                .moveTo(PointOption.point(startX, endY))
                .release()
                .perform();
    }

}
