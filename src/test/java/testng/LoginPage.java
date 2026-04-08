package testng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginPage {

	static WebDriver driver;
	static WebDriverWait wait;

	public void loginPage(String url) {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(url);
	}

	@Test(dataProvider = "dataHere")
	public void loadLoginPage(String username, String password) {
		loginPage("https://practicetestautomation.com/practice-test-login/");
		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.xpath("//button[text()='Submit']")).click();

	}

	@DataProvider(name = "dataHere")
	public Object[][] data() {

		return new Object[][] { { "student", "Password123" }, { "student", "Password13" }, { "student2", "Password123" }

		};
		//git branch testing version one

	}

}
