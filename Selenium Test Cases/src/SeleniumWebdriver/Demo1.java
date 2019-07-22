package SeleniumWebdriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Demo1 {

	public static void main(String[] args) throws InterruptedException {
		// This is to set the property of Gecko driver the reason is supports the latest version of firefox so we require to set the geckodriver path//
   System.setProperty("webdriver.gecko.driver", "C:\\Users\\SaranyaNATARAJAN\\Downloads\\geckodriver-v0.24.0-win64\\geckodriver.exe");
       WebDriver  ffdriver = new FirefoxDriver();
       
       //API command to maximize the browser//
       
       ffdriver.manage().window().maximize();
       
       // command to open the URL//
       
       //ffdriver.get("https://opensource-demo.orangehrmlive.com/");
       
       //Alternate API to open the browser//
       
   ffdriver.navigate().to("https://opensource-demo.orangehrmlive.com/");
   
   String ExpectedTitle= "OrangeHRM" ;
   
   //wait should not be used in real time//
    
   //Thread.sleep(3000);
   
   //refresh the web app(Navigation Method)//
   
        // ffdriver.navigate().refresh();
         
   
 
  //to find the element and pass value to the element//
         ffdriver.findElement(By.xpath("//*[@id='txtUsername']")).sendKeys("Admin");
         ffdriver.findElement(By.xpath("//*[@id='txtPassword']")).sendKeys("admin123");
         ffdriver.findElement(By.xpath("//*[@id='btnLogin']")).click();
         
         String ActualTitle = ffdriver.getTitle();
         
         System.out.println(ActualTitle); 
         if(ExpectedTitle.equals(ActualTitle))
         {
         Thread.sleep(3000);
         ffdriver.findElement(By.xpath("//*[@id='welcome']")).click();
         ffdriver.findElement(By.xpath("//*[@id='welcome-menu']/ul/li[2]/a")).click();
    
         }
         else
         {
        	 System.out.println("Title not same");
         }
         
         
         
         
	}

}
