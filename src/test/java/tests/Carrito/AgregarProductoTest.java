package tests.Carrito;

import hooks.BaseTest;
import org.junit.jupiter.api.Test;
import org.store.automation.pages.Carrito.AgregarProductos;
import org.store.automation.utils.Constans.ConstansError;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class AgregarProductoTest extends BaseTest {

    // Test para agregar un producto al carrito
    @Test
    public void testAgregarProductoAlCarrito() {
        // Configuración del test
        AgregarProductos agregarProductos = new AgregarProductos(driver);

        //Login
        realizarLogin();

        // Agregar producto al carrito
        agregarProductos.agregarProductoAlCarrito();

        // Ir al carrito
        agregarProductos.irAlCarrito();

        // Validar que el botón de checkout esté visible
        assertTrue(agregarProductos.isCheckoutButtonVisible(), ConstansError.ERROR_CHECKOUT_BUTTON);
    }
}
