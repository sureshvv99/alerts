package assement;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class alerts5seconds {
	WebDriver driver;
	String url = "https://demoqa.com/alerts";
@BeforeTest
public void tc() {
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get(url);
	driver.manage().timeouts().implicitlyWait(7,TimeUnit.SECONDS);
	
}
@Test
public void tc1() throws InterruptedException {
	driver.findElement(By.id("timerAlertButton")).click();
	Thread.sleep(5000);
	Alert at = driver.switchTo().alert();
	at.accept();
	
}
}
