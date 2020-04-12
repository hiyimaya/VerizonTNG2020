package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import BasePage.BasePage;
import Utilities.Constants;
import Utilities.ElementUtil;

public class SmartPhone extends BasePage{
	WebDriver driver;
    ElementUtil elementUtil;
    By iphone11=By.xpath("//a[@aria-label='Apple iPhone 11']");
 public SmartPhone(WebDriver driver){
	  this.driver=driver;
	  elementUtil=new ElementUtil(driver);
      }
   public String getSmartPhoneTitle(){
	  return elementUtil.waitForGetPageTitle(Constants.SMARTPHONES_TITLE);
      }
   public PhoneFeatures clickIphone11(){
	  elementUtil.doClick(iphone11);
	  return new PhoneFeatures(driver);
      }
      }
