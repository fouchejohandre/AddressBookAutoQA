package automationFramework;

import org.openqa.selenium.WebDriver;
//import org.testng.Assert;
//import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
//import org.testng.annotations.TestInstance;
import org.testng.asserts.SoftAssert;

public class FirstTestCase {
	
	@Test
	public static void testFull() throws Exception
	{
		//Variables
		SoftAssert softAssert = new SoftAssert();
		AddressBook addressBook  = new AddressBook();
		WebDriver addressBookPage = addressBook.getAddressBook();
		PHPMyAdmin php = new PHPMyAdmin();
		
		String username = "Johandre";
		String password = "Johandre";
		String testInfo = "AAWebAutoTest1";
		
		//Register User
		 Thread.sleep(2000);
		 addressBook.Register(testInfo, addressBookPage);
		 Thread.sleep(2000);

		//Login with new details
		 addressBook.Login(testInfo, testInfo, addressBookPage);
		 Thread.sleep(2000);
		 softAssert.assertEquals(addressBook.IsLoggedIn(addressBookPage), true, "User Not Logged In");
		 
		//Logout
		addressBook.Logout(addressBookPage);
		Thread.sleep(2000);
		
		//Login with Known details
		addressBook.Login(username, password, addressBookPage);
		Thread.sleep(2000);
		
		//Expand a user and View more details and Edit details
		addressBook.EditDetails("Bill1", addressBookPage);
		Thread.sleep(2000);
		softAssert.assertEquals(addressBook.ElementIsPresent("Bill12", addressBookPage), true, "User Not Edited");
		
		//Reset Contact
		addressBook.ResetDetails("Bill1", addressBookPage);
		softAssert.assertEquals(addressBook.ElementIsPresent("Bill12", addressBookPage), false, "User Not Reset");
		Thread.sleep(2000);
		
		//Add Contact
		addressBook.AddContact(testInfo, addressBookPage);
		softAssert.assertEquals(addressBook.ElementIsPresent(testInfo, addressBookPage), true, "Contact Not Created");
		Thread.sleep(2000);
		
		//Delete contact
		addressBook.RemoveUser(testInfo, addressBookPage);
		softAssert.assertEquals(addressBook.ElementIsPresent(testInfo, addressBookPage), false, "Contact Not Deleted");
		Thread.sleep(2000);
		
		//Search for user and Sort By
		addressBook.SearchSort("John", addressBookPage);
		Thread.sleep(2000);
		softAssert.assertEquals(addressBook.ElementIsPresent("John2", addressBookPage), true, "User Not Filtered");
		softAssert.assertEquals(addressBook.ElementIsPresent("John3", addressBookPage), true, "User Not Filtered");
		softAssert.assertEquals(addressBook.ElementIsPresent("John4", addressBookPage), true, "User Not Filtered");
		
		//Message
		addressBook.SendMessage(testInfo, addressBookPage);
		Thread.sleep(2000);
		softAssert.assertEquals(addressBook.ElementIsPresent("John2", addressBookPage), true, "User Not Filtered");
		softAssert.assertEquals(addressBook.ElementIsPresent(testInfo, addressBookPage), true, "User Not Filtered");
		addressBook.DeleteMessage(testInfo, addressBookPage);
		softAssert.assertEquals(addressBook.ElementIsPresent(testInfo, addressBookPage), false, "Message Not Deleted");
		Thread.sleep(2000);
		
		//Logout
		addressBook.Logout(addressBookPage);
		Thread.sleep(2000);
		addressBookPage.quit();
		Thread.sleep(2000);

		WebDriver phpPage = php.getPhpMyAdmin();
		
		php.Login("root", "", phpPage);
		
		Thread.sleep(2000);
		
		php.RemoveUser("", phpPage);
		
		phpPage.quit();
		
		softAssert.assertAll();
	}
	
	@Test
	public static void testAddUser() throws Exception
	{

		SoftAssert softAssert = new SoftAssert();
		
		AddressBook addressBook  = new AddressBook();
		
		WebDriver addressBookPage = addressBook.getAddressBook();
		 
		 String username = "Johandre";
		 String password = "Johandre";
		 String testInfo = "AAWebAutoTest";
		 
		 Thread.sleep(2000);
		 
		 addressBook.Login(username, password, addressBookPage);
		 
		 Thread.sleep(2000);
		 
		 addressBook.AddContact(testInfo, addressBookPage);
		 
		 softAssert.assertEquals(addressBook.ElementIsPresent(testInfo, addressBookPage), true, "User Not Created");
		 
		 Thread.sleep(3000);
		 
		 addressBook.RemoveUser(testInfo, addressBookPage);
		 
		 softAssert.assertEquals(addressBook.ElementIsPresent(testInfo, addressBookPage), false, "User Not Deleted");
		 
		 softAssert.assertAll();
	}

	@Test
	public static void testLogin() throws Exception
	{
		AddressBook addressBook  = new AddressBook();
		
		WebDriver addressBookPage = addressBook.getAddressBook();
		 
		 String username = "Johandre";
		 String password = "Johandre";
		 
		 Thread.sleep(2000);
		 
		 addressBook.Login(username, password, addressBookPage);
		 
		 Thread.sleep(2000);
	}

	@Test
	public static void testResetDB() throws Exception
	{
		PHPMyAdmin php = new PHPMyAdmin();
		WebDriver phpPage = php.getPhpMyAdmin();

		Thread.sleep(2000);
		
		php.Login("root", "", phpPage);
		
		Thread.sleep(2000);
		
		php.RemoveUser("", phpPage);
		
		phpPage.quit();
	}
	
	@Test
	public static void testUserRegistion() throws Exception
	{
		SoftAssert softAssert = new SoftAssert();
		
		AddressBook addressBook  = new AddressBook();
		
		WebDriver addressBookPage = addressBook.getAddressBook();
		
		 String testInfo = "AAWebAutoTest2";
		 
		 Thread.sleep(2000);
		 
		 addressBook.Register(testInfo, addressBookPage);
		 
		 Thread.sleep(2000);
		 
		 addressBook.Login(testInfo, testInfo, addressBookPage);
		 
		 Thread.sleep(2000);
		 
		 softAssert.assertEquals(addressBook.IsLoggedIn(addressBookPage), true, "User Not Logged In");
		 
		 softAssert.assertAll();
	}
	
	@Test
	public static void testGithub() throws Exception
	{
		GitHub gitHub  = new GitHub();
		
		WebDriver githubPage = gitHub.getGithubPage();
		 
		String username = "--";
		String password = "--";
		
		Thread.sleep(2000);
		
		//Login
		gitHub.Login(username, password, githubPage);
		Thread.sleep(4000);
		
		//Goto Repo
		gitHub.AccessRepo("AddressBookAutoQA", "", githubPage);
		Thread.sleep(2000);
		
		//Clone or Download
		gitHub.CloneOrDownload(githubPage);
		
		//View Insights, Commits, Branches
		gitHub.ScrollTabs(githubPage);
		
		
		//gitHub.DeleteRepo("TestRepoName", githubPage);
	}
}
