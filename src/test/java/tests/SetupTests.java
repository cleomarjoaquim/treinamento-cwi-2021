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

        









        }





    @Test
    public void testOpeningBrowserAndLoadingPage(){
        assertTrue(Browser.getCurrentDriver().getCurrentUrl().contains(Utils.getBaseUrl()));
        System.out.println("Conseguimos abrir a pagina na web");
    }
    @Test
    public void testLogin(){

        HomePage home = new HomePage();
        LoginPage login = new LoginPage();
        home.clickBtnLogin();
        System.out.println("Clicou em Login e direcionou para a pégina de login");
        assertTrue(Browser.getCurrentDriver().getCurrentUrl().contains(Utils.getBaseUrl().
                concat("index.php?controller=authentication&back=my-account")));


        login.fillEmail();
        System.out.println("Preencheu o email");
        login.fillPasswd();
        System.out.println("preencheu a senha");
        login.clickBtnSubmitLogin();
        System.out.println("Clicou em Sign IN");
        assertTrue(Browser.getCurrentDriver().getCurrentUrl().
                contains(Utils.getBaseUrl().concat("index.php?controller=my-account")));
        System.out.println("Validou a url de minha conta");

        assertTrue(Browser.getCurrentDriver().findElement(By.className("page-heading")).getText().
                contains("MY ACCOUNT"));
        System.out.println("Validou minha conta no site");


        // Browser.getCurrentDriver().findElement(By.className("login")).click();
        // System.out.println("Click Login");
        assertTrue(Browser.getCurrentDriver().getCurrentUrl().contains(Utils.getBaseUrl().concat("index.php?controller=authentication&back=my-account")));
        Browser.getCurrentDriver().findElement(By.id("email")).sendKeys("rrsetcwi+autopractice@gmail.com");
        System.out.println("preencheu o email");
        Browser.getCurrentDriver().findElement(By.id("passwd")).sendKeys("teste123");

        Browser.getCurrentDriver().findElement(By.id("SubmitLogin")).click();
        System.out.println("Clicou em Sign IN");
        assertTrue(Browser.getCurrentDriver().getCurrentUrl().contains(Utils.getBaseUrl().concat("index.php?controller=my-account")));
        System.out.println("Validou a url de minha conta");
        assertTrue(Browser.getCurrentDriver().findElement(By.className("page-heading")).getText().contains("MY ACCOUNT"));
        System.out.println("Validou minha conta no site");


    }
















    @Test
    public void testSearch(){
        String quest = "DRESS";
        String questResultQtd= "7";


        //iniciar páginas
        HomePage home = new HomePage();
        SearchPage search= new SearchPage();

        //fazer a pesquisa
        home.doSearch("DRESS");

        // validar pesquisa
        assertTrue(search.isSearchPage());
        assertEquals(search.getTextLighter().replace("\"",""), quest);
        assertThat(search.getTextHeading_counter(), CoreMatchers.containsString(questResultQtd));
    }



}
//assertThat(search.getTextHeading_counter(), CoreMatchers.containsString(questResultQtd));