package org.stepdefinition;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;


public class LoginPage {
	WebDriver driver;
	
	@Given("User should load the url")
	public void user_should_load_the_url() {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
//		DesiredCapabilities cap = new DesiredCapabilities();
//		cap.setCapability(ChromeOptions.CAPABILITY, options);
//		options.merge(cap);
//		driver=new ChromeDriver(options);
		driver=new ChromeDriver(options);
		driver.get("https://demoqa.com/");
		driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	@When("User should click the elements")
	public void user_should_click_the_elements() {
		driver.findElement(By.xpath("//html/body")).sendKeys(Keys.PAGE_DOWN);
		driver.findElement(By.xpath("//div[@class='category-cards']//div[1]//div[1]//div[2]//*[name()='svg']")).click();

	}

	@When("User should click the text box")
	public void user_should_click_the_text_box() {
		driver.findElement(By.xpath("//span[normalize-space()='Text Box']")).click();
		
	}

	@When("User should enter the {string},{string},{string} and {string}")
	public void user_should_enter_the_and(String fullname, String email, String currentaddress, String preaddress) {
		driver.findElement(By.xpath("//input[@id='userName']")).sendKeys(fullname);
		driver.findElement(By.xpath("//input[@id='userEmail']")).sendKeys(email);
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/form[1]"
				+ "/div[3]/div[2]/textarea[1]")).sendKeys(currentaddress);
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]"
				+ "/div[2]/div[2]/form[1]/div[4]/div[2]/textarea[1]")).sendKeys(preaddress);
	}

	@When("User should click the submit buttom and check box")
	public void user_should_click_the_submit_buttom_and_check_box() {
		driver.findElement(By.xpath("//button[text()='Submit']")).click();
		//driver.quit();
	}

	@When("User should click the text box and check box")
	public void user_should_click_the_text_box_and_check_box() {
	    driver.findElement(By.xpath("//span[normalize-space()='Check Box']")).click();
	    driver.findElement(By.xpath("//button[@title='Toggle']//*[name()='svg']")).click();
	    driver.findElement(By.xpath("//span[text()='Documents']")).click();
	    driver.quit();
	}

	@When("User should click the webtable")
	public void user_should_click_the_webtable() {
		driver.findElement(By.xpath("//html/body")).sendKeys(Keys.PAGE_DOWN);
		driver.findElement(By.xpath("//span[text()='Web Tables']")).click();
		  driver.findElement(By.id("addNewRecordButton")).click();
	}

	@When("User should enter the {string},{string},{string},{string},{string} and {string}")
	public void user_should_enter_the_and(String firstname, String lastname, String emailid, String age, String salaray, String Department) {
	driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys(firstname);    
	driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys(lastname);    
	driver.findElement(By.xpath("//input[@id='userEmail']")).sendKeys(emailid);    
	driver.findElement(By.xpath("//input[@placeholder='Age']")).sendKeys(age);    
	driver.findElement(By.xpath("//input[@id='salary']")).sendKeys(salaray);    
	driver.findElement(By.xpath("//input[@id='department']")).sendKeys(Department);    
	
	}

	@When("user should click the submit button")
	public void user_should_click_the_submit_button() {
	    driver.findElement(By.xpath("//button[@id='submit']")).click();
	    driver.quit();
	}



	
	
	

}
