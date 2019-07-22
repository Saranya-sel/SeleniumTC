
package SeleniumWebdriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Demo4 {

	public static void main(String[] args) throws InterruptedException {
		// This is to set the property of Gecko driver the reason is supports the latest version of firefox so we require to set the geckodriver path//
   System.setProperty("webdriver.gecko.driver", "C:\\Users\\SaranyaNATARAJAN\\Downloads\\geckodriver-v0.24.0-win64\\geckodriver.exe");
       WebDriver  ffdriver = new FirefoxDriver();
       
       //API command to maximize the browser//
       
       ffdriver.manage().window().maximize();
       
       // command to open the URL//
       
       //ffdriver.get(c");
       
       //Alternate API to open the browser//
       
   ffdriver.navigate().to("https://opensource-demo.orangehrmlive.com/");
   
   
   
         
     ffdriver.findElement(By.xpath("//*[@id='txtUsername']")).sendKeys("Admin");
          ffdriver.findElement(By.xpath("//*[@id='txtPassword']")).sendKeys("admin123");
          ffdriver.findElement(By.xpath("//*[@id='btnLogin']")).click();
         Thread.sleep(3000);
         ffdriver.findElement(By.linkText("Performance")).click();
        
         //List<WebElement> allLinks = driver.findElements(By.tagName("a"));
        // System.out.println(link.getText() + " - " + link.getAttribute("href"));
    
       
         
         
         
         
	}

}