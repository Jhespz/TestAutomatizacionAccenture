package co.bocc.google.ui.screenplay.questions;

import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.annotations.Subject;
import net.serenitybdd.screenplay.questions.Text;

import static co.bocc.google.ui.screenplay.ui.HomePage.TXT_FINISH_BOOK;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class FinalText {

    private FinalText () {
        throw new IllegalStateException("Utility class");
    }

    @Subject("obtener el texto")
    public static Question<String> getText() {
        return actor -> Text.of(TXT_FINISH_BOOK).viewedBy(theActorInTheSpotlight()).asString();
    }

}
