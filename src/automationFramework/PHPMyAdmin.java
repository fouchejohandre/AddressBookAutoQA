package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.List;

public class PHPMyAdmin{
	
	public WebDriver getPhpMyAdmin()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Johandre.COMPRSA\\Desktop\\Projects\\Eclipse\\WebDriver\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--start-maximized");
		WebDriver driver = new ChromeDriver(options);
		

		 driver.get("localhost:8000/phpmyadmin/index.php");
		 
		 return driver;
	}
	
	public void Login(String username, String password, WebDriver phpPage) throws Exception
	{
		phpPage.findElement(By.xpath("//*[@id=\"input_username\"]")).sendKeys(username);
		phpPage.findElement(By.xpath("//*[@id=\"input_password\"]")).sendKeys(password);
		Thread.sleep(2000);
		phpPage.findElement(By.xpath("//*[@id=\"input_go\"]")).click();
	}
	
	public void RemoveUser(String data, WebDriver phpPage) throws Exception
	{
		phpPage.findElement(By.xpath("//*[@id=\"pma_navigation_tree_content\"]/ul/li[2]/a")).click();
		Thread.sleep(2000);
		phpPage.findElement(By.xpath("//*[@id=\"pma_navigation_tree_content\"]/ul/li[2]/div[4]/ul/li[2]/div[3]/ul/li[4]/a")).click();
		Thread.sleep(2000);
		
		List<WebElement> row = phpPage.findElements(By.partialLinkText("Delete"));
		WebElement toDelete = row.get(row.size() - 1);
		toDelete.click();

		Thread.sleep(2000);
		phpPage.findElement(By.xpath("/html/body/div[22]/div[3]/div/button[1]")).click();
	}
}
