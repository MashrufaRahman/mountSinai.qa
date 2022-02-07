package findADoctorTabTest;

import org.testng.annotations.Test;

import mountSinai.qa.base.BaseClass;

public class FindADoctorTest extends BaseClass {
	@Test
	public void verifyingTest() {
		productsPage.findADoctortab(cm, driver);
		productsPage.searchText(cm);
		productsPage.firstNameMathod(cm);

	}
}
