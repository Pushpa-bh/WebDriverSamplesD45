package TestScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class GooglePageTest {
	
	WebDriver driver;
	ChromeDriver driver1;
  @Test
  public void SearchJavaTest() {
	  
	//  ChromeOptions options=new ChromeOptions();
	//  options.addArguments("--headless");
	//  options.setBrowserVersion("115");
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.google.com/");
//	  WebElement searchbox=driver.findElement(By.id("APjFqb"));
//	  WebElement searchbox=driver.findElement(By.name("q"));
//	  WebElement searchbox=driver.findElement(By.className("gLFyf"));
	  searchbox.sendKeys("Java Tutorial");
	  searchbox.sendKeys(Keys.ENTER);
	  System.out.println("Page Title:" + driver.getTitle());
	  
	  driver.navigate().back();
	  System.out.println("Page Title: after back..." + driver.getTitle());
	  
	  driver.navigate().forward();
	  System.out.println("Page Title: after forward..." + driver.getCurrentUrl());
	  driver.close();
  }
}
