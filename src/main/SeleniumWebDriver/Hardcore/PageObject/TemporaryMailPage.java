package Hardcore.PageObject;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class TemporaryMailPage extends PageObject {
    public TemporaryMailPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
        url = "https://10minutemail.com";
    }

    WebDriverWait wait = new WebDriverWait(driver, 30);

    @Override
    public void openPage() {
        driver.get(url);
    }

    @FindBy(xpath = "//*[@id='mail_address']")
    private WebElement mailAddress;

    @FindBy(xpath = "//span[@class='small_message_icon']")
    private WebElement getMessage;

    @FindBy(xpath = "//*[@id='mobilepadding']/td/table/tbody/tr[1]/td[4]")
    private WebElement costValue;

    public void openSiteInNewTab() {
        createNewTab();
        switchTabByIndex(1);
        driver.get(url);
    }

    public String copyEmailAddress() throws InterruptedException {
        Thread.sleep(2500);
        return mailAddress.getAttribute("value");
    }

    public void getMessage() {
        switchTabByIndex(1);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[@class='small_message_icon']")));
        getMessage.click();
        costValue.getAttribute("value");
    }

    public String getAmount() {
        return costValue.getText();
    }
}
