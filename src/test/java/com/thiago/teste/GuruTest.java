package com.thiago.teste;

import com.thiago.page.PageGuruDeleteCustomer;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.thiago.core.InvokedMethodListener;
import com.thiago.page.PageGuruHome;
 
@Listeners(InvokedMethodListener.class)
public class GuruTest{
 
    @Test
    public void loginSucesso() throws Exception {
    	new PageGuruHome()
    	.openPage(PageGuruHome.class, "http://demo.guru99.com/test/login.html")
    	.acessarLoginGuru("thiagoovcf@gmail.com", "123")
    	.validarAcessoOK();
    }

	@Test
    public void deleteCustomerSucesso() throws Exception {
    	new PageGuruDeleteCustomer()
    	.openPage(PageGuruDeleteCustomer.class, "https://demo.guru99.com/test/delete_customer.php")
    	.enviarIdSubmit("1")
    	.validarSucessoOK();
    }


}