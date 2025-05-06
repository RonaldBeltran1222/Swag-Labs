package org.store.automation.pages.Carrito;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.store.automation.utils.Localizadores;

public class AgregarProductos {
    private WebDriver driver;

    private By addToCartButton = By.xpath(Localizadores.ADD_TO_CART_BUTTON);
    private By cartIcon = By.xpath(Localizadores.CART_ICON);
    private By checkoutButton = By.xpath(Localizadores.CHECKOUT_BUTTON);

    public AgregarProductos(WebDriver driver) {
        this.driver = driver;
    }

    public void agregarProductoAlCarrito() {
        driver.findElement(addToCartButton).click();
    }

    public void irAlCarrito() {
        driver.findElement(cartIcon).click();
    }

    public void irAlCheckout() {
        driver.findElement(checkoutButton).click();
    }

    //Validacion de que el boton de checkout este visible
    public boolean isCheckoutButtonVisible() {
        return driver.findElements(checkoutButton).size() > 0;
    }



}
