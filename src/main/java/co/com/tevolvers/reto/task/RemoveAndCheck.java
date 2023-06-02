package co.com.tevolvers.reto.task;

import co.com.devco.automation.mobile.actions.WaitFor;
import co.com.tevolvers.reto.userinterface.ShoppingCar;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.questions.Text;

import java.util.List;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class RemoveAndCheck implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {

        List<String> products = Text.of(ShoppingCar.BTN_REMOVE).viewedBy(actor).asList();
        int randomProduct = (int) (Math.random() * ((products.size()) - 1)) + 1;

        actor.attemptsTo(
                Click.on(ShoppingCar.BTN_REMOVE.of(String.valueOf(randomProduct))),
                Click.on(ShoppingCar.BTN_CHECKOUT)
        );
    }

    public static RemoveAndCheck productOfTheCar() {
        return instrumented(RemoveAndCheck.class);
    }
}
