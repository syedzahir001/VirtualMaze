package visualMazeProject;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class virtualMazeProject extends BaseClass {

	public static WebDriver driver = getbrowser("chrome");

	public static POMClass pom = new POMClass(driver);

	@Test(priority = 0)

	public void sigin() throws InterruptedException {

		// Driver Maximize and Url Launch

		geturl("https://accounts.vmmaps.com/");

		// user click sigup

		Clickonelement(pom.getvirtualMaze().getsignup());

		// user enter full name

		sendkeys(pom.getvirtualMaze().getfullname(), "syed zahir");

		// user enter email address

		sendkeys(pom.getvirtualMaze().getemailaddress(), "syedzahir001@gmail.com");

		// user entermobile number

		sendkeys(pom.getvirtualMaze().getmobilenumber(), "861074234");

		// user enter password

		sendkeys(pom.getvirtualMaze().getpassword(), "test12345");

		// user enter confirm password

		sendkeys(pom.getvirtualMaze().getconfirmpassword(), "test12345");

		// user click iagree

		Clickonelement(pom.getvirtualMaze().getiagree());

		// user click newsletter

		Clickonelement(pom.getvirtualMaze().getnewsletter());

		// user click register

		Clickonelement(pom.getvirtualMaze().getregister());

	}

	@Test(priority = 1)

	public void sigup() throws InterruptedException {

		// user click sigin

		Clickonelement(pom.getvirtualMaze().getsignin());

		// user enter email address

		sendkeys(pom.getvirtualMaze().getemailaddresssignin(), "syedzahir001@gmail.com");

		// user enter password

		sendkeys(pom.getvirtualMaze().getpasswordsignin(), "test12345");

		// user click login

		Clickonelement(pom.getvirtualMaze().getloginbutton());

		// user click profile
		Thread.sleep(5000);

		Clickonelement(pom.getvirtualMaze().getprofilebutton());

		// user click logout

		Clickonelement(pom.getvirtualMaze().getlogout());

	}

	@Test(priority = 2)

	public void forgotpassword() throws InterruptedException {

		// user enter email

		sendkeys(pom.getvirtualMaze().getenteremail(), "syedzahir001@gmail.com");

		// user click forgot password

		Clickonelement(pom.getvirtualMaze().getforgotpassword());

		// user enter New password
		Thread.sleep(5000);

		sendkeys(pom.getvirtualMaze().getforgotpasswordenter(), "test54321");

		// user click change

		Clickonelement(pom.getvirtualMaze().getchangepassword());

	}

}
