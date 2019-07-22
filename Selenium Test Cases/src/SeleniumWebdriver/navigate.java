package SeleniumWebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class navigate {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\SaranyaNATARAJAN\\Downloads\\geckodriver-v0.24.0-win64\\geckodriver.exe");
	      WebDriver  ffdriver = new FirefoxDriver();	
			ffdriver.manage().window().maximize();
			 ffdriver.navigate().to("http://newtours.demoaut.com/mercuryreservation.php");
			 
			 ffdriver.findElement(By.linkText("Cruises")).click();
				
				Thread.sleep(1000);
				ffdriver.navigate().back();
				
				Thread.sleep(1000);
				
				ffdriver.navigate().forward();
				
               Thread.sleep(1000);
				
				ffdriver.navigate().refresh();
				  Thread.sleep(1000);
				  
				  ffdriver.close();
				
				
	}

}
