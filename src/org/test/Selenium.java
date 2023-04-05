package org.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium {
	public static void main(String[] args) {
		// to configure driver
		System.setProperty("webdriver.chrome.driver", "F:\\eclipse-workspace\\Java\\DRIVER\\chromedriver.exe");
		// create the firefox driver
		WebDriver driver = new ChromeDriver();

		// url mention driver.get("https://www.facebook.com/"); driver.close();

		driver.get("https://www.facebook.com/");
		driver.close();

	}
}
