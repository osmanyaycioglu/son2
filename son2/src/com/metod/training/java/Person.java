package com.metod.training.java;

import java.util.Date;

public class Person {

    private String name;
    private String surname;
    private String email;
    private String phone;
    private String department;
    private String no;
    private Date   birthdate;


    public Person() {
    }

    public Person(final String nameParam,
                  final String surnameParam) {
        super();
        this.name = nameParam;
        this.surname = surnameParam;
    }


    public Person(final String nameParam,
                  final String surnameParam,
                  final String emailParam,
                  final String phoneParam,
                  final String departmentParam,
                  final String noParam,
                  final Date birthdateParam) {
        super();
        this.name = nameParam;
        this.surname = surnameParam;
        this.email = emailParam;
        this.phone = phoneParam;
        this.department = departmentParam;
        this.no = noParam;
        this.birthdate = birthdateParam;
    }

    public Person(final String nameParam,
                  final String surnameParam,
                  final String emailParam,
                  final String phoneParam,
                  final String departmentParam,
                  final String noParam) {
        super();
        this.name = nameParam;
        this.surname = surnameParam;
        this.email = emailParam;
        this.phone = phoneParam;
        this.department = departmentParam;
        this.no = noParam;
    }

    public static Person createPersonVer2(final String nameParam,
                                          final String surnameParam,
                                          final String emailParam,
                                          final String phoneParam) {
        Person personLoc = new Person();
        personLoc.name = nameParam;
        personLoc.surname = surnameParam;
        personLoc.email = emailParam;
        personLoc.phone = phoneParam;
        return personLoc;

    }

    public String getEmail() {
        return this.email;
    }


    public String getPhone() {
        return this.phone;
    }


    public String getDepartment() {
        return this.department;
    }


    public String getNo() {
        return this.no;
    }


    public Date getBirthdate() {
        return this.birthdate;
    }


    public String getName() {
        return this.name;
    }

    //    public void setName(final String nameParam) {
    //        this.name = nameParam;
    //    }

    public String getSurname() {
        return this.surname;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = (prime * result) + ((this.name == null) ? 0 : this.name.hashCode());
        result = (prime * result) + ((this.surname == null) ? 0 : this.surname.hashCode());
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (this.getClass() != obj.getClass()) {
            return false;
        }
        Person other = (Person) obj;
        if (this.name == null) {
            if (other.name != null) {
                return false;
            }
        } else if (!this.name.equals(other.name)) {
            return false;
        }
        if (this.surname == null) {
            if (other.surname != null) {
                return false;
            }
        } else if (!this.surname.equals(other.surname)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "*Person (name=" + this.name + "),(surname=" + this.surname + ")*";
    }


    //    public void setSurname(final String surnameParam) {
    //        this.surname = surnameParam;
    //    }


}
