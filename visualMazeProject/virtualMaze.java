package visualMazeProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class virtualMaze {
	public WebDriver driver;

	public virtualMaze(WebDriver driver2) {
		this.driver = driver2;

		PageFactory.initElements(driver2, this);

	}

	public WebDriver getDriver() {
		return driver;
	}

	@FindBy(xpath = "(//span[normalize-space()='Sign Up'])[1]")
	private WebElement signup;

	public WebElement getsignup() {
		return signup;
	}

	@FindBy(xpath = "(//input[@id='signup-username'])[1]")
	private WebElement fullname;

	public WebElement getfullname() {
		return fullname;
	}

	@FindBy(xpath = "(//input[@id='signup-email'])[1]")
	private WebElement emailaddress;

	public WebElement getemailaddress() {
		return emailaddress;
	}

	@FindBy(xpath = "(//input[@id='signup-mobile'])[1]")
	private WebElement mobilenumber;

	public WebElement getmobilenumber() {
		return mobilenumber;
	}

	@FindBy(xpath = "(//input[@id='signup-password'])[1]")
	private WebElement password;

	public WebElement getpassword() {
		return password;
	}

	@FindBy(xpath = "(//input[@id='signup-confirmPassword'])[1]")
	private WebElement confirmpassword;

	public WebElement getconfirmpassword() {
		return confirmpassword;
	}

	@FindBy(xpath = "(//input[@id='terms-vms-policy'])[1]")
	private WebElement iagree;

	public WebElement getiagree() {
		return iagree;
	}

	@FindBy(xpath = "(//input[@id='newsLetter'])[1]")
	private WebElement newsletter;

	public WebElement getnewsletter() {
		return newsletter;
	}

	@FindBy(xpath = "(//span[@id='signup-submit-text'])[1]")
	private WebElement register;

	public WebElement getregister() {
		return register;
	}

	////// signin //////////

	@FindBy(xpath = "(//span[normalize-space()='Sign In'])[1]")
	private WebElement signin;

	public WebElement getsignin() {
		return signin;
	}

	@FindBy(xpath = "(//input[@id='login-email'])[1]")
	private WebElement emailaddresssignin;

	public WebElement getemailaddresssignin() {
		return emailaddresssignin;
	}

	@FindBy(xpath = "(//input[@id='login-password'])[1]")
	private WebElement passwordsignin;

	public WebElement getpasswordsignin() {

		return passwordsignin;
	}

	@FindBy(xpath = "(//span[@id='login-submit-text'])[1]")
	private WebElement loginbutton;

	public WebElement getloginbutton() {

		return loginbutton;
	}

	@FindBy(xpath = "(//button[@id='profile'])[1]")
	private WebElement profilebutton;

	public WebElement getprofilebutton() {

		return profilebutton;
	}

	@FindBy(xpath = "//a[@id='menu-logout']")
	private WebElement logout;

	public WebElement getlogout() {

		return logout;
	}

	/// forgot password

	@FindBy(xpath = "(//input[@id='login-email'])[1]")
	private WebElement enteremail;

	public WebElement getenteremail() {

		return enteremail;
	}

	@FindBy(xpath = "(//span[@id='Forgot-Password'])[1]")
	private WebElement forgotpassword;

	public WebElement getforgotpassword() {

		return forgotpassword;
	}

	@FindBy(xpath = "(//input[@id='Resetpassword'])[1]")
	private WebElement forgotpasswordenter;

	public WebElement getforgotpasswordenter() {

		return forgotpasswordenter;
	}

	@FindBy(xpath = "(//span[@id='reset-login-otp-text'])[1]")
	private WebElement changepassword;

	public WebElement getchangepassword() {

		return changepassword;
	}

}
