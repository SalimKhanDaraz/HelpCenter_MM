package Pages;

import PageObjects.ContactUsPageObjects;
import Utilis.Wait;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.asserts.SoftAssert;

public class ContactUsPage extends Wait {

    ContactUsPageObjects contactUsPageObjects = new ContactUsPageObjects(driver);

    public void StillNeedHelp () throws InterruptedException {

        SoftAssert softAssert = new SoftAssert();

        boolean StillNeedHelp_Availability, StillNeedHelp_Ops;

        try {

            JavascriptExecutor js = (JavascriptExecutor) driver;

            js.executeScript("arguments[0].scrollIntoView();", contactUsPageObjects.TopQuestion_Section);
            Thread.sleep(3000);
            js.executeScript("arguments[0].scrollIntoView();", contactUsPageObjects.StillNeedHelp_Section);

            StillNeedHelp_Availability = contactUsPageObjects.StillNeedHelp_Section.isDisplayed();
            StillNeedHelp_Ops = contactUsPageObjects.StillNeedHelp_Options.isDisplayed();

            if (StillNeedHelp_Availability && StillNeedHelp_Ops)
            {
                System.out.println("");
                System.out.println("************************************************************");
                System.out.println("Check 1: Still Need Help section & its options are available");
                System.out.println("Case 20: Passed");
                System.out.println("***************");
            }
            else
            {
                System.out.println("");
                System.out.println("********************************************************");
                System.out.println("Check 1: Still Need Help section & its options not found");
                System.out.println("Case 20: Failed");
                System.out.println("***************");

                softAssert.assertFalse(true,"Still Need Help section & its options not found");

            }

        }catch (Exception e){

            System.out.println("");
            System.out.println("********************************************************");
            System.out.println("Check 1: Still Need Help section & its options not found");
            System.out.println("Case 20: Failed");
            System.out.println("***************");

            softAssert.assertFalse(true,"Still Need Help section & its options not found");
        }

        softAssert.assertAll();

    }
}
