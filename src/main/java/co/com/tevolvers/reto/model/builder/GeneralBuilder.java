package co.com.tevolvers.reto.model.builder;

import co.com.tevolvers.reto.model.DataGeneral;
import co.com.tevolvers.reto.util.Builder;

public class GeneralBuilder implements Builder<DataGeneral> {

    private String username;
    private String password;
    private String purchaseMade;

    public GeneralBuilder() {
        this.username = "";
        this.password = "";
        this.purchaseMade = "";
    }

    public static GeneralBuilder with() { return new GeneralBuilder(); }

    @Override
    public DataGeneral build() { return new DataGeneral(this); }

    public GeneralBuilder withUsername(String username){
        this.username = username;
        return this;
    }

    public GeneralBuilder withPassword(String password){
        this.password = password;
        return this;
    }

    public GeneralBuilder withPurchaseMade(String purchaseMade){
        this.purchaseMade = purchaseMade;
        return this;
    }

    public void setPurchaseMade(String purchaseMade) {
        this.purchaseMade = purchaseMade;
    }

    public DataGeneral aDataGeneral(){
        withUsername("standard_user");
        withPassword("secret_sauce");
        withPurchaseMade("Thank you for your order!");
        return build();
    }

    public String getUsername() {
        return username;
    }


    public String getPassword() {
        return password;
    }


    public String getPurchaseMade() {
        return purchaseMade;
    }

}
