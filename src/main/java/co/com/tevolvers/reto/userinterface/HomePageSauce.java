package co.com.tevolvers.reto.userinterface;

import net.serenitybdd.screenplay.targets.Target;

public class HomePageSauce {

    public static final Target DROP_DOWN_A_Z = Target.the("menu a-z")
            .locatedBy("//*[@id=\"header_container\"]/div[2]/div/span/select");
    public static final Target OPTION_LOW_TO_HIGH = Target.the("select op2")
            .locatedBy("//*[@id=\"header_container\"]/div[2]/div/span/select/option[3]");
    public static final Target BTN_ADD_TO_CAR = Target.the("button add car")
            .locatedBy("//*[text()=\"Add to cart\"]");
    public static final Target BTN_ADD_TO_CAR_SELECT = Target.the("button specific car")
            .locatedBy("(//*[text()=\"Add to cart\"])[{0}]");
    public static final Target ICON_CAR = Target.the("icon car")
            .locatedBy("//*[@id=\"shopping_cart_container\"]/a");

    public static final Target BTN_ADD_TO_CAR_PROBLEM_USER = Target.the("button add car problem").
            locatedBy("//*[@id=\"add-to-cart-sauce-labs-backpack\"]");

}
