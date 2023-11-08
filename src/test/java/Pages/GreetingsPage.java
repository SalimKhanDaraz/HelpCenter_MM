package Pages;

import PageObjects.GreetingsPageObjects;
import Utilis.Wait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.asserts.SoftAssert;

public class GreetingsPage extends Wait {

    GreetingsPageObjects greetingsPageObjects = new GreetingsPageObjects(driver);

    public void Greetings () throws InterruptedException {

        SoftAssert softAssert = new SoftAssert();

        boolean Content1, Content2;
        Thread.sleep(2000);

        try
        {
            Content1 = Wait.WaitForElement().until(ExpectedConditions.visibilityOf(greetingsPageObjects.Greeting_Section)).isDisplayed();
            Content2 = Wait.WaitForElement().until(ExpectedConditions.visibilityOf(greetingsPageObjects.Greeting_Content)).isDisplayed();

        }
        catch (Exception e)
        {
            Content1 = false;
            Content2 = false;
        }

        if (Content1 && Content2)
        {
            System.out.println("****************************************");
            System.out.println("Check 1: Greeting Section and data found");
            System.out.println("Case: Passed");
            System.out.println("************");

        }
        else
        {
            System.out.println("********************************************");
            System.out.println("Check 2: Greeting Section and data not found");
            System.out.println("Case: Failed");
            System.out.println("************");

            softAssert.assertFalse(true,"Greeting Section and data not found");

        }
        softAssert.assertAll();
    }

}
