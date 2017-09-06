package com.wordpress.objectRepositires;

import org.openqa.selenium.By;

public class LoginObjectRepositery {

	public final By username = By.xpath("//input[@id='user_login']");
	public final By password = By.xpath("//input[@id='user_pass']");
	public final By logInButton = By.id("wp-submit");
	public final By loginError = By.xpath("//div[@id='login_error']");
	
}
