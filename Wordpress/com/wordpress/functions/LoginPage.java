package com.wordpress.functions;

import com.wordpress.Utilites.GeneralUtilites;
import com.wordpress.objectRepositires.LoginObjectRepositery;

public class LoginPage extends GeneralUtilites {

	LoginObjectRepositery login = new LoginObjectRepositery();

	public void enterUserName(String userName) {

		try {
			elementDisplayed(login.username);
			sendText(login.username, userName);
		} catch (Exception e) {
			System.out.println("Element" + userName + " is not displayed");
			takeScreenShot("Failed enterUserName");
		}
	}

	public void enterPassWord(String passWord) {
		try {
			elementDisplayed(login.password);
			sendText(login.password, passWord);
		} catch (Exception e) {
			System.out.println("Element" + passWord + " is not displayed");
			takeScreenShot("Failed enterPassWord");
		}
	}

	public void clickLogin() {
		try {
			elementDisplayed(login.logInButton);
			takeScreenShot("clickLogin");
			waitTime(3000);
			clickElement(login.logInButton);
		} catch (Exception e) {
			System.out.println("Element login button not  displayed");
			takeScreenShot("Failed clickLogin");

		}
	}

}
