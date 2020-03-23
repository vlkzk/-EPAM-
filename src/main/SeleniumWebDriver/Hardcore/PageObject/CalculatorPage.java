package Hardcore.PageObject;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class CalculatorPage extends PageObject {

    public CalculatorPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @Override
    public void openPage() {
        driver.get("https://cloud.google.com/products/calculator/");
    }

    WebDriverWait wait = new WebDriverWait(driver, 30);
    JavascriptExecutor js = (JavascriptExecutor) driver;

    @FindBy(xpath = "//*[@id='mainForm']//md-input-container/input")
    private WebElement fieldOfInstance;

    @FindBy(xpath = "//*[@id='mainForm']/descendant::md-input-container[@class='flex md-input-has-value']/md-select")
    private WebElement fieldOfOperationSystem;
    @FindBy(xpath = "//md-option[@value='free']/div[@class='md-text']")
    private WebElement valueOfOperationSystem;

    @FindBy(xpath = "//md-select[@placeholder='VM Class']//span[@class='md-select-icon']")
    private WebElement fieldOfMachineClass;
    @FindBy(xpath = "//div[@class='md-select-menu-container md-active md-clickable']//div[text()='Regular']")
    private WebElement valueOfMachineClass;

    @FindBy(xpath = "//md-select[@placeholder='Instance type']//span[@class='md-select-icon']")
    private WebElement fieldOfMachineType;
    @FindBy(css = "md-option[value='CP-COMPUTEENGINE-VMIMAGE-N1-STANDARD-8'] div")
    private WebElement valueOfMachineType;

    @FindBy(xpath = "//*[@class='md-container md-ink-ripple']")
    private WebElement addGPU;

    @FindBy(xpath = "//md-select[@placeholder='Number of GPUs']//span[@class='md-select-icon']")
    private WebElement fieldOfNumberGPU;
    @FindBy(xpath = "//div[@class='md-select-menu-container md-active md-clickable']//md-option[@value='1']")
    private WebElement valueOfGPU;
    @FindBy(xpath = "//md-select[@placeholder='GPU type']//span[@class='md-select-icon']")
    private WebElement fieldOfGPUType;
    @FindBy(css = "md-option[value='NVIDIA_TESLA_V100']")
    private WebElement typeOfGPU;

    @FindBy(xpath = "//*[@id='select_value_label_166']")
    private WebElement fieldOfLocalSSD;
    @FindBy(xpath = "//*[@id='select_option_229']")
    private WebElement valueOfLocalSSD;

    @FindBy(xpath = "//*[@id='select_value_label_53']")
    private WebElement fieldOfDataCenterLocation;
    @FindBy(xpath = "//*[@id='select_option_177']")
    private WebElement valueOfDataCenterLocation;

    @FindBy(xpath = "//*[@id='select_value_label_54']")
    private WebElement fieldOfCommittedUsage;
    @FindBy(xpath = "//*[@id='select_option_87']")
    private WebElement valueOfCommittedUsage;

    @FindBy(xpath = "//*[@id='mainForm']/div[1]/div/md-card/md-card-content/div/div[1]/form/div[15]/button")
    private WebElement addToEstimateButton;

    public void setValueOfInstance(String value) {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.switchTo().frame(0);
        driver.switchTo().frame("myFrame");
        wait.until(ExpectedConditions.elementToBeClickable(fieldOfInstance));
        fieldOfInstance.sendKeys(value);
    }

    public void selectOperationSystem() {
        wait.until(ExpectedConditions.elementToBeClickable(fieldOfOperationSystem));
        js.executeScript("arguments[0].click()", fieldOfOperationSystem);
        wait.until(ExpectedConditions.elementToBeClickable(valueOfOperationSystem));
        js.executeScript("arguments[0].click()", valueOfOperationSystem);
    }

    public void selectVMClass() {
        wait.until(ExpectedConditions.elementToBeClickable(fieldOfMachineClass));
        js.executeScript("arguments[0].click()", fieldOfMachineClass);
        wait.until(ExpectedConditions.elementToBeClickable(valueOfMachineClass));
        js.executeScript("arguments[0].click()", valueOfMachineClass);
    }

    public void selectMachineType() {
        wait.until(ExpectedConditions.elementToBeClickable(fieldOfMachineType));
        js.executeScript("arguments[0].click()", fieldOfMachineType);
        wait.until(ExpectedConditions.elementToBeClickable(valueOfMachineType));
        js.executeScript("arguments[0].click()", valueOfMachineType);
    }

    public void addGPU() {
        wait.until(ExpectedConditions.elementToBeClickable(addGPU));
        js.executeScript("arguments[0].click()", addGPU);
        wait.until(ExpectedConditions.elementToBeClickable(fieldOfNumberGPU));
        js.executeScript("arguments[0].click()", fieldOfNumberGPU);
        wait.until(ExpectedConditions.elementToBeClickable(valueOfGPU));
        js.executeScript("arguments[0].click()", valueOfGPU);
        wait.until(ExpectedConditions.elementToBeClickable(fieldOfGPUType));
        js.executeScript("arguments[0].click()", fieldOfGPUType);
        wait.until(ExpectedConditions.elementToBeClickable(typeOfGPU));
        js.executeScript("arguments[0].click()", typeOfGPU);
    }

    public void selectLocalSSD() {
        wait.until(ExpectedConditions.elementToBeClickable(fieldOfLocalSSD));
        js.executeScript("arguments[0].click()", fieldOfLocalSSD);
        wait.until(ExpectedConditions.elementToBeClickable(valueOfLocalSSD));
        js.executeScript("arguments[0].click()", valueOfLocalSSD);
    }

    public void selectDataCenterLocation() {
        wait.until(ExpectedConditions.elementToBeClickable(fieldOfDataCenterLocation));
        js.executeScript("arguments[0].click()", fieldOfDataCenterLocation);
        wait.until(ExpectedConditions.elementToBeClickable(valueOfDataCenterLocation));
        js.executeScript("arguments[0].click()", valueOfDataCenterLocation);
    }

    public void selectCommittedUsage() {
        wait.until(ExpectedConditions.elementToBeClickable(fieldOfCommittedUsage));
        js.executeScript("arguments[0].click()", fieldOfCommittedUsage);
        wait.until(ExpectedConditions.elementToBeClickable(valueOfCommittedUsage));
        js.executeScript("arguments[0].click()", valueOfCommittedUsage);
    }

    public void addToEstimate() {
        addToEstimateButton.submit();
    }
}
