package ICanWin.Test;

import ICanWin.PageObject.PastebinHomePage;
import ICanWin.PageObject.PastebinResult;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class WebDriverPastebinTest {

    private WebDriver driver;
    private PastebinHomePage pastebinHomePage;
    private PastebinResult pastebinResult;

    @BeforeMethod(alwaysRun = true)
    public void browserSetup() {
        driver = new ChromeDriver();
        pastebinResult = new PastebinResult(driver);
        pastebinHomePage = new PastebinHomePage(driver);
    }

    @Test
    public void successfulCreateNewPaste() {
        pastebinHomePage.openPage();
        pastebinHomePage.enterPast();
        pastebinHomePage.enterPasteExpiration();
        pastebinHomePage.enterPasteName();
        pastebinHomePage.createNewPast();
        Assert.assertTrue(pastebinResult.getResultOfCreating());
    }

    @AfterMethod(alwaysRun = true)
    public void browserTearDown() {
        driver.quit();
        driver = null;
    }
}
