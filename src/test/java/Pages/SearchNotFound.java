package Pages;

import PageObjects.SearchPageObjects;
import Utilis.Wait;
import io.qameta.allure.Allure;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.asserts.SoftAssert;

public class SearchNotFound extends Wait {

    SearchPageObjects searchpageobj = new SearchPageObjects(driver);

    public void Search_NotFound () throws InterruptedException {

        SoftAssert softAssert = new SoftAssert();

        Wait.WaitForElement().until(ExpectedConditions.visibilityOf(searchpageobj.SearchBar)).isDisplayed();
        searchpageobj.SearchBar.sendKeys("vvvvv");
        Thread.sleep(5000);

        try {
            Wait.WaitForElement().until(ExpectedConditions.visibilityOf(searchpageobj.NoResultFound));
        }catch (Exception e){
            Thread.sleep(3000);

        }

        boolean InvalidSearchResult;

        try{
            InvalidSearchResult = searchpageobj.NoResultFound.isDisplayed();
        }
        catch(Exception e)
        {
            InvalidSearchResult = false;
        }

        if (InvalidSearchResult)
        {
            System.out.println("****************************");
            System.out.println("Check 1: Invalid Search Case");
            Allure.step("Search Icon is available");
            System.out.println("Case 6: Passed");
            System.out.println("**************");
            System.out.println("");
        }
        else
        {
            System.out.println("");
            System.out.println("****************************");
            System.out.println("Check 2: Invalid Search Case");
            Allure.step("Search Icon not found");
            System.out.println("Case 6: Search Module Failed");
            System.out.println("****************************");
            System.out.println("");

            softAssert.assertFalse(true,"Invalid Search Case");
        }

        softAssert.assertAll();

    }
}
