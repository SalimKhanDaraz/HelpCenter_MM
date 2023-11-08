package Pages;

import PageObjects.CategorySliderPageObjects;
import Utilis.ChromeSetup;
import Utilis.Wait;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

import java.time.Duration;
import java.util.List;
import java.util.Objects;


public class CategorySliderPage extends Wait {

    CategorySliderPageObjects categorySliderPageObjects = new CategorySliderPageObjects(driver);

    public void CategoryPage()
    {
        Wait.WaitForElement().until(ExpectedConditions.visibilityOf(categorySliderPageObjects.Category)).click();
    }

    //=================================================================

    public void CategorySlide () throws InterruptedException {

        SoftAssert softAssert = new SoftAssert();

        for (int i = 0; i < 8; i++) {

            List<WebElement> SliderSpot;

            Thread.sleep(1500);
            Wait.WaitForElement().until(ExpectedConditions.visibilityOf(categorySliderPageObjects.Categories));
            SliderSpot = driver.findElements(By.xpath("//*[@class=\"Ve1nldNCvVN1B5F6XLta\"]//div"));


            System.out.println(i + " click: " + SliderSpot.get(i).getText());
            SliderSpot.get(i).click();
            //Thread.sleep(4000);

            try {
                System.out.println("Waited in try block");
                Wait.WaitForElement().until(ExpectedConditions.visibilityOf(categorySliderPageObjects.L1Categories)).isDisplayed();
            }catch (Exception e){
                Thread.sleep(6000);
                System.out.println("Waited in try catch");

            }


            if (driver.findElements(By.xpath("//*[@class=\"ZBHhIA_OT_1jo3YsnlG4\"]//a")).size()>=1)
            {
                System.out.println("");
                System.out.println("************************************");
                System.out.println("Check 1: L2 Categories are available");
                System.out.println("Case 14: Passed");
                System.out.println("***************");

            }
            else if (driver.findElement(By.xpath("//*[@class=\"E1gFNGVHKHPRNiayKK9C\"]")).isDisplayed())
            {

                System.out.println("");
                System.out.println("********************************************************");
                System.out.println("Check 1: L2 Categories not found/Error Page is Appearing");
                System.out.println("Case 14: Failed");
                System.out.println("***************");

                softAssert.assertFalse(true,"Error Page is Appearing");
            }
            else
            {
                System.out.println("");
                System.out.println("******************************************");
                System.out.println("Check 1: L2 Categories are appearing blank");
                System.out.println("Case 14: Failed");
                System.out.println("***************");

                softAssert.assertFalse(true,"L2 Categories not found");
            }
        }
        softAssert.assertAll();
    }

    //=============================================================================

    public void CategorySliderSpot () throws InterruptedException {

        SoftAssert softAssert = new SoftAssert();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

        List<WebElement> SliderSpot;
        List<WebElement> CategorySpot;

        Thread.sleep(1500);
        Wait.WaitForElement().until(ExpectedConditions.visibilityOf(categorySliderPageObjects.PromotionCategory)).click();

        Thread.sleep(4000);

        for (int i = 0; i < 8; i++) {

            SliderSpot = driver.findElements(By.xpath("//*[@class=\"Ve1nldNCvVN1B5F6XLta\"]//div"));
            Wait.WaitForElement().until(ExpectedConditions.visibilityOf(categorySliderPageObjects.Categories)).click();


            // System.out.println(i +" click: "+SliderSpot.get(i).getText());
            SliderSpot.get(i).click();
            Thread.sleep(3000);

            CategorySpot = driver.findElements(By.xpath("//*[@class=\"Ve1nldNCvVN1B5F6XLta\"]//div"));
            Wait.WaitForElement().until(ExpectedConditions.visibilityOf(categorySliderPageObjects.Categories));
            CategorySpot.get(0).getText();
            Thread.sleep(2000);
            //  System.out.println("         - 1st Spot: "+CategorySpot.get(0).getText());


            if (Objects.equals(SliderSpot.get(i).getText(), CategorySpot.get(0).getText()))
            {
                System.out.println("***********************************");
                System.out.println(i +" click: "+SliderSpot.get(i).getText());
                System.out.println("         - 1st Spot: "+CategorySpot.get(0).getText());

                System.out.println("Check 1: Category Slider is working");
                System.out.println("Case: Passed");
                System.out.println("************");
            }
            else
            {
                System.out.println("***************************************");
                System.out.println("Check 2: Category Slider is not working");
                System.out.println("Case: Failed");
                System.out.println("************");

                softAssert.assertFalse(true,"L2 Categories not found");
            }
        }
        softAssert.assertAll();


                ChromeSetup.driver.navigate().to("https://m-helpcenter.daraz.pk/web/home.htm?hybrid=1");


        Thread.sleep(5000);
    }


}
