package test;

import org.testng.annotations.Test;

import utils.CommonUtils;

public class StaicLinkTest extends CommonUtils{
	
	@Test(description="Test First Method", testName="testFirstMethod", priority=1)
	public void testFirstMethod() {
		System.out.println("Test First Method");
	}
	
	@Test(description="Test Second Method", testName="testSecondMethod", priority=2,dependsOnMethods="testFirstMethod")
	public void testSecondMethod() {
		System.out.println("Test Second Method");
	}
	
	@Test(description="Test Third Method", testName="testThirdMethod", priority=3,alwaysRun=true)
	public void testThirdMethod() {
		System.out.println("Test Third Method");
	}
}
