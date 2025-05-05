package org.store.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.store.automation.config.ConfigReader;
import org.store.automation.utils.Constans.Constans;
import org.store.automation.utils.Localizadores;


public class LoginPage {

    private WebDriver driver;

    // Selectores usando la clase Localizadores
    private By usernameField = By.id(Localizadores.USERNAME_FIELD);
    private By passwordField = By.id(Localizadores.PASSWORD_FIELD);
    private By loginButton   = By.id(Localizadores.LOGIN_BUTTON);
    private By errorMessage  = By.cssSelector(Localizadores.ERROR_MESSAGE);

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void navigateTo() {
        driver.get(ConfigReader.get(Constans.BASE_URL));
    }

    public void enterUsername(String username) {
        driver.findElement(usernameField).sendKeys(username);
    }

    public void enterPassword(String password) {
        driver.findElement(passwordField).sendKeys(password);
    }

    public void clickLogin() {
        driver.findElement(loginButton).click();
    }

    public boolean isErrorDisplayed() {
        return driver.findElements(errorMessage).size() > 0;
    }
}
