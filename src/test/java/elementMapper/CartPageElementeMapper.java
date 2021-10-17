package elementMapper;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPageElementeMapper {

    @FindBy(css = ".cart_description .product-name")
    public WebElement productNameCart;

    @FindBy(css = "#center_column a[title='Proceed to checkout']")
    public WebElement butProceedToCheckout;

    @FindBy(xpath = "/html/body/div/div[2]/div/div[3]/div/form/p/button/span")
    public WebElement proceedToCheckoutAddress;

    @FindBy(className = "checker")
    public WebElement boxChecker;

    @FindBy(xpath = "/html/body/div/div[2]/div/div[3]/div/div/form/p/button/span")
    public WebElement proceedToCheckoutShipping;

    @FindBy(xpath = "/html/body/div/div[2]/div/div[3]/div/div/div[3]/div[1]/div/p/a")
    public WebElement payBankWire;

    @FindBy(xpath = "/html/body/div/div[2]/div/div[3]/div/form/p/button/span")
    public WebElement confirmPayment;


}
