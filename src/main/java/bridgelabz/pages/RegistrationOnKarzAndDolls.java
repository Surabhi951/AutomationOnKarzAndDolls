package bridgelabz.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.awt.*;
import java.awt.event.KeyEvent;

public class RegistrationOnKarzAndDolls {

    WebDriver driver;

    public RegistrationOnKarzAndDolls(WebDriver driver) {
        this.driver = driver;
    }

    public void registrationIntoKarzAndDollsSite() throws InterruptedException, AWTException {
        WebElement closeBtn = driver.findElement(By.xpath("//*[@id=\"homekarz\"]/div/div/div[1]/button"));
        closeBtn.click();
        Robot robot = new Robot();
        WebElement myAct = driver.findElement(By.xpath("/html/body/header/div[1]/div/div/div[2]/div[1]/button"));
        Point coordinate = myAct.getLocation();
        robot.mouseMove((int) coordinate.getX(),(int) coordinate.getY()+125);
        myAct.click();
        Thread.sleep(2000);
        WebElement signUpBtn = driver.findElement(By.xpath("/html/body/header/div[1]/div/div/div[2]/div[1]/ul/div[2]/button[2]"));
        signUpBtn.click();

        WebElement email = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/form/div[1]/div[1]/input"));
        email.sendKeys("surabhi22@gmail.com");
        Thread.sleep(1000);
        WebElement password = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/form/div[1]/div[2]/input[2]"));
        password.sendKeys("Surabhi@12345");
        Thread.sleep(1000);
        WebElement confirmPassword = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/form/div[2]/div/input"));
        confirmPassword.sendKeys("Surabhi@12345");
        Thread.sleep(1000);
        WebElement firstName = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/form/div[3]/div[1]/input"));
        firstName.sendKeys("Surabhi");
        Thread.sleep(1000);
        WebElement lastName = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/form/div[3]/div[2]/input"));
        lastName.sendKeys("Bhagat");
        robot.keyPress(KeyEvent.VK_PAGE_DOWN);

        WebElement contactNo = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/form/div[4]/div/input"));
        contactNo.sendKeys("7935963526");
        WebElement womenBtn = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/form/div[5]/label[2]"));
        womenBtn.click();
        Thread.sleep(500);
        WebElement createActBtn = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/form/div[6]/div/div/div/button"));
        createActBtn.click();
        Thread.sleep(1000);
    }
}
