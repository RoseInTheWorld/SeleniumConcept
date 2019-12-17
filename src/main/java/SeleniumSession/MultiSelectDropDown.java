package SeleniumSession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.implementation.bytecode.ByteCodeAppender.Size;

public class MultiSelectDropDown {
static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
		
		driver.findElement(By.id("justAnInputBox")).click();
		Thread.sleep(3000);
		List<WebElement>dropList=driver.findElements(By.xpath("//span[@class='comboTreeItemTitle']"));
		System.out.println(dropList.size());
		for(int i=0;i<dropList.size();i++){
			String text=dropList.get(i).getText();
			System.out.println((text));
			try {
				dropList.get(i).click();
			} catch (Exception e) {
				// TODO: handle exception
			}
			
//			try{
//			if(!text.isEmpty()){
//				dropList.get(i).click();
//			}
//			}catch(Exception e){
//			}
//			if(text.equals("choice 2 1")){
//				dropList.get(i).click();
//				break;
//				
//			}
		}
Thread.sleep(3000);
//selectMultipleValues(driver, "choice 1");
selectMultipleValues(driver, "ALL");//when we need to choice multiple choices
	}
  public static  void selectMultipleValues(WebDriver driver,String... value){
	  List<WebElement>dropList=driver.findElements(By.xpath("//span[@class='comboTreeItemTitle']"));
		System.out.println(dropList.size());
		if(!value[0].equalsIgnoreCase("ALL")){
		for(int i=0;i<dropList.size();i++){
			String text=dropList.get(i).getText();
			for(int j=0;j<value.length;j++){
			try{
			if(!text.isEmpty()){
				if(text.equals(value[j])){
					dropList.get(i).click();
					break;
				}
		}
			}catch(Exception e){
				
			}
		}
  
	}
}else{
	try {
		for(int full=0;full<dropList.size();full++){
			dropList.get(full).click();
			
		}
	} catch (Exception e) {
		// TODO: handle exception
	}
}
}
}