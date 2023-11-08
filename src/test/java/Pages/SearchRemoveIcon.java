package Pages;

import PageObjects.SearchPageObjects;
import Utilis.Wait;
import io.qameta.allure.Allure;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.asserts.SoftAssert;

public class SearchRemoveIcon extends Wait {

    SearchPageObjects searchPageObjectsbj = new SearchPageObjects(driver);


    public void SearchRemoveBtnCheck() throws InterruptedException {

        SoftAssert softAssert = new SoftAssert();

        Actions act = new Actions(driver);

        Wait.WaitForElement().until(ExpectedConditions.visibilityOf(searchPageObjectsbj.CloseIcon));
        Thread.sleep(1500);

        boolean RemoveIcon;

        try{
            RemoveIcon = searchPageObjectsbj.CloseIcon.isDisplayed();
        }
        catch(Exception e)
        {
            RemoveIcon = false;
        }

        if (RemoveIcon)
        {
            System.out.println("************************");
            System.out.println("Check 1: Close Icon Case");
            Allure.step("Search Icon is available");
            System.out.println("Case 7: Passed");
            System.out.println("**************");
            System.out.println("");

            act.doubleClick(searchPageObjectsbj.CloseIcon).perform();

        }
        else
        {
            System.out.println("");
            System.out.println("************************");
            System.out.println("Check 2: Close Icon Case");
            Allure.step("Search Icon not found");
            System.out.println("Case 7: Search Module Failed");
            System.out.println("****************************");
            System.out.println("");

            softAssert.assertFalse(true,"Close Icon Case failed");
        }

        softAssert.assertAll();
    }


    public void SearchboxisEmpty()
    {
        WebElement searchBox = driver.findElement(By.xpath("//*[@class=\"fZqLfjS1uHwYdkxLUb9m\"]"));
        String searchBoxValue = searchBox.getAttribute("value");

        if (searchBoxValue.isEmpty()) {
            System.out.println("Search box is empty.");
        } else {
            System.out.println("Search box is not empty. It contains: " + searchBoxValue);
        }

    }
}
