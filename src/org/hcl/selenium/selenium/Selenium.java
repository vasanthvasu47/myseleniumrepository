package org.hcl.selenium.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vasanth\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.quit();
		

	}

}
