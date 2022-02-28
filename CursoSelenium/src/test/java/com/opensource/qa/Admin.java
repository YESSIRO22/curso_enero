package com.opensource.qa;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;

public class Admin {
	
	String username, password, user, userNotExist, msgNoRecords;
	
	@BeforeTest
	  public void beforeTest() {
		
		username="Admin";
		password="admin123";
		user="Aravind";
		msgNoRecords = "No Records Found";
	  
	}
	
  @Test
  public void tc004_Admin_DeleteUser() {

			// Step 1
			Reporter.log("Open Browser \"OrangeHRM\" web page");
			System.setProperty("webdriver.chrome.driver", "./src/test/resources/drivers/chrome/chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://opensource-demo.orangehrmlive.com/");
			driver.manage().window().maximize();

			// Step 2
			Reporter.log("Enter Username, Password and click Login");
			driver.findElement(By.id("txtUsername")).sendKeys(username);
			driver.findElement(By.id("txtPassword")).sendKeys(password);
			driver.findElement(By.id("btnLogin")).click();

			// Step 3
			Reporter.log("Validate that you have logged in successfully");
			WebDriverWait wait = new WebDriverWait(driver, 10);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@id='welcome']")));

			// Step 4
			Reporter.log("Click Admin - Go to the admin page");
			driver.findElement(By.xpath("//a[@id='menu_admin_viewAdminModule']")).click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

			// Step 5
			Reporter.log("Search username in field \"Username\"");
			driver.findElement(By.id("searchSystemUser_userName")).sendKeys(user);

			// Step 6
			Reporter.log("Click Search");
			driver.findElement(By.id("searchBtn")).click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			
			// Step 7
			Reporter.log("Verify username exist in table");
			String actualValue = driver.findElement(By.xpath("//tbody/tr[1]/td[2]")).getText();
			Assert.assertEquals(actualValue, user);
	
			//Step 8
			Reporter.log("Select User");
			driver.findElement(By.id("ohrmList_chkSelectRecord_39")).click();
			
			//Step 9
			Reporter.log("Click Delete");
			driver.findElement(By.id("btnDelete")).click();
			
			//Step 10
			Reporter.log("Validate pop-window is displayed: \"Delete Records?\"");
			WebDriverWait wait1 = new WebDriverWait(driver, 5);
			wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"deleteConfModal\"]/div[1]")));
			
			//Step 11
			Reporter.log("Click Ok to confirm delete user");
			driver.findElement(By.id("dialogDeleteBtn")).click();
			
			//Step 12
			Reporter.log("Validate in table that user was delete successfully");
			userNotExist=user;
			driver.findElement(By.id("searchSystemUser_userName")).sendKeys(userNotExist);
			driver.findElement(By.id("searchBtn")).click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			String actualValue1 = driver.findElement(By.xpath("//tbody/tr")).getText();
			Assert.assertEquals(actualValue1, msgNoRecords);
			
			//Step13			
			Reporter.log("Log out");
			driver.findElement(By.id("welcome")).click();
			driver.findElement(By.xpath("//a[contains(@href, 'logout')]")).click();			
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

			// Step 14
			Reporter.log("Close Browser");
			driver.close();
			
 }
  @AfterTest
  public void afterTest() {
  }

}
