package SeleniumSession;

import java.sql.Driver;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AlertUtilUsage {
public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		String url="https://mail.rediff.com/cgi-bin/login.cgi";
		By goBtn=By.name("proceed");
		
		driver = Util.launchBrowser(driver, "chrome");
		Util.launchURL(driver,url);
		System.out.println(Util.getPageTitle(driver));
		Util.clickOn(driver, goBtn);
		Thread.sleep(3000);
		//get alert
		//verify 
		//close browser
//		 Alert alert = driver.switchTo().alert();
//         String text=alert.getText();            
//          System.out.println(text);
//          //validation
//         if(text.equals("Please enter a valid user name")){
//         	System.out.println("correct message");
//         }else{
//				System.out.println("In correct message");
//          }
//        alert.accept();//click on ok button in the alert
//        driver.quit();
		Util.getAlertText(driver);
		Util.closeBrowser(driver);
		//pop up
//		Alert alert=driver.switchTo().alert();
//		alert.accept();//OK
//		alert.dismiss();//cancel
//		alert.sendKeys(keysToSend);//send value
//		alert.getText(); //get string
		
	}
     
}
