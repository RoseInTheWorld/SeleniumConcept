package SeleniumSession;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsConcepts {
static WebDriver driver;
	public static void main(String[] args) {
		//if give exception No such element exception
		System.setProperty("webdriver.chrome.driver", "/Users/brttuba/Downloads/chromedriver");
		//launch browser-start browser
				WebDriver driver=new ChromeDriver();
				//driver.get("https://www.amazon.com");
			driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
			List<WebElement>linkList=driver.findElements(By.tagName("a"));
			//size
			
			System.out.println("total links:"+linkList.size());
			for(int i=0;i<linkList.size();i++){
				String text=linkList.get(i).getText();
		          if(!text.isEmpty()){
	        	  System.out.println(text);
	        	                 
	        	              }
		        	              
				//System.out.println(text);
				   if(text.equals("Forgot Password?")){
					   linkList.get(i).click();
				   break;
				   }
				   //called in selenium handle all links from web page
				   //how to handle link use the common tagname
				   
			}		      
			
	}
}

