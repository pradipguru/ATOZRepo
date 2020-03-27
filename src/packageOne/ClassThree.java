package packageOne;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ClassThree {
	//Class Three
	@Test
	  public void testThree(){
		  
		WebDriver driver = new FirefoxDriver();
		 
		 driver.get("http://newtours.demoaut.com");
		 
		 driver.close();	  
		  
	  }

}
