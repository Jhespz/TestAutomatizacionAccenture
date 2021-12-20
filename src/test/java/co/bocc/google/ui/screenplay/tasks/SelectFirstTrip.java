package co.bocc.google.ui.screenplay.tasks;

import co.bocc.google.ui.screenplay.ui.HomePage;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.serenitybdd.screenplay.waits.WaitUntilAngularIsReady;

import static co.bocc.google.ui.screenplay.ui.HomePage.*;
import static co.bocc.google.ui.screenplay.ui.HomePage.BTN_SELECT;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class SelectFirstTrip {

    private SelectFirstTrip() {
        throw new IllegalStateException("Utility class");
    }

    public static Performable open() {
        return Task.where(
                "{0} abre Google",
                Open.browserOn().the( HomePage.class ),
                new WaitUntilAngularIsReady()
        );
}
    public static Performable makeASearchBy() {
        return Task.where(
                "{0} escribe en el campo de búsqueda",

                WaitUntil.the(BTN_SELECT, isVisible()).forNoMoreThan(40).seconds(),
                Click.on(BTN_SELECT),

                WaitUntil.the(BTN_CONTINUE, isVisible()).forNoMoreThan(30).seconds(),
                Click.on(BTN_CONTINUE)

        );


    }
}


