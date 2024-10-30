package TestScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NavigationBarTest {
	WebDriver driver;
  @Test
  public void Navigation() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.lambdatest.com/");
	  driver.findElement((By.cssSelector("nav div.header__menu__items > div:nth-child(2)")).click();
  }
}
