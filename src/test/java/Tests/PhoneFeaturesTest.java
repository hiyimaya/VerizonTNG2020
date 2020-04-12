package Tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ISelect;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BasePage.BasePage;
import Pages.MainPage;
import Pages.PhoneFeatures;
import Pages.SmartPhone;
import Utilities.Constants;

public class PhoneFeaturesTest {
	WebDriver driver;
    Properties prop;
    BasePage basePage;
    MainPage mainPage;
  	SmartPhone smartphone;
  	PhoneFeatures phoneFeatures;
    @BeforeMethod
  public void setup(){
  	basePage=new BasePage();
  	prop=basePage.initialize_properties();
  	driver=basePage.initialize_driver(prop);
  	mainPage=new MainPage(driver);
  	smartphone=mainPage.phoneToClick();
  	phoneFeatures=smartphone.clickIphone11();
  	 }
  	 @Test(priority=1,enabled=true)
  public void getPageTitle(){
     String title=phoneFeatures.getFeaturesTitle();
     System.out.println("Page title is:"+title);
     Assert.assertEquals(title,Constants.FEATURES_TITLE);
     }
     @Test(priority=2)
  public void features(){
     phoneFeatures.getFeatures();
     }
     @AfterMethod
  public void tearDown(){
  	driver.quit();
    }
    }
    



