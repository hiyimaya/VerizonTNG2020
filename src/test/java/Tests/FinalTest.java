package Tests;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BasePage.BasePage;
import Pages.FinalPage;
import Pages.MainPage;
import Pages.PhoneFeatures;
import Pages.SmartPhone;
import Utilities.Constants;

public class FinalTest {
	WebDriver driver;
    Properties prop;
    BasePage basePage;
    MainPage mainPage;
    SmartPhone smartphone;
  	PhoneFeatures phoneFeatures;
    FinalPage finalPage;
    @BeforeMethod
  public void setup(){
  	basePage=new BasePage();
  	prop=basePage.initialize_properties();
  	driver=basePage.initialize_driver(prop);
  	mainPage=new MainPage(driver);
  	smartphone=mainPage.phoneToClick();
  	phoneFeatures=smartphone.clickIphone11();
  	finalPage=phoneFeatures.getFeatures();
  	}
   @Test(priority=1,enabled=true)
 public void getFinalTitle(){
   String title=finalPage.getFinalPageTitle();
   System.out.println("Page title is:"+title);
   Assert.assertEquals(title,Constants.FINAL_TITLE,"title is incorrect");
   }
   @AfterClass
 public void tearDown(){
  	driver.quit();
  	}
    }


