package SeleniumSession;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorConcept {
//locator is used to find element in DOM(HTML) if you want to interact web element
	//locators locate web element
	//in other words a locator enables to select an HTML DOM element act on
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/brttuba/Downloads/chromedriver");
		
		 WebDriver driver=new ChromeDriver();

		driver.get("https://app.hubspot.com/login");
		Thread.sleep(5000);
		//HTML DOM (Document Object Module)
		//1.ID usage
		//first way
		//driver.findElement(By.id("username"));
		//userElement.sendKeys("ilhanturkmen@hotmail.com");
        //Second way
		driver.findElement(By.id("username")).sendKeys("ilhanturkmen@hotmail.com");
		//third way--->always prefer this way
		//By username=By.id("username");
		//WebElement userElement=driver.findElement(username);
		//userElement.sendKeys("ilhanturkmen@hotmail.com");
		//fourth way
//		By username=By.id("username");
//		Util.getElement(driver, username).sendKeys("ilhanturkmen@hotmail.com");
//		By passwordElement=By.id("password");
//		Util.getElement(driver, passwordElement).sendKeys("123@test");
//		
//		By loginButton=By.id("loginBtn");
//		Util.getElement(driver, loginButton).click();;
    //2.Name
		//first
		driver.findElement(By.name("username")).sendKeys("test@test.net");
		//second
		WebElement element=driver.findElement(By.name("username"));
		element.sendKeys("test@test.net");
		//professional
		By username=By.name("username");
		Util.getElement(driver, username).sendKeys("test@test.net");
		//3.XPATH
		//first
//		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("ilhanturkmen@hotmail.com");
//		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Furkan.117675");
//		driver.findElement(By.xpath("//button[@id='loginBtn']")).click();
//		//second
//		WebElement element2=driver.findElement(By.xpath("//input[@id='username']"));
//		element.sendKeys("ilhanturkmen@hotmail.com");
		//professional usage
		//By username=By.xpath("//input[@id='username']");
	//	Util.getElement(driver, username).sendKeys("ilhanturkmen");
		//4.CSS selector
//		driver.findElement(By.cssSelector("#username")).sendKeys("ilhanturkmen@hotmail.com");
//		driver.findElement(By.cssSelector("#password")).sendKeys("Furkan.117675");
//		driver.findElement(By.cssSelector("#loginBtn")).click();
//		WebElement element2=driver.findElement(By.cssSelector("#username"));
//		element.sendKeys("ilhanturkmen@hotmail.com");
//		By username=By.cssSelector("#username");
//		Util.getElement(driver, username);
		//5. Class Name
		//form-control private-form_control login-email
//		By username=By.className("login-email");
//		Util.getElement(driver, username).sendKeys("ilhanturkmen@hotmail.com");
		//6.LINKTEXT
		By signupLink=By.linkText("Sign up");
		Util.getElement(driver,signupLink).click();
		
		//7.Partial Link (not grauntee to work)
		By signUpParLink=By.partialLinkText("Sign");//not recomended
		Util.getElement(driver, signUpParLink).click();
		
		
		
	}

}
