package pageobject.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckboxesPage extends BasePage{

    private By checkBox = By.xpath("//*[@id='checkboxes']/input[2]");
    //private By checkBoxOff = By.xpath("//input[contains(@type,'checkbox')][@checked])");
    private By checkboxHeader = By.xpath("//div[@class='example']");

    public CheckboxesPage(WebDriver driver) {
        super(driver);
    }

    public void clickCheckBox(){
        driver.findElement(checkBox).click();
    }

    public String checkHeaderCheckboxPage(){
        return driver.findElement(checkboxHeader).getText();
    }

    public boolean checkboxIsSelected(){
        return driver.findElement(checkBox).isSelected();
    }

}
