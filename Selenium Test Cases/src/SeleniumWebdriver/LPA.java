package SeleniumWebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LPA {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\SaranyaNATARAJAN\\Downloads\\geckodriver-v0.24.0-win64\\geckodriver.exe");
	       
		WebDriver  ffdriver = new FirefoxDriver();
	       
	      
	       ffdriver.manage().window().maximize();
	       
	       ffdriver.navigate().to("https://ppydalinmbz01.sl.bluecloud.ibm.com/services/in/lpa/pqaSignOut.action");
	       
	       ffdriver.findElement(By.xpath("//*[@name='userName']")).sendKeys("saranyn1@in.ibm.com");
	       
	       ffdriver.findElement(By.xpath("//*[@name='password']")).sendKeys("Bangalore135792!");
	       ffdriver.findElement(By.xpath("//*[@value='Submit' and @class='ibm-btn-arrow-pri']")).click();
	       
	       Thread.sleep(90000); 
	       
	       ffdriver.findElement(By.xpath("//*[@id='ibm-navigation']/ul/li[2]/a")).click();
	       
	}

}
