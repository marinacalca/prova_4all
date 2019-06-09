package util;

import org.openqa.selenium.WebDriver;

public class WebDriverFactory {
	
	private static final String CHROME_DRIVER_PATH = "C:\\Users\\mari_\\eclipse-workspace-4-all\\prova_4all\\src\\test\\resources\\webdrivers\\chromedriver.exe";
	private static final String GECKO_DRIVER_PATH = "C:\\Users\\mari_\\eclipse-workspace-4-all\\prova_4all\\src\\test\\resources\\webdrivers\\geckodriver.exe";	
	private static final String EDGE_DRIVER_PATH = "C:\\Users\\mari_\\eclipse-workspace-4-all\\prova_4all\\src\\test\\resources\\webdrivers\\edgedriver.exe";	
	
	public static WebDriver getWebDriver(String nome) {
		WebDriver driver = null;
		
		System.setProperty("webdriver.chrome.driver", CHROME_DRIVER_PATH);
		System.setProperty("webdriver.gecko.driver", GECKO_DRIVER_PATH);
		System.setProperty("webdriver.edge.driver", EDGE_DRIVER_PATH);
		
		try {
			Class<?> classe = Class.forName(nome);
			driver = (WebDriver) classe.newInstance();
		}
		catch (ClassNotFoundException e) {
			System.out.println("Webdriver não encontrado: " + e.toString());
		}
		catch (InstantiationException e) {
			System.out.println("Problema ao instanciar webdriver: " + e.toString());
		} 
		catch (IllegalAccessException e) {
			System.out.println("Acesso não permitido ao webdriver: " + e.toString());
		}
		return driver;
	}
}
