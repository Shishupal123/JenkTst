package com.mindtree.ComprehenssiveMilestone;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC001_URL {

	@Test
	public static void Test4(){
	System.setProperty("webdriver.chrome.driver","C:\\browser\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.urbanladder.com");

	}

}
