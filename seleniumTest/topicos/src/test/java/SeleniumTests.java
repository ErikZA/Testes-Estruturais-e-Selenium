/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 *
 * @author Danillo Lima <danillo@alunos.utfpr.edu.br>
 */
public class SeleniumTests {
    WebDriver firefoxDriver;
    @Before
    public void config(){
        System.setProperty("webdriver.firefox.driver", "D://geckodriver.exe");
        firefoxDriver = new FirefoxDriver();
    }
    
    @Test
    public void calculo1() throws Exception {
        firefoxDriver.get("http://127.0.0.1:8080/topicos");


        WebElement inputExp = firefoxDriver.findElement(By.className("expressao"));
       
        inputExp.sendKeys("2*2");
        WebElement inputSubmit = firefoxDriver.findElement(By.cssSelector("input[type=submit]"));
       inputSubmit.click();
        
        WebElement result = firefoxDriver.findElement(By.id("resultado"));
        
        assertEquals("4", result.getText().trim());
        

        //firefoxDriver.quit();
    }
    @Test
    public void calculo2() throws Exception {
        firefoxDriver.get("http://127.0.0.1:8080/topicos");


        WebElement inputExp = firefoxDriver.findElement(By.className("expressao"));
       
        inputExp.sendKeys("2*6");
        WebElement inputSubmit = firefoxDriver.findElement(By.cssSelector("input[type=submit]"));
        inputSubmit.click();
        
        WebElement result = firefoxDriver.findElement(By.id("resultado"));
        
        assertEquals("12", result.getText().trim());
        

        //firefoxDriver.quit();
    }
    
    
}
