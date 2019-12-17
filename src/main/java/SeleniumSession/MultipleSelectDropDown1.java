package SeleniumSession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleSelectDropDown1 {

	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver", "/Users/brttuba/Downloads/chromedriver");
		
		WebDriver driver=new ChromeDriver();

		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
		//click on function
		driver.findElement(By.id("justAnInputBox")).click();
		
		//List -->collect all values
		List<WebElement> dropList=driver.findElements(By.xpath("//span[@class='comboTreeItemTitle']"));
		System.out.println(dropList.size());
		//print out value
		for(int i=0;i<dropList.size();i++){
		String text=dropList.get(i).getText();
		System.out.println(text);
		
		
		//ignore empty values
		if(!text.isEmpty()){
			dropList.get(i).click();
		}
		if(text.equals("choice 3")){
			dropList.get(i).click();
			break;
		}

	}
	}
}
