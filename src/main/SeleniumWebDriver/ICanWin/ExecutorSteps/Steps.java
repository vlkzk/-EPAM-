package ICanWin.ExecutorSteps;

import ICanWin.PageObject.EnterDataPage;
import ICanWin.PageObject.MainPage;
import ICanWin.PageObject.ResultOfEnteredData;
import org.openqa.selenium.WebDriver;

public class Steps {
    private WebDriver driver;

    public Steps(WebDriver driver) {
        this.driver = driver;
    }

    public void openPage() {
        MainPage mainPage = new MainPage(driver);
        mainPage.openPage();
    }

    public void fillForm() {
        EnterDataPage enterDataPage = new EnterDataPage(driver);
        enterDataPage.enterCode();
        enterDataPage.setPasteExpiration();
        enterDataPage.setPasteName();
        enterDataPage.createNewPast();
    }
    public String getTitlePastedData() {
        ResultOfEnteredData resultOfEnteredData = new ResultOfEnteredData(driver);
        return resultOfEnteredData.getPastedData();
    }

    public String getTitlePasteName() {
        ResultOfEnteredData resultOfEnteredData = new ResultOfEnteredData(driver);
        return resultOfEnteredData.getPasteName();
    }
}

