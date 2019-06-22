import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

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
    public void assignUserToGroup_TC05() throws InterruptedException {
        Thread.sleep(2000);
        //bug or fuck. be sleepo neveikia. kazkoks netoks buttonas..
//        wait.until(ExpectedConditions.visibilityOf(naudotojuAdministravimasPage.grupesButton));
//        wait.until(ExpectedConditions.elementToBeClickable(naudotojuAdministravimasPage.grupesButton));
        naudotojuAdministravimasPage.clickGrupesButton();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//tr[2]//td[3]")));
        naudotojuAdministravimasPage.copyGroupName();
        naudotojuAdministravimasPage.clickGrupesElement();
        naudotojuAdministravimasPage.closePopup();
        Assert.assertEquals(naudotojuAdministravimasPage.getNaudotojoGrupesFieldText(), naudotojuAdministravimasPage.pasteGroupName());
    }
}
