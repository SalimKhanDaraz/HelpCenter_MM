package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GreetingsPageObjects {

    public GreetingsPageObjects(WebDriver driver) {PageFactory.initElements(driver, this);}

    @FindBy(xpath = "//*[@class=\"nhIZA2SM8Ej0xRmL4NSk\"]")
    public WebElement Greeting_Section;

    @FindBy(xpath = "//*[@class=\"iYyH_w8TTMkQ2IGAUKZe\"]")
    public WebElement Greeting_Content;

}

