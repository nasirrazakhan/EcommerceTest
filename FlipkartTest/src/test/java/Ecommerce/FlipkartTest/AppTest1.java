package Ecommerce.FlipkartTest;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class AppTest1 {
	
	WebDriver driver;
	
  @BeforeTest
  public void beforeTest() {
	  
		System.setProperty("webdriver.chrome.driver", "D:\\Nasir Work Space\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
  }

  @AfterTest
  public void afterTest() {
  }


  @Test
  public void AppTest() {
    throw new RuntimeException("Test not implemented");
  }

}
