import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPom extends AbstractClasses {
    WebDriver driver;

    public LoginPom() {

        this.driver = driver;
        PageFactory.initElements(driver, this);

    }

    @FindBy(id = "")
    WebElement userName;
    @FindBy(id = "")
    WebElement passwordEle;
    @FindBy(css = "")
    WebElement submit;

    public void LoginData(String email, String Password) {
        userName.sendKeys(email);
        passwordEle.sendKeys(Password);
        submit.click();
    }
}





