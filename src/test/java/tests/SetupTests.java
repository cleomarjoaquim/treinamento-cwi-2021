package tests;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import pageObjects.*;
import utils.Browser;
import utils.Utils;

import static org.junit.Assert.*;

public class SetupTests extends BaseTests {
    @Test

    public void testCreateAccount(){

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
        create.FillPasswd();
        //create.FillFirstname();
        //create.FillLastname();
        create.FillAddress1();
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
}
