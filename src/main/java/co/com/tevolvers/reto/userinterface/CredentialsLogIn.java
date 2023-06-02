package co.com.tevolvers.reto.userinterface;

import net.serenitybdd.screenplay.targets.Target;

public class CredentialsLogIn {

    public static final Target USERNAME = Target.the("username")
            .locatedBy("//*[@id=\"user-name\"]");
    public static final Target PASSWORD = Target.the("password")
            .locatedBy("//*[@id=\"password\"]");
    public static final Target BUTTON_LOGIN = Target.the("button login")
            .locatedBy("//*[@id=\"login-button\"]");
    public static final Target INP_ERROR_MSG_USERNAME = Target.the("lbl message username")
            .locatedBy("//*[text()='Epic sadface: Username is required']");
    public static final Target INP_ERROR_MSG_PASSWORD = Target.the("lbl message password")
            .locatedBy("//*[text()='Epic sadface: Password is required']");



}
