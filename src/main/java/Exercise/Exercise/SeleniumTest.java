package Exercise.Exercise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pages.AutomationTestingOnlineLandingPage;
import pages.ShadyMeadowsFormPage;

import org.testng.annotations.BeforeClass;
import org.testng.Assert;
import org.testng.annotations.AfterClass;


public class SeleniumTest {

  public WebDriver driver;
  public AutomationTestingOnlineLandingPage automationTestingOnlineLandingPage;
  public ShadyMeadowsFormPage shadyMeadowsFormPage;
  
  @Test(priority=1)
  public void Test1() {
	  automationTestingOnlineLandingPage = new AutomationTestingOnlineLandingPage(driver);
	  shadyMeadowsFormPage = new ShadyMeadowsFormPage(driver);
	  
	  driver.get("https://automationintesting.online/");
	  automationTestingOnlineLandingPage.clickLetMeHackButton();
	  
	  shadyMeadowsFormPage.scrollToNameFieldAndEnterValue("Ada Lovelace");
	  shadyMeadowsFormPage.enterEmailValue("ada.lovelace@zeel.com");
	  shadyMeadowsFormPage.enterPhoneValue("347-555-1212");
	  shadyMeadowsFormPage.enterRandomSubjectString();
	  shadyMeadowsFormPage.enterRandomMessageString();
	  shadyMeadowsFormPage.clickSubmitButton();
	  
	  Assert.assertTrue(shadyMeadowsFormPage.verifySuccessMessage());
	  
	  shadyMeadowsFormPage.clickBookThisRoom();
	  
	  shadyMeadowsFormPage.selectTodayButtonForBookingRoom();
	  shadyMeadowsFormPage.enterBookRoomFirstNameField("Grace");
	  shadyMeadowsFormPage.enterBookRoomLastNameField("Hopper");
	  shadyMeadowsFormPage.enterBookRoomEmailField("grace.hopper@zeel.com");
	  shadyMeadowsFormPage.enterBookRoomPhoneField("347-555-9898");
	  shadyMeadowsFormPage.clickBookButtonForRoom();
	  shadyMeadowsFormPage.verifyBookRoomSuccessMessage();
	  shadyMeadowsFormPage.clickCloseButton();
  }
  
  /*@Test(priority=2)
  public void Test2() {
	  //additional test scenario would go here
  }*/
  
  @BeforeClass
  public void beforeClass() {
	  System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	  driver = new ChromeDriver();
  }
 
  @AfterClass
  public void afterClass() {
	  driver.quit();
  }
 
}