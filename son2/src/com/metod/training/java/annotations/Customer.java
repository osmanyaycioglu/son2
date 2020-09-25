package com.metod.training.java.annotations;


public class Customer {

    @ValidateSize(min = 5, max = 120)
    private String name;
    @ValidateSize(min = 6, max = 100)
    private String surname;
    @MyFirstAnno(start = "dep")
    private String deparment;

    public String getName() {
        return this.name;
    }

    public void setName(final String nameParam) {
        this.name = nameParam;
    }

    public String getSurname() {
        return this.surname;
    }

    public void setSurname(final String surnameParam) {
        this.surname = surnameParam;
    }

    public String getDeparment() {
        return this.deparment;
    }

    public void setDeparment(final String deparmentParam) {
        this.deparment = deparmentParam;
    }

}
