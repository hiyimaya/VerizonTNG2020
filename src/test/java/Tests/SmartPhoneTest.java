package Tests;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BasePage.BasePage;
import Pages.MainPage;
import Pages.PhoneFeatures;
import Pages.SmartPhone;

import Utilities.Constants;

public class SmartPhoneTest {
	WebDriver driver;
    Properties prop;
    BasePage basePage;
    SmartPhone smartphone;
  	MainPage mainPage;
  	@BeforeMethod
  public void setup(){
  	basePage=new BasePage();
  	prop=basePage.initialize_properties();
  	driver=basePage.initialize_driver(prop);
  	mainPage=new MainPage(driver);
  	smartphone=mainPage.phoneToClick();
  	}
    @Test(priority=1,enabled=true,description="Smartphones - Buy The Newest Cell Phones | Verizon Wireless")
  public void getTitle(){
    String title=smartphone.getSmartPhoneTitle();
    System.out.println("Page title is:"+title);
    Assert.assertEquals(title,Constants.SMARTPHONES_TITLE,"title is incorrect");
    }
    @Test(priority=2)
 public void phoneToSmartClick(){
	smartphone.clickIphone11();
    }
    @AfterClass
  public void tearDown(){
  	driver.quit();
    }
    }
  
 


