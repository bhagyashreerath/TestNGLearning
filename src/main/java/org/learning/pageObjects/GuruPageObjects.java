package org.learning.pageObjects;

import org.learning.managers.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GuruPageObjects {

    WebDriver driver=null;
    public GuruPageObjects(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver=driver;
    }

    @FindBy(xpath = "//a[contains(@title,'What is Selenium?')]")
    public WebElement whatIsSeleniumLink;



}
