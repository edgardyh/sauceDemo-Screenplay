package co.com.tevolvers.reto.question;

import co.com.tevolvers.reto.userinterface.OverviewCheckout;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class TotalItemTax implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {

        String miDataItem = Text.of(OverviewCheckout.TXT_ITEM_TOTAL).viewedBy(actor).asString();
        String cleanItem = miDataItem.replaceAll("[^\\d.]", "");
        double itemTotal = Double.parseDouble(cleanItem);

        String miDataTotal = Text.of(OverviewCheckout.TXT_TAX).viewedBy(actor).asString();
        String cleanTotal = miDataTotal.replaceAll("[^\\d.]", "");
        double taxTotal = Double.parseDouble(cleanTotal);

        String miDataFinalTotal = Text.of(OverviewCheckout.TXT_TOTAL_SUM).viewedBy(actor).asString();
        String cleanFinal = miDataFinalTotal.replaceAll("[^\\d.]", "");
        double finalTotal = Double.parseDouble(cleanFinal);

        double totalSum = itemTotal + taxTotal;

        if (totalSum == finalTotal){
            return true;
        }

        return false;
    }

    public static TotalItemTax validateSumTotal() {
        return new TotalItemTax();
    }
}
