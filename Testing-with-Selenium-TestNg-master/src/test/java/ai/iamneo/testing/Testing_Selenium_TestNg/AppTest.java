import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import java.util.List;

public class AppTest {

    WebDriver driver;

    @BeforeTest
    public void setUp() {
        // set the system property for the chromedriver
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

        // initialize the Chrome driver
        driver = new ChromeDriver();

        // navigate to the Flipkart website
        driver.get("https://www.flipkart.com/");
    }

    @Test
    public void testLinksCount() {
        // find all the links on the page
        List<WebElement> links = driver.findElements(By.tagName("a"));

        // print the number of links on the page
        System.out.println("Number of Links: " + links.size());

        // print the link text and URLs of all the links on the page
        for (WebElement link : links) {
            System.out.println(link.getText() + " - " + link.getAttribute("href"));
        }
    }

    @AfterTest
    public void tearDown() {
        // close the browser
        driver.quit();
    }
}