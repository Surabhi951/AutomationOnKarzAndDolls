package bridgelabz.pages;

import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;
import org.openqa.selenium.*;
import org.openqa.selenium.Point;
import org.openqa.selenium.io.FileHandler;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

public class KarzAndDollsPage {

    WebDriver driver;

    public KarzAndDollsPage(WebDriver driver) {
        this.driver = driver;
    }

    public void addProductToCart() throws AWTException, InterruptedException {
        WebElement search = driver.findElement(By.cssSelector("#searchProduct"));
        search.sendKeys("chase");
        Thread.sleep(200);
        WebElement productName = driver.findElement(By.cssSelector("body > header > div.container-menu-header > div > div > div > form > div > div > ul > li:nth-child(1) > a"));
        productName.click();
        Thread.sleep(500);
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_PAGE_DOWN);
        Thread.sleep(200);
        WebElement selectProduct = driver.findElement(By.cssSelector("body > section.product-show-set > div.product-show-bottom > div > div.product-show-right > div.row.no-gutters > div:nth-child(1) > div > a"));
        selectProduct.click();
        Thread.sleep(500);
        WebElement addToBagBtn = driver.findElement(By.cssSelector("body > div.product-detail-set > section > div > div > div.col-md-5.col-xs-12 > div.pro-detail > div.pro-addcart-detail > button.cart-btn"));
        addToBagBtn.click();
        Thread.sleep(500);
        WebElement shoppingBag = driver.findElement(By.cssSelector("body > header > div.container-menu-header > div > div > div > div.header-icons > div.header-wrapicon2.header-icon1.js-show-header-dropdown > a > i"));
        shoppingBag.click();
        Thread.sleep(2000);
    }

    public void placeOrder() throws InterruptedException, AWTException, IOException, TesseractException {
        Robot robot = new Robot();
        WebElement greenLight = driver.findElement(By.cssSelector("#navbarDropdown"));
        Point coordinate = greenLight.getLocation();
        robot.mouseMove((int) coordinate.getX()+110,(int) coordinate.getY()+150);
        Thread.sleep(2000);
        WebElement bollywoodSeries = driver.findElement(By.cssSelector("#navbarSupportedContent > ul > li:nth-child(2) > div > div > div > div > ul:nth-child(1) > a"));
        bollywoodSeries.click();
        Thread.sleep(2000);

        robot.keyPress(KeyEvent.VK_PAGE_DOWN);
        robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
        WebElement selectProduct = driver.findElement(By.cssSelector("body > section.product-show-set > div.product-show-bottom > div > div.product-show-right > div.row.no-gutters > div:nth-child(2) > div > a"));
        selectProduct.click();
        Thread.sleep(1000);
        WebElement addToBagBtn = driver.findElement(By.xpath("/html/body/div[2]/section/div/div/div[2]/div[1]/div[5]/button[1]"));
        addToBagBtn.click();
        Thread.sleep(1000);
        WebElement cartBtn = driver.findElement(By.cssSelector("body > header > div.container-menu-header > div > div > div > div.header-icons > div.header-wrapicon2.header-icon1.js-show-header-dropdown > a > i"));
        cartBtn.click();
        Thread.sleep(1000);

        robot.keyPress(KeyEvent.VK_PAGE_DOWN);
        robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
        Thread.sleep(500);
        WebElement placeOrderBtn = driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div/div[5]/button"));
        placeOrderBtn.click();
        Thread.sleep(2000);

        WebElement name = driver.findElement(By.id("fname"));
        name.sendKeys("surabhi");
        Thread.sleep(500);
        WebElement mobile = driver.findElement(By.id("phone"));
        mobile.sendKeys("7935963526");
        Thread.sleep(500);
        WebElement pinCode = driver.findElement(By.id("pincode"));
        pinCode.sendKeys("758412");
        Thread.sleep(500);
        WebElement state = driver.findElement(By.id("state"));
        state.sendKeys("Maharashtra");
        Thread.sleep(500);
        robot.keyPress(KeyEvent.VK_PAGE_DOWN);
        robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
        WebElement address = driver.findElement(By.id("address"));
        address.sendKeys("sr.no.06,Nagar road");
        Thread.sleep(500);
        WebElement locality = driver.findElement(By.id("locality"));
        locality.sendKeys("pune");
        Thread.sleep(500);
        WebElement city = driver.findElement(By.id("city"));
        city.sendKeys("pune");
        Thread.sleep(500);
        WebElement saveBtn = driver.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/div/div/div/form/div[2]/button"));
        saveBtn.click();
        Thread.sleep(2000);

        WebElement paymentMethod = driver.findElement(By.xpath("//*[@id=\"sform\"]/div/div[2]/div[2]/div/div[1]/ul/li[5]/div/label[2]/span[1]"));
        paymentMethod.click();
        Thread.sleep(2000);

        WebElement captchaImg = driver.findElement(By.cssSelector("#image_captcha > img"));
        File src = captchaImg.getScreenshotAs(OutputType.FILE);
        String path = "C:\\Users\\chetan bhagat\\IdeaProjects\\Automate_Karzanddolls_Site\\src\\CaptchaScreenshot\\captcha.png";
        FileHandler.copy(src, new File(path));
        Thread.sleep(2000);
        Tesseract image = new Tesseract();
        image.setDatapath("C:\\Program Files\\Tesseract-OCR\\tessdata");
        String str = image.doOCR(new File(path));
        System.out.println("image OCR done");
        System.out.println(str);

        WebElement placeOrderButton = driver.findElement(By.xpath("//*[@id=\"sform\"]/div/div[2]/div[2]/div/div[4]/button"));
        placeOrderButton.click();
        Thread.sleep(2000);
    }
}
