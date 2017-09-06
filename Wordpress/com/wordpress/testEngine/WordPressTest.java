package com.wordpress.testEngine;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.wordpress.Utilites.GeneralUtilites;
import com.wordpress.Utilites.ReadExcelSheetData;
import com.wordpress.functions.AddNewPost;
import com.wordpress.functions.HomePage;
import com.wordpress.functions.LoginPage;

public class WordPressTest extends GeneralUtilites {

	String URL = "https://wordpress.com/wp-login.php";

	@BeforeTest
	public void startBrowser() {
		openBrowser();
	}

	@Test(dataProvider = "test", priority = 1)
	public void testWordPress(String testcaseName, String KeyWord, String testMethod, String testData) {
		LoginPage login = new LoginPage();
		AddNewPost post = new AddNewPost();
		HomePage home = new HomePage();
		switch (KeyWord) {
		case "open":
			driver.get(URL);
			break;
		case "UserName":
			login.enterUserName(testData);
			break;
		case "Password":
			login.enterPassWord(testData);
			break;
		case "Login":
			login.clickLogin();
			break;
		case "Reader":
			home.clickReader();
			break;
		case "MySite":
			home.clickmySite();
			break;
		case "PostLink":
			home.verifyPostLink();
			break;
		case "AddPost":
			home.clickAddPost();
			break;
		case "EditorTitle":
			post.enterTitle(testData);
			break;
		case "PreviewButton":
			post.clickPreviewButton();
			break;
		case "ClosePopup":
			post.closePreviewPoup();
			break;
		case "AddTags":
			post.clickOnCategoriesandTags();
			break;
		case "Tag1":
			post.addTags(testData);
		case "PostFormat":
			post.clickOnPostFormat();
			break;
		case "LinkRadiobutton":
			post.selectLinkRadiobutton();
			break;
		case "Preview":
			post.verifyPreview();
			break;
		case "sharing":
			post.verifySharing();
			break;
		case "unchecksharing":
			post.uncheckSharing();
			break;

		case "Logout":
			post.logOut();

		}

	}

	@DataProvider(name = "test")
	public Object[][] readLoginTestData() throws IOException {
		ReadExcelSheetData data = new ReadExcelSheetData();
		Object[][] testData = data.readData("Masterdata.xlsx", "LoginTestData");
		return testData;

	}

	@AfterTest
	public void closeBrowser() {
		AddNewPost post = new AddNewPost();
		post.logOut();
		driver.quit();
	}

}
