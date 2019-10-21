package steps;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "/media/manish/data2/IJ/IJ_Projects/CucumberDemo/src/test/java/features",
        glue = "steps",
        plugin = {"html:Reports/html_reports",
                "pretty:Reports/pretty_report.txt",
                "json:Reports/json_reports.json",
                "junit:Reports/junit_reports.xml"
        },
        monochrome = true)

public class TestRunner {
}
