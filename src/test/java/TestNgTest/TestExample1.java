package TestNgTest;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameters;

@Test
public class TestExample1 {
	WebDriver driver;

    @BeforeMethod
    public void beforeMethod() {

        // set path of Chromedriver executable
        System.setProperty("webdriver.chrome.driver","Driver/chromedriver");

        // initialize new WebDriver session
        driver = new ChromeDriver();
    }

    public void navigateToAUrl() {
        // navigate to the web site
        driver.get("http://selenium.dev");
        // Validate page title
        AssertJUnit.assertEquals(driver.getTitle(), "Selenium");
    }
    
    public void navigateToAUrl1() {
        // navigate to the web site
        driver.get("https://google.com/");
        // Validate page title
        AssertJUnit.assertEquals(driver.getTitle(), "Google");
    }
    
    public void navigateToAUrl2() {
        // navigate to the web site
        driver.get("https://www.facebook.com/");
        // Validate page title
        AssertJUnit.assertEquals(driver.getTitle(), "Facebook-log in or sign up");
    }
    
    public void navigateToAUrl3() {
        // navigate to the web site
        driver.get("https://www.naukri.com");
        System.out.println("Naukri Page");
        // Validate page title
        //Assert.assertEquals(driver.getTitle(), "Google");
    }
    
    @Test
    public void StringCheck(String m) {
        // navigate to the web site
        
        System.out.println(m);
        // Validate page title
        //Assert.assertEquals(driver.getTitle(), "Google");
    }
    @AfterMethod
    public void afterMethod() {

        // close and quit the browser
        driver.quit();
    }

}
