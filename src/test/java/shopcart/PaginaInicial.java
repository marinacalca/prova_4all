package shopcart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaginaInicial {
	
	@FindBy(id = "open-categories-btn")
    private WebElement botaoAbrirCategorias;
	
	@FindBy(id= "category-1")
    private WebElement categoriaDoces;
	
	@FindBy(id= "category-2")
    private WebElement categoriaSalgados;
	
	@FindBy(id= "category-0")
    private WebElement categoriaBebidas;

    @FindBy(id = "category-all")
    private WebElement categoriaTodos;
    
    @FindBy(id = "add-product-4-btn")
    private WebElement botaoAdicionarBrigadeiro;

    @FindBy(id = "add-product-5-btn")
    private WebElement botaoAdicionarAlfajorChocolate;
    
    @FindBy(id = "add-product-3-btn")
    private WebElement botaoAdicionarRissoleMedio;
    
    @FindBy(id = "add-product-1-btn")
    private WebElement botaoAdicionarFanta;
    
    @FindBy(id = "add-product-0-btn")
    private WebElement botaoAdicionarCoca;
    
    @FindBy(id = "add-product-2-btn")
    private WebElement botaoAdicionarAgua;
    
    @FindBy(id = "cart-btn")
    private WebElement botaoCarrinho;  
    
    private WebDriver driver;

    public PaginaInicial(WebDriver driver) {
        this.driver = driver;
        driver.get("https://shopcart-challenge.4all.com/");
        PageFactory.initElements(driver, this);
    }

    public PaginaInicial adicionarTodosDoces() {
        botaoAbrirCategorias.click();
        categoriaDoces.click();
        botaoAdicionarBrigadeiro.click();
        botaoAdicionarAlfajorChocolate.click();
        return this;
    }

    public PaginaInicial selecionarCategoriaTodos() {
        botaoAbrirCategorias.click();
        categoriaTodos.click();
        return this;
    }
    
    public PaginaInicial adicionarRissoleMedio() {
    	botaoAdicionarRissoleMedio.click();
    	return this;
    }
    
    public PaginaInicial adicionarTodasBebidas() {
    	botaoAbrirCategorias.click();
    	categoriaBebidas.click();
    	botaoAdicionarAgua.click();
    	botaoAdicionarCoca.click();
    	botaoAdicionarFanta.click();
    	return this;
    }
    
    public PaginaCarrinho acessarCarrinho() {
    	botaoCarrinho.click();
    	PaginaCarrinho paginacarrinho = new PaginaCarrinho(driver);
    	return paginacarrinho;
    }

}
