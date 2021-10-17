package pageObjects;

import elementMapper.LoginPageElementMapper;
import org.openqa.selenium.support.PageFactory;
import utils.Browser;

public class LoginPage extends LoginPageElementMapper {
    public LoginPage(){
        PageFactory.initElements(Browser.getCurrentDriver(),this);
    }



    public void fillEmail(){
        email.sendKeys("cleoj@gmail.com");

    }
    public void fillPasswd(){
       passwd.sendKeys("mechamaCWI");

    }
    public void clickBtnSubmitLogin(){
        SubmitLogin.click();

    }

    public void newEmail_create(){
        email_create.sendKeys("cleouj@gmail.com");
    }
    public void clickSubmitCreate(){
        SubmitCreate.click();
    }


}
