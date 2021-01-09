package org.com;

import javax.management.loading.PrivateClassLoader;

import org.net.BaseClass1;
import org.omg.CORBA.PRIVATE_MEMBER;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pom1_class extends BaseClass1 {

	
	public pom1_class() {
		
	PageFactory.initElements(driver, this);
	
	}
	@FindBy(id="username")
    private WebElement username;
	
	@FindBy (id="password")
	private WebElement password;
	
	@FindBy (id="login")
	private WebElement login;

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLogin() {
		return login;
	
	
	}
	
}
