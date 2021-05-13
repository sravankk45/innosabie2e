package com.innosabi.e2e.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.innosabi.e2e.base.BaseTest;

public class SubmitIdeaPage extends BaseTest {
	
	@FindBy(xpath="//input[@placeholder='Idea title']")
	WebElement ideaTitle;
	
	@FindBy(xpath="//div[@aria-label='false']")
	WebElement ideaDescription;
	
	@FindBy(xpath="//button[normalize-space()='Submit idea']")
	WebElement submitIdeaButton;
	
	WebDriverWait wait;
	
	//Initializing the Page Objects:
	public SubmitIdeaPage(){
		PageFactory.initElements(driver, this);
		wait = new WebDriverWait(driver, 15);
	}
	
	public void enterIdeaTitle(String title){
		
		wait.until(ExpectedConditions.visibilityOf(ideaTitle));
		ideaTitle.sendKeys(title);
		    	
	}
	
	public void enterIdeaDescription(String description) {
		
		wait.until(ExpectedConditions.visibilityOf(ideaDescription));
		ideaDescription.sendKeys(description);
		
	}
	
	public void clickSubmitIdeaButton() {
		
		wait.until(ExpectedConditions.visibilityOf(submitIdeaButton));
		submitIdeaButton.click();
		
	}

}
