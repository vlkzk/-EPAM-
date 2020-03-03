package ICanWin.PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PastebinResult {

    private WebDriver driver;

    public PastebinResult(WebDriver driver) {
        this.driver = driver;
    }

    public boolean getResultOfCreating() {
        return driver.findElement(By.xpath("//*[@id='success']")).getText()
                .equals("NOTE: Your guest paste has been posted. If you sign up for a free account, you can edit and delete your pastes!");
    }
}
