import java.awt.datatransfer.SystemFlavorMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DEMO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\automation\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://jt-dev.azurewebsites.net/#/SignUp");
		
		//validating the language
		
		driver.findElement(By.xpath("//*[@id=\'language\']/div[1]/span/span[2]")).click();
		
		//Entering the name
		
		driver.findElement(By.id("name")).sendKeys("AshwinKumar A");
		
		//Enter your organization name here
		
		driver.findElement(By.name("orgName")).sendKeys("XXX");
		
		//enter your email id
		
		driver.findElement(By.name("email")).sendKeys("ashwinkumarari@gmail.com");
		
		//select the checkbox
		
		driver.findElement(By.xpath("//*[@id='content']/div/div[3]/div/section/div[1]/form/fieldset/div[4]/label/span")).click();
		
		//click on get started
		
		
		driver.findElement(By.xpath("//*[@id=\'content\']/div/div[3]/div/section/div[1]/form/fieldset/div[5]")).click();
	
		
		

	}

}
