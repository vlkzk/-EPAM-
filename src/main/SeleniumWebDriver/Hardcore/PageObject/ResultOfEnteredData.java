package Hardcore.PageObject;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ResultOfEnteredData extends PageObject {
    public ResultOfEnteredData(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    JavascriptExecutor js = (JavascriptExecutor) driver;

    @Override
    public void openPage() {
        driver.get("https://cloud.google.com/products/calculator/#id=85423bd7-79e4-4e7e-bb63-abbd83493a54");
    }

    @FindBy(xpath = "//*[@id='resultBlock']//h2/b")
    private WebElement valueAmount;

    @FindBy(xpath = "//*[@id='email_quote']")
    private WebElement buttonEmailEstimate;

    public void pushButtonEmail() {
        js.executeScript("arguments[0].click()", buttonEmailEstimate);
    }

    public String getValueAmount() {
        switchTabByIndex(0);
        driver.switchTo().frame(0);
        driver.switchTo().frame("myFrame");
        String value = valueAmount.getText();
        switchTabByIndex(1);
        return value;
    }
}
