package java1;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;


public class Tester {

	public static void main(String[] args) throws FindFailed, AWTException {
			
			WebDriver driver = Components.selectBrowser("chrome");
			
			//Runtime.getRuntime().exec("C:\\Users\\p.nvs.vivek\\Desktop\\AutoITScripts\\HandleAuthWindow.exe");
			driver.get("http://staging.filmstruck.com/#!/login/");
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			Screen scr = new Screen();
			
			
			Pattern pat1 = new Pattern("C:/Users/p.nvs.vivek/Downloads/password.png");
			scr.wait(pat1, 10);
			scr.type(pat1, "t7rn3rt3st!");
			
			Pattern pat = new Pattern("C:/Users/p.nvs.vivek/Downloads/username.png");
			scr.wait(pat, 10);
			scr.type(pat, "turnertest");
			Robot rb = new Robot();
			rb.keyPress(KeyEvent.VK_ENTER);
			rb.keyRelease(KeyEvent.VK_ENTER);
		
		
	}
}
