package SeleniumSession;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandling { //known in selenium browser pop up
  static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		//JS- POPs
		System.setProperty("webdriver.chrome.driver", "/Users/brttuba/Downloads/chromedriver");
		
				 driver=new ChromeDriver();
		
				driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
				driver.findElement(By.name("proceed")).click();//click on go button
				Thread.sleep(4000);
				getAlertText();
				//if(Util.getAlertText(driver).equals("Please enter a valid user name")){
					//System.out.println("Correct message");
					
				//}else{
					//System.out.println("inCorrect message");
				//}
           Alert alert = driver.switchTo().alert();//alert interface is used to handle alert in web apps
           String text=alert.getText();            //void dismiss()
//                                                   //void accept()
//                                                  //String getText()
//                                                  //void sendKeys(String keysToSend)
            System.out.println(text);
            //validation
           if(text.equals("Please enter a valid user name")){
           	System.out.println("correct message");
           }else{
				System.out.println("In correct message");
            }
          alert.accept();//click on ok button in the alert
            alert.dismiss(); //cancel alert
          
            
	}
public static  String getAlertText(){ //prof generic usege
	Alert alert=driver.switchTo().alert();
	String text= alert.getText();
   System.out.println(text);
	alert.accept();
	return text;
}
}
//Generic method:Reuseability code 
//POM framework hybrid
