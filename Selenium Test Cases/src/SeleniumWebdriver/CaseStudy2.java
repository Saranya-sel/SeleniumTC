package SeleniumWebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class CaseStudy2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\SaranyaNATARAJAN\\Downloads\\geckodriver-v0.24.0-win64\\geckodriver.exe");
	      WebDriver  ffdriver = new FirefoxDriver();	
			ffdriver.manage().window().maximize();
			 ffdriver.navigate().to("https://opensource-demo.orangehrmlive.com/");
			 ffdriver.findElement(By.xpath("//*[@id='txtUsername']")).sendKeys("Admin");
	         ffdriver.findElement(By.xpath("//*[@id='txtPassword']")).sendKeys("admin123");
			 //ffdriver.findElement(By.xpath("//*[@id='btnLogin']"));

                  Actions MouseOver =new Actions(ffdriver);
                 MouseOver.sendKeys(Keys.RETURN).perform();//Even Keys.Enter also do the same operations
                 Thread.sleep(3000);
                 
                 MouseOver.sendKeys(Keys.TAB, Keys.TAB, Keys.TAB,Keys.RETURN).perform();
                 
                 
                  
                  
	}

}
