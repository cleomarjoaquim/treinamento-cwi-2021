package tests;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageObjects.*;
import utils.Browser;
import utils.Utils;

import static org.junit.Assert.*;

public class SetupTests extends BaseTests {
    @Test

    public void testCreateAccount() {

        HomePage home = new HomePage();
        LoginPage login = new LoginPage();
        home.clickBtnLogin();
        System.out.println("Clicou em Login e direcionou para a página de login");
        assertTrue(Browser.getCurrentDriver().getCurrentUrl().contains(Utils.getBaseUrl().
                concat("index.php?controller=authentication&back=my-account")));
        login.newEmail_create();
        login.clickSubmitCreate();
        System.out.println("preencheu o email e clicou em create account");

        CreateAccountPage create = new CreateAccountPage();
        create.isCreateAccountPage();

        create.fillCustomer_firstname();
        create.FillCustomer_lastname();
        create.FillEmail();
        create.FillPasswd();        create.FillAddress1();
        create.FillCity();
        create.FillIDState();
        create.FillPostcode();
        create.FillId_country();
        create.FillPhone_mobile();
        create.FillAlias();
        System.out.println("Preencheu os campos de cadastro pessoal");
        create.ClickSubmitAccount();
        System.out.println("Clicou eu REGISTER e criou a conta");


    }

    @Test
    public void testLogin() {
        HomePage home = new HomePage();
        LoginPage login = new LoginPage();
        home.clickBtnLogin();


        login.fillEmail();
        System.out.println("Preencheu o email");
        login.fillPasswd();
        System.out.println("Preencheu a senha");
        login.clickBtnSubmitLogin();
    }

    @Test
            public void testSearch() {
        testLogin();
        SearchPage search = new SearchPage();
        ProductPage product = new ProductPage();
        CartPage cart = new CartPage();
        HomePage home = new HomePage();

        //fazer a pesquisa
        home.doSearch("T-Shirt");
        System.out.println("fez a pesquisa");
    }


    @Test
            public void testBuy(){

        testSearch();

        LoginPage login = new LoginPage();
        SearchPage search = new SearchPage();
        ProductPage product = new ProductPage();
        CartPage cart = new CartPage();
        HomePage home = new HomePage();

        search.clickProductAddToPage();
        product.goTOProductPage();
        product.clickButtonAddToCard();
        product.clickButtonProceedToCheckoutModal();
        cart.clickButProceedToCheckout();
        cart.clickProceedToCheckoutAddress();
        cart.clickBoxChecker();
        cart.clickProceedToCheckoutShipping();
        cart.clickPayBankWire();
        cart.clickConfirmPayment();
        
        }




}
