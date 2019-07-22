package SeleniumWebdriver;

import java.util.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
public class CaseStudy1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\SaranyaNATARAJAN\\Downloads\\geckodriver-v0.24.0-win64\\geckodriver.exe");
	      WebDriver  ffdriver = new FirefoxDriver();	
			ffdriver.manage().window().maximize();
			 ffdriver.navigate().to("http://newtours.demoaut.com/mercuryreservation.php");
			 
			 String UnderConstructiontitle = "Under Construction: Mercury Tours";
			 
			
			 
			List<WebElement>links = ffdriver.findElements(By.tagName("a"));
			 String[] linktext = new String[links.size()];
			int i=0;
			
			for(WebElement e:links)
			{
				linktext[i]=e.getText();
				i++;
				}
			
			for(String t:linktext)
				
			{
			  
			 	ffdriver.findElement(By.linkText(t)).click();
			 	if(ffdriver.getTitle().equals(UnderConstructiontitle))
			 	{
			 		System.out.println("\"" + t  + "\" + is under Construction");
			 		
			 		
			 	}
			 	else
			 	{
			 		
			 		System.out.println("\""+ t +"\"+is Working");
			 	}
			 		
			 		ffdriver.navigate().back();		
			 
			 	}
			ffdriver.close(); 
	}

}
