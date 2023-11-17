package Utilities;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Helper {
	
	private static Helper Helper;
      private static WebDriver driver;
       
       private Helper() {
    	   
    	 //  WebDriverManager.chromedriver().setup();
    	   driver = new ChromeDriver();
    	   new WebDriverWait(driver,Duration.ofSeconds(2));
    	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
    	   driver.manage().window().maximize();
       } 
    	   
       public static void openPage() {
    	   driver.get("https://dsportalapp.com/login");
       }
       
       public static String getTitle() {
    	   return driver.getTitle();
       
       }
       
       public static void NavBack() {
    	   driver.navigate().back();
       
       }
       
       public static void GetStartedbttn() {
    	  
    	   driver.findElement(By.xpath("//a[text() = 'GetStarted'")).click();
       }
       
       public static void Tryherebttn() {
    	   
    	   driver.findElement(By.xpath("//a[text()='Try here>>>'")).click();
    	   
       }
       
       public static void setUpDriver() {
    	   if (Helper==null) {
    		   Helper=new Helper();
    	   }
       }
       
       public static void tearDown() {
    	   if(driver!=null) {
    		   driver.close();
    		   driver.quit();
    	   }
    	   
    	   Helper = null;
    	   
    	  
       }
       
       
}
