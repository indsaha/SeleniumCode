package demo.pojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
	
	@FindBy(id="login_field")
	WebElement username;
	
	@FindBy(id="password")
	WebElement password;
	
	@FindBy(className="btn")
	WebElement button;

}
