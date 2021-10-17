package pageObjects;

import elementMapper.ProductElementPagerMapper;
import org.openqa.selenium.support.PageFactory;
import utils.Browser;

public class ProductPage extends ProductElementPagerMapper {

    public ProductPage(){
        PageFactory.initElements(Browser.getCurrentDriver(), this);
    }

    public String getProductNamePDP(){
        return productNamePDP.getText();
    }
    public void goTOProductPage(){
        productNamePDP.click();
    }
    public void clickButtonAddToCard(){
        buttonAddToCard.click();
    }
    public void clickButtonProceedToCheckoutModal(){
        buttonProceedToCheckoutModal.click();
    }

}
