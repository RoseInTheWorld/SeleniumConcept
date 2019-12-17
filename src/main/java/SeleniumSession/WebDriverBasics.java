package SeleniumSession;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverBasics {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/brttuba/Downloads/chromedriver");
//launch browser-start browser
		WebDriver driver=new ChromeDriver();
		//enter URL
		driver.get("https://www.google.com");
		//get title
		String title=driver.getTitle();
		System.out.println("Page title is"+ title);
		//validation point//verify
		if(title.equals("Google")){
			System.out.println("correct title");
			
		}else{
			System.out.println("in correct title");
		}
		System.out.println("current title"+driver.getCurrentUrl());
		//Page source
		//System.out.println(driver.getPageSource());
		
		//slow down
		
			
		//System.out.println(driver.getPageSource());
		Thread.sleep(5000);//it will wait 5 second
		
		//close browser
		driver.quit();//close the browser
		//driver.close();
		
	}

}
