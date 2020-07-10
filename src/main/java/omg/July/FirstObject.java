package omg.July;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FirstObject {
	public WebDriver driver;
	
	By from=By.id("ctl00_mainContent_ddl_originStation1_CTXT");
	By ajmer=By.xpath("//a[@text='Ajmer (KQH)']");
	By to=By.id("ctl00_mainContent_ddl_destinationStation1_CTXT");
	By mumbai=By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR']//a[@text='Mumbai (BOM)'][contains(text(),'Mumbai (BOM)')]");
	By fromm=By.xpath("//div[@class='field js-fields field--focus']//label[@class='field__text'][contains(text(),'Departure airport')]");
	By too=By.xpath("//input[@id='30b7d7d6-fa8d-4669-8fab-5b8928e15bc2']");
	
	public FirstObject(WebDriver driver) {
		this.driver=driver;
	}
	
	public WebElement eto() {
		return driver.findElement(too);
	}
	
	public WebElement efrom() {
		return driver.findElement(fromm);
	}
	
	public WebElement Afrom() {
		return driver.findElement(from);
		
	}
	public WebElement AAjmer() {
		return driver.findElement(ajmer);
		
	}
	public WebElement ATo() {
		return driver.findElement(to);
		
	}
	public WebElement Amumbai() {
		return driver.findElement(mumbai);
		
	}

}
