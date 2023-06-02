package co.com.tevolvers.reto.question.factories;

import co.com.tevolvers.reto.question.ValidateFinalMessage;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.targets.Target;

public class Is {

    public Is (){ }

    public static Question<String> txtMessageFinalBuying (Target obj){
        return new ValidateFinalMessage(obj);
    }
}
