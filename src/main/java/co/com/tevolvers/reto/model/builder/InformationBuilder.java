package co.com.tevolvers.reto.model.builder;

import co.com.tevolvers.reto.model.FormInformation;
import co.com.tevolvers.reto.util.Builder;

public class InformationBuilder implements Builder<FormInformation> {

    private String name;
    private String lasName;
    private String zipCode;

    public InformationBuilder(){
        this.name="";
        this.lasName="";
        this.zipCode="";
    }

    public static InformationBuilder with(){ return new InformationBuilder(); }

    @Override
    public FormInformation build() {return new FormInformation(this);}

    public InformationBuilder withName(String name){
        this.name = name;
        return this;
    }

    public InformationBuilder withLastName(String lasName){
        this.lasName = lasName;
        return this;
    }

    public InformationBuilder withZipCode(String zipCode){
        this.zipCode = zipCode;
        return this;
    }

    public FormInformation aFormInformation(){
        withName("Isaac");
        withLastName("Newton");
        withZipCode("333221");
        return build();
    }

    public String getName() {
        return name;
    }

    public String getLasName() {
        return lasName;
    }

    public String getZipCode() {
        return zipCode;
    }

}
