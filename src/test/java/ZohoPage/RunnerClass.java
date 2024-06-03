package ZohoPage;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty", "html:target/CucumberReport.html"},
        features ={"src/main/java/ZohoPage/LeadCreation.feature"}
)

public class RunnerClass {

}
