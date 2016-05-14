import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.sikuli.script.FindFailed;
/*import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
*/


public class A 
{
	@Test
	public void m1(WebElement ele) throws FindFailed, Exception
	{
		WebDriver dr=new FirefoxDriver();
		dr.get("http://www.facebook.com/");
		
		JavascriptExecutor s=(JavascriptExecutor)dr;
		s.executeScript("arguments[0].value='symbee.hasan';",dr.findElement(By.id("email")));
		Thread.sleep(30000);
		s.executeScript("arguments[0].value='5060709sh';",dr.findElement(By.id("pass")));
		
		s.executeScript("arguments[0].click();",dr.findElement(By.id("u_0_w")));
		/*Pattern p=new Pattern("//Users/mahamudulhasan/Desktop/SC1.png");
		Screen s=new Screen();
		s.doubleClick("//Users/mahamudulhasan/Desktop/SC1.png");*/
	}

}
