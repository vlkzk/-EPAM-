package Hardcore.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ResultOfSearch extends PageObject {

    public ResultOfSearch(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @Override
    public void openPage() {
    }

    WebDriverWait wait = new WebDriverWait(driver, 30);

    @FindBy(xpath = "//b[text()='Google Cloud Platform Pricing Calculator']")
    private WebElement resultOfSearch;

    public void getResultOfSearch() {
        wait.until(ExpectedConditions.elementToBeClickable(resultOfSearch));
        resultOfSearch.click();
    }
}
