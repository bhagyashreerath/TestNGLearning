package org.learning.pageActions;

import org.learning.managers.WebDriverManager;
import org.learning.pageObjects.GuruPageObjects;
import org.learning.pageObjects.RahulShettyPageObjects;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class RahulShettyPageAction {
    WebDriver driver = WebDriverManager.getDriver();
    RahulShettyPageObjects rahulShettyPageObjects = new RahulShettyPageObjects(driver);

    public void navigateToRahulLocator() throws InterruptedException {
        driver.get("https://rahulshettyacademy.com/locatorspractice/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
    public void loginToRS(String name, String password) {
        rahulShettyPageObjects.userNameInput.sendKeys(name);
        rahulShettyPageObjects.passwordInput.sendKeys(password);
        rahulShettyPageObjects.signInButton.click();
    }
    public void errorMessage() {
        String error = rahulShettyPageObjects.errorText.getText();
        System.out.println(error);
    }
    public void visitUs(){
        rahulShettyPageObjects.visitUsButton.click();
    }
}

