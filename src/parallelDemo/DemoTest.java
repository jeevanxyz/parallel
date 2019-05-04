package parallelDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class DemoTest {
	public WebDriver driver;
	@Parameters({"browser"})
  @Test
  public void test(String browser) throws InterruptedException 
  {
	  if(browser.equals("firefox"))
	  {
		  System.setProperty("webdriver.gecko.driver",
				  "./softwares/geckodriver.exe");
		  driver=new FirefoxDriver();	  
	  }
	  else{
		  System.setProperty("webdriver.chrome.driver",
		  "./softwares/chromedriver.exe");
		  driver=new ChromeDriver();
	  }
	  driver.get("https://www.gmail.com");
	 Thread.sleep(5000);
	 driver.close();
	  
	 
	  
	  
	  
	  
	  
  }
}
