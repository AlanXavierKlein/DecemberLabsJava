package lab.project.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class GetInTouchPage {

    String formularioEnviado = "//span[contains(text(),'Thanks for reaching out!')]";
    String botonEnviar = "//form[@class='form']//input[@type='submit']";
    String nameIncompleto = "//div[contains(@class, 'warning')]//input[@id='name']";
    String emailIncompleto = "//div[contains(@class, 'warning')]//input[@id='email']";
    String messageIncompleto = "//div[contains(@class, 'warning')]//textarea[@id='message']";
    WebDriver driver;

    public GetInTouchPage(WebDriver driver){
        this.driver = driver;
    }

    public void completarCampos(String name, String eMail, String mensaje){
        driver.findElement(By.id("name")).sendKeys(name);
        driver.findElement(By.id("email")).sendKeys(eMail);
        driver.findElement(By.id("message")).sendKeys(mensaje);
    }
    public void enviarFormulario() throws InterruptedException {
        driver.findElement(By.xpath(botonEnviar)).click();
        Thread.sleep(2000);
    }

    public Boolean validarFormularioEnviado(){
        try {
            return driver.findElement(By.xpath(formularioEnviado)).isDisplayed();
        }catch (org.openqa.selenium.NoSuchElementException e){
            return false;
        }
    }

    public Boolean isDisplayed(By locator){
        try {
            driver.findElement(locator);
            return true;
        }catch (org.openqa.selenium.NoSuchElementException e){
            return false;
        }
    }
    public Boolean nameMensajeError(){
        return isDisplayed(By.xpath(nameIncompleto));
    }
    public Boolean emailMensajeError(){
        return isDisplayed(By.xpath(emailIncompleto));
    }

    public Boolean messageMensajeError(){
        return isDisplayed(By.xpath(messageIncompleto));
    }


}
