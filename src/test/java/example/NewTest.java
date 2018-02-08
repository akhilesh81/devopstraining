package example;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class NewTest {

	private WebDriver driver;
 
	@Test
  public void f() {
		driver.get("http://demo.guru99.com/test/guru99home/");  
		String title = driver.getTitle();				 
		Assert.assertTrue(title.contains("Demo Guru99 Page"));
		//System.out.println("Hello");
	}
		@Test
		  public void e() {
				System.out.println("Hello");

  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.gecko.driver", "C:\\Users\\DELL\\Downloads\\geckodriver.exe");
	  final FirefoxOptions options = new FirefoxOptions();
	  options.addPreference("security.sandbox.content.level", 5);
	  driver = new FirefoxDriver(options);
	  //driver = new FirefoxDriver();
  }

  @AfterTest
  public void afterTest() {
	  driver.quit();
  }

}
