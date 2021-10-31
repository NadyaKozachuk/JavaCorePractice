package pageobject.tests;

import driver.DriverSingleton;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;
import org.junit.runner.RunWith;
import org.omg.CORBA.Environment;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import pageobject.pages.*;

public class BaseTestJunit5 {
    protected WebDriver driver;
    private static final String TEST_URL="https://the-internet.herokuapp.com/";

    @Execution(ExecutionMode.CONCURRENT)
    @BeforeEach
    public void testsSetUp() {
        System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(TEST_URL);

        //driver = DriverSingleton.getDriver();
        //driver.manage().window().maximize();
        //driver.get(TEST_URL);
    }

    @AfterEach
    public void tearDown() {
        driver.quit(); }

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
