package hooks;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.store.automation.config.ConfigReader;
import org.store.automation.pages.LoginPage;
import org.store.automation.utils.Constans.Constans;

public class BaseTest {

    protected WebDriver driver;

    @BeforeEach
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    // Método para realizar el login
    protected void realizarLogin() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.navigateTo();
        loginPage.enterUsername(ConfigReader.get(Constans.USERNAME));
        loginPage.enterPassword(ConfigReader.get(Constans.PASSWORD));
        loginPage.clickLogin();
    }

    @AfterEach
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
