package SeleniumSession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathConcept {

	public static void main(String[] args) throws InterruptedException {
		//x path :it is used to find location of any element on a web page
		//using HTML structure
		//xpath absulate(/) ans relative(//) slash
		// //tagname[@attributeName='value']sntax in xpath
		//absulate x path start with (/) single slash starting from root element all 
		//all the way to element
		//realative starts with (//)startingselection matching any where in the decument
		//Css and xpath
		//css is faster tahn x path
		//x path can traverse both forword and backword,but css onl forword
		//css is more understandable
		//x path is complex and make hard to read
		
System.setProperty("webdriver.chrome.driver", "/Users/brttuba/Downloads/chromedriver");
		
		WebDriver driver=new ChromeDriver();

		driver.get("https://app.hubspot.com/login");
  Thread.sleep(5000);
 //first
  //WebElement userElement=driver.findElement(By.xpath)
	}

}
