package SeleniumWebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxDriver.SystemProperty;

public class Verify1  {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
    System.setProperty("webdriver.gecko.driver", "C:\\Users\\SaranyaNATARAJAN\\Downloads\\geckodriver-v0.24.0-win64\\geckodriver.exe");
      WebDriver  ffdriver = new FirefoxDriver();	
		ffdriver.manage().window().maximize();
		 ffdriver.navigate().to("http://newtours.demoaut.com/mercuryreservation.php");
		
		 Thread.sleep(3000);
		 
		 ffdriver.findElement(By.name("userName")).sendKeys("sunil");
		 ffdriver.findElement(By.name("password")).sendKeys("sunil");
		 
		 ffdriver.findElement(By.xpath("//*[@name='login']")).click();
		 
		 Thread.sleep(3000);
			
		 ffdriver.findElement(By.linkText("Home")).click();
		 
		 Thread.sleep(3000);
		 
			
			ffdriver.findElement(By.linkText("Flights")).click();
			 
			Thread.sleep(3000);
			
		
		 ffdriver.findElement(By.linkText("Hotels")).click();
		
		Thread.sleep(3000);
		
		WebElement temp = ffdriver.findElement(By.xpath("//*[contains(@src,'/images/masts/mast_construction.gif')]"));
		
		if(temp.isDisplayed())
		{
			System.out.println(" Hotel Website is under construction");
				
		
		}
		Thread.sleep(3000);
		
		ffdriver.findElement(By.linkText("Car Rentals")).click();
		
		WebElement temp1 = ffdriver.findElement(By.xpath("//*[contains(@src,'/images/masts/mast_construction.gif')]"));
		
	
		if(temp1.isDisplayed())
		{
			System.out.println(" Car Rentals Website is under construction");
				
		}
		
		
		ffdriver.findElement(By.linkText("Cruises")).click();
		
		Thread.sleep(3000);
		
		ffdriver.findElement(By.linkText("Destinations")).click();
		
		Thread.sleep(3000);
		
		WebElement temp2 = ffdriver.findElement(By.xpath("//*[contains(@src,'/images/masts/mast_construction.gif')]"));

		if(temp2.isDisplayed())
		{
			System.out.println(" Destinations Website is under construction");
				
		}
		
		Thread.sleep(31000);
				
		ffdriver.findElement(By.linkText("Vacations")).click();
		
		Thread.sleep(3000);
		
		WebElement temp3 = ffdriver.findElement(By.xpath("//*[contains(@src,'/images/masts/mast_construction.gif')]"));
		
		if(temp3.isDisplayed())
		{
			System.out.println(" Vacation Website is under construction");
				
		}
		
		
	}

		

}