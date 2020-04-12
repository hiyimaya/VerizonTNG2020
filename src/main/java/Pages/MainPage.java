package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import BasePage.BasePage;
import Utilities.Constants;
import Utilities.ElementUtil;

 
  public class MainPage extends BasePage {
	  
	 WebDriver driver;
     ElementUtil elementUtil;
     
     By PhoneMenu=By.xpath("//button[contains(text(),'Phones list')]");
     By smartPhone=By.id("thirdLevel00");
     
  public MainPage(WebDriver driver){
	  this.driver=driver;
	  elementUtil=new ElementUtil(driver);
  }
  
   public String getMainPageTitle(){
	  return elementUtil.waitForGetPageTitle(Constants.VERIZON_TITLE);
      }
   
   public SmartPhone phoneToClick(){
	 elementUtil.moveToElement(PhoneMenu);
     elementUtil.doClick(smartPhone);
     return new SmartPhone(driver);
     }
     }
	