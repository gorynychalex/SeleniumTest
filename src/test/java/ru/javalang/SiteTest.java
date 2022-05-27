package ru.javalang;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.io.File;

import static org.junit.Assert.*;

public class SiteTest extends WebDriverSettings {


    @Test
    public void getSite() {

        assertTrue(driver.getTitle().equals("Яндекс"));
    }

    @Test
    public void getSiteElement(){
        WebElement webElement = driver
                .findElement(By.xpath("/html/body/table/tbody/tr[2]/td/form/div[2]/button"));

        assertTrue(webElement.isEnabled());
    }
}