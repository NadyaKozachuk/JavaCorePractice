package pageobject.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static com.sun.jmx.snmp.ThreadContext.contains;
import static org.junit.Assert.*;

public class DisappearingElementsPage extends BasePage {

    private By homeButton = By.xpath("//a[contains(text(),'Home')]");
    private By aboutButton = By.xpath("//a[contains(text(),'About')]");
    private By contactUsButton = By.xpath("//a[contains(text(),'Contact Us')]");
    private By portfolioButton = By.xpath("//a[contains(text(),'Portfolio')]");
    private static final String EXPECTED_BUTTON_NAME = "Home";



    public DisappearingElementsPage(WebDriver driver) {
        super(driver);
    }
    public String getButtonText(){
        return driver.findElement(contactUsButton).getText();
    }


    public void getButtonTitleList() {
        List<String> buttonList = new ArrayList<>();
        buttonList.add(driver.findElement(homeButton).getText());
        buttonList.add(driver.findElement(aboutButton).getText());
        buttonList.add(driver.findElement(contactUsButton).getText());
        buttonList.add(driver.findElement(portfolioButton).getText());
        for (String title:buttonList) {
            assertTrue(buttonList.contains(EXPECTED_BUTTON_NAME));
        }
    }
}
