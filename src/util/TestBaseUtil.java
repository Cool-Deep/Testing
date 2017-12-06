package util;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBaseUtil {
	
	public static WebDriver driver;
	
	public TestBaseUtil(){
				
	}
	
public static void initalize2() {
	
	
	System.setProperty("webdriver.chrome.driver", "K://chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.get("http://www.google.com");
	driver.navigate().to("http://www.gcrit.com/build3/admin/login.php");
}


}
