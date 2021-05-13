package com.innosabi.e2e.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.innosabi.e2e.base.BaseTest;

public class LoginPage extends BaseTest{
	
			//Page Factory
	
			@FindBy(id="email")
			WebElement email;
			
			
			@FindBy(xpath="//button[normalize-space()='Next']")
			WebElement nextButton;
			
			@FindBy(id="password")
			WebElement password;
			
			@FindBy(xpath="//button[normalize-space()='Login']")
			WebElement loginButton;
			
			WebDriverWait wait;
			
			//Initializing the Page Objects:
			public LoginPage(){
				PageFactory.initElements(driver, this);
				wait = new WebDriverWait(driver, 15);
			}
			
			public void login(String emailid, String pwd){
				
				wait.until(ExpectedConditions.visibilityOf(email));
				email.sendKeys(emailid);
				nextButton.click();
				wait.until(ExpectedConditions.visibilityOf(password));
				password.sendKeys(pwd);
				loginButton.click();
				    	
			}

}
