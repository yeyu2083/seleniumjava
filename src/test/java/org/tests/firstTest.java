package org.tests;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class firstTest {
  public static void main(String[] args) throws InterruptedException {

     WebDriver driver = new ChromeDriver(); Thread.sleep(3000);

    driver.get("http://www.google.com"); Thread.sleep(3000); String title = driver.getTitle();
    if(title.equals("Google")) {
      System.out.println("Test Passed");
    } else {
      System.out.println("Test Failed");
    }
    String url = driver.getCurrentUrl();
    if(url.equals("http://google.co.in")) {
      System.out.println("Test Passed url has co.in");
    } else {
      System.out.println("Test Failed url has not co.in");
    }
//    driver.navigate().to("http://www.gmail.com");Thread.sleep(3000);
//    driver.navigate().back();Thread.sleep(3000);
//    driver.navigate().forward();Thread.sleep(3000);
//    driver.navigate().refresh();Thread.sleep(3000);

    driver.manage().window().maximize();
    driver.close();
  }

}
