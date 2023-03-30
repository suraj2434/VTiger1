package Basic;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Flow {

	@BeforeClass
	public void BC() {
		System.out.println("Launch Browser");
	}

	@AfterClass
	public void AC() {
		System.out.println("Close Browser");
	}
	
	@BeforeMethod
	public void BM() {
		System.out.println("Login");
	}
	
	@AfterMethod
	public void AM() {
		System.out.println("Logout");
	}

	@Test
	public void Createaccount() {
		System.out.println("created");
	}
	@Test
	public void ModifyAcc() {
		System.out.println("modified");
	}
	
	@Test
	public void DeleteAcc() {
		System.out.println("deleted");
	}
}
