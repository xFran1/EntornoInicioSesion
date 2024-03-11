/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pruebaselenium;

import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 *
 * @author Fran
 */
public class PruebaSelenium {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {

        
    
        
        
        
        System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");    
        
        WebDriver navegador = new ChromeDriver();
   
       navegador.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
        //navegador.manage().window().fullscreen();
        navegador.manage().window().maximize();
        
      //  navegador.get("https://es.wikipedia.org");
        navegador.get("https://ciclos.iesruizgijon.es/");
            WebElement searchBox = navegador.findElement(By.xpath("/html/body/nav/div/div/div/ul/li[2]/div/span/a"));
            searchBox.click();
            
            WebElement usuario = navegador.findElement(By.xpath("/html/body/div[1]/div[3]/div/div/section/div[1]/div[2]/div/div[3]/div[1]/form/div[1]/div/input"));
            usuario.sendKeys("franrubio1");
            
            WebElement contra = navegador.findElement(By.xpath("/html/body/div[1]/div[3]/div/div/section/div[1]/div[2]/div/div[3]/div[1]/form/div[2]/div/input"));
            contra.sendKeys("");
            
            WebElement enter = navegador.findElement(By.xpath("/html/body/div[1]/div[3]/div/div/section/div[1]/div[2]/div/div[3]/div[1]/form/button"));
            enter.click();

            Thread.sleep(5000);

        
      
    //    WebElement searchBox = navegador.findElement(By.className("cdx-text-input__input"));
//        searchBox.click();
       // searchBox.sendKeys("Utrera");
       
        //WebElement buscar = navegador.findElement(By.xpath("/html/body/div[1]/header/div[2]/div/div/div/form/div/button"));
           //     buscar.click();
        //String encabezado = navegador.findElement(By.id("firstHeading")).getText();
        //System.out.println("Primer encabezado: "+encabezado);
        
        
      //  navegador.findElement(By.xpath("/html/body/div[1]/header/div[1]/nav/div/input")).click();
       //     navegador.findElement(By.cssSelector("#vector-main-menu-dropdown-checkbox")).click();
      //  navegador.findElement(By.id("vector-main-menu-dropdown-checkbox")).click();
         //     WebElement enlaceAl = navegador.findElement(By.linkText("Página aleatoria"));
            //  enlaceAl.click();
              
       
          
        
        System.out.println( navegador.getTitle());
    navegador.quit();
    }
}
