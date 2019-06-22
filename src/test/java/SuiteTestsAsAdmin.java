import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@Suite.SuiteClasses({
        LoginPageTestLoginAsAdmin.class,
        NaudotojuAdministravimasPageTest.class,
        NaujoDokumentoKurimasPageTestAsAdmin.class
})
@RunWith(Suite.class)
public class SuiteTestsAsAdmin {
}
