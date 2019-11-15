package com.colorib.runners;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src\\test\\resources\\features\\popup_validation.feature",
        tags = "@CasoExitoso"

)
public class PopupValidationRunner {

}
