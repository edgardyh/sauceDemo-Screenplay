package co.com.tevolvers.reto.model;

import co.com.tevolvers.reto.model.builder.InformationBuilder;

public class FormInformation {

    private String name;
    private String lastName;
    private String zipCode;

    public FormInformation(final InformationBuilder informationBuilder) {
        this.name = informationBuilder.getName();
        this.lastName = informationBuilder.getLasName();
        this.zipCode = informationBuilder.getZipCode();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLasName() {
        return lastName;
    }

    public void setLasName(String lasName) {
        this.lastName = lasName;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

}
