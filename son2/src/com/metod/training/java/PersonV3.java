package com.metod.training.java;

import java.util.Date;

public class PersonV3 {

    private String name;
    private String surname;
    private String email;
    private String phone;
    private String department;
    private String no;
    private Date   birthdate;

    public String getName() {
        return this.name;
    }

    public PersonV3 setName(final String nameParam) {
        this.name = nameParam;
        return this;
    }

    public String getSurname() {
        return this.surname;
    }

    public PersonV3 setSurname(final String surnameParam) {
        this.surname = surnameParam;
        return this;
    }

    public String getEmail() {
        return this.email;
    }

    public PersonV3 setEmail(final String emailParam) {
        this.email = emailParam;
        return this;
    }

    public String getPhone() {
        return this.phone;
    }

    public PersonV3 setPhone(final String phoneParam) {
        this.phone = phoneParam;
        return this;
    }

    public String getDepartment() {
        return this.department;
    }

    public PersonV3 setDepartment(final String departmentParam) {
        this.department = departmentParam;
        return this;
    }

    public String getNo() {
        return this.no;
    }

    public PersonV3 setNo(final String noParam) {
        this.no = noParam;
        return this;
    }

    public Date getBirthdate() {
        return this.birthdate;
    }

    public PersonV3 setBirthdate(final Date birthdateParam) {
        this.birthdate = birthdateParam;
        return this;
    }


}
