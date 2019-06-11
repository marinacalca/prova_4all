package shopcart;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import util.CapturasTela;

public class PaginaCarrinho {
	
	@FindBy(id = "add-product-4-qtd")
    private WebElement botaoAumentarQtdBrigadeiro;
	
	@FindBy(id = "add-product-3-qtd")
    private WebElement botaoAumentarQtdRissoleMedio;
	
	@FindBy(id = "remove-product-3-qtd")
    private WebElement botaoDiminuirQtdRissoleMedio;
    
    @FindBy(id = "finish-checkout-button")
    private WebElement botaoFinalizarCompra;
    
    @FindBy(xpath = "//*[@id=\"root\"]/div[3]/div/div/div/button")
    private WebElement botaoConcluir;
    
    @FindBy(id = "subtotal-price")
    private WebElement subTotal;
    
    private int i;
    
    
    private WebDriver driver;

    public PaginaCarrinho(WebDriver driver) {
        this.driver = driver;
        driver.get("https://shopcart-challenge.4all.com/checkout");
        PageFactory.initElements(driver, this);
    }
    
    public PaginaCarrinho aumentarQtdBrigadeiro() {
    	
    	for(i=0; i<3; i++) {
    		botaoAumentarQtdBrigadeiro.click();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    	}

        return this;
    }
    
    public PaginaCarrinho aumentarQtdRissoleMedio() {
    	
    	for(i=0; i<8; i++) {
    		botaoAumentarQtdRissoleMedio.click();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    	}
        
        return this;
    }
    
    public PaginaCarrinho diminuirQtdRissoleMedio() {
    	
    	for(i=0; i<4; i++) {
    		botaoDiminuirQtdRissoleMedio.click();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    	}
       
        return this;
    }
    
    public PaginaCarrinho finalizarCompra() {
        botaoFinalizarCompra.click();
        return this;
    }
    
    public boolean verificarMensagemSucessoRealizacaoPedido() {
        return driver.getPageSource().contains("Pedido realizado com sucesso!");
    }
    
    public boolean verificarValorPedido() { //*[@id="subtotal-price"]
        return driver.getPageSource().contains("27,50");
    }
    
    public PaginaCarrinho concluir() {
    	botaoConcluir.click();
    	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    	return this;
    }

}
