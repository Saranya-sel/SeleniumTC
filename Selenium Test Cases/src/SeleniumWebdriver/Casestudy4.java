package SeleniumWebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Casestudy4 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SaranyaNATARAJAN\\Documents\\Selinium TCs\\chromedriver_win32\\chromedriver.exe");
				
				WebDriver  driver = new ChromeDriver();				
						
	       driver.manage().window().maximize();
	       driver.navigate().to("http://retail.upskills.in/admin/");
	       
	      driver.findElement(By.name("username")).sendKeys("admin");
	      
	      driver.findElement(By.name("password")).sendKeys("admin@123");
	      
	      Actions Mouseover = new Actions(driver);
	      
	      Mouseover.sendKeys(Keys.ENTER).perform();
	      
	      WebElement tab1 =  driver.findElement(By.id("menu-catalog"));
	      
	      Actions act = new Actions(driver);
	  
	      Thread.sleep(3000);
	       
	      act.moveToElement(tab1).click().build().perform();
	           

}
}