package BringItOn.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ResultOfEnteredData extends PageObject {
    public ResultOfEnteredData(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @Override
    public void openPage() {
        driver.get("https://pastebin.com/kWh0685u");
    }

    @FindBy(xpath = "//*[@id='paste_code']")
    private WebElement pastedData;

    @FindBy(xpath = "//*[@id='content_left']/div[2]/div[3]/div[1]")
    private WebElement pasteName;

    @FindBy(xpath = "//*[@id='code_buttons']/span[2]/a")
    private WebElement syntaxHighlighting;

    public String getSyntaxHighlighting() {
        return syntaxHighlighting.getText();
    }

    public String getPastedData() {
        return pastedData.getText();
    }

    public String getPasteName() {
        return pasteName.getText();
    }
}
