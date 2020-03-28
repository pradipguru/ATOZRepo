package packageOne;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ClassTwo {
	//Class Two and three
	
	@Test
	  public void testTwo(){
		  
		WebDriver driver = new FirefoxDriver();
		 
		 driver.get("https://compendiumdev.co.uk/selenium/basic_web_page.html");
		 
		 driver.close();
		  
	  }

}
