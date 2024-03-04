package visualMazeProject;

import org.openqa.selenium.WebDriver;



public class POMClass {
	public static WebDriver driver;

	private virtualMaze pa;

	public POMClass(WebDriver driver2) {
		this.driver = driver2;

	}

	public virtualMaze getvirtualMaze() {

		if (pa == null) {

			pa = new virtualMaze(driver);

		}
		return pa;

	}

}
