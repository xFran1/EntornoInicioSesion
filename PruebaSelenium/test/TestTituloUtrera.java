/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import pruebaselenium.PruebaSelenium;


/**
 *
 * @author Fran
 */
public class TestTituloUtrera {
    
    public TestTituloUtrera() {
    }
    
    private WebDriver navegador;
    
     @BeforeClass
    public static void setUpClass() {
              System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");    

    }
    
    
    
    
    @Before
    public void setUp() {
        
        navegador = new ChromeDriver();
   
        navegador.manage().timeouts().implicitlyWait(1,TimeUnit.SECONDS);
        
        navegador.manage().window().maximize();


    }

 @After
    public void tearDown() {
       
        navegador.quit();

    
    }
    
    @Test
    public void testUtreraWiki(){
        
      
        
        navegador.get("https://es.wikipedia.org");
        
        
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            Logger.getLogger(PruebaSelenium.class.getName()).log(Level.SEVERE, null, ex);
        }
        WebElement searchBox = navegador.findElement(By.className("cdx-text-input__input"));
        searchBox.sendKeys("Utrera");
       
        WebElement buscar = navegador.findElement(By.xpath("/html/body/div[1]/header/div[2]/div/div/div/form/div/button"));
                buscar.click();
        String encabezado = navegador.findElement(By.id("firstHeading")).getText();
        System.out.println("Primer encabezado: "+encabezado);
        
        
    
              
          try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            Logger.getLogger(PruebaSelenium.class.getName()).log(Level.SEVERE, null, ex);
        }
          
        
        System.out.println( navegador.getTitle());
        
        String rExp="Utrera";
        
        assertEquals(rExp, navegador.findElement(By.id("firstHeading")).getText());
        
    }
}
