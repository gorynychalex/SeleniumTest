package ru.javalang;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverSettings {
    protected ChromeDriver driver;
    @Before
    public void setUp() throws Exception {
        System.setProperty("webdriver.chrome.driver","c:\\java\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(Site.URL);
    }

    @After
    public void setDown(){
        driver.quit();
    }
}
