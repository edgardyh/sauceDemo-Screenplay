package co.com.tevolvers.reto.question;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.targets.Target;

public class ValidateFinalMessage implements Question<String> {

    private Target obj;

    public ValidateFinalMessage (Target obj) {
        this.obj = obj;
    }

    @Override
    public String answeredBy(Actor actor) {
        return null;
    }
}
