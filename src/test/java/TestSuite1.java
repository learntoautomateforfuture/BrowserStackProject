
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSuite1 extends BaseTest {

    @Test(priority = 1)
    public void googleTest(){
        System.out.println("googleTest");
        driver.get("https://www.google.com");
        String title = driver.getTitle();
        Assert.assertEquals(title,"Google");
    }

    @Test(priority = 2)
    public void bingTest(){
        System.out.println("bingTest");
        driver.get("https://www.bing.com");
        String title = driver.getTitle();
        Assert.assertEquals(title,"Bing");
    }

}