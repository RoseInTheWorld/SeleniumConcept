package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DarkSkyTimeZonePre {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://darksky.net/");   
		driver.findElement(By.xpath("//form[@id='searchForm']//input")).clear();
       driver.findElement(By.xpath("//form[@id='searchForm']//input")).sendKeys("70817");
        driver.findElement(By.className("searchButton")).click();
        Thread.sleep(5000);
        //String lowerCaseCity= city.toLowerCase();
    	//String timeZone="";
    //switch (lowerCaseCity){
    	//case "new york":
    		//timeZone="GMT-4";
    		//break;
    	//case "chicago" :
    		//timeZone="GMT-5";
   		//break;
   	//case "denver":
    		//timeZone="GMT-6";
    		//break;
    	//case "phoenix":
    	//case "los angeles":
    		//timeZone="GMT-7";
    		//break;
    	//case "anchorage":
    		//timeZone="GMT-8";
    		//break;
    	//case "honalulu" :
    		//timeZone="GMT-10";
    		//break;
	//}
	}
}
