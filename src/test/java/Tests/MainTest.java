package Tests;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BasePage.BasePage;
import Pages.MainPage;
import Utilities.Constants;

public class MainTest {
      WebDriver driver;
      Properties prop;
      BasePage basePage;
      MainPage mainPage;
    @BeforeMethod
 public void setup(){
    	basePage=new BasePage();
    	prop=basePage.initialize_properties();
    	driver=basePage.initialize_driver(prop);
    	mainPage=new MainPage(driver);
    	}
    @Test(priority=1,enabled=true)
  public void getTitle(){
     String title=mainPage.getMainPageTitle();
     System.out.println("Page title is:"+title);
     Assert.assertEquals(title,Constants.VERIZON_TITLE,"title is incorrect");
     }
     @Test(priority=2)
  public void phoneToSmartClick(){
    mainPage.phoneToClick();
    }
    @AfterClass
  public void tearDown(){
    	driver.quit();
    }
    }
      
      
      
      

