package testScript;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage;
import util.TestBaseUtil;

public class TestScripts extends TestBaseUtil {
	TestBaseUtil testBaseUtil;
	LoginPage loginPage;
	HomePage homepage;
	
	 public TestScripts() {
		super();
	}
	
	@BeforeTest
	public void setup() {
		testBaseUtil = new TestBaseUtil();
		TestBaseUtil.initalize2();
	}

	//public static void main(String[] args) throws InterruptedException {
		
		
		/*System.setProperty("webdriver.chrome.driver", "K://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://www.google.com");
		driver.navigate().to("http://www.gcrit.com/build3/admin/login.php");	*/
	@Test(priority=1)	
	public void loginPage1() throws InterruptedException{
		LoginPage loginPage = new LoginPage();
		
		loginPage.typeUserName("admin");
		Thread.sleep(2000);
		loginPage.typePassword("admin@12");
		Thread.sleep(2000);
		loginPage.clickLoginButton();
	
	}
}
