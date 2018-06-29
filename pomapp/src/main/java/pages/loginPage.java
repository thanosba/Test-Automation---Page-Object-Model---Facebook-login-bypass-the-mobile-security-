/**
 * Created by thanos-imac on 30/6/18.
 */
package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginPage {
    WebDriver driver;
    By userEmail = By.name("email");
    By userPassword = By.name("pass");
    By login = By.id("u_0_2");

    public loginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void setUserEmail(String strUserEmail) {
        this.driver.findElement(this.userEmail).sendKeys(new CharSequence[]{strUserEmail});
    }

    public void setUserPassword(String strUserPassword) {
        this.driver.findElement(this.userPassword).sendKeys(new CharSequence[]{strUserPassword});
    }

    public void clickLogin() {
        this.driver.findElement(this.login).click();
    }

    public void loginToPage(String strUserEmail, String strUserPassword) {
        this.setUserEmail(strUserEmail);
        this.setUserPassword(strUserPassword);
        this.clickLogin();
    }
}