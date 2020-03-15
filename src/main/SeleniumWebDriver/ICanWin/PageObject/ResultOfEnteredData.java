package ICanWin.PageObject;

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
        driver.get("https://pastebin.com/sK813HzC");
    }

    @FindBy(xpath = "//*[@id='selectable']/ol/li/div")
    private WebElement pastedData;

    @FindBy(xpath = "//*[@id='content_left']/div[2]/div[3]/div[1]")
    private WebElement pasteName;

    public String getPastedData() {
        return pastedData.getText();
    }

    public String getPasteName() {
        return pasteName.getText();
    }
}
