import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@Suite.SuiteClasses({
        SuiteTestsAsAdmin.class,
        SuiteTestsAsUser.class
})
@RunWith(Suite.class)
public class SuiteAll {
}
