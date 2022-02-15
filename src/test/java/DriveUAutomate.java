import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;
import java.util.Collections;

public class DriveUAutomate {
    public static void main(String s[])
    {
        System.setProperty("webdriver.chrome.driver","/Users/admin/Desktop/chromedriver");
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.setExperimentalOption("useAutomationExtension", false);
        chromeOptions.setExperimentalOption("excludeSwitches", Collections.singletonList("enable-automation"));
        WebDriver driver = new ChromeDriver(chromeOptions);

        driver.manage().window().maximize();
        //driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.get("https://www.driveu.in/");
        System.out.println("Website Launched");
        driver.findElement(By.name("city")).sendKeys("Ahmedabad");
        driver.quit();
        System.out.println("Website Closed");
    }
}
