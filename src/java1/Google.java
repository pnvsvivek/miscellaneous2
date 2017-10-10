package java1;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Google {
	
	public static void main(String[] args) throws InterruptedException, AWTException {
	  WebDriver driver = Components.selectBrowser("chrome");
      /*driver.get("http://newtours.demoaut.com/mercurysignon.php");
      driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
      driver.manage().window().maximize();
      driver.findElement(By.name("userName")).sendKeys("mercury");
      driver.findElement(By.name("password")).sendKeys("mercury");
      driver.findElement(By.name("login")).click();
      WebDriverWait wait = new WebDriverWait(driver,30);
      System.out.println("message "+wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.name("fromPort")))));
      WebElement text = driver.findElement(By.name("fromPort"));
      Select select = new Select(text);
      select.selectByVisibleText("London");
      System.out.println(select.getFirstSelectedOption().getText());*/
      
/*      driver.get("http://toolsqa.com/automation-practice-form/");
      driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
      driver.manage().window().maximize();
      WebElement el = driver.findElement(By.id("selenium_commands"));
      Select select = new Select(el);
      System.out.println(select.isMultiple());*/
	  driver.get("https://www.youtube.com/");
	  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	  driver.manage().window().maximize();
      List<WebElement> listofFrames = driver.findElements(By.tagName("iframe"));
      System.out.println("size of frames "+listofFrames.size());
      List<WebElement> listofVideos = driver.findElements(By.xpath("//div[contains(@class,'yt-thumb video-thumb')]"));
      System.out.println("size of list : "+listofVideos.size());
      listofVideos.get(0).click();
      Thread.sleep(5000);
      driver.findElement(By.xpath("//video[@class = 'video-stream html5-main-video']")).click();
      for(int i=0;i<5;i++)
      {
    	  Thread.sleep(1000);	
      }
    Point point =  driver.findElement(By.xpath("//video[@class = 'video-stream html5-main-video']")).getLocation();
    System.out.println("x axis "+point.getX());
    System.out.println("x+20 "+(point.getX()+20));

    System.out.println("y axis "+point.getY());
    WebElement pro = driver.findElement(By.xpath("//div[@class = 'ytp-scrubber-button ytp-swatch-background-color']"));
    System.out.println("x "+pro.getLocation().getX());
    System.out.println("y "+pro.getLocation().getY());
    int xaxis = (pro.getLocation().getX()+10);
    Actions act = new Actions(driver);      
    act.clickAndHold(pro).moveByOffset(20, 0).release().build().perform();
    /*Robot rb = new Robot();
    rb.keyPress(KeyEvent.VK_L);
    rb.keyRelease(KeyEvent.VK_L);*/
    System.out.println("x "+pro.getLocation().getX());
    System.out.println("y "+pro.getLocation().getY());
    System.out.println("Success");
    JavascriptExecutor js = (JavascriptExecutor)driver;
    js.executeScript("alert('Successful run');");
    
   // driver.close();
}
}
