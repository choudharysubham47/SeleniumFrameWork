import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class FindElement {
    public static void main(String s[]) throws InterruptedException {
    System.out.println("We Are Ready To launch");
    //System.setProperty("webdriver.chrome.driver",path+"//chromedriver/chromedriver");
        System.setProperty("webdriver.chrome.driver","/Users/admin/Desktop/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        // driver.manage().deleteAllCookies();
        driver.get("https://www.google.com/");
        Thread.sleep(5000);

        driver.findElement(By.id("input")).sendKeys("Subham Choudhary");
        System.out.println("Enter the text");
        driver.findElement(By.id("input")).sendKeys(Keys.RETURN);
        System.out.println("Clicked enter key");
        driver.close();
        System.out.println("Done For The Day");
}

}
