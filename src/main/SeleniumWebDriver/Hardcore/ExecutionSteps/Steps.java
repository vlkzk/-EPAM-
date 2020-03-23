package Hardcore.ExecutionSteps;

import Hardcore.PageObject.*;
import org.openqa.selenium.WebDriver;

import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class Steps {
    private WebDriver driver;

    public Steps(WebDriver driver) {
        this.driver = driver;
    }

    public void searchPage() {
        MainPage mainPage = new MainPage(driver);
        mainPage.openPage();
        mainPage.searchingPage();
    }

    public void getSearchingResult() {
        ResultOfSearch resultOfSearch = new ResultOfSearch(driver);
        resultOfSearch.getResultOfSearch();
    }

    public void fillForm(String value) {
        CalculatorPage calculatorPage = new CalculatorPage(driver);
        calculatorPage.setValueOfInstance(value);
        calculatorPage.selectOperationSystem();
        calculatorPage.selectVMClass();
        calculatorPage.selectMachineType();
        calculatorPage.addGPU();
        calculatorPage.selectLocalSSD();
        calculatorPage.selectDataCenterLocation();
        calculatorPage.selectCommittedUsage();
        calculatorPage.addToEstimate();
    }

    public void fillEmailPage() throws InterruptedException {
        ResultOfEnteredData resultOfEnteredData = new ResultOfEnteredData(driver);
        TemporaryMailPage temp = new TemporaryMailPage(driver);
        FillEmailCalculatorPage fillEmailCalculatorPage = new FillEmailCalculatorPage(driver);
        fillForm("4");
        resultOfEnteredData.pushButtonEmail();
        temp.openSiteInNewTab();
        String email = temp.copyEmailAddress();
        fillEmailCalculatorPage.setEmail(email);
        fillEmailCalculatorPage.sendResult();
        temp.getMessage();
    }

    public String valueAmountEmail() {
        TemporaryMailPage temp = new TemporaryMailPage(driver);
        String title = temp.getAmount();
        return Parser.getPartString(title);
    }

    public String getTitleValueAmount() {
        ResultOfEnteredData resultOfEnteredData = new ResultOfEnteredData(driver);
        String title = resultOfEnteredData.getValueAmount();
        return Parser.parseLineForWordsOnMiddle(title);
    }
}
