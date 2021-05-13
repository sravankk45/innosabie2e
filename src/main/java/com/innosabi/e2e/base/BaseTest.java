package com.innosabi.e2e.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.TestNG;

public class BaseTest {
	
	protected static WebDriver driver;
	protected static Properties prop;
	private static String baseDir=System.getProperty("user.dir");
	
	public BaseTest(){
		
		try {
			
			prop = new Properties();
			FileInputStream ip = new FileInputStream(baseDir+ "/src/main/java/com/innosabi"
					+ "/e2e/config/config.properties");
			prop.load(ip);
		}
		
		catch (FileNotFoundException e) {
			
			e.printStackTrace();
			
		} 
		
		catch (IOException e) {
			
			e.printStackTrace();
			
		}
	}
	
	
	public static void initialization(){
		
		String browserName = prop.getProperty("browser");
		
		if(browserName.equals("chrome")){
			
			System.setProperty("webdriver.chrome.driver", baseDir+"/driver/chromedriver.exe");	
			driver = new ChromeDriver();
			
		}
		else if(browserName.equals("FF")){
			
			System.setProperty("webdriver.gecko.driver", baseDir+"/driver/geckodriver.exe");	
			driver = new FirefoxDriver(); 
		}
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get(prop.getProperty("url"));
		
	}

}
