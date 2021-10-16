package pageObjects;

import elementMapper.CreateAccountElementMapper;
import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.Browser;
import utils.Utils;


public class CreateAccountPage extends CreateAccountElementMapper {
    public CreateAccountPage() { {
        PageFactory.initElements(Browser.getCurrentDriver(),this);
    }

    }

    public void isCreateAccountPage() {
        WebDriverWait wait = new WebDriverWait(Browser.getCurrentDriver(), 10);
        wait.until(ExpectedConditions.urlContains("#account-creation"));
        Assert.assertEquals(Utils.getBaseUrl().concat("index.php?controller=authentication&back=my-account#account-creation"),
                Browser.getCurrentDriver().getCurrentUrl());
    }

    public void fillCustomer_firstname(){
        customer_firstname.sendKeys("cleomar");
    }
    public void  FillCustomer_lastname(){
        customer_lastname.sendKeys("Joaquim");
    }
    public void FillEmail(){

    }
    public void FillPasswd(){
        passwd.sendKeys("mechamaCWI");
    }
    public void FillFirstname(){
        firstname.sendKeys("Cleomar");

    }
    public void FillLastname(){
        lastname.sendKeys("Joaquim");
    }
    public void FillAddress1(){
        address1.sendKeys("Rua perto daqui, 582 AP 304");
    }
    public void FillCity(){
        city.sendKeys("Parobé");
    }
    public void FillIDState(){
        id_state.sendKeys("RS");
    }
    public void FillPostcode(){
        postcode.sendKeys("95630");
    }
    public void FillId_country(){
        id_country.sendKeys("Brasil");
    }
    public void FillPhone_mobile(){
        phone_mobile.sendKeys("999999999");
    }
    public void FillAlias(){
        alias.sendKeys("");
    }
    public void ClickSubmitAccount(){
        submitAccount.click();
    }




}
