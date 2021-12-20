/**
 * Grupo Aval Acciones y Valores S.A. CONFIDENTIAL
 *
 * <p>Copyright (c) 2018 . All Rights Reserved.
 *
 * <p>NOTICE: This file is subject to the terms and conditions defined in file 'LICENSE', which is
 * part of this source code package.
 */
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
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;


public class HomeDespegar {

  private HomeDespegar() {
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
            WaitUntil.the(CLOSE_POPUP, isEnabled()).forNoMoreThan(40).seconds(),
            Click.on(CLOSE_POPUP),
            Click.on(ORIGIN_CITY),
            Enter.theValue("M").into(ORIGIN_CITY),
            Enter.theValue("MED").into(ORIGIN_CITY),
            WaitUntil.the(LIST_CITY_OPTIONS, isVisible()).forNoMoreThan(10).seconds(),
            Click.on(CITY_ACTIVE),

            Click.on(DESTINATION_CITY),
            Enter.theValue("B").into(DESTINATION_CITY),
            Enter.theValue("BOG").into(DESTINATION_CITY),
            WaitUntil.the(LIST_CITY_OPTIONS, isVisible()).forNoMoreThan(10).seconds(),
            Click.on(CITY_ACTIVE),
            Click.on(DATES),
            Click.on(DEPARTURE_DAY),
            WaitUntil.the(DATES_1, isEnabled()).forNoMoreThan(10).seconds(),
            Click.on(DATES_1),
            Click.on(ARRIVED_DAY),
            Click.on(BTN_SEARCH)

            );
  }

}
