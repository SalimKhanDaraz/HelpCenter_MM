package Pages;

import PageObjects.SearchPageObjects;
import Utilis.Wait;
import io.qameta.allure.Allure;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.asserts.SoftAssert;

public class SearchPageArticle extends Wait {

    SearchPageObjects searchPageObjects = new SearchPageObjects(driver);


    public void ClickArticleSearchSuggestion()
    {
        Wait.WaitForElement().until(ExpectedConditions.visibilityOf(searchPageObjects.SearchSuggestion)).click();

    }


    public void ArticleLandingPage() throws InterruptedException {

        SoftAssert softAssert = new SoftAssert();

        Wait.WaitForElement().until(ExpectedConditions.visibilityOf(searchPageObjects.SearchSuggestion_Article)).click();
        Thread.sleep(1500);

        boolean ArticleTitle;

        try{
            ArticleTitle = searchPageObjects.SearchSuggestion_Article.isDisplayed();
        }
        catch(Exception e)
        {
            ArticleTitle = false;
        }

        if (ArticleTitle)
        {
            System.out.println("************************************************");
            System.out.println("Check 1: Article displayed via Search Suggestion");
            Allure.step("Search Icon is available");
            System.out.println("Case: Passed");
            System.out.println("************");
            Allure.step("Search Module Passed");
            System.out.println("");

        }
        else
        {
            System.out.println("");
            System.out.println("****************************************************");
            System.out.println("Check 2: Article Not displayed via Search Suggestion");
            Allure.step("Search Icon not found");
            System.out.println("Case: Search Module Failed");
            System.out.println("**************************");
            System.out.println("");

            softAssert.assertFalse(true,"Article displayed via Search Suggestion Case failed");
        }

        softAssert.assertAll();

    }
}
