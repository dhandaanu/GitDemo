package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(tags="" , 
      features={"src/test/resources/features/getstart.feature"},
      glue= {"stepdefinitions"},
      monochrome=true,
      plugin= {"pretty" , "html:target/htmlreport.html"}

		)
public class DsTestRunner {

}
