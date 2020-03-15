package BringItOn.Test;

import BringItOn.Entity.FillingOrder;
import BringItOn.ExecutorSteps.Steps;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class WebDriverPastebinTest {
    FillingOrder fillingOrder = new FillingOrder(
            "git config --global user.name  'New Sheriff in Town'\n" +
                    "git reset $(git commit-tree HEAD^{tree} -m 'Legacy code')\n" +
                    "git push origin master --force",
            "how to gain dominance among developers",
            "Bash");

    private WebDriver driver;

    @BeforeTest
    public void initDriver() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        Steps steps = new Steps(driver);
        steps.openPage();
        steps.fillForm();
    }

    @Test
    public void checkPasteCode() {
        Steps steps = new Steps(driver);
        String value = steps.getTitlePastedData();
        Assert.assertEquals(value, fillingOrder.getCode());
    }

    @Test
    public void checkSyntaxHighlighting() {
        Steps steps = new Steps(driver);
        String value = steps.getTitleSyntaxHighlighting();
        Assert.assertEquals(value, fillingOrder.getBash());
    }

    @Test
    public void checkPasteName() {
        Steps steps = new Steps(driver);
        String value = steps.getTitlePasteName();
        Assert.assertEquals(value, fillingOrder.getPasteName());
    }

    @AfterTest(alwaysRun = true)
    public void driverTearDown() {
        driver = null;
    }
}
