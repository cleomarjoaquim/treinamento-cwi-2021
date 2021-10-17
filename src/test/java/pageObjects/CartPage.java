package pageObjects;

import elementMapper.CartPageElementeMapper;
import org.openqa.selenium.support.PageFactory;
import utils.Browser;

public class CartPage extends CartPageElementeMapper {
    public CartPage(){
        PageFactory.initElements(Browser.getCurrentDriver(),this);
    }
    public String getNameProductCard(){
        return productNameCart.getText();
    }

    public void clickButProceedToCheckout(){
        butProceedToCheckout.click();

    }
    public void clickProceedToCheckoutAddress(){
        proceedToCheckoutAddress.click();
    }
    public void clickBoxChecker(){
        boxChecker.click();
    }

    public void clickProceedToCheckoutShipping(){
        proceedToCheckoutShipping.click();
    }
    public void clickPayBankWire(){
        payBankWire.click();
    }

    public void clickConfirmPayment(){
        confirmPayment.click();
    }


}
