import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AbstractClasses extends Run {
    //WebDriver driver;


    public AbstractClasses() {

        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "")
    WebElement byLocator;

    public void openBrowser(String Url) {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get(Url);

    }

    public void implicitWait(Integer time) {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(time));
    }

    public void explicitWaitElementToBeClickable(Integer time, WebElement byLocator) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(time));
        wait.until(ExpectedConditions.elementToBeClickable(byLocator));

    }
}
