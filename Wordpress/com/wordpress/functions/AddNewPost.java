package com.wordpress.functions;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import com.wordpress.Utilites.GeneralUtilites;
import com.wordpress.objectRepositires.NewPostRepositery;

public class AddNewPost extends GeneralUtilites {

	NewPostRepositery post = new NewPostRepositery();
	WebDriverWait wait = null;

	public void verifyEditorHeaderField(String eTitle) {
		try {
			elementDisplayed(post.editorHeader);
			elementDisplayed(post.editorTitle);
			String expectedEditorHeader = eTitle;
			String actualEditorHeader = getText(post.editorHeader);
			Assert.assertEquals(expectedEditorHeader, actualEditorHeader);
			takeScreenShot("verifyEditorHeaderField");

		} catch (Exception e) {
			System.out.println("Element Editor Header Field is  not  displayed");
			takeScreenShot("Failed Verify Editor Header Field");
		}
	}

	public void enterTitle(String title) {
		try {
			elementDisplayed(post.editorTitle);
			sendText(post.editorTitle, title);
			takeScreenShot("enterTitle");

		} catch (Exception e) {
			System.out.println("Element title text box is  not  displayed");
			takeScreenShot("Failed enter Title Field");
		}
	}

	public void clickonHtmlView() {
		try {
			elementDisplayed(post.htmlLink);
			clickElement(post.htmlLink);
			takeScreenShot("HTML view");

		} catch (Exception e) {
			System.out.println("Element HTML view button is  not  displayed");
			takeScreenShot("Failed click on HTML view");
		}

	}

	public void clickPreviewButton() {
		try {
			//elementDisplayed(post.previewButton);
			waitTime(8000);
			clickElement(post.previewButton);			
			takeScreenShot("clickPreviewButton");

		} catch (Exception e) {
			System.out.println("Element  Preview button not displayed");
			takeScreenShot("Failed click preview button");
		}
	}

	public void closePreviewPoup() {
		try {
			elementDisplayed(post.closePreview);
			clickElement(post.closePreview);
			waitTime(2000);
			takeScreenShot("closePreviewPoup");

		} catch (Exception e) {
			System.out.println("Element  closePreview is  not  displayed");
			takeScreenShot("Failed close preview pop up");
		}
	}

	public void clickOnPostFormat() {
		try {
			elementDisplayed(post.postFormat);
			clickElement(post.postFormat);
			takeScreenShot("clickOnPostFormat");

		} catch (Exception e) {
			System.out.println("Element clickOnPostFormat  is  not  displayed");
			takeScreenShot("Failed click clickOnPostFormat button");
		}
	}

	public void clickOnCategoriesandTags() {
		try {
			elementDisplayed(post.categoriesAndText);
			clickElement(post.categoriesAndText);
			takeScreenShot("clickOnCategoriesandTags");

		} catch (Exception e) {
			System.out.println("Element categoriesAndText  is  not  displayed");
			takeScreenShot("Failed click categoriesAndText button");
		}
	}

	public void addTags(String tags) {
		try {
			elementDisplayed(post.addTagsTextbox);
			clickElement(post.addTagsTextbox);
			sendText(post.activeAddTagsTextbox, tags);
			takeScreenShot("addTags");

		} catch (Exception e) {
			System.out.println("Element addTags text box is  not  displayed");
			takeScreenShot("Failed enter addTags Field");
		}
	}

	public void selectLinkRadiobutton() {
		try {
			elementDisplayed(post.categoriesAndText);
			elementDisplayed(post.linkRadiobutton);
			clickElement(post.linkRadiobutton);
			takeScreenShot("selectLinkRadiobutton");

		} catch (Exception e) {
			System.out.println("Element selectLinkRadiobutton is  not  displayed");
			takeScreenShot("Failed selectLinkRadiobutton Field");
		}
	}

	public void verifyLinkTagadded() {
		try {
			elementDisplayed(post.addedLink);
			getText(post.addedLink);
			takeScreenShot("verifyLinkTagadded");

		} catch (Exception e) {
			System.out.println("Element addedLink is  not  displayed");
			takeScreenShot("Failed addedLink Field");
		}
	}

	public void verifyPreview() {
		try {
			elementDisplayed(post.mobileView);
			clickElement(post.mobileView);
			takeScreenShot("mobileView");

		} catch (Exception e) {
			System.out.println("Element mobileView is  not  displayed");
			takeScreenShot("Failed mobileView Field");
		}

		try {
			elementDisplayed(post.tabletView);
			clickElement(post.tabletView);
			takeScreenShot("tabletView");

		} catch (Exception e) {
			System.out.println("Element tabletView is  not  displayed");
			takeScreenShot("Failed tabletView Field");
		}

		try {
			elementDisplayed(post.desktopView);
			clickElement(post.desktopView);
			takeScreenShot("desktopView");

		} catch (Exception e) {
			System.out.println("Element desktopView is  not  displayed");
			takeScreenShot("Failed desktopView Field");
		}
	}

	public void setFeaturedImage() {
		try {
			elementDisplayed(post.featuredImage);
			clickElement(post.featuredImage);
			clickElement(post.SetFeaturedImage);
			takeScreenShot("featuredImage");
			clickElement(post.fileUploadMedia);
			Runtime.getRuntime().exec("C:\\Users\\Rjogula\\Edureka WorkSpace\\SeleniumWebDriverProject\\UploadFile.exe");

		} catch (Exception e) {
			System.out.println("Element featuredImage is  not  displayed");
			takeScreenShot("Failed featuredImage Field");
		}
	}

	public void verifySharing() {
		try {
			elementDisplayed(post.sharing);
			clickElement(post.sharing);
			takeScreenShot("verifySharing");

		} catch (Exception e) {
			System.out.println("Element sharing is  not  displayed");
			takeScreenShot("Failed sharing Field");
		}
	}

	public void uncheckSharing() {

		try {
			elementDisplayed(post.showLikeButtonsCheckBox);
			elementDisplayed(post.showSharingButtonsCheckBox);
			clickElement(post.showLikeButtonsCheckBox);
			clickElement(post.showSharingButtonsCheckBox);
			takeScreenShot("uncheckSharing");

		} catch (Exception e) {
			System.out.println("Element uncheckSharing checkbox is  not  displayed");
			takeScreenShot("Failed checkbox Field");
		}
	}

	public void logOut() {
		try {
			elementDisplayed(post.profile);
			clickElement(post.profile);
			driver.switchTo().alert().accept();
			clickElement(post.signOut);			
			takeScreenShot("logOut");

		} catch (Exception e) {
			takeScreenShot("logOut");
		}
	}

}
