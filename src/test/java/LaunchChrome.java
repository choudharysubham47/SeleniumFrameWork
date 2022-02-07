import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChrome {

    public static void main(String s[])

    {

      // String path = System.getProperty("user.dir");
        System.out.println("We Are Ready To launch");
        //System.setProperty("webdriver.chrome.driver",path+"//chromedriver/chromedriver");
        System.setProperty("webdriver.chrome.driver","/Users/admin/Desktop/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
       // driver.manage().deleteAllCookies();
        driver.get("https://www.selenium.dev/downloads/");

        driver.close();
    }
}


/*Note:
======
If chromeDriver is throwing error that it cannot run on mac
then goto teminal and navigate to chromedriver path
and run this command

        xattr -d com.apple.quarantine chromedriver
  https://stackoverflow.com/questions/60362018/macos-catalinav-10-15-3-error-chromedriver-cannot-be-opened-because-the-de
         */