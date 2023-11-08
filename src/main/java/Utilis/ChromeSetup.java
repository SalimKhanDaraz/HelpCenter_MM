package Utilis;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

public class ChromeSetup extends Wait{


    public ChromeSetup(WebDriver driver) {

        PageFactory.initElements(driver, this);
    }

    public WebDriver driver() throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        ChromeDriverService service = ChromeDriverService.createDefaultService();
        ChromeOptions options = new ChromeOptions();
        Map<String, String> mobileEmulation = new HashMap<>();
        mobileEmulation.put("deviceName", "Galaxy S5");
        options.addArguments("headless");
        options.addArguments("--remote-allow-origins=*");
        options.setExperimentalOption("mobileEmulation", mobileEmulation);
        options.setPageLoadStrategy(PageLoadStrategy.EAGER);
        options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        ChromeDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));


        return driver;
    }

}
