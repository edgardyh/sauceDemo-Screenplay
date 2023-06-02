package co.com.tevolvers.reto.userinterface;

import net.serenitybdd.screenplay.targets.Target;

public class ShoppingCar {

    public static final Target BTN_REMOVE = Target.the("button remove")
            .locatedBy("//*[text()='Remove']");
    public static final Target BTN_CHECKOUT = Target.the("button check")
            .locatedBy("//*[@id=\"checkout\"]");

}
