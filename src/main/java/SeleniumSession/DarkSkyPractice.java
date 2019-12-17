package SeleniumSession;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.ClickAction;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DarkSkyPractice {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://darksky.net/");     
        driver.findElement(By.xpath("//form[@id='searchForm']//input")).clear();
        driver.findElement(By.xpath("//form[@id='searchForm']//input")).sendKeys("70817");
        driver.findElement(By.className("searchButton")).click();
        Thread.sleep(5000);
        JavaScriptUtil.scrollPageDown(driver);
        Thread.sleep(3000);
        driver.findElement(By.xpath("//a[@class='button']")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//button[contains(text(),'27')]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//span[@class='4am']")).click();
//        WebElement slider= driver.findElement(By.xpath("//div[@class='handle']"));
//        Actions actions= new Actions(driver);
//        //actions.clickAndHold(slider).moveByOffset(-270, 0).release().perform();
//        actions.dragAndDropBy(slider, -270, 0).perform();
//        
       
        //if(slider==driver.findElement(By.xpath("//span[@class='4am']"))){
      //div[@class='hours']//span[5]
        
//		JavascriptExecutor jse = (JavascriptExecutor)driver;
//		
//		jse.executeScript("window.scrollBy(0,i+250)");
//	//jse.executeScript("window.scrollBy(0,700)"); 
//       	Thread.sleep(3000);
//		
	    
		
//	  driver.findElement(By.xpath("//span[contains(text(),'Today')]")).click();
//	  List<WebElement>temp=driver.findElements(By.cssSelector("span[style^=opacity]"));
//	  //List<WebElement>temp=driver.findElements(By.xpath("//div[@class='dayDetails revealed']//div[@class='temps']"));
//	 System.out.println(temp.size());
//	
//	 ArrayList<Integer>tempList=new ArrayList<Integer>();
//	  
//	  
//	  
//	  
//	 
//	 for(int i=0;i<temp.size();i++){
//		 
//		 String text=temp.get(i).getText();
//	      if(!text.isEmpty()){
//   	  System.out.println(text);
//		      
//	    tempList.add(Integer.parseInt(text.replaceAll("[^\\d.]","")));
//	    	 
//	 }
//	 }	
//	  	Collections.sort(tempList);
//	  	int max=tempList.get(tempList.size()-1);
//	     int min=tempList.get(0);
//	  	System.out.println(max);
//	  	System.out.println(min);
//	
//	 
//	if(min ==tempList.get(0))                                                                                                         
//	{         
//	  System.out.println("min temp is: "+min);     
//	}    
//	else    
//	{     
//	 System.out.println("thats not a min temp");  
//	 
//	 
//	 
//	 
//	}
//	if(max==tempList.get(tempList.size()-1)){
//		System.out.println("max temp is:"+max);
//	}else{
//		System.out.println("thats not a max temp");
//	}
}
}

	   // System.out.println(temps.size()); 
	   // System.out.println(tempList.size());
	 



	
//	}



		  
		  
		  
		  
		  
		  
		  



	