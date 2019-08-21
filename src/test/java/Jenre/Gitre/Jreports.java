package Jenre.Gitre;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Jreports {
	WebDriver driver;
	
	@Given("TestMe is up and running")
	public void testme_is_up_and_running() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
		System.setProperty("webdriver.chrome.driver","C:\\Users\\training_h2a.06.15\\Desktop\\Selenium Workspace\\SeleniumBroDrivers\\chromedriver.exe\\");
		driver=new ChromeDriver();
		driver.get("http://10.232.237.143:443/TestMeApp/login.htm");
		driver.manage().window().maximize();
	
	}

	@Then("registered user enter the valid creds")
	public void registered_user_enter_the_valid_creds() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	
		driver.findElement(By .name("userName")).sendKeys("Lalitha");
		driver.findElement(By .name("password")).sendKeys("Password123");
		driver.findElement(By .name("Login")).click();
		
	}

	@Then("verifies for the login status for this cred")
	public void verifies_for_the_login_status_for_this_cred() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		 String str6 = driver.findElement(By .xpath("//*[@id=\"menu3\"]/li[4]/a/span")).getText();
		  String str7= "OrderDetails";
		  Assert.assertEquals(str6, str7);
		  driver.findElement(By .linkText("SignOut")).click();
	}

}
