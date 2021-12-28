package com.sreejith.training;
import com.google.common.base.Verify;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



@Test
public class FirstTest {

 public static void main (String [] args) throws InterruptedException {
 System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
  //WebDriverManager.chromedriver().setup();

  WebDriver driver = new ChromeDriver();
  driver.get("https://www.facebook.com/");
  Thread.sleep(4000);
  String page_Title = driver.getTitle();
  Assert.assertEquals(page_Title,"Facebook – log in or sign up");
  driver.quit();
 }



}
