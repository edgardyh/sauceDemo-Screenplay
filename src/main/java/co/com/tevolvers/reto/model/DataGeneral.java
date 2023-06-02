package co.com.tevolvers.reto.model;

import co.com.tevolvers.reto.model.builder.GeneralBuilder;

public class DataGeneral {

    private String purchaseMade;
    private String username;
    private String password;

    public DataGeneral(final GeneralBuilder generalBuilder){
        this.purchaseMade = generalBuilder.getPurchaseMade();
        this.username = generalBuilder.getUsername();
        this.password = generalBuilder.getPassword();
    }

    public DataGeneral(String purchaseMAde) {
        this.purchaseMade = purchaseMAde;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPurchaseMAde() {
        return purchaseMade;
    }

    public void setPurchaseMAde(String purchaseMAde) {
        this.purchaseMade = purchaseMAde;
    }
}
