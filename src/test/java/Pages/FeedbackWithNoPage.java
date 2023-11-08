package Pages;

import PageObjects.FeedbackPageObjects;
import Utilis.Wait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

public class FeedbackWithNoPage extends Wait {

    FeedbackPageObjects feedbackPageObjects = new FeedbackPageObjects(driver);

    public void ArticlePage() throws InterruptedException
    {
        driver.navigate().refresh();
        Thread.sleep(4000);
        Wait.WaitForElement().until(ExpectedConditions.visibilityOf(feedbackPageObjects.ArticlePage)).click();

    }

    public void Submit_Feedback_No () throws InterruptedException {

        SoftAssert softAssert = new SoftAssert();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

        boolean HC_Feedback;
        boolean HC_FeedbackForm_NO;
        boolean HC_FeedbackThankYou;


        Thread.sleep(2000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", feedbackPageObjects.Feedback_Yes);

        try {
            Thread.sleep(1500);
            Wait.WaitForElement().until(ExpectedConditions.visibilityOf(feedbackPageObjects.Feedback_No)).click();
            System.out.println("Clicked in try block");

        }catch (Exception e){
            js.executeScript("arguments[0].click();", feedbackPageObjects.Feedback_No);
            System.out.println("Clicked in catch block");

        }


        Thread.sleep(1500);
        Wait.WaitForElement().until(ExpectedConditions.visibilityOf(feedbackPageObjects.Feedback_Option1)).click();

        Thread.sleep(1500);
        Wait.WaitForElement().until(ExpectedConditions.visibilityOf(feedbackPageObjects.Feedback_Submit_Button)).click();

        Thread.sleep(1500);

        try
        {
            HC_FeedbackThankYou = Wait.WaitForElement().until(ExpectedConditions.visibilityOf(feedbackPageObjects.Feedback_ThankYou)).isDisplayed();
        }
        catch (Exception e)
        {
            HC_FeedbackThankYou = false;
        }

        if (HC_FeedbackThankYou)
        {
            System.out.println("****************************************");
            System.out.println("Check 1: Feedback Submitted Successfully");
            System.out.println("Case 19: Passed");
            System.out.println("***************");
        }
        else
        {
            System.out.println("***********************************");
            System.out.println("Check 2: Feedback Submittion Failed");
            System.out.println("Case 19: Failed");
            System.out.println("***************");

            softAssert.assertFalse(true,"Feedback Submittion Failed");

        }
        softAssert.assertAll();
        driver.navigate().back();
        Wait.WaitForElement().until(ExpectedConditions.visibilityOf(feedbackPageObjects.CloseGenericFeedbackForm)).click();
        //Thread.sleep(100);

    }

}
