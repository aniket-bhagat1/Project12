package TestCases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DemoClass {
	
	@BeforeSuite
	public void m1() {
		System.out.println("First");
	}
	@BeforeTest
	public void m2() {
		System.out.println("second");
	}
	@BeforeClass
	public void m3() {
		System.out.println("third");
	}
	@BeforeMethod
	public void m4() {
		System.out.println("fourth");
	}
	@Test
	public void m5() {
		System.out.println("fifth");
	}
	@AfterMethod
	public void m6() {
		System.out.println("sixth");
	}
	@AfterClass
	public void m7() {
		System.out.println("seventh");
	}
	@AfterTest
	public void m8() {
		System.out.println("eight");
	}
	@AfterSuite
	public void m9() {
		System.out.println("nineth");
	}
	
}