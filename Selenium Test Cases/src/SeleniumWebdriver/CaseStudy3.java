package SeleniumWebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class CaseStudy3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\SaranyaNATARAJAN\\Downloads\\geckodriver-v0.24.0-win64\\geckodriver.exe");
	       WebDriver  ffdriver = new FirefoxDriver();
	       ffdriver.manage().window().maximize();
	       ffdriver.navigate().to("http://newtours.demoaut.com/mercuryreservation.php");
	       
	      ffdriver.findElement(By.name("userName")).sendKeys("sunil");;
	      
	      ffdriver.findElement(By.name("password")).sendKeys("sunil");
	      
	      WebElement home = ffdriver.findElement(By.linkText("Home"));
	      
	      Actions Mouseover = new Actions(ffdriver);
	      
	      Mouseover.moveToElement(home).build().perform();
	      
	  
	      
	      Mouseover.sendKeys(Keys.ENTER).perform();
	      
	        ffdriver.navigate().back();
	      
	      
	      
	      
	      
	}

}
