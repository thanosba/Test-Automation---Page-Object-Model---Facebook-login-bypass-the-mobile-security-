/**
 * Created by thanos-imac on 30/6/18.
 */

package test;

import org.openqa.selenium.WebDriver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.loginPage;

public class testLogin {

    WebDriver driver;

    loginPage objLogin;

    HomePage objHomePage;


    @BeforeTest
    public void setup() {

        driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("http://www.facebook.com");
    }

    @Test(priority = 0)

    public void test_Home_Page_Appear_Correct() throws InterruptedException {


        objLogin = new loginPage(driver);
        //login to application
        objLogin.loginToPage("your email", "your password");
        //long delay - Unlock your facebook account
        Thread.sleep(20000);

        //verify home page
        objHomePage = new HomePage(driver);
        Assert.assertTrue(objHomePage.getHomePageDashboardUserName().contains("your name"));

    }
}






