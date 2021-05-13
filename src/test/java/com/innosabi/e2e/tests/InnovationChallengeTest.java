package com.innosabi.e2e.tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.innosabi.e2e.base.BaseTest;
import com.innosabi.e2e.pages.HomePage;
import com.innosabi.e2e.pages.InnovationChallengePage;
import com.innosabi.e2e.pages.LoginPage;
import com.innosabi.e2e.pages.SubmitIdeaPage;

public class InnovationChallengeTest extends BaseTest{
	
	private LoginPage loginPage;
	private HomePage homePage;
	private InnovationChallengePage innovationChallengePage;
	private SubmitIdeaPage submitIdeaPage;
	
	public InnovationChallengeTest() {
		super();
	}
	
	
	@BeforeMethod
	public void login(){
		
		initialization();
		loginPage = new LoginPage();
		homePage = new HomePage();
		innovationChallengePage = new InnovationChallengePage();
		submitIdeaPage = new SubmitIdeaPage();
		
		String email = prop.getProperty("email");
		String password = prop.getProperty("password");
		loginPage.login(email, password);
		
	}
	
	@Test
	public void createIdeaTest() throws Exception{
		
		String ideaTitle = "my new idea";
		String ideaDescription = "create test automation suite for spark product";
		homePage.clickInvChallengeLink();
		innovationChallengePage.clickSubmitIdeaButton();
		submitIdeaPage.enterIdeaTitle(ideaTitle);
		submitIdeaPage.enterIdeaDescription(ideaDescription);
		submitIdeaPage.clickSubmitIdeaButton();
		String resIdeaDescription = innovationChallengePage.getIdeaDescription();
		Assert.assertEquals(resIdeaDescription, ideaDescription);
	}
	
	@Test
	public void submitCommentTest() throws Exception{
		
		String comment = "this is great idea";
		homePage.clickInvChallengeLink();
		innovationChallengePage.enterComment(comment);
		innovationChallengePage.submitComment();
		String resComment = innovationChallengePage.getComment();
		Assert.assertEquals(resComment, comment);
	}

	@AfterMethod
	public void logout() {
		
		innovationChallengePage.clickProfileIcon();
		innovationChallengePage.clickSignoutButton();
		driver.close();
		
	}
}

