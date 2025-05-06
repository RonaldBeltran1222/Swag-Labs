package org.store.automation.pages.Carrito;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.store.automation.utils.Constans.Constans;
import org.store.automation.utils.Localizadores;

public class ComprarProductos {
    private WebDriver driver;

    private By firstNameField = By.xpath(Localizadores.FIRST_NAME);
    private By lastNameField = By.xpath(Localizadores.LAST_NAME);
    private By postalCodeField = By.xpath(Localizadores.POSTAL_CODE);
    private By continueButton = By.xpath(Localizadores.CONTINUE_BUTTON);
    private By finishButton = By.xpath(Localizadores.FINISH_BUTTON);
    private By backHomeButton = By.xpath(Localizadores.BACK_HOME_BUTTON);
    private By checkoutCompleteMessage = By.xpath(Localizadores.CHECKOUT_COMPLETE);
    private By checkoutCompleteHeader = By.xpath(Localizadores.CHECKOUT_COMPLETE);

    public ComprarProductos(WebDriver driver){
        this.driver = driver;
    }

    public void ingresarDatos() {
        driver.findElement(firstNameField).sendKeys(Constans.FIRST_NAME);
        driver.findElement(lastNameField).sendKeys(Constans.LAST_NAME);
        driver.findElement(postalCodeField).sendKeys(Constans.POSTAL_CODE);
    }

    public void continuarCompra() {
        driver.findElement(continueButton).click();
    }

    public void finalizarCompra() {
        driver.findElement(finishButton).click();
    }

    //Validaciones
    public boolean isCheckoutCompleteMessageVisible() {
        return driver.findElement(checkoutCompleteMessage).isDisplayed();
    }


}
