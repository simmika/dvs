import org.junit.Assert;
import org.junit.Test;

public class LoginPageTestLoginAsAdmin extends AbstractClassBeforeAfter {
   private LoginPage loginPage = new LoginPage(driver);

    @Test
    public void loginAsAdmin() throws InterruptedException {
        loginPage.fillUsernameFieldAsAdmin();
        loginPage.fillPasswordFieldAsAdmin();
        loginPage.clickPrisijungtiButton();
        Assert.assertEquals( "DVS", loginPage.getLogoText());
    }


//    @Test
//    public void  loginAsUser(){
//        loginPage.fillUsernameFieldAsUser();
//        loginPage.fillPasswordFieldAsUser();
//        loginPage.clickPrisijungtiButton();
//    }


}
