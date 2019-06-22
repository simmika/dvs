import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class VisiDokumentaiPageTestAsUser extends AbstractClassBeforeAfter {
    private LoginPage loginPage = new LoginPage(driver);
    private VisiDokumnentaiPage visiDokumnentaiPage = new VisiDokumnentaiPage(driver);

    @Before
    public void loginAsUser() {
        loginPage.loginAsUser();
    }

    @After
    public void quit() {
        visiDokumnentaiPage.clickExit();
    }

    @Test
    public void submitDocumentForApproval_TC16() {
        visiDokumnentaiPage.clickSukurtiDokumentai();
        visiDokumnentaiPage.copyLastDocumentTitle();
        visiDokumnentaiPage.clickDetaliau();
        visiDokumnentaiPage.clickPateikti();
        visiDokumnentaiPage.clickHomeIcon();
        visiDokumnentaiPage.clickPateiktiDokumentai();
        wait.until(ExpectedConditions.textToBePresentInElement(visiDokumnentaiPage.getLastDocumentTittle(),
                visiDokumnentaiPage.pasteLastDocumentTittle()));
    }

    @Test
    public void userAcceptDocument_TC17() {
        visiDokumnentaiPage.clickDokumentaiTvirtinimui();
        visiDokumnentaiPage.copyLastDocumentTitle();
        visiDokumnentaiPage.clickDetaliau();
        visiDokumnentaiPage.clickPatvirtinti();
        visiDokumnentaiPage.clickHomeIcon();
        visiDokumnentaiPage.clickPatvirtintiDokumentai();
//        wait.until(ExpectedConditions.textToBePresentInElement(visiDokumnentaiPage.getLastDocumentTittle(),
//                visiDokumnentaiPage.pasteLastDocumentTittle()));
    }

    @Test
    public void userRejectDocument_TC18() {
        visiDokumnentaiPage.clickDokumentaiTvirtinimui();
        visiDokumnentaiPage.copyLastDocumentTitle();
        visiDokumnentaiPage.clickDetaliau();
        visiDokumnentaiPage.clickAtmesti();
        driver.switchTo().alert().sendKeys("Netinkamas formatas");
        driver.switchTo().alert().accept();
        visiDokumnentaiPage.clickHomeIcon();
        visiDokumnentaiPage.clickAtmestiDokumentai();
//        wait.until(ExpectedConditions.textToBePresentInElement(visiDokumnentaiPage.getLastDocumentTittle(),
//                visiDokumnentaiPage.pasteLastDocumentTittle()));


    }

}