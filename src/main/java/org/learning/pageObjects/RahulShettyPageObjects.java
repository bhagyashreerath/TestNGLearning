package org.learning.pageObjects;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RahulShettyPageObjects {
    WebDriver driver=null;
    public RahulShettyPageObjects(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver=driver;
    }

    @FindBy(id = "inputUsername")
    public WebElement userNameInput;
     @FindBy (name = "inputPassword")
    public WebElement passwordInput;
     @FindBy(xpath = "//button[text()='Sign In']")
    public WebElement signInButton;
     @FindBy(xpath = "//p[@class='error']")
    public WebElement errorText;
@FindBy(id="visitUsTwo")
    public WebElement visitUsButton;
}
    @FindBy (xpath = "//a[text()='Forgot your password?']")
        public WebElement forgotPassword;
    @FindBy(xpath = "//input[@placeholder='Name']")
    public WebElement fuserName;
    @FindBy (xpath = "//input[@placeholder='Email']")
    public WebElement femail;
    @FindBy (xpath = "//input[@placeholder='Phone Number']")
    public WebElement fphoneNo;
    @FindBy (xpath = "//button[@class='reset-pwd-btn']")
    public WebElement resetPwdBtn;

