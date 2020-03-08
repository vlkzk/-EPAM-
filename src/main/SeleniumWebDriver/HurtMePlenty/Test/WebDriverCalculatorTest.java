package HurtMePlenty.Test;
import HurtMePlenty.PageObject.CalculatorHomePage;
import HurtMePlenty.PageObject.CalculatorResltPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



public class WebDriverCalculatorTest {
    private WebDriver driver;
    private CalculatorHomePage calculatorHomePage;
    private CalculatorResltPage calculatorResltPage;

    @BeforeMethod(alwaysRun = true)
    public void browserSetup() {
        driver = new ChromeDriver();
        calculatorHomePage = new CalculatorHomePage(driver);
        calculatorResltPage = new CalculatorResltPage(driver);
    }

    @Test
    public void Test() throws InterruptedException {
        calculatorHomePage.openPage();
        calculatorHomePage.enterSearchData();
        calculatorHomePage.openCalculator();
        calculatorHomePage.activateSection();
//        calculatorHomePage.enterNumberOfInstances();
//        calculatorHomePage.enterOperationSystem();
//        calculatorHomePage.enterMachineClass();
    }


    @AfterMethod(alwaysRun = true)
    public void browserTearDown() {
        driver = null;
    }
}
