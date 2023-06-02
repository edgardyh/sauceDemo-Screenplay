package co.com.tevolvers.reto.question;

import co.com.tevolvers.reto.userinterface.OverviewCheckout;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import java.util.List;

public class CountTotalItems implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {

        List<String> products = Text.of(OverviewCheckout.TXT_PRICE).viewedBy(actor).asList();

        double suma = 0;
        String cleanNum = "";
        for (String numero : products) {
            cleanNum = numero.replaceAll("[$]", "");
            double num = Double.parseDouble(cleanNum);
            suma += num;
        }
        String miData = Text.of(OverviewCheckout.TXT_ITEM_TOTAL).viewedBy(actor).asString();
        String cleanString = miData.replaceAll("[^\\d.]", "");
        double num = Double.parseDouble(cleanString);
        if(num == suma){
            return true;
        }
        return false;
    }
    public static CountTotalItems validateCountITems() {
        return new CountTotalItems();
    }
}
