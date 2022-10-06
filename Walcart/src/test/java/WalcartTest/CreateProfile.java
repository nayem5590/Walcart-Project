package WalcartTest;

import org.apache.commons.lang.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import javax.swing.plaf.basic.BasicTreeUI;

public class CreateProfile extends BaseTest{

    By loginbtn= By.xpath("//a[contains(text(),'Log In')]");
    By mobilefld= By.xpath("//input[@id='mobile']");
    By continuebtn= By.xpath("//*[@id=\"tab-login\"]/div[3]/div[1]/button/span");
    //By mobile= By.id("mobile");
    By password = By.id("pass");
    By signin = By.xpath("//*[@id=\"tab-login\"]/div[3]/div[2]/button/span");
    By Alemran = By.xpath("//div[contains(text(),'AL EMRAN')]");
    By logout = By.xpath("//span[contains(text(),'Log Out')]");

     @Test
    public void test1_CreateProfile(){

         //driver.findElement(By.xpath("//*[@id=\"html-body\"]/div[1]/header/div[1]/div/div[1]/div/div/div/div/div[3]/div/div[4]/ul/li/a")).click();
         click(loginbtn);
         type(mobilefld,"01685551990");
         click(continuebtn);
         //type(mobile,"01685551990");
         type(password,"Abc1234#");
         click(signin);
         click(Alemran);

         Actions act= new Actions(driver);
         act.moveToElement(find(Alemran)).perform();
         click(logout);
     }

     private WebElement find(By locator){
         return driver.findElement(locator);

     }

     private void click(By locator){
         find(locator).click();
     }

     private void type(By locator,String text){
         find(locator).sendKeys(text);
     }


}
