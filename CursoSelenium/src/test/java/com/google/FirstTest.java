package com.google;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FirstTest {
	
	public static WebDriver driver;

  @BeforeTest
  public void beforeTest() {
  }
  
  @Test
  public void googleTest() {
	  
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/drivers/chrome/chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("https://es-la.facebook.com/");
		driver.manage().window().maximize();
		
		//Assert.assertEquals(driver.getTitle(), "Google");
		Assert.assertEquals(driver.getTitle(), "Facebook - Inicia sesi�n o reg�strate");
		
		System.out.println("Checkpoint");

  }

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}
