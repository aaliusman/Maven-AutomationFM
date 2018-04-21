package maven.test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MavenAnnotations {
    WebDriver driver = null;
    @BeforeMethod
    public void setUp(){

        System.setProperty("webdriver.chrome.driver", "/Users/bravo1516/IdeaProjects/Maven-Framework/driver/chromedriver");
        driver = new ChromeDriver();

        driver.get("https://www.google.com");

    }
    @Test
            public void testSearch() {
        driver.findElement(By.id("lst-ib")).sendKeys("Selenium", Keys.ENTER);

        String actual = driver.getTitle();
        String expected = "Selenium - Google Search";
        Assert.assertEquals(actual, expected);
        System.out.println("pass");
    }

    @AfterMethod
    public void goodBye(){
        driver.close();
        driver.quit();
    }
}
