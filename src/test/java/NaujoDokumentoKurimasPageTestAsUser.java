import org.junit.Assert;
import org.junit.Test;

public class NaujoDokumentoKurimasPageTestAsUser extends AbstractClassBeforeAfter {
    private LoginPage loginPage = new LoginPage(driver);
    private NaujoDokumentoKurimasPage naujoDokumentoKurimasPage = new NaujoDokumentoKurimasPage(driver);

    @Test
    public void createNewDocumentByUser_TC12() {
        loginPage.loginAsUser();
        naujoDokumentoKurimasPage.clickIconIkelti();
        naujoDokumentoKurimasPage.typePavadinimas();
        naujoDokumentoKurimasPage.selectTestDocType();
        naujoDokumentoKurimasPage.typeAprasymas();
        naujoDokumentoKurimasPage.uploadFile();
        naujoDokumentoKurimasPage.clickIssaugoti();
        Assert.assertTrue(naujoDokumentoKurimasPage.IsConfirmMessageDisplayed());
    }
}
