package tests;

import org.testng.annotations.Test;

public class TestCase extends BaseTest {
	
	String email, mobile, title, firstName, lastName;
	
	@Test(priority = 0)
	public void test1() {
		
		hp.clickSearch();
		
	}
	
	@Test(priority = 1, dependsOnMethods = "test1")
	public void test2() {
		
		fp.clickViewFares();
		fp.clickBook();
		
	}
	
	@Test(priority = 2, dependsOnMethods = "test2")
	public void test3() throws Exception {
		
		email = excelSetup.getExcelData(sheetName, 1, 1);
		mobile = excelSetup.getExcelData(sheetName, 1, 2);
		title = excelSetup.getExcelData(sheetName, 1, 3);
		firstName = excelSetup.getExcelData(sheetName, 1, 4);
		lastName = excelSetup.getExcelData(sheetName, 1, 5);
		
		bdp.fillDetails(email, mobile, title, firstName, lastName);
		bdp.submitDetails();
		
	}
	
	@Test(priority = 3, dependsOnMethods = "test3")
	public void test4() {
		
		pp.displayPrice();
		
	}

}
