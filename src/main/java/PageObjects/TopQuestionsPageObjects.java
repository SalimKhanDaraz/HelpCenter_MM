package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class TopQuestionsPageObjects {

    public TopQuestionsPageObjects(WebDriver driver) {PageFactory.initElements(driver, this);}

    @FindBy(xpath = "//*[@class=\"tITMzDBm9656dono8C6j\"]")
    public WebElement TopQuestion_Section;

    @FindBy(xpath = "//*[@class=\"kefbN5wilL5_z_JAQ8aQ\"]")
    public WebElement TopQuestion_Articles;

    @FindBy(xpath = "//*[@class=\"aRLClMMX4At4DDn_6QPG\"]")
    public List<WebElement> TopQuestion_AllArticle;

    @FindBy(xpath = "//h1[@class=\"zOAodfFFSXYQxHntYUeh\"]")
    public WebElement ArticlePage;

}
