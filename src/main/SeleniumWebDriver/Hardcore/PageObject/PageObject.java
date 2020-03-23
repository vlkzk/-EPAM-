package Hardcore.PageObject;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import java.util.ArrayList;

public abstract class PageObject {
    protected WebDriver driver;
    public abstract void openPage();
    protected String url;

    public PageObject(WebDriver driver){
        this.driver = driver;
    }

    public void createNewTab() {
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("window.open();");
    }

    public void switchTabByIndex(int index) {
        ArrayList<String> allTabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(allTabs.get(index));
    }
}
