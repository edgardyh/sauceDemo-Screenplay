package co.com.tevolvers.reto.task;

import co.com.tevolvers.reto.model.builder.GeneralBuilder;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class CredentialsLogIn implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(GeneralBuilder.with().aDataGeneral().getUsername()).into(co.com.tevolvers.reto.userinterface.CredentialsLogIn.USERNAME),
                Enter.theValue(GeneralBuilder.with().aDataGeneral().getPassword()).into(co.com.tevolvers.reto.userinterface.CredentialsLogIn.PASSWORD),
                Click.on(co.com.tevolvers.reto.userinterface.CredentialsLogIn.BUTTON_LOGIN)
        );
    }
    public static CredentialsLogIn LogInToThePage() {
        return instrumented(CredentialsLogIn.class);
    }
}
