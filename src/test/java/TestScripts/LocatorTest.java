package TestScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LocatorTest {
	WebDriver driver;
  @Test
  public void loginTest() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	//  driver.get("https://the-internet.herokuapp.com/login");
	  driver.get("https://testautomationpractice.blogspot.com/");
	//  driver.findElement(By.xpath("//input[@id='username']")).sendKeys("tomsmith");
	  
//	  WebElement username=driver.findElement(By.id("username"));
//	  username.sendKeys("tomsmith ");
//	  WebElement password=driver.findElement(By.id("password"));
//	  password.sendKeys("SuperSecretPassword!");
//	  driver.findElement(( By.className("radius")).click();
//	  driver.findElement((By.linkText("Elemental Selenium")).click();
//	  driver.findElement((By.partialLinkText("Elemental")).click();
	  driver.findElement((By.cssSelector("button.radius")).click();
	  driver.findElement((By.cssSelector("input[placeholder='Enter Name']")).click();
	  
  }
}
