/**
 * Created by thanos-imac on 30/6/18.
 */
package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    WebDriver driver;
    By homePageUserName = By.xpath("//*[@id='navItem_100000101571826']/a/div");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public String getHomePageDashboardUserName() {
        return this.driver.findElement(this.homePageUserName).getText();
    }
}
