package org.hcl.selenium.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TitleAndUrl {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vasanth\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		//driver.get("http://www.greenstechnologys.com/index.html");
		//driver.get("https://www.amazon.in/?tag=googinabkkenshoo-21&ascsubtag=dc635b5c-f6da-4e95-a12b-a0ed609fa76b&ie=UTF8");
		driver.get("https://www.flipkart.com/");
		String title = driver.getTitle();
		System.out.println(title);
		String url = driver.getCurrentUrl();
		System.out.println(url);
		}

}
