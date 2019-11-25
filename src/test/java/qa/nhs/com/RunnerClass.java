package qa.nhs.com;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources",dryRun = false,strict = true,tags = "@SmokeTest"  )
public class RunnerClass
{

}
