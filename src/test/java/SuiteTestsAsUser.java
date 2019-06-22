import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@Suite.SuiteClasses({
        LoginPageTestLoginAsUser.class,
        NaujoDokumentoKurimasPageTestAsUser.class,
        VisiDokumentaiPageTestAsUser.class
})
@RunWith(Suite.class)
public class SuiteTestsAsUser {
}
