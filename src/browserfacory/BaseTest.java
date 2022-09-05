package browserfacory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class BaseTest {

    public static WebDriver driver;

    public void openBrowser(String baseUrl)
    {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(baseUrl);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

    }
    public void closeBrowser()
    {
        //driver.quit();
    }

}
//        sendKeysToElement(By.xpath(""),"");
//        clickOnElement(By.xpath(""));
//  String actualTest = getTextFromElement(By.xpath(""));
//        String expectedTest = "";
//        Assert.assertEquals(expectedTest,actualTest);