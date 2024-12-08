package Stepdef1;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


	//case 1: where "and" operator is used in 2 tags(those scenarios will execute which scenario will have the common tags separated by and )
	//@RunWith(Cucumber.class)
	//@CucumberOptions(tags="@regression and @smoke",features="C:\\Users\\DELL\\eclipse-workspace\\CucumberFramework\\cucumber.test\\"
//			+ "cucumber2.feature",glue="Stepdefinitions1",
//			dryRun=false,monochrome=true,plugin={"json:target/cucumberreport/report.json","junit:target/cucumberreport/report1.xml"}
	//)

	//case 2: where "or" operator is used in 2 tags(those scenarios will execute which scenario will have any of the tags separated by or )
	//@RunWith(Cucumber.class)
	//@CucumberOptions(tags="@regression or @smoke",features="C:\\Users\\DELL\\eclipse-workspace\\CucumberFramework\\cucumber.test\\"
//			+ "cucumber2.feature",glue="Stepdefinitions1",
//			dryRun=false,monochrome=true,plugin={"json:target/cucumberreport/report.json","junit:target/cucumberreport/report1.xml"}
	//)

	//case 3: where "and not" operator is used(those scenarios will not execute which scenario will have tags separated by and not )
	//@RunWith(Cucumber.class)
	//@CucumberOptions(tags="@regression and not @smoke",features="C:\\Users\\DELL\\eclipse-workspace\\CucumberFramework\\cucumber.test\\"
//			+ "cucumber2.feature",glue="Stepdefinitions1",
//			dryRun=false,monochrome=true,plugin={"json:target/cucumberreport/report.json","junit:target/cucumberreport/report1.xml"}
	//

	//case 4: where "and" and |"or" operator is used
	@RunWith(Cucumber.class)
	@CucumberOptions(tags="(@regression and not @smoke) and (@regression or @smoke)",
	features="C:\\Users\\DELL\\eclipse-workspace\\cucumbernew\\cucumber.new\\cucum.feature",
	glue="Stepdef1",
			dryRun=false,monochrome=true,plugin={"json:target/cucumberreport/report.json",
					"junit:target/cucumberreport/report1.xml"}
	)
	
	public class Testrunner1 {
	
	}