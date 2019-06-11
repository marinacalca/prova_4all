package desafio1;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.WebDriver;

import shopcart.PaginaCarrinho;
import shopcart.PaginaInicial;
import util.CapturasTela;
import util.JUnitTestReporter;
import util.WebDriverFactory;

public class Desafio1Test extends JUnitTestReporter{
	// "org.openqa.selenium.edge.EdgeDriver"
	// "org.openqa.selenium.chrome.ChromeDriver"
	// "org.openqa.selenium.firefox.FirefoxDriver"
	WebDriver driver = WebDriverFactory.getWebDriver("org.openqa.selenium.firefox.FirefoxDriver");
	
	@Test
	public void casoTesteDesafio1()  {
	   PaginaInicial paginaInicial = new PaginaInicial(driver);
	   CapturasTela.getCaptura(driver, "desafio_1");
	   driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	   paginaInicial.adicionarTodosDoces();
	   CapturasTela.getCaptura(driver, "desafio_1");
	   driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	   paginaInicial.selecionarCategoriaTodos();
	   CapturasTela.getCaptura(driver, "desafio_1");
	   driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	   PaginaCarrinho paginaCarrinho = paginaInicial.acessarCarrinho();
	   CapturasTela.getCaptura(driver, "desafio_1");
	   driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	   paginaCarrinho.aumentarQtdBrigadeiro();
	   CapturasTela.getCaptura(driver, "desafio_1");
	   driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	   paginaCarrinho.finalizarCompra();
	   CapturasTela.getCaptura(driver, "desafio_1");
	   driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	   assert(paginaCarrinho.verificarMensagemSucessoRealizacaoPedido());
	   CapturasTela.getCaptura(driver, "desafio_1");
	   driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	   paginaCarrinho.concluir();
	   CapturasTela.getCaptura(driver, "desafio_1");
	   driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	   driver.close();
	}
}
