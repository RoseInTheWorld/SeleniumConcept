package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ISelect;
import org.openqa.selenium.support.ui.Select;

import net.bytebuddy.asm.Advice.OnDefaultValue;

public class DropDownMenu {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "/Users/brttuba/Downloads/chromedriver");
		
		WebDriver driver=new ChromeDriver();

		driver.get("http://www.facebook.com");
		By day=By.id("day");
		By month=By.id("month");
		By year=By.id("year");
//        WebElement day= driver.findElement(By.id("day"));
//        WebElement month= driver.findElement(By.id("month"));
//        WebElement year= driver.findElement(By.id("year"));
     //  Select select1=new Select(day);
//        select1.selectByVisibleText("13");
//        Select select2=new Select(month);
//        select2.selectByVisibleText("Jun");
//        Select select3=new Select(year);
//        select3.selectByVisibleText("1975");
		selectDropDownValueByText(driver,day, "13");
		selectDropDownValueByText(driver,month, "Jun");
		selectDropDownValueByText(driver,year, "1975");
		
		WebElement dayElement= driver.findElement(By.id("day"));
      WebElement monthElement= driver.findElement(By.id("month"));
     WebElement yearElement= driver.findElement(By.id("year"));
		
     Select select1=new Select(dayElement);
     select1.selectByIndex(4);
     Select select2=new Select(monthElement);
    select2.selectByIndex(10);
     Select select3=new Select(yearElement);
  
//     select3.selectByIndex(1995);
      selectDropDownSelectByIndex(driver, day, 16);
      selectDropDownSelectByIndex(driver, month, 11);
      selectDropDownSelectByIndex(driver, year, 4);
	}
	/**
	 * This is used to select the values from dropDown on the basis of visible text
	 * @param element
	 * @param value
	 */
public static void selectDropDownValueByText(WebDriver driver,By locator ,String value){//generic usage
	WebElement element=getElement(driver, locator);
	Select select=new Select(element);
	select.selectByVisibleText(value);
	
}
/**
 * This is used to select the values from dropDown on the basis of index
 * @param driver
 * @param locator
 * @param index
 */
public static void selectDropDownSelectByIndex(WebDriver driver,By locator ,int index){//generic usage
	WebElement element=getElement(driver, locator);
	Select select=new Select(element);
	select.selectByIndex(index);
	
}
/**
 * this is used to select the values from dropdown on  the basis of visible text
 * @param driver
 * @param locator
 * @return
 */
public static WebElement getElement(WebDriver driver, By locator){
	WebElement element=driver.findElement(locator);
	return element;
	
}
}
