package SeleniumSession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumWeek1 {
//	Create a maven project named SeleniumWeek1
//	Add necessary dependencies
//	Configure your system to test youR cases
//
//	Assignment 6
//
//	Go to https://www.verizonwireless.com/
//	Get title
//	Validate title whether it is true or not
//	close browser
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/brttuba/Downloads/chromedriver");
		//launch browser-start browser
				WebDriver driver=new ChromeDriver();
				//enter URL
				driver.get("https://www.verizonwireless.com");
				//get title
				String title=driver.getTitle();
				System.out.println("Page title is"+ title);
				//validation point//verify
				if(title.equals("Verizon Wireless, Smartphone Deals & Plans | First to 5G")){
					System.out.println("correct title");
					
				}else{
					System.out.println("in correct title");
				}
				driver.quit();

	}

}
