package Pages;

import Utilis.Wait;
import io.qameta.allure.Allure;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class NavigatetoHC extends Wait {


    public NavigatetoHC(WebDriver driver) {PageFactory.initElements(driver, this);}

    public void HelpCenter(WebDriver driver) throws InterruptedException {
        Thread.sleep(3000);
        driver.navigate().to("https://m-helpcenter.shop.com.mm/web/home.htm?hybrid=1");
        System.out.println("Navigating to Shop Help Center");
        Allure.step("Navigating to Shop Help Center");

    }
}
