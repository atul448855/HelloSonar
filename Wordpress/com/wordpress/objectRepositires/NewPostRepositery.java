package com.wordpress.objectRepositires;

import org.openqa.selenium.By;

public class NewPostRepositery {

	public final By editorHeader = By.xpath("//a[contains(text(),'New Post')]");
	public final By editorTitle = By.xpath("//div[@class='editor-title']/textarea");
	public final By editorBody = By.xpath("//textarea[@id='tinymce-2']");
	public final By htmlLink = By.linkText("HTML");
	public final By previewButton = By.xpath("//span[contains(text(),'Preview')]");
	public final By closePreview = By.xpath("//button[@class='web-preview__close']");
	public final By categoriesAndText = By.xpath("//span[contains(text(),'Categories & Tags')]");
	public final By sharing = By.xpath("//span[contains(text(),'Sharing')]");
	public final By showSharingButtonsCheckBox = By.name("sharing_enabled");
	public final By showLikeButtonsCheckBox = By.name("likes_enabled");
	public final By addTagsTextbox = By.xpath("//label[@class='editor-drawer__label']/div/div");
	public final By activeAddTagsTextbox = By.xpath("//label[@class='editor-drawer__label']/div/div/div/input");
	public final By listOfTagsDisplayed = By.xpath("//span[@class='tags-links']/a");
	public final By postFormat = By.xpath("//span[contains(text(),'Post Format')]");
	public final By featuredImage = By.xpath("//span[contains(text(),'Featured Image')]");
	public final By SetFeaturedImage = By.xpath("//span[contains(text(),'Set Featured Image')]");
	public final By image = By.xpath("(//div[@class='editor-featured-image__current-image'])[1]");
	public final By setImage = By.xpath("(//span[@class='dialog__button-label'])[2]");
	public final By fileUploadPopUp = By.xpath("//div[@class='dialog__content']");
	public final By fileUploadMedia = By.xpath("//div[@class='media-library is-single']/div[3]/header/div/form");
	public final By linkRadiobutton = By.xpath("//input[@value='link']");
	public final By addedLink = By.xpath("//span[@class='entry-format']/a[contains(text(),'Link')]");
	public final By desktopView = By.xpath("//div[@class='web-preview__device-switcher']/button[1]");
	public final By tabletView = By.xpath("//div[@class='web-preview__device-switcher']/button[2]");
	public final By mobileView = By.xpath("//div[@class='web-preview__device-switcher']/button[3]");
	public final By profile = By.xpath("//a[@class='masterbar__item masterbar__item-me']");
	public final By signOut = By.xpath("//button[contains(text(),'Sign Out')]");
}
