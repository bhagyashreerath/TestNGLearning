package org.learning.pageActions;

import org.learning.managers.WebDriverManager;
import org.learning.pageObjects.GuruPageObjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class GuruPageAction {

    WebDriver driver = WebDriverManager.getDriver();
    GuruPageObjects guruPageObjects = new GuruPageObjects(driver);

    public void navigateToGuru99Site(){
        driver.get("https://www.guru99.com/selenium-tutorial.html");
    }

    public void verifyTitle(){
        String title = driver.getTitle();
        System.out.println("Page Title: " + title);
        Assert.assertEquals( title,"Selenium Tutorial – Guru99", "Title does not match expected value");
        // Add assertions or verifications as needed
    }

    public void navigateToWhatIsSelenium() throws InterruptedException {
        Thread.sleep(5000);
        guruPageObjects.whatIsSeleniumLink.click();
    }
}
