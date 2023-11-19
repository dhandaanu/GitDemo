package PageObject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

   public class Login{
	   static WebDriver driver ; 
	
	By loginBtn = By.xpath("//a[text()='Sign in']");
	By Uname = By.name("username");
	By Passwrd = By.name("password");
	By Loginclick = By.xpath("//input[@type='submit' and @value='Login']");
	By Unameerr = By.xpath("//div[@class='alert alert-primary']");
	By Loginmsg = By.xpath("//div[@class='alert alert-primary']");
	By Validusername = By.xpath("//div/ul/a[2]");
	By InvalidUNerr = By.xpath("//div[@class='alert alert-primary']");
	By InvalidPasserr = By.xpath("//div[@class='alert alert-primary']");
	By SignoutBtn = By.xpath("//a[text()='Sign out']");
	
	public void openHomePage() {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://dsportalapp.herokuapp.com/home");
		
	 }

	public void signIn() {
		driver.findElement(loginBtn).click();
	}
	
	public void enterUsername(String username) {
		driver.findElement(Uname).sendKeys(username);
	}

	public void enterPassword(String password) {
		driver.findElement(Passwrd).sendKeys(password);
	}
	
	public void clickLogin() {
		driver.findElement(Loginclick).click();
	}
	
	public void getSucessmsg(){
		WebElement Succmsg = driver.findElement(By.xpath("//div[@class='alert alert-primary']"));
		String text=(Succmsg).getText();
		System.out.println( text );
		String expectedElementText = "You are logged in";
		Assert.assertEquals(text, expectedElementText,"You are logged in");
	  }
	
	public void getErrMsgUN() {
		WebElement Errmsg = driver.findElement(Unameerr);
		String text1=(Errmsg).getText();
		System.out.println( text1 );
		String expectedElementText1 = "Invalid Username and Password";
		//String expectedElementText2 = "Please check your user id";
		//String expectedElementText3 = "Please check your password";
		 //Assert to verify the actual and expected values
		Assert.assertEquals(text1, expectedElementText1,"Expected and Actual are not same");
	  }
	
	public void getErrMsgInvaludUN() {
		
		WebElement InvalidUnErrmsg = driver.findElement(InvalidUNerr);
		String InvalidUnErrmsgtext=(InvalidUnErrmsg).getText();
		System.out.println( InvalidUnErrmsgtext );
		
		String expectedElementText2 = "Please check your user id";
		
		Assert.assertEquals(InvalidUnErrmsgtext, expectedElementText2,"Expected and Actual are not same");
	}
	
	
	public void getErrMsgInvaliedpass() {
		
		WebElement InvalidpassErrmsg = driver.findElement(InvalidPasserr);
		String InvalidpassErrmsgtext=(InvalidpassErrmsg).getText();
		System.out.println( InvalidpassErrmsgtext );
		
		String expectedElementText3 = "Please check your password";
		
		Assert.assertEquals(InvalidpassErrmsgtext, expectedElementText3,"Expected and Actual are not same");
	}
	
	
	public void signOut() {
		
		driver.findElement(SignoutBtn).click();
	}
}
