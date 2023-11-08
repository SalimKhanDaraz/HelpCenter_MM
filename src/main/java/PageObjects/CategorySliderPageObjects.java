package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class CategorySliderPageObjects {

    public CategorySliderPageObjects(WebDriver driver) {PageFactory.initElements(driver, this);}

    @FindBy(xpath = "//*[@class=\"Ve1nldNCvVN1B5F6XLta\"]//div")
    public WebElement Categories;


    @FindBy(xpath = "//*[@class=\"Ve1nldNCvVN1B5F6XLta\"]//div")
    public List<WebElement> CategorySlider;

    @FindBy(xpath = "//*[@class=\"ZBHhIA_OT_1jo3YsnlG4\"]//a")
    public WebElement L1Categories;

    @FindBy(xpath = "//h2[text()=\"Promotions\"]")
    public WebElement Category;


    @FindBy(xpath = "//p[text()=\"Promotions\"]")
    public WebElement PromotionCategory;



}

