package com.innosabi.e2e.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.innosabi.e2e.base.BaseTest;

public class InnovationChallengePage extends BaseTest{
	
	@FindBy(xpath="//button[normalize-space()='Submit idea']")
	WebElement submitIdeaButton;
	
	@FindBy(xpath="(//a//h2)[1]")
	WebElement ideaTitle;
	
	@FindBy(xpath="(//a/div[@class='description'])[1]")
	WebElement ideaDescription;
	
	@FindBy(xpath="(//textarea)[1]")
	WebElement commentTextBox;
	
	@FindBy(xpath="//button[@class='btn-send ng-star-inserted']")
	WebElement submitCommentButton;
	
	@FindBy(xpath="(//div[@class='comment-information'])[1]/following-sibling::dynamic-content")
	WebElement commentText;
	
	@FindBy(xpath="//button[@data-test-id='user-menu']/icon")
	WebElement profileIcon;
	
	@FindBy(xpath="//button[normalize-space()='Sign out']")
	WebElement signoutButton;
	
	WebDriverWait wait;
	
	//Initializing the Page Objects:
	public InnovationChallengePage(){
		
		PageFactory.initElements(driver, this);
		wait = new WebDriverWait(driver, 15);
	}
	
	public void clickSubmitIdeaButton() {
		
		wait.until(ExpectedConditions.visibilityOf(submitIdeaButton));
		submitIdeaButton.click();
		    	
	}
	
	public String getIdeaDescription() {
			
			 wait.until(ExpectedConditions.visibilityOf(ideaTitle));
			 driver.navigate().refresh();
			 wait.until(ExpectedConditions.visibilityOf(ideaTitle));
			 return ideaDescription.getText();
			 
		 	}
	public void enterComment(String comment) {
		
		wait.until(ExpectedConditions.visibilityOf(commentTextBox));
		commentTextBox.sendKeys(comment);
		
	}
	public void submitComment() {
		
		wait.until(ExpectedConditions.visibilityOf(submitCommentButton));
		submitCommentButton.click();
		
	}
	public String getComment() {
		
		 driver.navigate().refresh();
		 wait.until(ExpectedConditions.visibilityOf(commentText));
		 return commentText.getText();
		 
	 	}
	
	public void clickProfileIcon() {
		profileIcon.click();
		
	}
	
	public void clickSignoutButton() {
		signoutButton.click();
		
	}
		 

}
