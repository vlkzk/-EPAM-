package BringItOn.PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PastebinResultBash {
    private WebDriver driver;

    public PastebinResultBash(WebDriver driver) {
        this.driver = driver;
    }

    public boolean getResultOfCreating() {
        return
                  driver.findElement(By.xpath("//*[@id='success']")).getText()
                .equals("NOTE: Your guest paste has been posted. If you sign up for a free account, you can edit and delete your pastes!")
                
                & driver.findElement(By.xpath("//*[@id='content_left']/div[2]/div[3]/div[1]/h1")).getText()
                .equals("how to gain dominance among developers")

                & driver.findElement(By.xpath("//*[@id='paste_code']")).getText()
                .equals("git config --global user.name  'New Sheriff in Town'\n" +
                        "git reset $(git commit-tree HEAD^{tree} -m 'Legacy code')\n" +
                        "git push origin master --force")

                & driver.findElement(By.xpath("//*[@id='code_buttons']/span[2]/a")).getText()
                .equals("Bash");
    }
}
