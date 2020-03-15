package HurtMePlenty.PageObject;

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
        driver.get("https://cloud.google.com/products/calculator/#id=85423bd7-79e4-4e7e-bb63-abbd83493a54");
    }

    @FindBy(xpath = "//*[@id='compute']/md-list/md-list-item[2]/div")
    private WebElement valueVMClass;

    @FindBy(xpath = "//*[@id='compute']/md-list/md-list-item[3]/div")
    private WebElement instanceType;

    @FindBy(xpath = "//*[@id='compute']/md-list/md-list-item[4]/div")
    private WebElement valueOfRegion;

    @FindBy(xpath = "//*[@id='compute']/md-list/md-list-item[5]/div")
    private WebElement valueOfLocalSSD;

    @FindBy(xpath = "//*[@id='compute']/md-list/md-list-item[6]/div")
    private WebElement valueOfCommittedUsage;

    public String getVMClass() {
        return valueVMClass.getText();
    }

    public String getInstanceType() {
        return instanceType.getText();
    }

    public String getValueOfRegion() {
        return valueOfRegion.getText();
    }

    public String getValueOfLocalSSD() {
        return valueOfLocalSSD.getText();
    }

    public String getValueOfCommittedUsage() {
        return valueOfCommittedUsage.getText();
    }
}
