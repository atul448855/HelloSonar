package com.wordpress.Utilites;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class GeneralUtilites {

	protected static WebDriver driver = null;
	public static WebElement element = null;

	public void openBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	public void sendText(By locator, String text) {
		new WebDriverWait(driver, 10);
		By variable = locator;
		driver.findElement(variable).clear();
		driver.findElement(variable).sendKeys(text);
	}

	public void clickElement(By locator) {
		new WebDriverWait(driver, 10);
		By variable = locator;
		driver.findElement(variable).click();
	}

	public void verifyURL(String url) {
		new WebDriverWait(driver, 10);
		String expectedUrl = url;
		String actualUrl = driver.getCurrentUrl();
		Assert.assertEquals(expectedUrl, actualUrl);
	}

	public void actionClick(By locator) throws InterruptedException {
		Actions actions = new Actions(driver);
		WebElement element = driver.findElement(locator);
		Thread.sleep(2000);
		actions.moveToElement(element).build().perform();
		Thread.sleep(2000);
		actions.moveToElement(element).click().build().perform();
		Thread.sleep(2000);
	}

	public void verifyTitle(String title) {
		new WebDriverWait(driver, 10);
		String expectedTitle = title;
		String actualTitle = driver.getTitle();
		Assert.assertEquals(expectedTitle, actualTitle);
	}

	public String getText(By locator) {
		new WebDriverWait(driver, 10);
		String text = driver.findElement(locator).getText();
		return text;

	}

	public void waitTime(int time) throws InterruptedException {
		Thread.sleep(time);
	}

	public boolean elementDisplayed(By locator) {
		boolean elementVisbility = true;
		By variable = locator;
		elementVisbility = driver.findElement(variable).isDisplayed();
		return elementVisbility;
	}

	public void moveToFrame(String frameid, By locator, String text) {
		element = driver.switchTo().frame(frameid).findElement(locator);
		element.click();
		element.sendKeys(text);
	}

	public void takeScreenShot(String fileName) {
		new WebDriverWait(driver, 20);
		File source = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(source, new File("C:\\Selenium\\SeleniumProject\\Screenshots\\Screenshots\\"
					+ new Date().getTime() + "   " + fileName + ".png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
