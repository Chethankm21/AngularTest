package Testcase;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.CalculatorPage;

public class Test1 {

	CalculatorPage cal;

	@BeforeTest
	public void setUp() {

		cal = new CalculatorPage();
	}

	@Test
	public void add() {

		String res = cal.doSum("20", "30");
		Assert.assertEquals("50", res);
	}

	@Test
	public void sub() {

		String res = cal.doSub("60", "30");
		Assert.assertEquals("30", res);
	}

	@Test
	public void div() {

		String res = cal.doMul("5", "3");
		Assert.assertEquals("15", res);
	}

}
