package elementMapper;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateAccountElementMapper {
    @FindBy (id="customer_firstname")
    public WebElement customer_firstname;

    @FindBy (id="customer_lastname" )
    public WebElement customer_lastname;

    @FindBy (id="email")
    public WebElement email;

    @FindBy (id="passwd")
    public  WebElement passwd;

    @FindBy (id = "firstname")
    public WebElement firstname;

    @FindBy (id = "lastname")
    public WebElement lastname;

    @FindBy (id = "address1")
    public WebElement address1;

    @FindBy (id = "city")
    public WebElement city;

    @FindBy (id = "id_state")
    public  WebElement id_state;

    @FindBy (id = "postcode")
    public WebElement postcode;

    @FindBy(id = "id_country")
    public WebElement id_country;

    @FindBy (id = "phone_mobile")
    public WebElement phone_mobile;

    @FindBy (id = "alias")
    public WebElement alias;

    @FindBy (id = "submitAccount")
    public WebElement submitAccount;


}
