package com.cg.project.beans;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
public class RegisterPage {
	@FindBy(id="user[login]")
	WebElement username;

	@FindBy(id="user[email]")
	WebElement email;
	
	@FindBy(id="user[password]")
	WebElement password;

	@FindBy(xpath="/html/body/div[4]/div[1]/div/div/div[2]/div/form/button")
	WebElement button;

	public WebElement getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username.sendKeys(username);;
	}

	public WebElement getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email.sendKeys(email);;
	}

	public WebElement getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password.sendKeys(password);;
	}

	public void clickSubmitButton() {
		button.submit();
	}


	
}
