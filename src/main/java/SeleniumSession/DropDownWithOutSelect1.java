package SeleniumSession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDownWithOutSelect1 {
static WebDriver driver;

	public static void main(String[] args) {
		
		//how to select an element without using select class
		
System.setProperty("webdriver.chrome.driver", "/Users/brttuba/Downloads/chromedriver");
		
		WebDriver driver=new ChromeDriver();

		driver.get("http://www.facebook.com");
     List<WebElement> dayList=driver.findElements(By.xpath("//select[@id='day']/option"));
     System.out.println(dayList.size());
     //for select we use for loop to print out
     for(int i=0;i<dayList.size();i++){
    	 System.out.println(dayList.get(i).getText());
    	 String text=dayList.get(i).getText();
    	 if(text.equals("15")){
    		 dayList.get(i).click();
    		 break;
    	 }
    	 
     }
     
     
	}

}
