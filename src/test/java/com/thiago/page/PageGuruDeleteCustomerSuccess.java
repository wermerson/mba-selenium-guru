package com.thiago.page;

import com.thiago.core.CorePage;
import com.thiago.core.util.Utils;
import com.thiago.driver.TLDriverFactory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class PageGuruDeleteCustomerSuccess extends CorePage<PageGuruDeleteCustomerSuccess> {
    public PageGuruDeleteCustomerSuccess(){
        this.driver = TLDriverFactory.getDriver();
        PageFactory.initElements(this.driver, this);
    }

    public void validarSucessoOK() {
        aguardarAlertVisivel();
        Assert.assertEquals(getAlert(), "Customer Successfully Delete!");
        acceptAlert();
        //Utils.takeScreenshot("DeleteSucesso", "002");
    }
}
