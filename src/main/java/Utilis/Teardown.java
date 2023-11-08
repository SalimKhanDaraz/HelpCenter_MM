package Utilis;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Teardown {

    public Teardown(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void CloseBrowser (WebDriver driver) throws InterruptedException
    {
        try {
            if (driver != null) {

                driver.close();
                driver.quit();
            }
        } catch (Exception e) {
            e.printStackTrace();
            driver.close();
            driver.quit();
        }
    }

}

