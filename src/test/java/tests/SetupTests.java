package tests;

import org.junit.Test;
import org.openqa.selenium.By;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import utils.Browser;
import utils.Utils;
import static org.junit.Assert.assertTrue;

public class SetupTests extends BaseTests {
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



}
