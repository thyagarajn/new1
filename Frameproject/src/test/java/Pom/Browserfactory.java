package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.Test;

public class Browserfactory {

	static WebDriver driver ;
	
	@Test
	public static WebDriver startBrowser( String Btype, String URl) {
		
		if(Btype.equalsIgnoreCase(" chrome"))
		{
			driver=new ChromeDriver();
			
		}
		else if(Btype.equalsIgnoreCase(" firefox ")) {
			
			
			driver=new SafariDriver();
			
		}
		
		driver.get(URl);
		driver.manage().window().maximize();
		
		
		
		
		
		
		
		return driver;
		
	}
	
	
	
	
	
	
	
	

}
