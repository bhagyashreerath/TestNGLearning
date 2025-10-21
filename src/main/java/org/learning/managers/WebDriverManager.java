package org.learning.managers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverManager {

    static WebDriver driver = new ChromeDriver();

    public static WebDriver getDriver() {
        return driver;
    }
}
