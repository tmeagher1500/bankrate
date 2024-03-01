package com.bankrate.HomePage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HomePage {
	WebDriver driver;
	String url = "https://www.bankrate.com/mortgages/mortgage-calculator/";

	@Test
	public void homePage() throws InterruptedException {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get(url);
		;
		driver.findElement(By.id("homePrice")).clear();;
		driver.findElement(By.id("homePrice")).sendKeys("800000");

		Thread.sleep(5000);
		driver.close();
		driver.quit();

	}
}
