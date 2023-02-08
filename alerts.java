package assement;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class alerts {
	WebDriver driver;
	String url = "https://www.bput.ac.in/";
	String url1="https://www.google.com/";
	String url2="https://demoqa.com/alerts";
@BeforeTest
	public void tc() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url2);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		}
@Test
public void tc01() throws InterruptedException {
	 driver.findElement(By.id("promtButton")).click();
	 Alert at = driver.switchTo().alert();
	 at.sendKeys("suresh");
	 at.accept();
	 Thread.sleep(5000);
	System.out.println(driver.findElement(By.id("promptResult")).getText());
	
	 
	
}
}
