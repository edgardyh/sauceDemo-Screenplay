package co.com.tevolvers.reto.task;

import co.com.devco.automation.mobile.actions.WaitFor;
import co.com.tevolvers.reto.userinterface.HomePageSauce;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.util.List;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class AddToCar implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(HomePageSauce.DROP_DOWN_A_Z),
                Click.on(HomePageSauce.OPTION_LOW_TO_HIGH)
        );

        List<String> products = Text.of(HomePageSauce.BTN_ADD_TO_CAR).viewedBy(actor).asList();
        actor.attemptsTo(
                Click.on(HomePageSauce.BTN_ADD_TO_CAR_SELECT.of("1")),
                Click.on(HomePageSauce.BTN_ADD_TO_CAR_SELECT.of(String.valueOf(products.size() -1))),
                Click.on(HomePageSauce.BTN_ADD_TO_CAR_SELECT.of(String.valueOf(products.size() -4))),
                Click.on(HomePageSauce.ICON_CAR)
        );
    }
    public static AddToCar Product() {
        return instrumented(AddToCar.class);
    }
}
