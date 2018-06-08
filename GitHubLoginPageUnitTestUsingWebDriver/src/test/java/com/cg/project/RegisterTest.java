package com.cg.project;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import com.cg.project.beans.LoginPage;
import com.cg.project.beans.RegisterPage;

public class RegisterTest {
	static WebDriver driver;
	private RegisterPage registerPage;
	
	@BeforeClass
	public static void setUpDriverEnv()
	{
		System.setProperty("webdriver.chrome.driver", "D://chromedriver_win32//chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	@Before
	public void setUpTestEnv() {
		driver.get("https://github.com");
		registerPage= new RegisterPage();
		PageFactory.initElements(driver, registerPage);
	}
	
	@Test
	public void testForValidUser(){
		registerPage.setUsername("IndraSaha007");
		registerPage.setEmail("indsaha94@gmail.com");
		registerPage.setPassword("@Supaul20");
		registerPage.clickSubmitButton();
	}
	
	/*@AfterClass
	public static void tearDownDriverEnv(){
		driver.close();
		driver=null;
	}*/

}
