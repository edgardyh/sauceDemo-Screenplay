package co.com.tevolvers.reto.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class FormInformation {

    public static final Target INP_NAME = Target.the("input name")
            .located(By.xpath("//*[@id=\"first-name\"]"));
    public static final Target INP_LAST_NAME = Target.the("input lastName")
            .located(By.xpath("//*[@id=\"last-name\"]"));
    public static final Target INP_ZIP_CODE = Target.the("input zipCode")
            .located(By.xpath("//*[@id=\"postal-code\"]"));
    public static final Target BTN_CONTINUE = Target.the("button continue")
            .located(By.xpath("//*[@id=\"continue\"]"));

    public static final Target INP_ERROR_MSG_FIST_NAME = Target.the("lbl error message")
            .located(By.xpath("//*[text()='Error: First Name is required']"));
    public static final Target INP_ERROR_MSG_LAST_NAME = Target.the("lbl error message")
            .located(By.xpath("//*[text()='Error: Last Name is required']"));
    public static final Target INP_ERROR_MSG_ZIP_CODE = Target.the("lbl error message")
            .located(By.xpath("//*[text()='Error: Postal Code is required']"));



}
