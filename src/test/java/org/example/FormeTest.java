package org.example;

import org.example.utils.SeleniumDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FormeTest {

    public static WebDriver driver; public Void BeforeClass;
        {
        driver= SeleniumDriver.getRemoteDriver();
    }

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver-win64\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("http://google.com");
        driver.quit();}
}