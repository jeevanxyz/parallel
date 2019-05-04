package parallelDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class DemoTest1 {
	public WebDriver driver;
	@Parameters({"browser"})
  @Test
  public void test(String browser) throws InterruptedException 
  {
	  if (browser.equals("chrome"))
	  {
		  System.setProperty("webdriver.chrome.driver",
				  "./softwares/chromedriver.exe");
				  driver=new ChromeDriver();
	  }
	  else{
		  System.setProperty("webdriver.gecko.driver",
				  "./softwares/geckodriver.exe");
		  driver=new FirefoxDriver();
	  }
	  driver.get("https://gmail.com");
	  driver.findElement(By.xpath
 ("//input[@id='identifierId']")).sendKeys("admin");
	  Thread.sleep(5000);
	  
  }
}
