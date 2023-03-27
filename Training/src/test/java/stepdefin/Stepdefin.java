package stepdefin;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Stepdefin {

	WebDriver driver;

	@Given("launch the browser")
	public void launch_the_browser() {
		
		//WebDriverManager.chromeDriver().setup();
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(option);
	}

	@Given("visiting the login page")
	public void visiting_the_login_page() {
		driver.get("https://demo.cyclos.org/ui/login");
	}

	@When("enter username")
	public void enter_username() {
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		WebElement username = driver.findElement(By.xpath("//input[@placeholder='User']"));
		username.sendKeys("demo");
	}

	@When("enter the password")
	public void enter_the_password() {
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("1234");
	}

	@When("click on submit")
	public void click_on_submit() {
		driver.findElement(By.xpath("//span[normalize-space()='Submit']")).click();
		System.out.println("Login Succesfully");
	}

	@Then("I validate the login homepage")
	public void i_validate_the_login_homepage() {
		String title = "Login - Cyclos";
	
		Assert.assertEquals(title, driver.getTitle());
		driver.close();

	}

	@Given("click the payuser button")
	public void click_the_payuser_button() {
		WebElement payment = driver.findElement(By.xpath("//div[text()=' Pay user ']"));
		payment.click();

	}
	@When("Search any pet in the search option")
	public void search_any_pet_in_the_search_option() {
		
			WebElement Keyword = driver.findElement(By.xpath("//input[@name='keyword']"));
			Keyword.sendKeys("Amazon Parrot");
			WebElement Search = driver.findElement(By.xpath("//input[@value=\"Search\"]"));
			Search.click();
	}

	@When("Select the product and click the Add to card")
	public void select_the_product_and_click_the_add_to_card() {
		WebElement pro = driver
				.findElement(By.xpath("(//div[@id='Catalog']//following-sibling::a//font[@color='BLACK'])[1]"));
		pro.click();
		WebElement addtocart = driver.findElement(By.xpath("//a[text()='Add to Cart']"));
		addtocart.click();
	    
	}

	@Then("Purchase the product")
	public void purchase_the_product() {
		
			WebElement checkout = driver.findElement(By.xpath("//div[@id='Cart']//following-sibling::a[@class='Button']"));
			checkout.click();
			driver.quit();
	   
	}

	@When("enter the user name in search field")
	public void enter_the_user_name_in_search_field() {

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebElement p = driver.findElement(By.xpath("//input[@placeholder='Type to search']"));
		p.sendKeys("n");
		WebElement list = driver.findElement(By.xpath("//a[@class='select-option autocomplete-option-0']"));
		list.click();
	}

	@When("enter the user amount to be send")
	public void enter_the_user_amount_to_be_send() {

		WebElement amount = driver.findElement(By.xpath("//input[contains(@id,'id')]"));
		amount.clear();
		amount.sendKeys("200");

	}

	@When("Write a discription amount send or not")
	public void write_a_discription_amount_send_or_not() {

		WebElement desc = driver.findElement(By.xpath("//textarea[@id='id_6']"));
		desc.sendKeys("Amount added successfully");
	}

	@When("click the next button to redirect page")
	public void click_the_next_button_to_redirect_page() {

		WebElement next = driver.findElement(By.xpath("//span[normalize-space()='Next']"));
		next.click();

	}

	@Then("verify once all details correct then click to confirm button")
	public void verify_once_all_details_correct_then_click_to_confirm_button() {

		WebElement conf = driver.findElement(By.xpath("//span[normalize-space()='Confirm']"));
		conf.click();
		driver.close();
	}
	// Purchase one product
		@Given("Lauch the cyclos application url and Login")
		public void lauch_the_cyclos_application_url_and_login() {
//			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.get("https://demo.cyclos.org/ui/home");
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			driver.findElement(By.xpath("//div[text()=' Login ']")).click();
		}

		@When("Enter Username {string} and Password {string}")
		public void enter_username_and_password(String us, String ps) {
			WebElement usna = driver.findElement(By.xpath("//input[@placeholder='User']"));
			usna.sendKeys(us);
			WebElement psna = driver.findElement(By.xpath("//input[@placeholder='Password']"));
			psna.sendKeys(ps);

		}

		@When("Click submit button")
		public void click_submit_button() {
			WebElement sub = driver.findElement(By.xpath("//button[@type='button']//child::*"));
			sub.click();
		}

		@Then("Select Marketplace and choose the product")
		public void select_marketplace_and_choose_the_product() {
			driver.findElement(By.xpath("//div[@class='menu-text'][normalize-space()='Marketplace']")).click();
			WebElement img = driver.findElement(By.xpath("(//div[@class='card-body'])[1]"));
			img.click();

		}

		@Then("User Makes the payment")
		public void user_makes_the_payment() {
			driver.findElement(By.xpath("//div[text()='Make payment']")).click();
			driver.quit();
		}

		// Invalid user credentials
		@Given("User should launch the Cyclos Url")
		public void user_should_launch_the_cyclos_url() {
//			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.get("https://demo.cyclos.org/ui/home");

		}

		@Given("User should click the login button")
		public void user_should_click_the_login_button() {
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			driver.findElement(By.xpath("//div[text()=' Login ']")).click();
		}

		@When("User should enter the valid username")
		public void user_should_enter_the_valid_username() {
			WebElement usna = driver.findElement(By.xpath("//input[@placeholder='User']"));
			usna.sendKeys("demo");

		}

		@When("User should enter the invalid password")
		public void user_should_enter_the_invalid_password() {
			WebElement psna = driver.findElement(By.xpath("//input[@placeholder='Password']"));
			psna.sendKeys("12345");
		}

		@Then("Login with credentials and get error")
		public void login_with_credentials_and_get_error() {
			WebElement sub = driver.findElement(By.xpath("//button[@type='button']//child::*"));
			sub.click();
			driver.quit();
		}

	
	

	////////////////////////////////////////////////////////////////////////////
//	@When("select to my vouchers tab")
//	public void select_to_my_vouchers_tab() {
//		WebElement dashboard = driver.findElement(By.xpath("div[contains(text(),'Dashboard')]"));
//		dashboard.click();
//		WebElement select = driver.findElement(By.xpath("div[contains(text(),'My vouchers')]"));
//		select.click();
//
//	}
//
//	@When("choose cinema voucher")//////
//	public void choose_cinema_voucher() {
//		WebElement cinema = driver.findElement(By.xpath("div[contains(text(),'My vouchers')]"));
//		cinema.click();
//		WebElement myvou = driver.findElement(By.xpath("div[normalize-space()='Buy vouchers']"));
//		myvou.click();
//		WebElement clickVoucher = driver.findElement(By.xpath("a[normalize-space()='Cinema voucher']"));
//		clickVoucher.click();
//
//	}
//
//	@When("add three vouchers and pay amount reedem") /////input[@id='id_125']
//	public void add_three_vouchers_and_pay_amount_reedem() {
//		
//		WebElement totalVou = driver.findElement(By.xpath("input[@id='id_125']"));
//		totalVou.clear();
//		totalVou.sendKeys("3");
//		WebElement amountAdd = driver.findElement(By.xpath("//input[contains(@class,'form-control text-right ng-valid ng-touched ng-dirty')]input[@id='id_125']"));
//		amountAdd.sendKeys("20");
//		
//
//	}
//
//	@When("make the vouchers reedamble successfully")
//	public void make_the_vouchers_reedamble_successfully() {
//		
//		WebElement paymentDone = driver.findElement(By.xpath("//button[@class='btn d-flex justify-content-center align-items-center w-100 h-100 btn-primary']"));
//		paymentDone.click();
//		
//		
//
//	}
}
