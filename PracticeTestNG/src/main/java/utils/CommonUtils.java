package utils;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class CommonUtils {

	
	@BeforeSuite
	public void setUp() {
		System.out.println("SetUp Method");
	}
	
	@AfterSuite
	public void tearDown() {
		System.out.println("TearDown Method");
	}
}
