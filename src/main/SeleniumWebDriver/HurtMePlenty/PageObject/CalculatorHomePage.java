package HurtMePlenty.PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;


public class CalculatorHomePage {

    private WebDriver driver;

    public CalculatorHomePage(WebDriver driver) { this.driver = driver; }

    public void openPage() {
        driver.manage().window().maximize();
        driver.get("https://cloud.google.com/");
    }

    public void enterSearchData() throws InterruptedException {
        WebElement element = driver.findElement(By.xpath("/html/body/section/devsite-header/div/div[1]/div/div/div[2]/devsite-search/form/div[1]/div/input"));
        element.sendKeys("Google Cloud Platform Pricing Calculator");
        element.sendKeys(Keys.ENTER);
        driver.manage().timeouts().setScriptTimeout(5, TimeUnit.SECONDS);
        Thread.sleep(2500);
    }

    public void openCalculator() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id='___gcse_0']/div/div/div/div[5]/div[2]/div/div/div[1]/div[1]/div[1]/div[1]/div/a/b"))
                .click();
        Thread.sleep(15000);
    }

    public void activateSection() {
        driver.findElement(By.xpath("//*[@id='input-0']"))
                .click();
        driver.findElement(By.xpath("//*[@id='ul-0']/li[1]")).click();
    }

//    public void enterNumberOfInstances() {
//        WebElement element = driver.findElement(By.xpath("//*[@id='mainForm']/div[1]/div/md-card/md-card-content/div/div[1]/form/div[1]/div[1]/md-input-container/label"));
//        element.click();
//        element.sendKeys("4");
//    }

//    public void enterOperationSystem() {
//        driver.findElement(By.xpath("//*[@id='select_value_label_48']")).click();
//        driver.findElement(By.xpath("//*[@id='select_option_57']")).click();
//    }
//
//    public void enterMachineClass() {
//        driver.findElement(By.xpath("//*[@id='select_value_label_49']/span[2]")).click();
//        driver.findElement(By.xpath("//*[@id='select_option_69']")).click();
//    }
//

}
