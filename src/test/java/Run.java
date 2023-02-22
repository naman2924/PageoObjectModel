import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Run {
 WebDriver driver;

    public static void main(String[] args) {

        //WebDriverManager.chromedriver().setup();
        //WebDriver driver= new ChromeDriver();
        AbstractClasses RunMethods=new AbstractClasses();
        RunMethods.openBrowser("https://myolivia.shop/");

    }




}
