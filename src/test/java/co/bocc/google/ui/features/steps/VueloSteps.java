package co.bocc.google.ui.features.steps;

import co.bocc.google.ui.screenplay.questions.FinalText;
import co.bocc.google.ui.screenplay.tasks.HomeDespegar;
import co.bocc.google.ui.screenplay.tasks.SelectFirstTrip;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import org.hamcrest.Matchers;
import org.jetbrains.annotations.NotNull;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class VueloSteps {


    @Dado("que {actor} se encuentra en el sitio despegar")
    public void que_el_usuario_se_encuentra_en_el_sitio_despegar(@NotNull Actor actor) {
        actor.wasAbleTo(HomeDespegar.open());
    }

    @Cuando("ingrese los datos del vuelo")
    public void ingrese_los_datos_del_vuelo() {
        theActorInTheSpotlight().attemptsTo(HomeDespegar.makeASearchBy());
    }

    @Cuando("seleccione el primer vuelo disponible")
    public void seleccione_el_primer_vuelo_disponible() {
        theActorInTheSpotlight().attemptsTo(SelectFirstTrip.makeASearchBy());
    }
    @Entonces("el usuario podra ver el anuncio de {string}")
    public void el_usuario_podra_ver_el_anuncio_de(String validateText) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(FinalText.getText(),
                Matchers.equalTo(validateText)));
    }

}
