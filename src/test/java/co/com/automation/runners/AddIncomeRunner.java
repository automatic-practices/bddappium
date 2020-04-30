package co.com.automation.runners;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
    features = "src/test/resources/features/adicionar_proyecto.feature",
    glue = "co.com.automation.definitions")
public class AddIncomeRunner {}
