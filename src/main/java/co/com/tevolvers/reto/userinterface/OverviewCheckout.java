package co.com.tevolvers.reto.userinterface;

import net.serenitybdd.screenplay.targets.Target;

public class OverviewCheckout {

    public static final Target TXT_PRICE = Target.the("lbl price")
            .locatedBy("//div[@class=\"inventory_item_price\"]");
    public static final Target TXT_ITEM_TOTAL = Target.the("lbl item total")
            .locatedBy("//*[@id=\"checkout_summary_container\"]/div/div[2]/div[6]");
    public static final Target TXT_TAX = Target.the("lbl tax")
            .locatedBy("//*[@id=\"checkout_summary_container\"]/div/div[2]/div[7]");
    public static final Target TXT_TOTAL_SUM = Target.the("lbl final total")
            .locatedBy("//*[@id=\"checkout_summary_container\"]/div/div[2]/div[8]");
    public static final Target BTN_FINISH = Target.the("button finish")
            .locatedBy("//*[@id=\"finish\"]");
    public static final Target TXT_MSJ_PURCHASE = Target.the("lbl msg final")
            .locatedBy("//*[@id=\"checkout_complete_container\"]/h2");
    public static final Target BTN_CHECK = Target.the("lbl msg final")
            .locatedBy("//*[@id=\"checkout\"]");

}
