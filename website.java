package assement;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class website {
	WebDriver driver;
	String url = "https://www.cricbuzz.com/live-cricket-scores/59951/ind-vs-sl-1st-t20i-sri-lanka-tour-of-india-2023";
	String url1 = "https://demoqa.com/browser-windows";
	String url2 = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
	String url3 ="https://www.youtube.com/";
	@BeforeTest
	public void tc() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url1);
		
	}
	@Test
	public void tc1() throws InterruptedException {
	WebElement wb = driver.findElement(By.id("tabButton"));
	wb.click();
	wb.click();
	int ct = 0;
	String parent = driver.getWindowHandle();
	Set<String> tabs = driver.getWindowHandles();
	for(String handle:tabs) {
		if (!handle.equals(parent)) {
			ct++;
			if(ct==1) {
				driver.switchTo().window(handle);
				Thread.sleep(5000);
				driver.get(url1);
				Thread.sleep(5000);
			}
		else {
			driver.switchTo().window(handle);
			Thread.sleep(5000);
			driver.get(url2);
			Thread.sleep(5000);
		}}
		else {
			continue;
			
		
		}
	}
	driver.switchTo().window(parent);
	driver.get(url3);
		
	}

}
