package mountSinai.qa.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import mountSinai.qa.common.CommonClass;

public class ProductsPage {
	public ProductsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "(//a[@class='hidden-xs dropdown'])[2]")
	public WebElement findADoctortab;
	@FindBy(xpath = "//input[@id='downshift-0-input']")
	public WebElement searchText;
	@FindBy(xpath = "//input[@id = 'downshift-0-input']")
	public WebElement firstNamElement;

	public void findADoctortab(CommonClass cm, WebDriver driver) {
		cm.clicking(findADoctortab);

	}

	public void searchText(CommonClass cm) {

		cm.clicking(searchText);

		// cm.enterKeys(searchText, "03321");
	}

	public void firstNameMathod(CommonClass cm) {
		cm.enterKeys(firstNamElement, "Nicholas");
	}
}
