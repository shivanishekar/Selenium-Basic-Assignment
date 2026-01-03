import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Drivercmds {

    public static void main(String[] args) {

        System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");

        WebDriver driver = new FirefoxDriver();

        driver.get("https://automationpanda.com/");
        String title = driver.getTitle();
        System.out.println("The title of the website is: " + title);

        driver.quit();
    }
}

// output : The title of the website is: Automation Panda 
// will display the page of https://automationpanda.com/
