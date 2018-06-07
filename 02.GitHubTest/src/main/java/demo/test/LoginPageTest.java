package demo.test;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class LoginPageTest {
	private static WebDriver driver;
	private static LoginPageTest loginpage;
	@BeforeClass
	public void setUpTestEnv(){
		driver=new ChromeDriver();
		
	}
	@Before
	public void setUpTest(){
		loginpage=new LoginPageTest();
		driver.get("https://github.com/login");
		
	}
	
	@After
	public void refreshEnv()
	{
		loginpage=null;
		
	}
	@AfterClass
	public void endUpEnv()
	{
		
	}
	
}