package BringItOn.PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PastebinHomeBash {

    private WebDriver driver;

    public PastebinHomeBash(WebDriver driver) {
        this.driver = driver;
    }

    public void openPage() {
        driver.manage().window().maximize();
        driver.get("https://pastebin.com");
    }

    public void enterPast() {
        driver.findElement(By.xpath("//*[@id='paste_code']"))
                .sendKeys("git config --global user.name  'New Sheriff in Town'\n" +
                        "git reset $(git commit-tree HEAD^{tree} -m 'Legacy code')\n" +
                        "git push origin master --force");
    }

    public void enterSyntaxHighlighting() {
        driver.findElement(By.xpath("//*[@id='myform']/div[3]/div[1]/div[2]/span")).click();
        driver.findElement(By.xpath("//*[@id='myform']/div[3]/div[1]/div[2]/select/option[3]")).click();
        driver.findElement(By.xpath("//*[@id='myform']/div[3]/div[1]/div[2]/span")).click();
    }

    public void enterPasteExpiration() {
        driver.findElement(By.xpath("//*[@id='myform']/div[3]/div[2]/div[2]/span")).click();
        driver.findElement(By.xpath("//*[@id='myform']/div[3]/div[2]/div[2]/select/option[2]")).click();
        driver.findElement(By.xpath("//*[@id='myform']/div[3]/div[2]/div[2]/span")).click();
    }

    public void enterPasteName() {
        driver.findElement(By.xpath("//*[@id='myform']/div[3]/div[5]/div[2]/input"))
                .sendKeys("how to gain dominance among developers");
    }

    public void createNewPast() {
        driver.findElement(By.xpath("//*[@id='submit']")).click();
    }
}
