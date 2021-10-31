package pageobject.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DynamicControlsPage extends BasePage {
    private By removeButton = By.xpath("//button[contains(text(),'Remove')]");
    private By successMessage = By.xpath("//p[contains(text(),'gone!')]");

    public DynamicControlsPage(WebDriver driver) {
        super(driver);
    }
    public void clickRemoveButton(){
        driver.findElement(removeButton).click();
    }
    public String getSuccessMessage(){
        return driver.findElement(successMessage).getText();
    }


}
