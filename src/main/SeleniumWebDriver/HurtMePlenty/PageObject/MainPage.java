package HurtMePlenty.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MainPage extends PageObject{
private static final String BASE_URL = "https://cloud.google.com/" ;

    public MainPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @Override
    public void openPage() {
        driver.get(BASE_URL);
    }

    WebDriverWait wait = new WebDriverWait(driver, 10);

    @FindBy(xpath = "/html/body/section/devsite-header/div/div[1]/div/div/div[2]/devsite-search/form/div[1]/div/input")
    private WebElement searchButton;

    public void searchingPage(){
        wait.until(ExpectedConditions.elementToBeClickable(searchButton));
        searchButton.click();
        searchButton.sendKeys("Google Cloud Platform Pricing Calculator");
        searchButton.submit();
    }
}
