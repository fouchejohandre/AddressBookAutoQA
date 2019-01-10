package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.NoSuchElementException;
import java.util.List;

public class GitHub 
{
	public WebDriver getGithubPage()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Johandre.COMPRSA\\Desktop\\Projects\\Eclipse\\WebDriver\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--start-maximized");
		WebDriver driver = new ChromeDriver(options);
		

		 driver.get("https://github.com/");
		 
		 return driver;
	}
	
	public void Login(String username, String password, WebDriver githubPage) throws InterruptedException
	{
		githubPage.findElement(By.xpath("/html/body/div[1]/header/div/div[2]/div[2]/a[1]")).click();
		Thread.sleep(3000);
		githubPage.findElement(By.xpath("//*[@id=\"login_field\"]")).sendKeys(username);
		Thread.sleep(1000);
		githubPage.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys(password);
		Thread.sleep(1000);
		githubPage.findElement(By.xpath("//*[@id=\"login\"]/form/div[3]/input[3]")).click();
	}
	
	public void AccessRepo(String accessRepo, String newDesc, WebDriver githubPage) throws InterruptedException
	{
		//Go To Repos List
		githubPage.findElement(By.xpath("//*[@id=\"user-links\"]/li[3]/details/summary/img")).click();
		Thread.sleep(2000);
		githubPage.findElement(By.linkText("Your repositories")).click();
		Thread.sleep(2000);
		
		//Determines if repos exists
		if(ElementIsPresent(accessRepo, githubPage))
		{
			githubPage.findElement(By.partialLinkText(accessRepo)).click();
		}
		else
		{
			githubPage.findElement(By.xpath("//*[@id=\"js-pjax-container\"]/div/div[2]/div[4]/div[1]/form/div[2]/a")).click();
			Thread.sleep(4000);
			CreateRepo(accessRepo, newDesc, githubPage);
		}
		
		
	}
	
	public void CreateRepo(String name, String desc, WebDriver githubPage) throws InterruptedException
	{
		githubPage.findElement(By.xpath("//*[@id=\"repository_name\"]")).sendKeys(name);
		Thread.sleep(1000);
		githubPage.findElement(By.xpath("//*[@id=\"repository_description\"]")).sendKeys(desc);
		Thread.sleep(1000);
		githubPage.findElement(By.xpath("//*[@id=\"new_repository\"]/div[3]/button")).click();
		Thread.sleep(3000);
	}
	
	public Boolean ElementIsPresent(String name, WebDriver githubPage) throws InterruptedException
	{
		Boolean isPresent = githubPage.findElements(By.partialLinkText(name)).size() > 0;
		return isPresent;
	}
	
	public void DeleteRepo(String name, WebDriver githubPage) throws InterruptedException
	{
		//Go To Repos List
		githubPage.findElement(By.xpath("//*[@id=\"user-links\"]/li[3]/details/summary/img")).click();
		Thread.sleep(2000);
		githubPage.findElement(By.linkText("Your repositories")).click();
		Thread.sleep(2000);
		
		//Determines if repos exists
		if(ElementIsPresent(name, githubPage))
		{
			githubPage.findElement(By.partialLinkText(name)).click();
			Thread.sleep(3000);
			githubPage.findElement(By.xpath("//*[@id=\"js-repo-pjax-container\"]/div[1]/nav/a[4]")).click();
			Thread.sleep(3000);
			githubPage.findElement(By.xpath("//*[@id=\"options_bucket\"]/div[8]/ul/li[4]/details/summary")).click();
			Thread.sleep(1000);
			githubPage.findElement(By.xpath("//*[@id=\"options_bucket\"]/div[8]/ul/li[4]/details/details-dialog/div[3]/form/p/input")).sendKeys(name);
			Thread.sleep(1000);
			githubPage.findElement(By.xpath("//*[@id=\"options_bucket\"]/div[8]/ul/li[4]/details/details-dialog/div[3]/form/button")).click();
			Thread.sleep(3000);
		}
	}
	
	public void CloneOrDownload(WebDriver githubPage) throws InterruptedException
	{
		githubPage.findElement(By.xpath("//*[@id=\"js-repo-pjax-container\"]/div[2]/div[1]/div[3]/details/summary")).click();
		Thread.sleep(2000);
		githubPage.findElement(By.xpath("//*[@id=\"js-repo-pjax-container\"]/div[2]/div[1]/div[3]/details/div/div/div[1]/div[3]/a[2]")).click();
		Thread.sleep(2000);
		githubPage.findElement(By.xpath("//*[@id=\"js-repo-pjax-container\"]/div[2]/div[1]/div[3]/details/summary")).click();
	}
	
	public void ScrollTabs(WebDriver githubPage) throws InterruptedException
	{
		githubPage.findElement(By.xpath("//*[@id=\"js-repo-pjax-container\"]/div[2]/div[1]/button")).click();
		Thread.sleep(5000);
		githubPage.findElement(By.xpath("//*[@id=\"js-repo-pjax-container\"]/div[2]/div[1]/button")).click();
		Thread.sleep(2000);
		githubPage.findElement(By.xpath("/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/nav[1]/span[1]/a[1]")).click();
		Thread.sleep(2000);
		githubPage.findElement(By.xpath("/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/nav[1]/span[2]/a[1]")).click();
		Thread.sleep(2000);
		githubPage.findElement(By.xpath("/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/nav[1]/span[3]/a[1]")).click();
		Thread.sleep(2000);
		githubPage.findElement(By.xpath("/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/nav[1]/a[1]")).click();
		Thread.sleep(2000);
		githubPage.findElement(By.xpath("/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/nav[1]/a[2]")).click();
		Thread.sleep(2000);
		githubPage.findElement(By.xpath("/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/nav[1]/a[3]")).click();
		Thread.sleep(2000);
		githubPage.findElement(By.xpath("/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/nav[1]/a[4]")).click();
		Thread.sleep(2000);
		githubPage.findElement(By.xpath("/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/nav[1]/span[1]/a[1]")).click();
		Thread.sleep(2000);
		githubPage.findElement(By.xpath("/html[1]/body[1]/div[4]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[1]/a[1]")).click();
		Thread.sleep(2000);
		githubPage.findElement(By.xpath("/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/nav[1]/span[1]/a[1]")).click();
		Thread.sleep(2000);
		githubPage.findElement(By.xpath("/html[1]/body[1]/div[4]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[2]/a[1]")).click();
		Thread.sleep(2000);
		githubPage.findElement(By.xpath("/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/nav[1]/span[1]/a[1]")).click();
		Thread.sleep(2000);
		githubPage.findElement(By.xpath("/html[1]/body[1]/div[4]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[3]/a[1]")).click();
		Thread.sleep(2000);
		githubPage.findElement(By.xpath("/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/nav[1]/span[1]/a[1]")).click();
		Thread.sleep(2000);
		githubPage.findElement(By.xpath("/html[1]/body[1]/div[4]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[4]/a[1]")).click();
		Thread.sleep(2000);
		githubPage.findElement(By.xpath("/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/nav[1]/span[1]/a[1]")).click();
	}

}
