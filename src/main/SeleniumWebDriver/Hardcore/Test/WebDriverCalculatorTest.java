package Hardcore.Test;

import Hardcore.ExecutionSteps.Steps;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class WebDriverCalculatorTest {

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
        driver.quit();
        driver = null;
    }
}
