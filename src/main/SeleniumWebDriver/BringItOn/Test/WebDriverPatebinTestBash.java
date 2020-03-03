package BringItOn.Test;

import BringItOn.PageObject.PastebinHomeBash;
import BringItOn.PageObject.PastebinResultBash;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class WebDriverPatebinTestBash {
    private WebDriver driver;
    private PastebinHomeBash pastebinHomeBash;
    private PastebinResultBash pastebinResultBash;

    @BeforeMethod(alwaysRun = true)
    public void browserSetup() {
        driver = new ChromeDriver();
        pastebinResultBash = new PastebinResultBash(driver);
        pastebinHomeBash = new PastebinHomeBash(driver);
    }

    @Test
    public void successfulCreateNewPaste() {
        pastebinHomeBash.openPage();
        pastebinHomeBash.enterPast();
        pastebinHomeBash.enterSyntaxHighlighting();
        pastebinHomeBash.enterPasteExpiration();
        pastebinHomeBash.enterPasteName();
        pastebinHomeBash.createNewPast();
        Assert.assertTrue(pastebinResultBash.getResultOfCreating());
    }

    @AfterMethod(alwaysRun = true)
    public void browserTearDown() {
        driver.quit();
        driver = null;
    }
}
