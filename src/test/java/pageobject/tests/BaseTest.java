package pageobject.tests;


import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageobject.pages.*;

public class BaseTest {

    protected WebDriver driver;
    private static final String TEST_URL="https://the-internet.herokuapp.com/";


    @Before
    public void testsSetUp() {
        System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(TEST_URL);
    }

    @After
    public void tearDown() {
        driver.quit();
    }

    public WebDriver getDriver() {
        return driver;
    }
    public HomePage getHomePage(){
        return new HomePage(driver);
    }
    public CheckboxesPage getCheckboxesPage(){
        return new CheckboxesPage(driver);
    }
    public BasePage getBasePage() {
        return new BasePage(driver);
    }
    public DynamicControlsPage getDynamicControlsPage() {
        return new DynamicControlsPage(driver);
    }
    public DisappearingElementsPage getDisappearingElementsPage() {
        return new DisappearingElementsPage(driver);
    }
}
