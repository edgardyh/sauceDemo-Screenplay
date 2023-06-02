package co.com.tevolvers.reto.task;

import co.com.tevolvers.reto.userinterface.OverviewCheckout;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class ValidatePurchase implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(OverviewCheckout.BTN_FINISH),
                Click.on(OverviewCheckout.TXT_MSJ_PURCHASE)
        );
    }
}
