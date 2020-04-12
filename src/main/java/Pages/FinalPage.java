package Pages;



import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import BasePage.BasePage;
import Utilities.Constants;
import Utilities.ElementUtil;
import net.bytebuddy.dynamic.scaffold.MethodRegistry.Handler.ForAbstractMethod;

public class FinalPage extends BasePage{
	
	 WebDriver driver;
     ElementUtil elementUtil;
  public FinalPage(WebDriver driver){
	  this.driver=driver;
	  elementUtil=new ElementUtil(driver);
      }
  public String getFinalPageTitle(){
	  return elementUtil.waitForGetPageTitle(Constants.FINAL_TITLE);
      }
  
  public List<String> getLanguages(By locator) {
  List<WebElement> language= elementUtil.webElements(locator);
  List<String> lStrings= new ArrayList<String>();
    for (WebElement e: language){
    	String string=e.getText();
    	System.out.println(string);
    	if (string.equals("Turkish"))
    	{	lStrings.add(string);}}
    	return lStrings;

    }
  public boolean verifyTurkish(By locator) {
	  List<WebElement> language= elementUtil.webElements(locator);
	  List<String> lStrings= new ArrayList<String>();
	    for (WebElement e: language){
	    	String string=e.getText();
	    	System.out.println(string);
	    	if (string.equals("Turkish"))
	    	{	lStrings.add(string);}}
	    	return !lStrings.isEmpty();

	    }
  
      
}


	
	
	
	
	
	
	
	
	

