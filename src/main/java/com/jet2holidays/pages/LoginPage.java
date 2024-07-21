package com.jet2holidays.pages;

import com.jet2holidays.base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

    @FindBy(id = "com.jet2.holidays:id/btn_accept_cookies")
    public WebElement acceot_cookies;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.widget.ScrollView/android.view.View[3]/android.widget.Button")
    public WebElement notification_deny;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.widget.ScrollView/android.view.View[2]/android.widget.Button")
    public WebElement clickSignInButton;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View[2]/android.view.View[1]/android.view.View/android.widget.ListView/android.view.View[2]/android.widget.EditText")
    public WebElement emailId;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View[2]/android.view.View[1]/android.widget.Button")
    public WebElement emailContinue;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.widget.EditText")
    public WebElement password;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.widget.Button[2]")
    public WebElement passwordContinue;

    public void setAcceot_cookies(){
        acceot_cookies.click();
    }

    public void setNotification_deny(){
        notification_deny.click();
    }

    public void setClickSignInButton(){
        clickSignInButton.click();
    }

    public void setEmailId(String email){
        emailId.sendKeys(email);
    }

    public void setEmailContinue(){
        emailContinue.click();
    }

    public void setPassword(String pass){
        password.sendKeys(pass);
    }

    public void setPasswordContinue(){
        passwordContinue.click();
    }

    public void loginUser() throws InterruptedException {
        setAcceot_cookies();
        setClickSignInButton();
        Thread.sleep(2000);
        setEmailId("tusharjadhav228@gmail.com");
        Thread.sleep(1000);
        setEmailContinue();
        Thread.sleep(3000);
        setPassword("Sakshi@1228");
        setPasswordContinue();
    }

}
