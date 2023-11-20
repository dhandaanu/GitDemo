package PageObject;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import utilities.TestingHelper;

public class Register extends TestingHelper{

    static WebDriver driver;
    
    By registerBtn = By.xpath("//a[@href ='/register']");
	By usname = By.id("id_username");
	By psword = By.name("password1");
	By confpsword = By.name("password2");
	By register = By.xpath("//input[@value='Register']");
	By errormsg = By.xpath("//div[@class='alert alert-primary']");
	By successmsg = By.xpath("//div[@class='alert alert-primary']");	
    
    public void openHomePg() {
		driver = new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://dsportalapp.herokuapp.com/home");
	 }
    
    public void registerPage() {
       driver.findElement(registerBtn).click();
    }
 
    public void register() {
       driver.findElement(register).click();
   }

   public void sendUserName(String username) {

	   driver.findElement(usname).sendKeys(username);
   }

   public void sendPassword(String password) { 

	   driver.findElement(psword).sendKeys(password);
   }
   public void sendConfirmation(String confirmpassword) {

	   driver.findElement(confpsword).sendKeys(confirmpassword);
   }

 //  public void pwdmissMatch() {
 //       WebElement Errmsg =  driver.findElement(errormsg);
//		String text=(Errmsg).getText();
//		System.out.println(text);
//    }

 //  public void successMsg() {
 //     WebElement succmsg =  driver.findElement(successmsg);
//	  String text1=(succmsg).getText();
	//  System.out.println(text1);
	
 //  }
   
   public void fillOutField() throws InterruptedException {
	   Thread.sleep(2000);

	   Alert alert = driver.switchTo().alert(); // switch to alert

	   String alertMessage= driver.switchTo().alert().getText(); // capture alert message

	   System.out.println(alertMessage); // Print Alert Message
	   Thread.sleep(2000);
	   alert.accept(); 
	   
	   driver.findElement(By.xpath("//a[@class='bs-alert-close']")).click();
	   }
   
   public void navigate() {
	   driver.navigate().refresh();
   }
	  
   
 
}


