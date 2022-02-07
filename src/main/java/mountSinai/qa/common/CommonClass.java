package mountSinai.qa.common;

import org.openqa.selenium.WebElement;

public class CommonClass {

	public void clicking(WebElement element) {
		element.click();

	}

	public void enterKeys(WebElement element, String value) {
		element.sendKeys(value);
	}

}
