package tp;
import org.testng.annotations.Test;
import org.testng.Assert;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
public class GmailAssersion {
  @Test
  public void f() throws InterruptedException{
	  WebDriver driver = new ChromeDriver();
      // Test Condition 1: If Page title matches with actualTitle then it finds email
      // title and enters the value which we pass
      driver.get("https://www.gmail.com");
      String actualTitle = "Gmail";
      String expectedTitle = driver.getTitle();
      Assert.assertEquals(expectedTitle, actualTitle, "Incorrect page title");

	  
  }
}
