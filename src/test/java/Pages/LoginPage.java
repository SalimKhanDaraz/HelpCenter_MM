package Pages;

import PageObjects.LoginPageObjects;
import Utilis.ChromeSetup;
import Utilis.ReadConfig;
import Utilis.Wait;
import io.qameta.allure.Allure;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.asserts.SoftAssert;

import java.io.IOException;

public class LoginPage extends Wait {

//    public static String Venture = "MM";

   // public static String Venture = System.getenv("Venture_Jenkins");


    LoginPageObjects loginPageObjects = new LoginPageObjects(driver);

    ReadConfig readConfig = new ReadConfig();


public void HCLogin() throws IOException, InterruptedException {

    SoftAssert softAssert = new SoftAssert();

    Thread.sleep(1500);
    Wait.WaitForElement().until(ExpectedConditions.visibilityOf(loginPageObjects.UserName)).sendKeys(readConfig.getUsername());
    Allure.step("Entered UserName");

    Thread.sleep(1500);
    Wait.WaitForElement().until(ExpectedConditions.visibilityOf(loginPageObjects.Password)).sendKeys(readConfig.getPassword());
    Allure.step("Entered Password");

    Thread.sleep(1500);
    Wait.WaitForElement().until(ExpectedConditions.visibilityOf(loginPageObjects.LoginButton)).click();
    Allure.step("Clicked on Login Button");


    try {
        Wait.WaitForElement().until(ExpectedConditions.visibilityOf(loginPageObjects.AccountPage)).isDisplayed();
        System.out.println("Logged In Successfully");
        Allure.step("Logged In Successfully");
    }catch (Exception e){
        Allure.step("Login Failed");
        softAssert.assertFalse(true,"Login Failed");
    }

    softAssert.assertAll();

   }

}
