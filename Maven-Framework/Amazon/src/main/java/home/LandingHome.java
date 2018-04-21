package home;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class LandingHome {

    public static void main(String [] args) {
        //System.setProperty("webdriver.chrome.driver", "/Users/peoplentech/eclipse-workspace-March2018/SeleniumProject1/driver/chromedriver");
        System.setProperty("webdriver.gecko.driver", "/Users/bravo1516/eclipse-workspace/SeleniumProj1/drivers/geckodriver");
        System.setProperty("webdriver.firefox.bin","/Applications/Firefox.app/Contents/MacOS/firefox-bin");
        WebDriver driver = new FirefoxDriver();
        //WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.amazon.com");
        driver.manage().window().maximize();
        driver.findElement(By.name("field-keywords")).sendKeys("Iphone", Keys.ENTER);
//
    }
}
