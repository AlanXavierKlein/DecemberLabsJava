package lab.project.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GetInTouchTest {

    private WebDriver driver;
    String name = "Test";
    String eMail ="test@decemberlabs.com";
    String mensaje = "New Mensaje Test";

    @BeforeMethod
    public void setup(){
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        driver = new ChromeDriver(options);
        driver.get("https://decemberlabs.com/");
    }

    @Test
    public void envioFormularioCorrecto() throws InterruptedException {

        HomePage homePage = new HomePage(driver);
        homePage.getBotonGetInTouch().click();

        GetInTouchPage getInTouchPage = new GetInTouchPage(driver);
        getInTouchPage.completarCampos(name,eMail,mensaje);
        getInTouchPage.enviarFormulario();

        Assert.assertTrue(getInTouchPage.validarFormularioEnviado(),"No se logro enviar el formulario");

        Thread.sleep(5000);
        driver.close();
    }

    @Test
    public void envioFormularioVacio() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        homePage.getBotonGetInTouch().click();
        GetInTouchPage getInTouchPage = new GetInTouchPage(driver);
        getInTouchPage.enviarFormulario();
        Thread.sleep(2000);

        Assert.assertTrue(getInTouchPage.nameMensajeError(),"No emite error de campo 'Name' vacio");
        Assert.assertTrue(getInTouchPage.emailMensajeError(),"No emite error de campo 'E-mail' vacio");
        Assert.assertTrue(getInTouchPage.messageMensajeError(),"No emite error de campo 'Message' vacio");

        Thread.sleep(5000);
        driver.close();
    }
}
