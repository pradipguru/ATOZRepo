package packageOne;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ClassOne {
	//This is class one
	//This is a test origin method
  //This is comment
  @Test
  public void testOne(){
	  
	  //comment one
	  
	  WebDriver driver = new FirefoxDriver();
		 
		 driver.get("http://omayo.blogspot.in");
		 
		 driver.close(); 
	  
  }
  
  
}
