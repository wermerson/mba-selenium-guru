package com.thiago.page;

import com.thiago.core.CorePage;
import com.thiago.core.util.Utils;
import com.thiago.driver.TLDriverFactory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class PageGuruDeleteCustomer  extends CorePage<PageGuruDeleteCustomer> {
    public PageGuruDeleteCustomer(){
        this.driver = TLDriverFactory.getDriver();
        PageFactory.initElements(this.driver, this);
    }

    @FindBy(xpath = "/html/body/form/table/tbody/tr[2]/td[2]/input")
    private WebElement inputId;

    // tinha pego o xpath do reset, osso
    @FindBy(xpath = "/html/body/form/table/tbody/tr[3]/td[2]/input[1]")
    private WebElement btnSubmit;

    public PageGuruDeleteCustomerSuccess enviarIdSubmit(String id){
        preencherCampo(inputId, id);
        click(btnSubmit);
        aguardarAlertVisivel();
        acceptAlert();
        return new PageGuruDeleteCustomerSuccess();
    }
}