package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindAll;

import BasePage.BasePage;
import Utilities.Constants;
import Utilities.ElementUtil;

public class PhoneFeatures extends BasePage{
	WebDriver driver;
    ElementUtil elementUtil;
    By color=By.xpath("//div[contains(@style,'rgb(204, 197, 215)')]");
    By size=By.xpath("//p[contains(text(),'256GB')]"); //genel xpath
    	By price=By.xpath("//div[contains(text(),'Retail price')]");
    	By contn=By.id("ATC-Btn");
    	By zipcode=By.id("zipcode");
    	By Confirmlocation=By.className("defaultPrimaryCTA");
    	By newCostumer=By.xpath("//button[@aria-label='New Customer']");
 public PhoneFeatures(WebDriver driver){
	  this.driver=driver;
	  elementUtil=new ElementUtil(driver);
       }
  public String getFeaturesTitle(){
	  return elementUtil.waitForGetPageTitle(Constants.FEATURES_TITLE);
      }
  public FinalPage getFeatures(){
	  elementUtil.waitForElementPresent(color);
	  elementUtil.doClick(color);
	  elementUtil.doClick(size);
	  elementUtil.doClick(price);
	  elementUtil.doClick(contn);
	  elementUtil.waitForElementPresent(zipcode);
	  elementUtil.doSendKeys(zipcode,"123abc");
	  elementUtil.doClick(Confirmlocation);
	  elementUtil.doClick(newCostumer);
	  return new FinalPage(driver);
      }
      }
  
 