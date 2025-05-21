package practise_dataProvider;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestClass {
	@Test(dataProvider = "getData", dataProviderClass = dataproviderClassForTestCLass.class)
	public void db(String bn, String pn) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.amazon.in/");
		//search A product
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys(bn, Keys.ENTER);
		String xpath = "//span[.='" + pn + "']/../../../../div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/a/span/span";
		String price = driver.findElement(By.xpath(xpath)).getText();
		System.out.println(price);

	}
}
