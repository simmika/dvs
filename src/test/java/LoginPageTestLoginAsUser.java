import org.junit.Assert;
import org.junit.Test;

public class LoginPageTestLoginAsUser extends AbstractClassBeforeAfter {
    private LoginPage loginPage = new LoginPage(driver);

    @Test
    public void loginAsUser_TC01() {
        loginPage.fillUsernameFieldAsUser();
        loginPage.fillPasswordFieldAsUser();
        loginPage.clickPrisijungtiButton();
        Assert.assertEquals("DVS", loginPage.getLogoText());
    }
}
