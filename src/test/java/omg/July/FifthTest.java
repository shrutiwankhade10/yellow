package omg.July;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class FifthTest extends base {
	
	@Test(dataProvider= "getdata")
	public void fb(String un,String pwd) throws IOException {
		driver=startDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).click();
		driver.findElement(By.id("email")).sendKeys(un);
		driver.findElement(By.id("pass")).click();
		driver.findElement(By.id("pass")).sendKeys(pwd);
		driver.findElement(By.id("u_0_b")).click();
		
		}
	
	@DataProvider
	public Object[][] getdata() {
		Object[][] data=new Object[3][2];
	    data[0][0]="shruti@gmail.com";
	    data[0][1]="khdj";
	    data[1][0]="wnkhade@gmail.com";
	    data[1][1]="hvjvfjv";
	    data[2][0]="wert@gmail.com";
	    data[2][1]="kdjf";
	    return data;
	}
	
	@AfterTest
	public void shut() {
		driver.close();
	}

}
