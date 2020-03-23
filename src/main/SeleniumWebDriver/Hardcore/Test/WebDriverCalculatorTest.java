package Hardcore.Test;

import Hardcore.Entity.FillingOrder;
import Hardcore.ExecutionSteps.Steps;
import Hardcore.PageObject.TemporaryMailPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;

public class WebDriverCalculatorTest {

    FillingOrder fillingOrder = new FillingOrder(
            "Total Estimated Cost: USD 1,082.77 per 1 month");

    private WebDriver driver;

    @BeforeTest
    public void initDriver() throws InterruptedException {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        Steps steps = new Steps(driver);
        steps.searchPage();
        steps.getSearchingResult();
        steps.fillEmailPage();
    }

    @Test
    public void checkAmountEmail() {
        Steps steps = new Steps(driver);


        Assert.assertEquals(steps.getTitleValueAmount(), steps.valueAmountEmail());
    }

    @AfterTest(alwaysRun = true)
    public void driverTearDown() {
        driver = null;
    }
}
