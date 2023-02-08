package assement;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class alerts_3one {
	WebDriver driver;
	String url = "https://demoqa.com/alerts";
@BeforeTest
public void tc() {
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get(url);
	driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);

}
@Test
public void tc1() throws InterruptedException {
	driver.findElement(By.id("confirmButton")).click();
	Alert at = driver.switchTo().alert();
	Thread.sleep(3000);
	at.accept();
	System.out.println(driver.findElement(By.xpath("//span[@id='confirmResult']")).getText());
}
@Test
public void tc2() throws InterruptedException {
	driver.findElement(By.xpath("//button[@id='confirmButton']")).click();
	Alert a = driver.switchTo().alert();
	Thread.sleep(3000);
	a.dismiss();
	System.out.println();
	
}
}