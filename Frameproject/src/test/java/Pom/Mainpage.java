package Pom;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class Mainpage {

	
	
	WebDriver driver;
	
	@Test
	
	public void Runner() {
		
		driver=  Browserfactory.startBrowser(" chrome", " https://demo.guru99.com/V4/");
		Loginbank l =new Loginbank(driver);
		l.LoginFun("thyagarar", "788yyyy");
	}
}
