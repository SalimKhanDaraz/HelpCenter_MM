package Pages;

import PageObjects.SelfServicePageObjects;
import Utilis.Wait;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.asserts.SoftAssert;


public class SelfServicePage extends Wait {

    SelfServicePageObjects selfserviceobj = new SelfServicePageObjects(driver);


    // this method is validating the self-service Section and checking if all self-service tools are available in the SS Section.

    public void SelfServiceSection()
    {
        SoftAssert softAssert = new SoftAssert();

        driver.navigate().to("https://m-helpcenter.shop.com.mm/web/home.htm?hybrid=1");

        boolean SS_Section;

        try {
            SS_Section = Wait.WaitForElement().until(ExpectedConditions.visibilityOf(selfserviceobj.SelfServiceSection)).isDisplayed();
        }
        catch (Exception e)
        {
            SS_Section = false;
        }

        if (SS_Section) {
            if (driver.findElements(By.xpath("//*[@class=\"f3bufdfZt8m80TRswkWT\"]")).size() >= 8) {
                System.out.println("***********************************");
                System.out.println("Check 1: SST Section and data found");
                System.out.println("Case: Passed");
                System.out.println("**************");
            } else {
                System.out.println("***************************************");
                System.out.println("Check 2: SST Section and data not found");
                System.out.println("Case: Failed");
                System.out.println("**************");

                softAssert.assertFalse(true, "SST Section and data not found");
            }
        }

        softAssert.assertAll();

    }

    // In this method, Validating all the self-service tools are working or not

    public void SelfServiceTool()
    {

        SoftAssert softAssert = new SoftAssert();

        //WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

        //List<WebElement> SelfService_Tools;

        for (int i = 0; i < 8; i++) {

            try {

                //SelfService_Tools = selfserviceobj.SelfServiceTools;
                //SelfService_Tools = driver.findElements(By.xpath("//*[@class=\"f3bufdfZt8m80TRswkWT\"]"));
                Wait.WaitForElement().until(ExpectedConditions.visibilityOfAllElements(selfserviceobj.SelfServiceTools));


                Thread.sleep(1500);
                Wait.WaitForElement().until(ExpectedConditions.visibilityOf(selfserviceobj.SelfServiceTools.get(i))).click();


                //Wait.WaitForWebElement().until(ExpectedConditions.visibilityOf(SelfService_Tools.get(i))).click();
                //System.out.println(i + " click: " + SelfService_Tools.get(i).getText());
                //SelfService_Tools.get(i).click();

                Thread.sleep(1500);
                driver.navigate().back();
                //Wait.WaitForWebElement().until(ExpectedConditions.visibilityOf(selfserviceobj.Back_to_HC)).click();


                Wait.WaitForElement().until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@class=\"OUvoLIP67H31NKGPoSxx\"]")));
                Thread.sleep(1000);

            }
            catch (Exception e)
            {
                System.out.println("*****************************************");
                System.out.println("Check 2: SST Module Pages are not Working");
                System.out.println("Case: Failed");
                System.out.println("************");

                softAssert.assertFalse(true, "SST Module failed");

            }

        }

        System.out.println("**************************************");
        System.out.println("Check 2 : SST Module Pages are Working");
        System.out.println("Case: Passed");
        System.out.println("************");

        softAssert.assertAll();


    }

}
