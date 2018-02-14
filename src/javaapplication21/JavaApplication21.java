/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication21;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 *
 * @author tusshar
 */
public class JavaApplication21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
                  System.setProperty("webdriver.gecko.driver","C:\\Users\\tusshar\\Downloads\\geckodriver.exe");
                  
                  WebDriver driver = new FirefoxDriver();
                  driver.get("http://demowebshop.tricentis.com/");
                  driver.manage().window().maximize();
                  //Total Numbers of Links Presrent in this WebSite
                  List<WebElement> allElements = driver.findElements(By.tagName("a"));
                  System.out.println("Total Numbers of Links Presrent in this WebSite :" +allElements.size());
                  
                  for(int i=0;i<allElements.size();i++)
                  {
                      System.out.println(allElements.get(i).getAttribute("href"));
                  }
                 // for(WebElement ele : allElements)
                  //{
                  //    System.out.println("Link is :"+ele.getText());
                  //}
                  //Now in case, if you want to find Number of checkboxes present on the web page, then use below
                  List<WebElement> listOfCheckBoxes = driver.findElements(By.xpath("//input[@type='checkbox']")); 
                  System.out.println("Total Numbers of CheckBoxes present on the web page :"+listOfCheckBoxes.size());
                  
                    List<WebElement> allDropdowns = driver.findElements(By.tagName("select"));
                    System.out.println("Total Numbers of Dropdowns present on the web page :"+allDropdowns.size());
                    
                    List<WebElement> allTextBoxes = driver.findElements(By.xpath("//input[@type='text']"));
                    System.out.println("Total Numbers of TextBoxes present on the web page :" +allTextBoxes.size());
                    
                    List<WebElement> allRadio = driver.findElements(By.xpath("//input[@type='radio']"));
                    System.out.println("Total Numbers of RadioButtons present on the web page:"+allRadio.size());
                    
                    
                  

    }
    
}
