package maven.test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Maven {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Users/bravo1516/IdeaProjects/Maven-Framework/driver/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com");

        driver.findElement(By.id("lst-ib")).sendKeys("Selenium", Keys.ENTER);

        String actual = driver.getTitle();
                String expected = "Selenium - Google Search";
        Assert.assertEquals(actual, expected);
        System.out.println("pass");
       // driver.close();
    }
}
