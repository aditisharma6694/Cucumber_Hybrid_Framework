package stepdefinition;

import java.time.Duration;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import factory.DriverFactory;
import io.cucumber.java.*;
import io.cucumber.java.en.*;
import junit.framework.Assert;
import pages.AccountPage;
import pages.HomePage;
import pages.LoginPage;
import utils.CommonUtils;

public class Login {
	
	WebDriver driver;
	private HomePage homePage;
	private LoginPage loginPage;
	private AccountPage accountPage;
	
	@Given("User has navigates to login page")
	public void user_has_navigates_to_login_page() {
	    driver = DriverFactory.getDriver();
	    homePage = new HomePage(driver);
	    homePage.clickOnMyAccount();
	    loginPage = homePage.selectLoginOption();
	}

	@When("^User enters valid email address (.+) into email field$")
	public void user_enters_valid_email_address_amotooricap1_gmai2_com_into_email_field(String emailText) {
		loginPage.enterEmailAddress(emailText);
	}

	@When("^User entered valid password (.+) into password field$")
	public void user_entered_valid_password_into_password_field(String passwordText) {
		loginPage.enterPassword(passwordText);
	}
	
	
	@When("User enters valid email address {string} into the email field")
	public void user_enters_valid_email_address_into_email_field(String emailText) {
		//loginPage = new LoginPage(driver);
		loginPage.enterEmailAddress(emailText);
	}

	/*
	@When("User has entered valid password {string} into the password field")
	public void user_has_entered_valid_password_into_password_field(String passwordText) {
		//loginPage = new LoginPage(driver);
		loginPage.enterPassword(passwordText);	
	} */
	
	@When("User clicks on Login button")
	public void user_clicks_on_login_button() {
		//loginPage = new LoginPage(driver);
		accountPage = loginPage.clickOnLoginButton();
	}

	@Then("User should get successfully logged in")
	public void user_should_get_successfully_logged_in() {
		//accountPage = new AccountPage(driver);
		Assert.assertTrue(accountPage.displayStatusOfeditYourAccountInformationOption());
	}

	@When("User enters invalid email address into email field")
	public void user_enters_invalid_email_address_into_email_field() {
		//loginPage = new LoginPage(driver);
		loginPage.enterEmailAddress(CommonUtils.getEmailWithTimeStamp());
	}

	@When("User enters invalid password {string} into password field")
	public void user_enters_invalid_password_into_password_field(String invalidPasswordText) {
		//loginPage = new LoginPage(driver);
		loginPage.enterPassword(invalidPasswordText);
	}

	@Then("User should get a proper warning message about credentials mismatch")
	public void user_should_get_a_proper_warning_message_about_credentials_mismatch() {
		//loginPage = new LoginPage(driver);
		Assert.assertTrue(loginPage.getWarningMessageText().contains("Warning: No match for E-Mail Address and/or Password."));
	}

	@When("User enters valid password {string} into password field")
	public void user_enters_valid_password_into_password_field(String validPassword) {
		//loginPage = new LoginPage(driver);
		loginPage.enterPassword(validPassword);
	}

	@When("User dont enter email address into email field")
	public void user_dont_enter_email_address_into_email_field() {
		//loginPage = new LoginPage(driver);
		loginPage.enterEmailAddress("");
	}

	@When("User dont enter password into password field")
	public void user_dont_enter_password_into_password_field() {
		//loginPage = new LoginPage(driver);
		loginPage.enterPassword("");
	}
	
	


}
