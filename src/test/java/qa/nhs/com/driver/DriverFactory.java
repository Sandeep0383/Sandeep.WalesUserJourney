package qa.nhs.com.driver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class DriverFactory
{
    public static WebDriver driver;

    public DriverFactory()
    {
        PageFactory.initElements(driver,this);
    }

    public void openBrowser(String browser)
    {
        switch (browser)
        {
            case "chrome":
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                break;

            case "microsoft edge":
                WebDriverManager.edgedriver().setup();
                driver = new EdgeDriver();
                break;

            default:
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
                break;

        }
    }

    public void setUrl(String url)
    {
        driver.get(url);
    }

    public void maximize()
    {
        driver.manage().window().maximize();
    }

    public void pageLoadTimeOut()
    {
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
    }

    public void implicitWait()
    {
        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
    }

    public void deleteCookies()
    {
        driver.manage().deleteAllCookies();
    }

    public void closeBrowser()
    {
        driver.quit();
    }


}
