import org.junit.Assert;
import org.junit.Test;

public class LoginPageTestLoginAsAdmin extends AbstractClassBeforeAfter {
    private LoginPage loginPage = new LoginPage(driver);

    @Test
    public void loginAsAdmin_TC02() {
        loginPage.fillUsernameFieldAsAdmin();
        loginPage.fillPasswordFieldAsAdmin();
        loginPage.clickPrisijungtiButton();
        Assert.assertEquals("DVS", loginPage.getLogoText());
    }
}
