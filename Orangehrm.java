package assement;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import javax.swing.event.MenuKeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Orangehrm {

	WebDriver driver;
	String url =  "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
	
	@BeforeClass
	public void tc(){
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
	@Test
	public void tc1() throws InterruptedException, AWTException {
		WebElement we= driver.findElement(By.xpath("//input[@name='username']"));
		Actions at= new Actions(driver);
		at.moveToElement(we).build().perform();
		at.click(we).build().perform();
		Thread.sleep(5000);
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_SHIFT);
		r.keyPress(KeyEvent.VK_A);
		r.keyRelease(KeyEvent.VK_SHIFT);
		r.keyPress(KeyEvent.VK_D);
		r.keyPress(KeyEvent.VK_M);
		r.keyPress(KeyEvent.VK_I);
		r.keyPress(KeyEvent.VK_N);
		Thread.sleep(5000);  
		
	}
	@Test
	public void tc2() throws AWTException, InterruptedException {
		WebElement w = driver.findElement(By.xpath("//input[@name='password']"));
		Actions a = new Actions(driver);
		a.moveToElement(w).build().perform();
		a.click(w).build().perform();
		Thread.sleep(5000);
		Robot ro = new Robot();
		ro.keyPress(KeyEvent.VK_A);
		ro.keyPress(KeyEvent.VK_D);
		ro.keyPress(KeyEvent.VK_M);
		ro.keyPress(KeyEvent.VK_I);
		ro.keyPress(KeyEvent.VK_N);
		ro.keyPress(KeyEvent.VK_1);
		ro.keyPress(KeyEvent.VK_2);
		ro.keyPress(KeyEvent.VK_3);
		Thread.sleep(5000);
		ro.keyPress(MenuKeyEvent.VK_ENTER);
		
	}
	@Test
	public void tc3() throws InterruptedException  {
		WebElement wet = driver.findElement(By.xpath("//span[@class='oxd-userdropdown-tab']"));
		Actions as = new Actions(driver);
		as.moveToElement(wet).build().perform();
		as.click(wet).build().perform();
		Thread.sleep(5000);
		
	}
	@Test
	public void tc4() throws AWTException, InterruptedException {
		WebElement wl = driver.findElement(By.linkText("Logout"));
		Actions ai = new Actions(driver);
		ai.moveToElement(wl).build().perform();
		ai.click(wl).build().perform();
	}
}



  