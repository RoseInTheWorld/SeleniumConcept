package SeleniumSession;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserWindowPopUp {
//getWindowHandle()-get the current window handle
	//getWindowHandles()- get the window handles that handled
	//switchTo().window() switch focus between window
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.popuptest.com/goodpopups.html");
	//	driver.findElement(By.className("black"));
		driver.findElement(By.linkText("Good PopUp #3")).click();
		Set<String>handles=driver.getWindowHandles();
		Iterator<String> it=handles.iterator();
		String parentWindowId= it.next();
		System.out.println("Parent window is:"+parentWindowId);
		String childWindowId=it.next();
		System.out.println("child window is:"+childWindowId);
		
		driver.switchTo().window(childWindowId);
		System.out.println("child window title is:"+driver.getTitle());
		driver.close();
		driver.switchTo().window(parentWindowId);
		System.out.println("parent window title is"+driver.getTitle());

	}

}
