package org.example.testng;

import org.example.demoq.FormaPage;
import org.example.utils.SeleniumDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class FormaTest extends Basic{

    public static WebDriver driver;

    @BeforeClass
    public void beforeClass() {
//        System.setProperty("webdriver.chrome.driver", "D:\\chromedriver-win64\\chromedriver.exe");
//        ChromeOptions options = new ChromeOptions();
//        options.addArguments("--remote-allow-origins=*");
//        WebDriver driver = new ChromeDriver(options);
//        driver.manage().window().maximize();
//        FormaTest.driver = driver;
        driver= SeleniumDriver.getRemoteDriver();
    }

    @Test
    public void FormaTngTest() throws InterruptedException {
        driver.get("https://demoqa.com/automation-practice-form");
        FormaPage formaPage = new FormaPage(driver);
        formaPage .setFirstName(FIRST_NAME);
        Thread.sleep(5000);
    }

    @AfterClass
    public void close() {
        driver.quit();
    }
}