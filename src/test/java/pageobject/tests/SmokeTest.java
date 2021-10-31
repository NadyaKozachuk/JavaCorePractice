package pageobject.tests;


import org.apache.log4j.Logger;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.junit.Assert.*;


public class SmokeTest extends BaseTest {
    final static org.apache.log4j.Logger logger = Logger.getLogger(SmokeTest.class);

   private static final String TEST_URL="https://the-internet.herokuapp.com/";
    private static final String KEYWORD="Welcome to the-internet";
    private static final String MESSAGE="It's gone!";
    private static final String EXPECTED_BUTTON_NAME="Home";




    @Test
    public void checkSetUp() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe"); // set up path to the chromedriver
        WebDriver chromeDriver = new ChromeDriver(); // Creates a new Chrome instance
        chromeDriver.get(TEST_URL); // Navigates to a page by address
    }

    @Test
    public void checkHeadlineContainsSearchWord(){

        assertTrue(getHomePage().getHeader().contains(KEYWORD));
    }
    @Test
    public void checkCheckboxesPage(){
        getHomePage().clickCheckBoxesLink();
        getHomePage().implicitWait(10);
        logger.info("Deactivate checkbox 2");
        getCheckboxesPage().clickCheckBox();

        assertFalse(getCheckboxesPage().checkboxIsSelected());
    }
    @Test
    public void checkRemoveElement(){
        getHomePage().clickDynamicControlsLink();
        getDynamicControlsPage().clickRemoveButton();
        getHomePage().implicitWait(15);

        assertEquals(MESSAGE,getDynamicControlsPage().getSuccessMessage());
    }
    @Test
    public void checkButtonName() {
        getHomePage().clickDisappearingElementsLink();
        getHomePage().implicitWait(15);
       getDisappearingElementsPage().getButtonTitleList();

    }
}
