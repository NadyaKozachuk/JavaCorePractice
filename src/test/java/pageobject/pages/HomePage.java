package pageobject.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class HomePage extends BasePage {
    private By headLine= By.xpath("//h1[contains(text(),'Welcome')]");
    private By headLineSecond= By.xpath("//div[contains(@id,'content')]//h2");
    private By checkBoxesLink = By.cssSelector("a[href='/checkboxes']");
    private By dynamicControlsLink = By.cssSelector("a[href='/dynamic_controls']");
    private By disappearingElementsLink = By.cssSelector("a[href='/disappearing_elements']");

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public String getHeader() {
        return driver.findElement(headLine).getText();
    }

    public String getHeaderSecond() {
        //List<String> homePageHeadersList = new ArrayList<>();
        //homePageHeadersList.add(driver.findElement(headLine).getText());
        //homePageHeadersList.add(driver.findElement(headLineSecond).getText());
        return driver.findElement(headLineSecond).getText();
    }

    public void clickCheckBoxesLink(){
        driver.findElement(checkBoxesLink).click();
    }
    public void clickDynamicControlsLink(){
        driver.findElement(dynamicControlsLink).click();
    }
    public void clickDisappearingElementsLink(){
        driver.findElement(disappearingElementsLink).click();
    }


    }

