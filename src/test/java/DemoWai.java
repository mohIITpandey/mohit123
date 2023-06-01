import java.time.Duration;
import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoWai {
	
public static void main(String[] args) {
	//welcome to my world
	Scanner sc=new Scanner(System.in);
	System.out.println("Search phone:");
	String searchPhone = sc.next();
	System.out.println(searchPhone);
	String searchConnectivity = sc.next();
    
	WebDriver driver= new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://www.amazon.com");
	driver.findElement(By.id("twotabsearchtextbox")).sendKeys("samsung phones");
	List<WebElement> lists = driver.findElements(By.xpath("//div[@class='s-suggestion s-suggestion-ellipsis-direction'] "));
	for(int i=0;i<lists.size();i++) {
		String text = lists.get(i).getText();
		if(text.equalsIgnoreCase(searchPhone)) {
			lists.get(i).click();
		}
	}
	if(searchConnectivity.contains("USB"))
		searchConnectivity(driver, "USB").click();
}
public static WebElement searchConnectivity(WebDriver driver,String connectivity) {
	WebElement Connectivity = driver.findElement(By.xpath("//span[contains(.,'Mobile Phone Connectivity Technology')]/parent::div[contains(@id,'feature')]/following-sibling::ul//li[@aria-label='"+connectivity+"']//input[@type='checkbox']"));
	return Connectivity;
}
 
}
