package cucumber;


import com.example.democucumber.DemoCucumberApplication;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootContextLoader;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

@CucumberContextConfiguration
@SpringBootTest(classes = DemoCucumberApplication.class, webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
@ContextConfiguration(classes = DemoCucumberApplication.class, loader = SpringBootContextLoader.class)
public class CucumberSpringConfigurationTest {

}
