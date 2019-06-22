import org.junit.Assert;
import org.junit.Test;

public class NaudotojuAdministravimasPageTest extends AbstractClassBeforeAfter {

    private NaudotojuAdministravimasPage naudotojuAdministravimasPage = new NaudotojuAdministravimasPage(driver);
    private LoginPage loginPage = new LoginPage(driver);

    @Test
    public void createNewUser() {
        loginPage.loginAsAdmin();
        naudotojuAdministravimasPage.clickIconNaudotojai();
        naudotojuAdministravimasPage.clickRegistruotiNaujaNaudotojaButton();
        naudotojuAdministravimasPage.fillVardasField();
        naudotojuAdministravimasPage.fillPavardeField();
        naudotojuAdministravimasPage.fillNaudotojoVardasField();
        naudotojuAdministravimasPage.fillSlaptazodisField();
        naudotojuAdministravimasPage.clickIssaugotiButton();
        Assert.assertEquals(naudotojuAdministravimasPage.checkOrRegistered(), "ThisIsName");
    }

    @Test
    public void assignUserToGroup() throws InterruptedException {
        Thread.sleep(3000);
        naudotojuAdministravimasPage.clickGrupesButton();
        Thread.sleep(3000);
        naudotojuAdministravimasPage.copyGroupName();
        naudotojuAdministravimasPage.clickGrupesElement();
        Thread.sleep(3000);
        naudotojuAdministravimasPage.closePopup();
        Assert.assertEquals(naudotojuAdministravimasPage.getNaudotojoGrupesFieldText(), naudotojuAdministravimasPage.pasteGroupName());
    }
}
