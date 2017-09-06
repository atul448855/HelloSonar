package com.wordpress.objectRepositires;

import org.openqa.selenium.By;

public class HomePageObjectRepositery {

	public final By login        =By.linkText("Log In");
	public final By readerheader = By.xpath("//a[@data-tip-target='reader']");
	public final By mySiteheader = By.xpath("//a[@data-tip-target='my-sites']");
	public final By sideBar      = By.xpath("//div[@class='sidebar__region']"); 
	public final By siteTitle    = By.xpath("//div[@class='site__domain']");
	public final By blogPost     = By.xpath("//span[contains(text(),'Blog Posts')]");
	public final By addNewPost   = By.xpath("(//a[@class='sidebar__button'])[1]");
}
