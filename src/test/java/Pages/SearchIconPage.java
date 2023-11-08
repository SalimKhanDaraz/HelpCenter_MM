package Pages;

import PageObjects.SearchPageObjects;
import Utilis.Wait;
import io.qameta.allure.Allure;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.asserts.SoftAssert;

public class SearchIconPage extends Wait {

    SearchPageObjects searchpageobj = new SearchPageObjects(driver);

    // Validating the searchbar icon in this method
    public void SearchIconVerification () throws InterruptedException {

        SoftAssert softAssert = new SoftAssert();

        Wait.WaitForElement().until(ExpectedConditions.visibilityOf(searchpageobj.SearchBar)).isDisplayed();
        Thread.sleep(1500);

        boolean Icon;

        try{
            Icon = searchpageobj.SearchIcon.isDisplayed();
        }
        catch(Exception e)
        {
            Icon = false;
        }

        if (Icon)
        {
            System.out.println("*********************************");
            System.out.println("Check 1: Search Icon is available");
            Allure.step("Search Icon is available");
            System.out.println("Case 5: Passed");
            System.out.println("**************");
            System.out.println("");
        }
        else
        {
            System.out.println("");
            System.out.println("******************************");
            System.out.println("Check 2: Search Icon not found");
            Allure.step("Search Icon not found");
            System.out.println("Case 5: Search Module Failed");
            System.out.println("****************************");
            System.out.println("");

            softAssert.assertFalse(true,"Search Icon not found");
        }

        softAssert.assertAll();

    }
}
