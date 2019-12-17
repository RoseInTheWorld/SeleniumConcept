package SeleniumSession;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownOptions {
static WebDriver driver;
	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "/Users/brttuba/Downloads/chromedriver");
		
		WebDriver driver=new ChromeDriver();

		driver.get("http://www.facebook.com");
		By day=By.id("day");
		By month=By.id("month");
		By year=By.id("year");
		ArrayList<String>dayOptions=getAllOptions(driver, day);
		System.out.println("total days are:"+dayOptions.size());
		if(dayOptions.size()==32){
			System.out.println("total number of days are correct");
		}else{
			System.out.println("total number of days are not correct");
		//Print:
		}
		for(int i=0;i<dayOptions.size();i++){
			System.out.println(dayOptions.get(i));
			
		}
		
		getAllOptions(driver, month);
		getAllOptions(driver, year);
//	WebElement day= driver.findElement(By.id("day"));
//    WebElement month= driver.findElement(By.id("month"));
//    WebElement year= driver.findElement(By.id("year"));
//		//Select select1=new Select(day);
//		Select select2=new Select(month);
//		List<WebElement> monthOptions=select2.getOptions();
//		System.out.println(monthOptions.size());
//		for(int i=0; i<monthOptions.size();i++){
//			String text=monthOptions.get(i).getText();
//			System.out.println(text);
//		}
//		List<WebElement> dayOptions=select1.getOptions();
//		System.out.println(dayOptions.size());
//		for(int i=0; i<dayOptions.size();i++){
//			String text=dayOptions.get(i).getText();
//			System.out.println(text);
//		}
  
	}
	public static ArrayList<String> getAllOptions(WebDriver driver,By locator){
		ArrayList<String>optionList=new ArrayList<String>();
		
		WebElement element=getElement(driver, locator);
		Select select=new Select(element);
		List<WebElement>dropDownOptions=select.getOptions();
		//System.out.println(dropDownOptions.size());
		for(int i=0;i<dropDownOptions.size();i++){
			String text=dropDownOptions.get(i).getText();
				System.out.println(text);
				optionList.add(text);
			}
		return optionList;
		
		}
	
	public static WebElement getElement(WebDriver driver,By locator){
		WebElement element =driver.findElement(locator);
		return element;
		
	}

}
