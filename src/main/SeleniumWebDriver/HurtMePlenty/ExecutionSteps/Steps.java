package HurtMePlenty.ExecutionSteps;

import HurtMePlenty.PageObject.CalculatorPage;
import HurtMePlenty.PageObject.MainPage;
import HurtMePlenty.PageObject.ResultOfEnteredData;
import HurtMePlenty.PageObject.ResultOfSearch;
import org.openqa.selenium.WebDriver;

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

    public String getTitleVMClass() {
        ResultOfEnteredData resultOfEnteredData = new ResultOfEnteredData(driver);
        return resultOfEnteredData.getVMClass();
    }

    public String getTitleInstanceType() {
        ResultOfEnteredData resultOfEnteredData = new ResultOfEnteredData(driver);
        return resultOfEnteredData.getInstanceType();
    }

    public String getTitleRegion() {
        ResultOfEnteredData resultOfEnteredData = new ResultOfEnteredData(driver);
        return resultOfEnteredData.getValueOfRegion();
    }

    public String getTitleLocalSSD() {
        ResultOfEnteredData resultOfEnteredData = new ResultOfEnteredData(driver);
        return resultOfEnteredData.getValueOfLocalSSD();
    }

    public String getTitleCommittedUsage() {
        ResultOfEnteredData resultOfEnteredData = new ResultOfEnteredData(driver);
        return resultOfEnteredData.getValueOfCommittedUsage();
    }
}
