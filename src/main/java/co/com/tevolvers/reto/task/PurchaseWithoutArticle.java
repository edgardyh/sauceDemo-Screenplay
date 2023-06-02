package co.com.tevolvers.reto.task;

import co.com.tevolvers.reto.model.builder.InformationBuilder;
import co.com.tevolvers.reto.userinterface.FormInformation;
import co.com.tevolvers.reto.userinterface.HomePageSauce;
import co.com.tevolvers.reto.userinterface.OverviewCheckout;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class PurchaseWithoutArticle implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(HomePageSauce.ICON_CAR),
                Click.on(OverviewCheckout.BTN_CHECK),
                Enter.theValue(InformationBuilder.with().aFormInformation().getName()).into(FormInformation.INP_NAME),
                Enter.theValue(InformationBuilder.with().aFormInformation().getLasName()).into(FormInformation.INP_LAST_NAME),
                Enter.theValue(InformationBuilder.with().aFormInformation().getZipCode()).into(FormInformation.INP_ZIP_CODE),
                Click.on(FormInformation.BTN_CONTINUE),
                Click.on(OverviewCheckout.BTN_FINISH),
                Click.on(OverviewCheckout.TXT_MSJ_PURCHASE)
        );
    }
    public static PurchaseWithoutArticle emptyPurchase () { return instrumented(PurchaseWithoutArticle.class); }
}
