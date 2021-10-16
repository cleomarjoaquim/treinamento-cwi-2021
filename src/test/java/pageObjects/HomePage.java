package pageObjects;

import elementMapper.HomePageElementMapper;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import utils.Browser;

public class HomePage extends HomePageElementMapper {

    public HomePage  (){
        PageFactory.initElements(Browser.getCurrentDriver(), this);

    }

    public void clickBtnLogin(){
        login.click();
    }

    public void clickCategoryTShirts(){

    }









    public void clickSearch_query_top(){
        search_query_top.click();
    }
    public void sendKeyssearch_query_top(String keys){
        search_query_top.sendKeys(keys);
    }
    public void clickSubmit_search(){
        submit_search.click();
    }
    public void doSearch(String quest){
        clickSearch_query_top();
        sendKeyssearch_query_top(quest);
        clickSubmit_search();


    }

}
