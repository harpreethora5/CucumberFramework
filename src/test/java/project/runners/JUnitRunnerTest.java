package project.runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		glue= {"project"},
		features = "src/test/resources/project"
)

public class JUnitRunnerTest 
{
  
}
