package BringItOn.PageObject;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class EnterDataPage extends PageObject {
    public EnterDataPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @Override
    public void openPage() {
        driver.get("https://pastebin.com/");
    }

    WebDriverWait wait = new WebDriverWait(driver, 10);
    JavascriptExecutor js = (JavascriptExecutor) driver;

    @FindBy(xpath = "//*[@id='paste_code']")
    private WebElement fieldOfPasteCode;

    @FindBy(xpath = "//*[@id='myform']/div[3]/div[1]/div[2]/span")
    private WebElement fieldOfSyntaxHighlighting;
    @FindBy(xpath = "//*[@id='myform']/div[3]/div[1]/div[2]/select/option[3]")
    private WebElement valueOfSyntaxHighlighting;

    @FindBy(xpath = "//*[@id='myform']/div[3]/div[2]/div[2]/span")
    private WebElement fieldOfPasteExpiration;
    @FindBy(xpath = "//*[@id='myform']/div[3]/div[2]/div[2]/select/option[2]")
    private WebElement valueOfPasteExpiration;

    @FindBy(xpath = "//*[@id='myform']/div[3]/div[5]/div[2]/input")
    private WebElement fieldOfPasteName;

    @FindBy(xpath = "//*[@id='submit']")
    private WebElement submitButton;


    public void enterCode() {
        wait.until(ExpectedConditions.elementToBeClickable(fieldOfPasteCode));
        js.executeScript("arguments[0].click()", fieldOfPasteCode);
        fieldOfPasteCode.sendKeys("git config --global user.name  'New Sheriff in Town'\n" +
                "git reset $(git commit-tree HEAD^{tree} -m 'Legacy code')\n" +
                "git push origin master --force");
    }

    public void setSyntaxHighlighting() {
        driver.manage().timeouts().setScriptTimeout(2, TimeUnit.SECONDS);
        fieldOfSyntaxHighlighting.click();
        driver.manage().timeouts().setScriptTimeout(2, TimeUnit.SECONDS);
        valueOfSyntaxHighlighting.click();
        driver.manage().timeouts().setScriptTimeout(2, TimeUnit.SECONDS);
        fieldOfSyntaxHighlighting.click();
    }

    public void setPasteExpiration() {
        driver.manage().timeouts().setScriptTimeout(2, TimeUnit.SECONDS);
        fieldOfPasteExpiration.click();
        driver.manage().timeouts().setScriptTimeout(2, TimeUnit.SECONDS);
        valueOfPasteExpiration.click();
        driver.manage().timeouts().setScriptTimeout(2, TimeUnit.SECONDS);
        fieldOfPasteExpiration.click();
    }

    public void setPasteName() {
        wait.until(ExpectedConditions.elementToBeClickable(fieldOfPasteName));
        js.executeScript("arguments[0].click()", fieldOfPasteName);
        fieldOfPasteName.sendKeys("how to gain dominance among developers");
    }

    public void createNewPast() {
        submitButton.submit();
    }
}
