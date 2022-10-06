package WalcartTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class AddToCart_CheckOut extends BaseTest{

    By loginbtn= By.xpath("//a[contains(text(),'Log In')]");
    By mobilefld= By.xpath("//input[@id='mobile']");
    By continuebtn= By.xpath("//*[@id=\"tab-login\"]/div[3]/div[1]/button/span");
    By password = By.id("pass");
    By signin = By.xpath("//*[@id=\"tab-login\"]/div[3]/div[2]/button/span");
    By search = By.xpath("//input[@id='search']");
    By searchbtn= By.xpath("//body[1]/div[1]/header[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/form[1]/div[2]/button[1]/span[1]");
    By tv= By.xpath("//body/div[1]/main[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[3]/ol[1]/li[2]/div[1]/div[2]/h2[1]/a[1]");
    By addtocart = By.xpath("//span[contains(text(),'Add to Cart')]");
    By checkout = By.xpath("//button[@id='top-cart-btn-checkout']");


    @Test
    public void test2_AddToCart_CheckOut(){

        click(loginbtn);
        type(mobilefld,"01685551990");
        click(continuebtn);
        type(password,"Abc1234#");
        click(signin);
        type(search,"tv");
        click(searchbtn);
        click(tv);
        click(addtocart);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(checkout));
        click(checkout);


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
