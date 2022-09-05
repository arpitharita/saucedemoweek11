package testsuite;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import utilitis.Utility;

public class LoginTest extends Utility {

    String BaseUrl = "https://www.saucedemo.com/";

    @Before
    public void setUp()
    {
        openBrowser(BaseUrl);

    }

    @Test
    public void userShouldLoginSuccessfullyWithValid(){

        //* Enter “standard_user” username
        sendKeysToElement(By.xpath("//input[@id='user-name']"),"standard_user");

        //* Enter “secret_sauce” password
        sendKeysToElement(By.xpath("//input[@id='password']"),"secret_sauce");

        //* Click on ‘LOGIN’ button
        clickOnElement(By.xpath("//input[@id='login-button']"));

        //* Verify the text “PRODUCTS”
        String actualTest = getTextFromElement(By.xpath("//span[@class='title']"));
        String expectedTest = "PRODUCTS";
        Assert.assertEquals(expectedTest,actualTest);
    }
    @Test
    public void verifyThatSixProductsAreDisplayedOnPage(){

        //* Enter “standard_user” username
        sendKeysToElement(By.xpath("//input[@id='user-name']"),"standard_user");

        //* Enter “secret_sauce” password
        sendKeysToElement(By.xpath("//input[@id='password']"),"secret_sauce\"");

        //* Click on ‘LOGIN’ button
        clickOnElement(By.xpath("//input[@id='login-button']"));

        //* Verify that six products are displayed on page
        String actualTest = getTextFromElement(By.xpath("//div[@class='inventory_list']"));
        String expectedTest = "";
        Assert.assertEquals(expectedTest,actualTest);

    }
}
