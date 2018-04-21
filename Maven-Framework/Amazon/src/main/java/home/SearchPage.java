package home;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.LinkedList;
import java.util.List;

public class SearchPage {

    @FindBy(id = "twotabsearchtextbox")
    public WebElement searchInputField;

    public WebElement getSearchInputField(){
        return searchInputField;
    }

    public void setSearchInputField(WebElement searchInputField){
        this.searchInputField = searchInputField;

    }

    public void searchItems() {
        List<String> itemList = getItemValue();
        for (String it : itemList) {

            getSearchInputField().sendKeys(it, Keys.ENTER);
            getSearchInputField().clear();
        }
    }
    public List<String> getItemValue(){
        List<String> itemList = new LinkedList<String>();
        itemList.add("Java Book");
        itemList.add("Selenium Book");
        itemList.add("MacBook Pro");
        itemList.add("Apple Watch");
        return itemList;
    }
}
