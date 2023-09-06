package Pom;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Loginbank {

	WebDriver driver;
	
	public Loginbank(WebDriver driver) {
		this.driver=driver;
		
	}
	public void LoginFun(String usernameP,String PasswordP) {
		By userid=By.xpath("//input[@name=\"uid\"]");
		By Pass =By.name("Password");
		By button=By.xpath("//input[@name=\"btnLogin\"]");
		//waits
		
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement username=wait.until(ExpectedConditions.visibilityOfElementLocated(userid));
		username.sendKeys(usernameP);
		WebElement password=wait.until(ExpectedConditions.visibilityOfElementLocated(Pass));
		password.sendKeys(PasswordP);
		WebElement loginbutton=wait.until(ExpectedConditions.visibilityOfElementLocated(button));
		loginbutton.submit();

		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
