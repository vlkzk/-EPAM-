package HurtMePlenty.Test;

import HurtMePlenty.Entity.FillingOrder;
import HurtMePlenty.ExecutionSteps.Steps;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class WebDriverCalculatorTest {

    FillingOrder fillingOrder = new FillingOrder("4 x",
            "VM class: regular",
            "Instance type: n1-standard-8",
            "Total available local SSD space 2x375 GB",
            "Region: Frankfurt",
            "Commitment term: 1 Year"
            );

    private WebDriver driver;

    @BeforeTest
    public void initDriver() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        Steps steps = new Steps(driver);
        steps.searchPage();
        steps.getSearchingResult();
        steps.fillForm("4");
    }

    @Test
    public void checkValueVMClass() {
        Steps steps = new Steps(driver);
        String value = steps.getTitleVMClass();
        Assert.assertEquals(value, fillingOrder.getClassVM());
    }

    @Test
    public void checkInstanceType() {
        Steps steps = new Steps(driver);
        String value = steps.getTitleInstanceType();
        Assert.assertEquals(value, fillingOrder.getTypeInstance());
    }

    @Test
    public void checkRegion() {
        Steps steps = new Steps(driver);
        String value = steps.getTitleRegion();
        Assert.assertEquals(value, fillingOrder.getRegion());
    }

    @Test
    public void checkLocalSSD() {
        Steps steps = new Steps(driver);
        String value = steps.getTitleLocalSSD();
        Assert.assertEquals(value, fillingOrder.getLocalSSD());
    }

    @Test
    public void checkCommittedUsage() {
        Steps steps = new Steps(driver);
        String value = steps.getTitleCommittedUsage();
        Assert.assertEquals(value, fillingOrder.getCommittedUsage());
    }

    @AfterTest (alwaysRun = true)
    public void driverTearDown() {
        driver.quit();
        driver = null;
    }
}
