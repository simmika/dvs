import org.junit.Assert;
import org.junit.Test;

public class NaujoDokumentoKurimasPageTestAsAdmin extends AbstractClassBeforeAfter {
    private LoginPage loginPage = new LoginPage(driver);
    private NaujoDokumentoKurimasPage naujoDokumentoKurimasPage = new NaujoDokumentoKurimasPage(driver);

    @Test
    public void createNewDocumentByAdmin_TC14() {
        loginPage.loginAsAdmin();
        naujoDokumentoKurimasPage.clickIconIkelti();
        naujoDokumentoKurimasPage.typePavadinimas();
        naujoDokumentoKurimasPage.selectTestDocType();
        naujoDokumentoKurimasPage.typeAprasymas();
        naujoDokumentoKurimasPage.uploadFile();
        naujoDokumentoKurimasPage.clickIssaugoti();
        Assert.assertTrue(naujoDokumentoKurimasPage.IsConfirmMessageDisplayed());

    }
}
