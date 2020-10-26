package com.fbLogin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FbLoginSteps {
	WebDriver driver;
	@Given("^user open web browser and navigate to Facebook login screen$")
	public void user_open_web_browser_and_navigate_to_Facebook_login_screen() throws Throwable {
System.setProperty("webdriver.chrome.driver","C:\\Driver\\chromedriver.exe");
		
	    driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/login/");	
	    driver.manage().window().maximize();

	}

	@Then("^users Navigate to Page and verify the Page Title is \"([^\"]*)\"$")
	public void users_Navigate_to_Page_and_verify_the_Page_Title_is(String arg1) throws Throwable {
	   
	    String actual = driver.getTitle();
	    String expected = "Log into Facebook";
	    Assert.assertTrue(actual.contains(expected), "The titel is wrong");
	}

	@Then("^users enter a valid username and password$")
	public void users_enter_a_valid_username_and_password() throws Throwable {
		
		driver.findElement(By.xpath("//*[@id='email']")).sendKeys("fahadfai808@gmail.com");
		driver.findElement(By.xpath("//*[@name='pass']")).sendKeys("Juma2001");
	   
	    
	}

	@Then("^users click the Sign in button$")
	public void users_click_the_Sign_in_button() throws Throwable {
		
		WebElement singin = driver.findElement(By.xpath("//*[@type='submit']"));
		singin.click();
	   
	    
	}



}
