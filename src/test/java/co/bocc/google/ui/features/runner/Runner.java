package co.bocc.google.ui.features.runner;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/seleccionarVuelo.feature",
                 glue = {"co.bocc.google.ui.features.steps"},
                 tags = "not @ignore")

public class Runner {
}
