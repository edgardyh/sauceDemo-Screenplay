package co.com.tevolvers.reto.task;

import co.com.tevolvers.reto.model.builder.GeneralBuilder;
import co.com.tevolvers.reto.model.builder.InformationBuilder;
import co.com.tevolvers.reto.userinterface.*;
import co.com.tevolvers.reto.userinterface.CredentialsLogIn;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ProblemUserCheckout implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(CredentialsLogIn.BUTTON_LOGIN),
                Click.on(CredentialsLogIn.INP_ERROR_MSG_USERNAME),
                Enter.theValue("problem_user").into(CredentialsLogIn.USERNAME),
                Click.on(CredentialsLogIn.BUTTON_LOGIN),
                Click.on(CredentialsLogIn.INP_ERROR_MSG_PASSWORD),
                Enter.theValue(GeneralBuilder.with().aDataGeneral().getPassword()).into(CredentialsLogIn.PASSWORD),
                Click.on(CredentialsLogIn.BUTTON_LOGIN),

                Click.on(HomePageSauce.ICON_CAR),
                Click.on(ShoppingCar.BTN_CHECKOUT),
                Click.on(FormInformation.BTN_CONTINUE),
                Click.on(FormInformation.INP_ERROR_MSG_FIST_NAME),
                Enter.theValue(InformationBuilder.with().aFormInformation().getName()).into(FormInformation.INP_NAME),
                Click.on(FormInformation.BTN_CONTINUE),
                Click.on(FormInformation.INP_ERROR_MSG_LAST_NAME),
                Enter.theValue(InformationBuilder.with().aFormInformation().getLasName()).into(FormInformation.INP_LAST_NAME),
                Enter.theValue(InformationBuilder.with().aFormInformation().getZipCode()).into(FormInformation.INP_ZIP_CODE),
                Click.on(FormInformation.BTN_CONTINUE),
                Click.on(FormInformation.INP_ERROR_MSG_LAST_NAME)
        );
    }
    public static ProblemUserCheckout validatingFieldAndCheck() {
        return instrumented(ProblemUserCheckout.class);
    }
}
