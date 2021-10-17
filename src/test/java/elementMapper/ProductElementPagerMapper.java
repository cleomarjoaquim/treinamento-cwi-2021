package elementMapper;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductElementPagerMapper {
    @FindBy (css = "h1[itemprop=name]")
    public WebElement productNamePDP;
    @FindBy(css = "#add_to_cart > button")
    public WebElement buttonAddToCard;
    @FindBy(css = ".button-container a[title='Proceed to checkout']")
    public  WebElement buttonProceedToCheckoutModal;

}
