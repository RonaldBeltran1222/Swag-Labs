package tests.Carrito;

import hooks.BaseTest;
import org.junit.jupiter.api.Test;
import org.store.automation.pages.Carrito.AgregarProductos;
import org.store.automation.pages.Carrito.ComprarProductos;
import org.store.automation.utils.Constans.Constans;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class ComprarProductoTest extends BaseTest {

    // Test para comprar un producto
    @Test
    public void testComprarProducto() {
        // Configuración del test
        AgregarProductos agregarProductos = new AgregarProductos(driver);
        ComprarProductos comprarProductos = new ComprarProductos(driver);

        //Login
        realizarLogin();

        // Agregar producto al carrito
        agregarProductos.agregarProductoAlCarrito();

        // Ir al carrito
        agregarProductos.irAlCarrito();

        //click en Checkout
        agregarProductos.irAlCheckout();

        // Continuar con la compra
        comprarProductos.ingresarDatos();
        comprarProductos.continuarCompra();
        comprarProductos.finalizarCompra();

        // Validar que el mensaje de compra se haya mostrado
        assertTrue(comprarProductos.isCheckoutCompleteMessageVisible(), Constans.CHECKOUT_COMPLETE_MESSAGE);
    }
}
