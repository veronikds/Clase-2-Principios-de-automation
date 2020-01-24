package search;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class searchTest {
	
	@Test
	public void searchTennis() {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://automationpractice.com/index.php");
		driver.findElement(By.id("search_query_top")).sendKeys("Tennis");
		driver.findElement(By.name("submit_search")).click();
		String textTypeOfResult = driver.findElement(By.className("heading-counter")).getText();
		System.out.println(textTypeOfResult);
		Assert.assertEquals(textTypeOfResult, "0 results have been found.");
		driver.close();
		driver.quit();
	}
}
