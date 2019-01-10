package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class AddressBook{
	
	public void AddContact(String testInfo, WebDriver addressBookPage) throws InterruptedException
	{
		addressBookPage.findElement(By.xpath("/html/body/ui-view/address-list/address-book-header/nav/div/div[1]/ul/li[3]/a")).click();
		Thread.sleep(2000);
		addressBookPage.findElement(By.xpath("/html/body/ui-view/address-add/div[2]/div/div[2]/input[1]")).sendKeys(testInfo);
		addressBookPage.findElement(By.xpath("/html/body/ui-view/address-add/div[2]/div/div[2]/input[2]")).sendKeys(testInfo);
		addressBookPage.findElement(By.xpath("/html/body/ui-view/address-add/div[2]/div/div[2]/input[3]")).sendKeys(testInfo);
		addressBookPage.findElement(By.xpath("/html/body/ui-view/address-add/div[2]/div/div[2]/input[4]")).sendKeys(testInfo);
		addressBookPage.findElement(By.xpath("/html/body/ui-view/address-add/div[2]/div/div[2]/input[5]")).sendKeys(testInfo);
		addressBookPage.findElement(By.xpath("/html/body/ui-view/address-add/div[2]/div/div[2]/input[6]")).sendKeys(testInfo);
		addressBookPage.findElement(By.xpath("/html/body/ui-view/address-add/div[2]/div/div[2]/input[7]")).sendKeys(testInfo);
		addressBookPage.findElement(By.xpath("/html/body/ui-view/address-add/div[2]/div/div[2]/input[8]")).sendKeys(testInfo);
		addressBookPage.findElement(By.xpath("/html/body/ui-view/address-add/div[2]/div/div[2]/input[9]")).sendKeys(testInfo);
		addressBookPage.findElement(By.xpath("/html/body/ui-view/address-add/div[2]/div/div[2]/input[10]")).sendKeys(testInfo);
		addressBookPage.findElement(By.xpath("/html/body/ui-view/address-add/div[2]/div/div[2]/input[11]")).sendKeys(testInfo);
		addressBookPage.findElement(By.xpath("/html/body/ui-view/address-add/div[2]/div/div[2]/input[12]")).sendKeys(testInfo);
		addressBookPage.findElement(By.xpath("/html/body/ui-view/address-add/div[2]/div/div[2]/input[13]")).sendKeys(testInfo);
		addressBookPage.findElement(By.xpath("/html/body/ui-view/address-add/div[2]/div/div[2]/input[14]")).sendKeys(testInfo);
		addressBookPage.findElement(By.xpath("/html/body/ui-view/address-add/div[2]/div/div[2]/input[15]")).sendKeys(testInfo);
		addressBookPage.findElement(By.xpath("/html/body/ui-view/address-add/div[2]/div/div[2]/input[16]")).sendKeys(testInfo);
		Thread.sleep(2000);
		addressBookPage.findElement(By.xpath("//*[@id=\"fileToUpload\"]")).sendKeys("C:/wamp64/www/AddressBook/Images/20.jpg");
		Thread.sleep(2000);
		addressBookPage.findElement(By.xpath("//*[@id=\"uploadForm\"]/input[2]")).click();
		Thread.sleep(5000);
		addressBookPage.findElement(By.xpath("/html/body/ui-view/address-add/div[2]/div/div[2]/div[2]/button")).click();
	}
	
	public void DeleteMessage(String data, WebDriver addressBookPage) throws InterruptedException
	{
		addressBookPage.findElement(By.partialLinkText(data)).click();
		Thread.sleep(2000);
		addressBookPage.findElement(By.partialLinkText("Delete Message")).click();
		Thread.sleep(2000);
		addressBookPage.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/button[1]")).click();
	}
	
	public void EditDetails(String data, WebDriver addressBookPage) throws InterruptedException
	{
		addressBookPage.findElement(By.partialLinkText(data)).click();
		Thread.sleep(2000);
		addressBookPage.findElement(By.xpath("/html[1]/body[1]/ui-view[1]/address-list[1]/div[1]/uib-accordion[1]/div[1]/div[3]/div[2]/div[1]/div[2]/div[1]/button[1]")).click();
		Thread.sleep(2000);
		addressBookPage.findElement(By.xpath("/html[1]/body[1]/ui-view[1]/address-list[1]/div[1]/uib-accordion[1]/div[1]/div[3]/div[2]/div[1]/div[2]/div[2]/button[1]")).click();
		Thread.sleep(2000);
		addressBookPage.findElement(By.partialLinkText("Edit Contact Details")).click();
		Thread.sleep(2000);
		data = data + "2";
		addressBookPage.findElement(By.xpath("/html[1]/body[1]/ui-view[1]/address-details[1]/div[2]/div[1]/div[2]/div[1]/input[1]")).sendKeys(data);
		addressBookPage.findElement(By.xpath("/html[1]/body[1]/ui-view[1]/address-details[1]/div[2]/div[1]/div[2]/div[1]/input[2]")).sendKeys(data);
		addressBookPage.findElement(By.xpath("/html[1]/body[1]/ui-view[1]/address-details[1]/div[2]/div[1]/div[2]/div[1]/input[3]")).sendKeys(data);
		addressBookPage.findElement(By.xpath("/html[1]/body[1]/ui-view[1]/address-details[1]/div[2]/div[1]/div[2]/div[1]/input[4]")).sendKeys(data);
		addressBookPage.findElement(By.xpath("/html[1]/body[1]/ui-view[1]/address-details[1]/div[2]/div[1]/div[2]/div[1]/input[5]")).sendKeys(data);
		addressBookPage.findElement(By.xpath("/html[1]/body[1]/ui-view[1]/address-details[1]/div[2]/div[1]/div[2]/div[1]/input[6]")).sendKeys(data);
		addressBookPage.findElement(By.xpath("/html[1]/body[1]/ui-view[1]/address-details[1]/div[2]/div[1]/div[2]/div[1]/input[7]")).sendKeys(data);
		addressBookPage.findElement(By.xpath("/html[1]/body[1]/ui-view[1]/address-details[1]/div[2]/div[1]/div[2]/div[1]/input[8]")).sendKeys(data);
		addressBookPage.findElement(By.xpath("/html[1]/body[1]/ui-view[1]/address-details[1]/div[2]/div[1]/div[2]/div[1]/input[9]")).sendKeys(data + "@mail.com");
		addressBookPage.findElement(By.xpath("/html[1]/body[1]/ui-view[1]/address-details[1]/div[2]/div[1]/div[2]/div[1]/input[10]")).sendKeys(data + "@mail.com");
		addressBookPage.findElement(By.xpath("/html[1]/body[1]/ui-view[1]/address-details[1]/div[2]/div[1]/div[2]/div[1]/input[11]")).sendKeys(data);
		addressBookPage.findElement(By.xpath("/html[1]/body[1]/ui-view[1]/address-details[1]/div[2]/div[1]/div[2]/div[1]/input[12]")).sendKeys(data);
		addressBookPage.findElement(By.xpath("/html[1]/body[1]/ui-view[1]/address-details[1]/div[2]/div[1]/div[2]/div[1]/input[13]")).sendKeys(data);
		addressBookPage.findElement(By.xpath("/html[1]/body[1]/ui-view[1]/address-details[1]/div[2]/div[1]/div[2]/div[1]/input[14]")).sendKeys(data);
		addressBookPage.findElement(By.xpath("/html[1]/body[1]/ui-view[1]/address-details[1]/div[2]/div[1]/div[2]/div[1]/input[15]")).sendKeys(data);
		addressBookPage.findElement(By.xpath("/html[1]/body[1]/ui-view[1]/address-details[1]/div[2]/div[1]/div[2]/div[1]/input[16]")).sendKeys(data);
		Thread.sleep(2000);
		addressBookPage.findElement(By.xpath("//*[@id=\"fileToUpload\"]")).sendKeys("C:/wamp64/www/AddressBook/Images/20.jpg");
		Thread.sleep(2000);
		addressBookPage.findElement(By.xpath("//*[@id=\"uploadForm\"]/input[2]")).click();
		Thread.sleep(5000);
		addressBookPage.findElement(By.xpath("/html/body/ui-view/address-details/div[2]/div/div[2]/div/div[2]/button")).click();
	}
	
	public Boolean ElementIsPresent(String name, WebDriver addressBookPage) throws InterruptedException
	{
		Boolean isPresent = addressBookPage.findElements(By.partialLinkText(name)).size() > 0;
		return isPresent;
	}
	
	public WebDriver getAddressBook()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Johandre.COMPRSA\\Desktop\\Projects\\Eclipse\\WebDriver\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--start-maximized");
		WebDriver driver = new ChromeDriver(options);
		

		 driver.get("localhost:3000");
		 
		 return driver;
	}
	
	public Boolean IsLoggedIn(WebDriver addressBookPage)
	{
		Boolean isPresent = addressBookPage.findElements(By.xpath("/html[1]/body[1]/ui-view[1]/address-list[1]/address-book-header[1]/nav[1]/div[1]/div[1]/ul[1]/li[2]/a[1]")).size() > 0;
		return isPresent;
	}
	
	public void Login(String username, String password, WebDriver addressBookPage) throws InterruptedException
	{
		 addressBookPage.findElement(By.xpath("/html/body/ui-view/home/div[4]/div/div[2]/div[2]/input")).sendKeys(username);
		 addressBookPage.findElement(By.xpath("/html/body/ui-view/home/div[4]/div/div[3]/div[2]/input")).sendKeys(password);
		 Thread.sleep(2000);
		 addressBookPage.findElement(By.xpath("/html/body/ui-view/home/div[4]/div/div[4]/div[2]/button")).click();
	}
	
	public void Logout(WebDriver addressBookPage)
	{
		addressBookPage.findElement(By.partialLinkText("Logout")).click();
	}
	
	public void Register(String name, WebDriver addressBookPage) throws InterruptedException
	{
		addressBookPage.findElement(By.xpath("/html[1]/body[1]/ui-view[1]/home[1]/div[1]/address-login-header[1]/nav[1]/div[1]/div[1]/ul[1]/li[2]/a[1]")).click();
		
		Thread.sleep(2000);
		
		addressBookPage.findElement(By.xpath("/html/body/ui-view/register/div/div[2]/input[1]")).sendKeys(name);
		addressBookPage.findElement(By.xpath("/html/body/ui-view/register/div/div[2]/input[2]")).sendKeys(name);
		addressBookPage.findElement(By.xpath("/html/body/ui-view/register/div/div[2]/input[3]")).sendKeys(name);
		addressBookPage.findElement(By.xpath("/html/body/ui-view/register/div/div[2]/input[4]")).sendKeys(name);
		addressBookPage.findElement(By.xpath("/html/body/ui-view/register/div/div[2]/input[5]")).sendKeys(name + "@mail.com");
		addressBookPage.findElement(By.xpath("/html/body/ui-view/register/div/div[2]/input[6]")).sendKeys(name);
		addressBookPage.findElement(By.xpath("/html/body/ui-view/register/div/div[2]/input[7]")).sendKeys(name);
		addressBookPage.findElement(By.xpath("/html/body/ui-view/register/div/div[2]/input[8]")).sendKeys(name);
		
		Thread.sleep(2000);
		
		addressBookPage.findElement(By.xpath("/html/body/ui-view/register/div/div[2]/div[1]/button")).click();
	}
	
	public void RemoveUser(String name, WebDriver addressBookPage) throws InterruptedException
	{
		addressBookPage.findElement(By.partialLinkText(name)).click();
		Thread.sleep(2000);
		addressBookPage.findElement(By.partialLinkText("Edit Contact Details")).click();
		Thread.sleep(1000);
		addressBookPage.findElement(By.xpath("/html[1]/body[1]/ui-view[1]/address-details[1]/div[2]/div[1]/div[2]/div[1]/div[3]/button[1]")).click();
		Thread.sleep(1000);
		addressBookPage.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/button[1]")).click();
	}
	
	public void ResetDetails(String data, WebDriver addressBookPage) throws InterruptedException
	{
		addressBookPage.findElement(By.partialLinkText(data)).click();
		Thread.sleep(2000);
		addressBookPage.findElement(By.partialLinkText("Edit Contact Details")).click();
		Thread.sleep(2000);
		
		//Clear and insert original text
		addressBookPage.findElement(By.xpath("/html[1]/body[1]/ui-view[1]/address-details[1]/div[2]/div[1]/div[2]/div[1]/input[1]")).clear();
		addressBookPage.findElement(By.xpath("/html[1]/body[1]/ui-view[1]/address-details[1]/div[2]/div[1]/div[2]/div[1]/input[1]")).sendKeys("Bill1");
		
		addressBookPage.findElement(By.xpath("/html[1]/body[1]/ui-view[1]/address-details[1]/div[2]/div[1]/div[2]/div[1]/input[2]")).clear();
		addressBookPage.findElement(By.xpath("/html[1]/body[1]/ui-view[1]/address-details[1]/div[2]/div[1]/div[2]/div[1]/input[2]")).sendKeys("Soap1");
		
		addressBookPage.findElement(By.xpath("/html[1]/body[1]/ui-view[1]/address-details[1]/div[2]/div[1]/div[2]/div[1]/input[3]")).clear();
		addressBookPage.findElement(By.xpath("/html[1]/body[1]/ui-view[1]/address-details[1]/div[2]/div[1]/div[2]/div[1]/input[3]")).sendKeys("CompanyPosition");
		
		addressBookPage.findElement(By.xpath("/html[1]/body[1]/ui-view[1]/address-details[1]/div[2]/div[1]/div[2]/div[1]/input[4]")).clear();
		addressBookPage.findElement(By.xpath("/html[1]/body[1]/ui-view[1]/address-details[1]/div[2]/div[1]/div[2]/div[1]/input[4]")).sendKeys("CompanyName");
		
		addressBookPage.findElement(By.xpath("/html[1]/body[1]/ui-view[1]/address-details[1]/div[2]/div[1]/div[2]/div[1]/input[5]")).clear();
		addressBookPage.findElement(By.xpath("/html[1]/body[1]/ui-view[1]/address-details[1]/div[2]/div[1]/div[2]/div[1]/input[5]")).sendKeys("27 83 228 6958");
		
		addressBookPage.findElement(By.xpath("/html[1]/body[1]/ui-view[1]/address-details[1]/div[2]/div[1]/div[2]/div[1]/input[6]")).clear();
		addressBookPage.findElement(By.xpath("/html[1]/body[1]/ui-view[1]/address-details[1]/div[2]/div[1]/div[2]/div[1]/input[6]")).sendKeys("2711 111 2223");
		
		addressBookPage.findElement(By.xpath("/html[1]/body[1]/ui-view[1]/address-details[1]/div[2]/div[1]/div[2]/div[1]/input[7]")).clear();
		addressBookPage.findElement(By.xpath("/html[1]/body[1]/ui-view[1]/address-details[1]/div[2]/div[1]/div[2]/div[1]/input[7]")).sendKeys("2741 258 9612");
		
		addressBookPage.findElement(By.xpath("/html[1]/body[1]/ui-view[1]/address-details[1]/div[2]/div[1]/div[2]/div[1]/input[8]")).clear();
		addressBookPage.findElement(By.xpath("/html[1]/body[1]/ui-view[1]/address-details[1]/div[2]/div[1]/div[2]/div[1]/input[8]")).sendKeys("2711 111 7589");
		
		addressBookPage.findElement(By.xpath("/html[1]/body[1]/ui-view[1]/address-details[1]/div[2]/div[1]/div[2]/div[1]/input[9]")).clear();
		addressBookPage.findElement(By.xpath("/html[1]/body[1]/ui-view[1]/address-details[1]/div[2]/div[1]/div[2]/div[1]/input[9]")).sendKeys("bs1@home.com");
		
		addressBookPage.findElement(By.xpath("/html[1]/body[1]/ui-view[1]/address-details[1]/div[2]/div[1]/div[2]/div[1]/input[10]")).clear();
		addressBookPage.findElement(By.xpath("/html[1]/body[1]/ui-view[1]/address-details[1]/div[2]/div[1]/div[2]/div[1]/input[10]")).sendKeys("bs1@work.com");
		
		addressBookPage.findElement(By.xpath("/html[1]/body[1]/ui-view[1]/address-details[1]/div[2]/div[1]/div[2]/div[1]/input[11]")).clear();
		addressBookPage.findElement(By.xpath("/html[1]/body[1]/ui-view[1]/address-details[1]/div[2]/div[1]/div[2]/div[1]/input[11]")).sendKeys("6");
		
		addressBookPage.findElement(By.xpath("/html[1]/body[1]/ui-view[1]/address-details[1]/div[2]/div[1]/div[2]/div[1]/input[12]")).clear();
		addressBookPage.findElement(By.xpath("/html[1]/body[1]/ui-view[1]/address-details[1]/div[2]/div[1]/div[2]/div[1]/input[12]")).sendKeys("Random Street");
		
		addressBookPage.findElement(By.xpath("/html[1]/body[1]/ui-view[1]/address-details[1]/div[2]/div[1]/div[2]/div[1]/input[13]")).clear();
		addressBookPage.findElement(By.xpath("/html[1]/body[1]/ui-view[1]/address-details[1]/div[2]/div[1]/div[2]/div[1]/input[13]")).sendKeys("Summerstrand");
		
		addressBookPage.findElement(By.xpath("/html[1]/body[1]/ui-view[1]/address-details[1]/div[2]/div[1]/div[2]/div[1]/input[14]")).clear();
		addressBookPage.findElement(By.xpath("/html[1]/body[1]/ui-view[1]/address-details[1]/div[2]/div[1]/div[2]/div[1]/input[14]")).sendKeys("Port Elizabeth");
		
		addressBookPage.findElement(By.xpath("/html[1]/body[1]/ui-view[1]/address-details[1]/div[2]/div[1]/div[2]/div[1]/input[15]")).clear();
		addressBookPage.findElement(By.xpath("/html[1]/body[1]/ui-view[1]/address-details[1]/div[2]/div[1]/div[2]/div[1]/input[15]")).sendKeys("6080");
		
		addressBookPage.findElement(By.xpath("/html[1]/body[1]/ui-view[1]/address-details[1]/div[2]/div[1]/div[2]/div[1]/input[16]")).clear();
		addressBookPage.findElement(By.xpath("/html[1]/body[1]/ui-view[1]/address-details[1]/div[2]/div[1]/div[2]/div[1]/input[16]")).sendKeys("None");
		
		Thread.sleep(2000);
		addressBookPage.findElement(By.xpath("//*[@id=\"fileToUpload\"]")).sendKeys("C:/wamp64/www/AddressBook/Images/17.jpg");
		Thread.sleep(2000);
		addressBookPage.findElement(By.xpath("//*[@id=\"uploadForm\"]/input[2]")).click();
		Thread.sleep(5000);
		addressBookPage.findElement(By.xpath("/html/body/ui-view/address-details/div[2]/div/div[2]/div/div[2]/button")).click();
	}

	public void SearchSort(String data, WebDriver addressBookPage) throws InterruptedException
	{
		addressBookPage.findElement(By.xpath("/html[1]/body[1]/ui-view[1]/address-list[1]/div[1]/div[1]/input[1]")).sendKeys(data);
		Thread.sleep(2000);
		Select s = new Select(addressBookPage.findElement(By.xpath("/html/body/ui-view/address-list/div/div[2]/select")));
		s.selectByValue("LastName");
	}
	
	public void SendMessage(String data, WebDriver addressBookPage) throws InterruptedException
	{
		addressBookPage.findElement(By.xpath("/html/body/ui-view/address-list/address-book-header/nav/div/div[1]/ul/li[5]/a")).click();
		Thread.sleep(2000);
		Select s = new Select(addressBookPage.findElement(By.xpath("/html/body/ui-view/message-send/div/div[2]/div[2]/select")));
		s.selectByValue("2");
		Thread.sleep(2000);
		addressBookPage.findElement(By.xpath("/html/body/ui-view/message-send/div/div[2]/input[1]")).sendKeys(data);
		addressBookPage.findElement(By.xpath("/html/body/ui-view/message-send/div/div[2]/input[2]")).sendKeys(data);
		Thread.sleep(2000);
		addressBookPage.findElement(By.xpath("/html/body/ui-view/message-send/div/div[2]/div[3]/button")).click();
	}
}
