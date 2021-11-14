package lab.project.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

    String getInTouchText = "//a[contains(text(),'Get in touch')]";
    WebDriver driver;
    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getBotonGetInTouch(){
        return driver.findElement(By.xpath(getInTouchText));
    }

    public void getGetInTouch(){

    };
}
