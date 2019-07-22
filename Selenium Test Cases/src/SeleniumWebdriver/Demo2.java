package SeleniumWebdriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\SaranyaNATARAJAN\\Downloads\\geckodriver-v0.24.0-win64\\geckodriver.exe");
	       WebDriver  ffdriver = new FirefoxDriver();
	       ffdriver.manage().window().maximize();
	       ffdriver.navigate().to("http://newtours.demoaut.com/mercuryreservation.php");
	       ffdriver.findElement(By.xpath("//*[@name='userName']")).sendKeys("sunil");
	       ffdriver.findElement(By.xpath("//*[@name='password']")).sendKeys("sunil");
	       ffdriver.findElement(By.xpath("//*[@name='login']")).click();
	}

}
