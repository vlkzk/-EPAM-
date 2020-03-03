package ICanWin.PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PastebinHomePage {

    private WebDriver driver;

    public PastebinHomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void openPage() {
        driver.manage().window().maximize();
        driver.get("https://pastebin.com");
    }

    public void enterPast() {
        driver.findElement(By.xpath("//*[@id='paste_code']")).sendKeys("Hello from WebDriver");
    }

    public void enterPasteExpiration() {
        driver.findElement(By.xpath("//*[@id='myform']/div[3]/div[2]/div[2]/span")).click();
        driver.findElement(By.xpath("//*[@id='myform']/div[3]/div[2]/div[2]/select/option[2]")).click();
        driver.findElement(By.xpath("//*[@id='myform']/div[3]/div[2]/div[2]/span")).click();
    }

    public void enterPasteName() {
        driver.findElement(By.xpath("//*[@id='myform']/div[3]/div[5]/div[2]/input")).sendKeys("helloweb");
    }

    public void createNewPast() {
        driver.findElement(By.xpath("//*[@id='submit']")).click();
    }
}
