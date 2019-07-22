package SeleniumWebdriver;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class demo5 {

	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
		
	       System.setProperty("webdriver.chrome.driver", "C:\\Users\\SaranyaNATARAJAN\\Documents\\Selinium TCs\\chromedriver_win32\\chromedriver.exe");
			
			WebDriver  driver = new ChromeDriver();				
	       driver.manage().window().maximize();
	       driver.navigate().to("http://realestate.upskills.in/my-profile/?redirect_to=http://realestate.upskills.in/wp-admin/");
	       driver.findElement(By.id("user_login")).sendKeys("admin");
	       driver.findElement(By.id("user_pass")).sendKeys("adminuser@12345");
	       driver.findElement(By.xpath("//*[@name='login' and @value ='Sign In']")).click();
	       
	       WebElement howdy =  driver.findElement(By.xpath("//*[contains(text(),'Howdy')]"));
	       
	    Actions act = new Actions(driver);
	       
	       act.moveToElement(howdy).build().perform();
	      act.contextClick(howdy).build().perform(); // contextclick for right click
	       
	       Robot robot= new Robot();
	       
	       
	       robot.keyPress(KeyEvent.VK_DOWN);
	       
	       Thread.sleep(1000);
	       
	       robot.keyPress(KeyEvent.VK_ENTER);
	       Thread.sleep(1000);
	       
	       String URL = driver.getCurrentUrl();
	       
	      
	}

}
