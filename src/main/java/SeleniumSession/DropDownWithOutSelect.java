package SeleniumSession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDownWithOutSelect {

	public static void main(String[] args) {
		//how to select an element without using select class
System.setProperty("webdriver.chrome.driver", "/Users/brttuba/Downloads/chromedriver");
		
		WebDriver driver=new ChromeDriver();

		driver.get("http://www.facebook.com");
List<WebElement> dayList=driver.findElements(By.xpath("//select[@id='id']/option"));
System.out.println(dayList.size());
//for(int i=0;i<dayList.size();i++){
//	System.out.println(dayList.get(i).getText());
//	String text= dayList.get(i).getText();
//	if(text.equals("10")){
//		dayList.get(i).click();
//		break;
//	}
//}

	}

}
