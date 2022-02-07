package mountSinai.qa.base;



import java.time.Duration;


import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;
import mountSinai.qa.common.CommonClass;
import mountSinai.qa.page.ProductsPage;

public class BaseClass {
	public static WebDriver driver;
	public ProductsPage productsPage;
	public CommonClass cm;

	@BeforeMethod
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.mountsinai.org/");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		initElement1();

	}

	@AfterMethod
	public void tearUp() {
		driver.quit();
	}

	public void initElement1() {

		productsPage = new ProductsPage(driver);

		cm = new CommonClass();

	}

}
