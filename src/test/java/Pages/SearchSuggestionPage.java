package Pages;

import PageObjects.SearchPageObjects;
import Utilis.Wait;
import io.qameta.allure.Allure;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

public class SearchSuggestionPage extends Wait {

    SearchPageObjects searchPageObjects = new SearchPageObjects(driver);

    public void EnterKeywordInSearch() throws InterruptedException {

        Wait.WaitForElement().until(ExpectedConditions.visibilityOf(searchPageObjects.SearchBar)).sendKeys("order");
        Thread.sleep(300);

    }


    public void SearchSuggestion()
    {

        SoftAssert softAssert = new SoftAssert();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@class=\"HhKIOe7NwNv6pGPmHJyn\"]//a")));
        int SearchSuggestionsCount =  driver.findElements(By.xpath("//*[@class=\"HhKIOe7NwNv6pGPmHJyn\"]//a")).size();

        if (SearchSuggestionsCount==5)
        {
            System.out.println("*********************************");
            System.out.println("Check 1: Search Suggestions Count");
            Allure.step("Search Icon is available");
            System.out.println("Case 11: Passed");
            System.out.println("***************");
            System.out.println("");

        }
        else
        {
            System.out.println("");
            System.out.println("*********************************");
            System.out.println("Check 2: Search Suggestions Count");
            Allure.step("Search Icon not found");
            System.out.println("Case 11: Search Module Failed");
            System.out.println("****************************");
            System.out.println("");

            softAssert.assertFalse(true,"Search Suggestion Count Case failed");
        }

        softAssert.assertAll();

    }

}
