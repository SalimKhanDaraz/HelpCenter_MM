package Regression_Suite;

import Pages.*;
import Utilis.ChromeSetup;
import Utilis.Teardown;
import Utilis.Wait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.IOException;

import static Utilis.Wait.driver;




public class Regression {


    ChromeSetup CS = new ChromeSetup(driver);

    @BeforeTest
    public void Setup() throws InterruptedException
    {
        Wait.driver = CS.driver();
    }


    @AfterTest
    public void TearDown() throws InterruptedException
    {

        Teardown TD = new Teardown(driver);
        TD.CloseBrowser(driver);

    }

    @Test (priority = 1)
    public void NavigateToShop() throws IOException
    {
        GotoShopMsite GHC = new GotoShopMsite();
        GHC.openURL();
    }

    @Test(priority = 2)
    public void Login() throws IOException, InterruptedException
    {
        LoginPage LP = new LoginPage();
        LP.HCLogin();

    }

    @Test(priority = 3)
    public void HelpCenter() throws InterruptedException {
        NavigatetoHC NHC = new NavigatetoHC(driver);
        NHC.HelpCenter(driver);
    }

    @Test(priority = 4)
    public void HomePage() throws IOException, InterruptedException
    {
        GotoHelpCenter GHC = new GotoHelpCenter(driver);
        GHC.HomePage(driver);

    }

    @Test(priority = 5)
    public void ContactUs() throws InterruptedException {
        ContactUsPage CUP = new ContactUsPage();
        CUP.StillNeedHelp();
    }

    @Test(priority = 6)
    public void Greetings() throws InterruptedException {
        GreetingsPage GP = new GreetingsPage();
        GP.Greetings();
    }

    @Test(priority = 7)
    public void Search() throws InterruptedException {
        SearchPage SP = new SearchPage();
        SP.SearchBoxPlaceholderCheck();
    }

    @Test(priority = 8)
    public void SearchIcon() throws InterruptedException {
        SearchIconPage SIP = new SearchIconPage();
        SIP.SearchIconVerification();
    }

    @Test(priority = 9)
    public void SearchResultNotFound() throws InterruptedException {
        SearchNotFound SNF = new SearchNotFound();
        SNF.Search_NotFound();
    }

    @Test(priority = 10)
    public void SearchRemoveIcon() throws InterruptedException {
        SearchRemoveIcon SRI = new SearchRemoveIcon();
        SRI.SearchRemoveBtnCheck();
    }

    @Test(priority = 11)
    public void SearchBoxEmpty() throws InterruptedException {
        SearchRemoveIcon SRI = new SearchRemoveIcon();
        SRI.SearchboxisEmpty();
    }

    @Test(priority = 12)
    public void SearchSuggestions() throws InterruptedException {
        SearchSuggestionPage SSP = new SearchSuggestionPage();
        SSP.EnterKeywordInSearch();
    }

    @Test(priority = 13)
    public void SearchSuggestionsResult() throws InterruptedException {
        SearchSuggestionPage SSP = new SearchSuggestionPage();
        SSP.SearchSuggestion();
    }

    @Test(priority = 14)
    public void SearchSuggestionArticles(){

        SearchPageArticle SPA = new SearchPageArticle();
        SPA.ClickArticleSearchSuggestion();
    }

    @Test(priority = 15)
    public void ArticlesLandingPage() throws InterruptedException {

        SearchPageArticle SPA = new SearchPageArticle();
        SPA.ArticleLandingPage();
    }

    @Test(priority = 16)
    public void SelfServiceSection() throws InterruptedException {
        SelfServicePage SSP = new SelfServicePage();
        SSP.SelfServiceSection();

    }

    @Test(priority = 17)
    public void SelfService() throws InterruptedException {
        SelfServicePage SSP = new SelfServicePage();
        SSP.SelfServiceTool();
    }

    @Test(priority = 18)
    public void Announcement() throws InterruptedException {
        AnnouncementsPage AP = new AnnouncementsPage();
        AP.Announcements();
    }

    @Test(priority = 19)
    public void Categories() throws InterruptedException {
        CategorySliderPage CSP = new CategorySliderPage();
        CSP.CategoryPage();
    }

    @Test(priority = 20)
    public void CategorySlider() throws InterruptedException {
        CategorySliderPage CSP = new CategorySliderPage();
        CSP.CategorySlide();
    }

    @Test(priority = 21)
    public void CategorySpot() throws InterruptedException {
        CategorySliderPage CSP = new CategorySliderPage();
        CSP.CategorySliderSpot();
    }

    @Test(priority = 22)
    public void FeedbackWithYes() throws InterruptedException {
        FeedbackWithYesPage FWYP = new FeedbackWithYesPage();
        FWYP.ArticlePage();
    }

    @Test(priority = 23)
    public void Feedback() throws InterruptedException {
        FeedbackWithYesPage FWYP = new FeedbackWithYesPage();
        FWYP.Submit_Feedback_Yes();
    }

    @Test(priority = 24)
    public void GotoHomePageForGenericFeedback() throws InterruptedException {
        GenericFeedbackPage GFP = new GenericFeedbackPage();
        GFP.BacktoHomepage();
    }

    @Test(priority = 25)
    public void GenericFeedback() throws InterruptedException {
        GenericFeedbackPage GFP = new GenericFeedbackPage();
        GFP.Generic_Feedback();
    }

    @Test(priority = 26)
    public void ArticlePageFeedbackWithNo() throws InterruptedException {
        FeedbackWithNoPage FWNP = new FeedbackWithNoPage();
        FWNP.ArticlePage();
    }

    @Test(priority = 27)
    public void SubmitFeedbackWithNo() throws InterruptedException {
        FeedbackWithNoPage FWNP = new FeedbackWithNoPage();
        FWNP.Submit_Feedback_No();
    }

    @Test(priority = 28)
    public void TopQuestionsSection() throws InterruptedException {
        TopQuestionsPage TQP = new TopQuestionsPage();
        TQP.TopQuestionsSection();
    }

    @Test(priority = 29)
    public void TopQuestionsArticles() throws InterruptedException {
        TopQuestionsPage TQP = new TopQuestionsPage();
        TQP.ArticlesPage();
    }

}
