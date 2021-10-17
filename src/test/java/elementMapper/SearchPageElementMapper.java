package elementMapper;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchPageElementMapper {


    @FindBy(className = "navigation_page")
    public WebElement navigation_page;

    @FindBy(className = "lighter")
    public WebElement  lighter;

    @FindBy(className = "heading_counter")
    public WebElement heading_counter;

    @FindBy(css = ".product-container")
    public WebElement product;

    @FindBy(css = ".button[title=View]")
    public WebElement buttonMoreAddProductPage;

    }


