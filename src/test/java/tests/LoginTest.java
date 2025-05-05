package tests;

import org.junit.jupiter.api.Test;
import org.store.automation.config.ConfigReader;
import org.store.automation.pages.LoginPage;
import hooks.BaseTest;
import org.store.automation.utils.Constans.Constans;
import org.store.automation.utils.Constans.ConstansError;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LoginTest extends BaseTest {

    @Test
    public void testSuccessfulLogin() {
        // Configuración del test
        LoginPage loginPage = new LoginPage(driver);

        // Navegar a la página de login
        loginPage.navigateTo();
        // Ingresar credenciales
        loginPage.enterUsername(ConfigReader.get(Constans.USERNAME));
        loginPage.enterPassword(ConfigReader.get(Constans.PASSWORD));
        // Hacer clic en el botón de login
        loginPage.clickLogin();

        // Validar que redirigió al inventario
        String currentUrl = driver.getCurrentUrl();

        // Verifica que la URL actual sea la esperada
        assertEquals(Constans.URLINVENTORY, currentUrl, ConstansError.ERROR_LOGIN);
    }
}
