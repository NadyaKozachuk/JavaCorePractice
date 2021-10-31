package pageobject.tests;

import org.apache.log4j.Logger;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static com.sun.jmx.snmp.ThreadContext.contains;
import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertAll;

@Execution(ExecutionMode.CONCURRENT)
public class SmokeJunit5 extends BaseTestJunit5 {
    final static org.apache.log4j.Logger logger = Logger.getLogger(SmokeTest.class);

    private static final String TEST_URL="https://the-internet.herokuapp.com/";
    private static final String KEYWORD="Welcome to the-internet";
    private static final String KEYWORD_SECOND="Available Examples";
    private static final String MESSAGE="It's gone!";


    public void checkSetUp() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe"); // set up path to the chromedriver
        WebDriver chromeDriver = new ChromeDriver(); // Creates a new Chrome instance
        chromeDriver.get(TEST_URL); // Navigates to a page by address
    }

    @RepeatedTest(2)
    @Test
    public void checkHeadlineContainsSearchWord(){

        Assertions.assertTrue(getHomePage().getHeader().contains(KEYWORD));
    }

    @Test
    public void checkCheckboxesPage(){
        getHomePage().clickCheckBoxesLink();
        getHomePage().implicitWait(10);
        logger.info("Deactivate checkbox");
        getCheckboxesPage().clickCheckBox();

        Assertions.assertFalse(getCheckboxesPage().checkboxIsSelected());
    }

    @Test
    public void checkRemoveElement(){
        getHomePage().clickDynamicControlsLink();
        getDynamicControlsPage().clickRemoveButton();
        getHomePage().implicitWait(15);

        Assertions.assertEquals(MESSAGE,getDynamicControlsPage().getSuccessMessage());
    }
    @ParameterizedTest
    @ValueSource(strings = { KEYWORD, KEYWORD_SECOND })
    void checkHeadlineContainsKeywords(String argument) {
        assertEquals(argument, getHomePage().getHeaderSecond());
    }

    @Test
    public void checkHomePageHeaders(){
        assertAll("headers",
                () -> assertEquals(KEYWORD,getHomePage().getHeader()),
                () -> assertEquals(KEYWORD_SECOND,getHomePage().getHeaderSecond())
        );
    }
}
