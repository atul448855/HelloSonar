package com.wordpress.functions;

import org.testng.Assert;

import com.wordpress.Utilites.GeneralUtilites;
import com.wordpress.objectRepositires.HomePageObjectRepositery;

public class HomePage extends GeneralUtilites {
	HomePageObjectRepositery homePage = new HomePageObjectRepositery();

	
	public void clickLogin(){
		try {
			elementDisplayed(homePage.login);
			clickElement(homePage.login);
			takeScreenShot("clickLogin");
		} catch (Exception e) {
			System.out.println("Element clickLogin not  displayed");
			takeScreenShot("Failed clickLogin ");
		}
	}
	
	
	
	
	public void clickReader() {
		try {
			elementDisplayed(homePage.readerheader);
			clickElement(homePage.readerheader);
			takeScreenShot("clickReader");
		} catch (Exception e) {
			System.out.println("Element ReaderLink not  displayed");
			takeScreenShot("Failed clickReader");
		}
	}

	public void clickmySite() {
		try {
			elementDisplayed(homePage.mySiteheader);
			clickElement(homePage.mySiteheader);
			takeScreenShot("clickmySite");

		} catch (Exception e) {
			System.out.println("Element My Site Link is  not  displayed");
			takeScreenShot("Failed clickmySite");
		}
	}

	public void verifySiteTitle(String siteTitle) {
		try {
			elementDisplayed(homePage.sideBar);
			String expectedSiteTitle = siteTitle;
			String actualSiteTitle = getText(homePage.siteTitle);
			Assert.assertEquals(expectedSiteTitle, actualSiteTitle);
			takeScreenShot("verifySite Title");
		} catch (Exception e) {
			System.out.println("Element sideBar is  not  displayed");
			takeScreenShot("Failed clickmySite");
		}
	}

	public void verifyPostLink() {
		try {
			elementDisplayed(homePage.blogPost);
			clickElement(homePage.blogPost);
			takeScreenShot("verifyPostLink");

		} catch (Exception e) {
			System.out.println("Element blogPost  not  displayed");
			takeScreenShot("Failed verifyPostLink");
		}
	}

	public void clickAddPost() {
		try {
			elementDisplayed(homePage.addNewPost);
			clickElement(homePage.addNewPost);
			takeScreenShot("clickAddPost");

		} catch (Exception e) {
			System.out.println("Element Add  not  displayed");
			takeScreenShot("Failed clickAddPost");
		}
	}

}
