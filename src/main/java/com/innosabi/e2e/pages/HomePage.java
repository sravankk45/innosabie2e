package com.innosabi.e2e.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.innosabi.e2e.base.BaseTest;

public class HomePage extends BaseTest{
	
	@FindBy(xpath="//h2[normalize-space()='Innovation Challenge']")
	WebElement invChallengeLink;
	
	WebDriverWait wait;
	
	//Initializing the Page Objects:
	public HomePage(){
		PageFactory.initElements(driver, this);
		wait = new WebDriverWait(driver, 15);
	}
	
	public void clickInvChallengeLink(){
		
		wait.until(ExpectedConditions.visibilityOf(invChallengeLink));
		invChallengeLink.click();
		    	
	}


}
