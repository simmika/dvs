import org.junit.Assert;
import org.junit.Test;

public class NaudotojuAdministravimasPageTest extends AbstractClassBeforeAfter {

    private NaudotojuAdministravimasPage naudotojuAdministravimasPage = new NaudotojuAdministravimasPage(driver);
    private LoginPage loginPage = new LoginPage(driver);

    @Test
    public void createNewUser_TC08() {
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
    public void assignUserToGroup_TC05() {
        naudotojuAdministravimasPage.clickGrupesButton();
        naudotojuAdministravimasPage.copyGroupName();
        naudotojuAdministravimasPage.clickGrupesElement();
        naudotojuAdministravimasPage.closePopup();
        Assert.assertEquals(naudotojuAdministravimasPage.getNaudotojoGrupesFieldText(), naudotojuAdministravimasPage.pasteGroupName());
    }
}
