package SeleniumSession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultipleDropDown2 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
		driver.findElement(By.id("justAnInputBox")).click();
		selectMultipleValues(driver, "choice 3");

	}
public static void selectMultipleValues(WebDriver driver,String value){
	List<WebElement> dropList=driver.findElements(By.xpath("//span[@class='comboTreeItemTitle']"));
System.out.println(dropList.size());
for(int i=0; i<dropList.size();i++){
	String text=dropList.get(i).getText();
	try {
		if(text.isEmpty()){
			if(text.equals(value)){
				dropList.get(i).click();
				break;
			}
		}
	} catch (Exception e) {
		// TODO: handle exception
	}
}
}

}
