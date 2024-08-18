package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.CommonUtils;
import utils.ElementUtils;

public class RegisterPage {
	
	WebDriver driver;
	private ElementUtils elementUtils;
	
	public RegisterPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		elementUtils = new ElementUtils(driver);
	}
	
	@FindBy(id="input-firstname")
	private WebElement firstnameField;
	
	@FindBy(id="input-lastname")
	private WebElement lastnameField;
	
	@FindBy(id="input-email")
	private WebElement emailField;
	
	@FindBy(id="input-telephone")
	private WebElement telephoneField;
	
	@FindBy(id="input-password")
	private WebElement passwordField;
	
	@FindBy(id="input-confirm")
	private WebElement confirmField;
	
	@FindBy(name="agree")
	private WebElement privacyPolicyOption;
	
	@FindBy(xpath="//input[@value='Continue']")
	private WebElement continuebutton;
	
	@FindBy(xpath="//input[@name='newsletter'][@value='1']")
	private WebElement yesNewsletterOption;
	
	@FindBy(xpath="//div[@class='alert alert-danger alert-dismissible']")
	private WebElement warningMessage;
	
	@FindBy(xpath="//input[@name='firstname']/following-sibling::div")
	private WebElement firstnamewarning;
	
	@FindBy(xpath="//input[@name='lastname']/following-sibling::div")
	private WebElement lastnamewarning;
	
	@FindBy(xpath="//input[@name='email']/following-sibling::div")
	private WebElement emailwarning;
	
	@FindBy(xpath="//input[@name='telephone']/following-sibling::div")
	private WebElement telephonewarning;
	
	@FindBy(xpath="//input[@name='password']/following-sibling::div")
	private WebElement passwordwarning;
	
	
	public void enterFirstnameField(String firstnameText) {
		//firstnameField.sendKeys(firstnameText);
		elementUtils.typeTextIntoElement(firstnameField, firstnameText, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
	}
	
	public void enterLastnameField(String lastnameText) {
		//lastnameField.sendKeys(lastnameText);
		elementUtils.typeTextIntoElement(lastnameField, lastnameText, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
	}
	
	public void enterEmailAddress(String emailText) {
		//emailField.sendKeys(emailText);
		elementUtils.typeTextIntoElement(emailField, emailText, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
	}
	
	public void enterTelephone(String telephoneText) {
		//telephoneField.sendKeys(telephoneText);
		elementUtils.typeTextIntoElement(telephoneField, telephoneText, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
	}
	
	public void enterPasswordField(String passwordText) {
		//passwordField.sendKeys(passwordText);
		elementUtils.typeTextIntoElement(passwordField, passwordText, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
	}
	
	public void enterConfirmPasswordField(String confirmPasswordText) {
		//confirmField.sendKeys(confirmPasswordText);
		elementUtils.typeTextIntoElement(confirmField, confirmPasswordText, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
	}
	
	public void selectPrivacyPolicyOption() {
		//privacyPolicyOption.click();
		elementUtils.clickOnElement(privacyPolicyOption, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
	}
	
	public AccountSuccessPage clickOncontinuebutton() {
		//continuebutton.click();
		elementUtils.clickOnElement(continuebutton, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
		return new AccountSuccessPage(driver);
	}
	
	public void selectYesNewsletterOption() {
		//yesNewsletterOption.click();
		elementUtils.clickOnElement(yesNewsletterOption, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
	}
	
	public String getWarningMessageText() {
		//return warningMessage.getText();
		return elementUtils.getTextFromElement(warningMessage, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
	}
	
	public String getFirstNameWarning() {
		//return firstnamewarning.getText();
		return elementUtils.getTextFromElement(firstnamewarning, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
	}
	
	public String getLastNameWarning() {
		//return lastnamewarning.getText();
		return elementUtils.getTextFromElement(lastnamewarning, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
	}
	
	public String getEmailWarning() {
		//return emailwarning.getText();
		return elementUtils.getTextFromElement(emailwarning, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
	}
	
	public String getTelephoneWarning() {
		//return telephonewarning.getText();
		return elementUtils.getTextFromElement(telephonewarning, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
	}
	
	public String getPasswordWarning() {
		//return passwordwarning.getText();
		return elementUtils.getTextFromElement(passwordwarning, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
	}
	
}
