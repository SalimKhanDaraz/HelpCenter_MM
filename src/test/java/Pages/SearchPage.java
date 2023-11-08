package Pages;

import PageObjects.SearchPageObjects;
import Utilis.Wait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.asserts.SoftAssert;

public class SearchPage extends Wait {

    SearchPageObjects searchpageobj = new SearchPageObjects(driver);

    // Validating the searchbar placeholder in this method
    public void SearchBoxPlaceholderCheck() throws InterruptedException {

        SoftAssert softAssert = new SoftAssert();

        Wait.WaitForElement().until(ExpectedConditions.visibilityOf(searchpageobj.SearchBar)).isDisplayed();

        boolean Search_PlaceHolder;
        try {
            Search_PlaceHolder = Wait.WaitForElement().until(ExpectedConditions.visibilityOf(searchpageobj.SearchPlaceHolder)).isDisplayed();
        }catch (Exception e){
            Search_PlaceHolder = false;
        }
        // String ActualSearchBoxText = searchpageobj.SearchPlaceHolder.getAttribute("placeholder");
        // String ExpectedSearchBoxText = "Search for questions, topics here";


        //if (Objects.equals(ActualSearchBoxText, ExpectedSearchBoxText))
        if (Search_PlaceHolder)
        {
            System.out.println("************************************");
            System.out.println("Check 1: Searchbox text is available");
            System.out.println("Case: Passed");
            System.out.println("************");

        }
        else
        {
            System.out.println("************************************");
            System.out.println("Check 2: Searchbox text not matched");
            System.out.println("Case: Failed");
            System.out.println("************");

            softAssert.assertFalse(true,"Searchbox text no matched");
        }

        softAssert.assertAll();
    }
}
