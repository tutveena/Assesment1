package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.CucumberOptions.SnippetType;

@CucumberOptions(features="src/test/java/Feature/TestAssesment.feature",glue="stepstest",monochrome=true)
public class RunTest extends AbstractTestNGCucumberTests {

}
