package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

// this class has purpose of instructing how and what kind of feature we want to test

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/feature", // -> or: "classpath:features"
                 glue = "stepDefinitions", // -> which part to connect (step defs)
                 publish = true, // -> it will give you public link for your local report
                 plugin = { "html:target/cucumber.html", // -> creates a report (.html)
                            "rerun:target/rerun.txt", // -> creates a report (.txt)
                            "json:target/cucumber.json", // -> report for unused import statements
                            "me.jvt.cucumber.report.PrettyReports:target"},
                 dryRun = false, // -> checks if codes will run before actual run (quick scan)

                 tags = "@RoamHub" // -> run codes with that specific tag
         )
public class TestRunner {

}
