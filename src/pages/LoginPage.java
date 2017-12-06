package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import util.TestBaseUtil;

public class LoginPage extends TestBaseUtil{

	
	 public LoginPage() {
		this.driver=driver;
	}
	 
	By Username = By.name("username");
	By Password = By.name("password");
	By LoginButton = By.id("tdb1");

	
	
	public void typeUserName(String uname) {
		driver.findElement(Username).sendKeys(uname);
	}
	
	public void typePassword(String pass) {
		driver.findElement(Password).sendKeys(pass);
	}
	public void clickLoginButton() {
		driver.findElement(LoginButton).click();
	
	}
	
	
}
