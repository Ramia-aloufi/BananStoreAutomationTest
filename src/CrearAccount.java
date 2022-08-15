import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CrearAccount {
	//Use safari Browser
	SafariDriver driver;
	String url;
	String expect;
	String actual;
	boolean status;
	
	@BeforeTest
	public void before() {

		driver = new SafariDriver();
		url = "https://www.banana.sa";
		expect = "The email you entered isn’t connected to an account. Find your account and log in.";
	}

  @Test
  public void sigup()throws InterruptedException  {
	  WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(90));

	  //navigate to banana website and maximaize
	  driver.get(url);
	  driver.manage().window().maximize();
	 
	  //click register
	  driver.findElement(By.xpath("/html/body/div[5]/header/div[1]/div[1]/div[3]/div/ul/li[2]/a/span")).click();
	  Thread.sleep(10000);
	  

	  

	  driver.switchTo().frame(driver.findElement(By.xpath("/html/body/div[7]/div[1]/div/div/iframe")));
	  Thread.sleep(1000);
	  //firstname
//      wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.cssSelector("#input-firstname"))));

	  driver.findElement(By.cssSelector("#input-firstname")).sendKeys("Ramia");
	  Thread.sleep(1000);
	  
	  //lastname
	  driver.findElement(By.cssSelector("#input-lastname")).sendKeys("Aloufi");
	  Thread.sleep(1000);

	  //email
	  driver.findElement(By.cssSelector("#input-email")).sendKeys("rpk@a.com");
	  Thread.sleep(1000);

	  //telephone
	  driver.findElement(By.cssSelector("#input-telephone")).sendKeys("050000000");
	  Thread.sleep(1000);

	  //password
	  driver.findElement(By.cssSelector("#input-password")).sendKeys("abcd1234");
	  Thread.sleep(1000);

	  //confirm password
	  driver.findElement(By.cssSelector("#input-confirm")).sendKeys("abcd1234");
	  Thread.sleep(1000);

	  //check agree
	  driver.findElement(By.xpath("/html/body/div[2]/form/div[2]/div/input")).click();
	  Thread.sleep(1000);

	  //click continue
	  driver.findElement(By.xpath("/html/body/div[2]/form/div[2]/div/button")).click();
	  Thread.sleep(20000);


	  

	  
	  
	  
	  
	  
	  
	  
}
  
}
