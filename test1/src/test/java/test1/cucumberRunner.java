package test1;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
	@Cucumber.Options(format={"pretty","html:reports/test-report"},tags= "@smokeTest")
	public class cucumberRunner {
	}


