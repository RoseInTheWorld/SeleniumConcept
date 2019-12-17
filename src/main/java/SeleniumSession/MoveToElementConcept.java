package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MoveToElementConcept {

	public static void main(String[] args) throws InterruptedException {
		//http://mrbool.com/how-to-create-menu-with-submenu-using-css-html/26146
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("http://mrbool.com/how-to-create-menu-with-submenu-using-css-html/26146");
		WebElement contentMenu=driver.findElement(By.className("menulink"));
		Actions actions=new Actions(driver);
		actions.moveToElement(contentMenu).build().perform();
		//WebElement coursesLink=driver.findElement(By.linkText("COURSES"));
		WebElement coursesLink=driver.findElement(By.xpath("//ul[@class='submenu']//a[contains(text(), 'Courses')]"));
		//actions.click(coursesLink);
		Thread.sleep(5000);
		//coursesLink.click();//first aproach
		//actions.click(coursesLink); //always there is no guarantie to work
		//annations contains(text(),'courses')]

	}

}
