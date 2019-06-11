package util;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class CapturasTela {        
  
    private static final String CAPTURAS_PATH = "C:\\Users\\mari_\\eclipse-workspace-4-all\\prova_4all\\img\\";
    
    public static void getCaptura(WebDriver driver, String nomeCasoTeste) {
      try {
    	File f = new File(CAPTURAS_PATH + nomeCasoTeste);
       	if(!f.exists()) {
    	   f.mkdir();
       	}   
       	Date data = new Date();
       	SimpleDateFormat mascaraData = new SimpleDateFormat("dd_MM_yy_HH_mm_ss_a");
       	String timestamp = mascaraData.format(data);
       	String nomeCaptura = CAPTURAS_PATH + nomeCasoTeste + "\\" + timestamp + ".png";

       	TakesScreenshot captura = ((TakesScreenshot) driver);
       	File arquivoOrigem = captura.getScreenshotAs(OutputType.FILE);
       	File arquivoDestino = new File(nomeCaptura);
       	FileUtils.copyFile(arquivoOrigem, arquivoDestino);
      }
      catch(Exception e) {
        e.getMessage();
      }
   }
}