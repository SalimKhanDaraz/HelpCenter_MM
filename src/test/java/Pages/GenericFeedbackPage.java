package Pages;

import PageObjects.FeedbackPageObjects;
import Utilis.Wait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.asserts.SoftAssert;

public class GenericFeedbackPage extends Wait {

    FeedbackPageObjects feedbackPageObjects = new FeedbackPageObjects(driver);


    public void BacktoHomepage()
    {
        driver.navigate().back();

    }

    public void Generic_Feedback () throws InterruptedException
    {
        SoftAssert softAssert = new SoftAssert();

        // WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

        boolean Gen_HC_Feedback;

        try
        {
            Gen_HC_Feedback = Wait.WaitForElement().until(ExpectedConditions.visibilityOf(feedbackPageObjects.Generic_Feedback_Content)).isDisplayed();
        }
        catch (Exception e)
        {
            Gen_HC_Feedback = false;
        }

        if (Gen_HC_Feedback)
        {
            System.out.println("**********************************************");
            System.out.println("Check 1: Generic Feedback Section is Available");
            System.out.println("Case 17: Passed");
            System.out.println("***************");

            //driver.findElement(By.xpath("//*[text()=\"Answers were not clear\"]")).isDisplayed()
            if ((feedbackPageObjects.Overall_HC_Feedback).isDisplayed())
            {
                Wait.WaitForElement().until(ExpectedConditions.visibilityOf(feedbackPageObjects.Overall_HC_Feedback)).click();
                //wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[text()=\"Answers were not clear\"]")));
                Thread.sleep(1000);
                //driver.findElement(By.xpath("//*[text()=\"Answers were not clear\"]")).click();
                //feedbackPageObjects.Overall_HC_Feedback.click();

                Wait.WaitForElement().until(ExpectedConditions.visibilityOf(feedbackPageObjects.GenericFeedbackSubmit_Btn)).click();
                // wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@class=\"aKvm7IOvMy_qmuO1Oulw\"]")));
                //Thread.sleep(1000);
                //driver.findElement(By.xpath("//*[@class=\"aKvm7IOvMy_qmuO1Oulw\"]")).click();

                System.out.println("****************************************");
                System.out.println("Check 2: Feedback Submitted Successfully");
                System.out.println("Case 17: Passed");
                System.out.println("***************");

                Thread.sleep(5000);
            }
            else
            {
                System.out.println("*******************************************");
                System.out.println("Check 3: Overall Feedback Submittion Failed");
                System.out.println("Case 17: Failed");
                System.out.println("***************");

                softAssert.assertFalse(true,"Overall Feedback Submittion Failed");
            }

        }
        else
        {
            System.out.println("**************************************************");
            System.out.println("Check 4: Generic Feedback Section is not Available");
            System.out.println("Case 17: Failed");
            System.out.println("***************");

            softAssert.assertFalse(true,"Generic Feedback Section is not Available");

        }

        softAssert.assertAll();

    }

}
