package Hardcore.PageObject;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FillEmailCalculatorPage extends PageObject {
    @Override
    public void openPage() {
    }

    public FillEmailCalculatorPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    JavascriptExecutor js = (JavascriptExecutor) driver;

    @FindBy(xpath = "//*[@id='input_395']")
    private WebElement fieldEmailSet;

    @FindBy(xpath = "//*[@id='dialogContent_401']/form/md-dialog-actions/button[2]")
    private WebElement buttonSendEmail;

    public void setEmail(String email) {
        switchTabByIndex(0);
        driver.switchTo().frame(0);
        driver.switchTo().frame("myFrame");
        fieldEmailSet.click();
        fieldEmailSet.sendKeys(email);
    }

    public void sendResult() {
        js.executeScript("arguments[0].click()", buttonSendEmail);
    }
}
