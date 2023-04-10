package bridgelabz.pages;

import org.openqa.selenium.*;
import org.openqa.selenium.Point;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import java.awt.*;
import java.awt.event.KeyEvent;

public class LoginOnKarzAndDolls {

    WebDriver driver;

    public LoginOnKarzAndDolls(WebDriver driver) {
        this.driver = driver;
    }

    public void loginIntoKarzAndDolls() throws InterruptedException, AWTException {
        WebElement closeBtn = driver.findElement(By.xpath("//*[@id=\"homekarz\"]/div/div/div[1]/button"));
        closeBtn.click();
        Robot robot = new Robot();
        WebElement myAct = driver.findElement(By.xpath("/html/body/header/div[1]/div/div/div[2]/div[1]/button"));
        Point coordinate = myAct.getLocation();
        robot.mouseMove((int) coordinate.getX(),(int) coordinate.getY()+125);
        myAct.click();
        Thread.sleep(2000);
        WebElement loginBtn = driver.findElement(By.cssSelector("body > header > div.container-menu-header > div > div > div.header-icons > div.top-profile.topbar-child1.dropdown.open > ul > div.log-inset > button:nth-child(1)"));
        loginBtn.click();
        Thread.sleep(2000);
        WebElement userName = driver.findElement(By.id("frm02--email"));
        userName.sendKeys("surabhi22@gmail.com");
        Thread.sleep(500);
        WebElement password = driver.findElement(By.id("login"));
        password.sendKeys("Surabhi@12345");
        Thread.sleep(500);
        robot.keyPress(KeyEvent.VK_PAGE_DOWN);
        WebElement signInBtn = driver.findElement(By.xpath("//*[@id=\"sform\"]/div[3]/div/div/div[1]/button"));
        signInBtn.click();
        Thread.sleep(2000);
    }
}
