package SeleniumWebdriver;
import java.util.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo3 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\SaranyaNATARAJAN\\Downloads\\geckodriver-v0.24.0-win64\\geckodriver.exe");
	       WebDriver  ffdriver = new FirefoxDriver();
	       ffdriver.manage().window().maximize();
	       ffdriver.navigate().to("http://newtours.demoaut.com/mercuryreservation.php");
	       
	      WebElement username = ffdriver.findElement(By.name("userName"));
	      
	      if(username.isEnabled())
	      {
	    	  username.sendKeys("sunil");
	    	  
	    	  //Get attribute --- whenever we pass value to edit field,whenever webelement is dynamic in nature//
	    	  	String UserName = username.getAttribute("value");
	    	  	System.out.println(UserName);
	    	  	
	    	  	//get txt ----label,dropdown,links which is available in the link eg:Username//
	    	  	
	    	  	String un = ffdriver.findElement(By.xpath("//*[contains (text(),'Name:')]")).getText();
	    	  	System.out.println(un);
	    	  	
	      }
	   
	      WebElement Password=  ffdriver.findElement(By.name("password"));
	    		  Password.sendKeys("sunil");
	    		  
	    		  ffdriver.findElement(By.xpath("//*[@name='login']")).click();
	    		  
	    		Thread.sleep(30000);
	    	   //how to enable click button/      
	    		if( ffdriver.findElement(By.xpath("//*[@name='tripType' and @value='roundtrip']")).isSelected());
	    		Thread.sleep(30000);
	    		{
	    			ffdriver.findElement(By.xpath("//*[@name='tripType' and @value='oneway']")).click();
	    		}
	    		
	    		
	    		 WebElement DropDown=  ffdriver.findElement(By.name("passCount"));
	    		 //Select is to click on the drop down//
	    		 Select sel = new Select( DropDown);
	    		 //to get all the values from drop down//
	    		 
	    		List<WebElement>options = sel.getOptions();
	    		
	    		System.out.println(options.size());// size is not a method of Selenium//
	    		
	    		for(int i=0;i<options.size();i++) 
	    		{
	    			System.out.println(options.get(i).getText());
	    		}
	    		
	    		sel.selectByValue("1");
	    		
	    	String option = ffdriver.findElement(By.name("passCount")).getAttribute("value");
	    		
	    	//Thread.sleep(3000); 
	    	       
	    	sel.selectByValue("1");
	    		 //Thread.sleep(3000); 
	    		
	    		//sel.selectByValue("");
	    		
	    		Thread.sleep(3000); 
	    		
	    		ffdriver.findElement(By.xpath("//*[@name='servClass' and @value='Business']")).click();	
	    		
	    		Thread.sleep(3000); 
	    		
	    		ffdriver.findElement(By.xpath("//*[@name='findFlights']")).click();
	    		
	    		Thread.sleep(3000); 
	    		
	    		ffdriver.findElement(By.xpath("//*[@name='reserveFlights' ]")).click();	
	    		
	    		Thread.sleep(3000); 
	    		
	    		 ffdriver.findElement(By.xpath("//*[@name='passFirst0']")).sendKeys("Saranya");
	    		 
	    		 ffdriver.findElement(By.xpath("//*[@name='passLast0']")).sendKeys("Parthiban");
	    		 
	    		 ////WebElement DropDown1=  ffdriver.findElement(By.name("creditCard")); 
	    		 
	    		 ////Select sel1 = new Select( DropDown1);
	    		
	    		// List<WebElement> options1 = sel1.getOptions();
	    		 
	    		 //for(int i=0;i<options.size();i++) 
		    		//{
		    			//System.out.println(options.get(i).getText());
		    		//}
		 // sel.selectByValue("2");
	    		 
	    		 ffdriver.findElement(By.xpath("//*[@name='creditnumber']")).sendKeys("43025687");
	    		 
	    		 
	    		 
	        List<WebElement>checkbox =ffdriver.findElements(By.xpath("//*[@name='ticketLess' and @value='checkbox']"));
	       
	        System.out.println("Checkbox size:"+checkbox.size());
	 for(int i=0 ; i<checkbox.size();i++)
	 {
		checkbox.get(i).click(); 
	 }
		 
	 ffdriver.findElement(By.xpath("//*[@name='byFlights']")).click();
	
	}
	
}


