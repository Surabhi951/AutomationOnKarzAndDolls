package test;

import bridgelabz.baseclass.BaseClass;
import bridgelabz.pages.KarzAndDollsPage;
import bridgelabz.pages.LoginOnKarzAndDolls;
import bridgelabz.pages.RegistrationOnKarzAndDolls;
import net.sourceforge.tess4j.TesseractException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.awt.*;
import java.io.IOException;

public class KarzAndDollsTest extends BaseClass {

    RegistrationOnKarzAndDolls registration;
    LoginOnKarzAndDolls login;
    KarzAndDollsPage karzanddollsPage;

    @BeforeMethod
    public void initialization() {
        setUp();
        registration = new RegistrationOnKarzAndDolls(driver);
        login = new LoginOnKarzAndDolls(driver);
        karzanddollsPage = new KarzAndDollsPage(driver);
    }

    @Test(priority = 1)
    public void insertDataIntoRegistrationPage() throws InterruptedException, AWTException {
        registration.registrationIntoKarzAndDollsSite();
    }

    @Test
    public void checkAddedProductIntoCart() throws InterruptedException, AWTException {
        login.loginIntoKarzAndDolls();
        karzanddollsPage.addProductToCart();
    }

    @Test(priority = 2)
    public void automateKarzAndDolls() throws InterruptedException, AWTException, TesseractException, IOException {
        login.loginIntoKarzAndDolls();
        karzanddollsPage.placeOrder();
    }

    @AfterMethod
    public void tearDown() {
        closeBrowser();
    }
}

