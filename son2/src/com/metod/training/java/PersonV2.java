package com.metod.training.java;

import java.util.Date;

public class PersonV2 {

    private String name;
    private String surname;
    private String email;
    private String phone;
    private String department;
    private String no;
    private Date   birthdate;


    private PersonV2() {
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

    public String getSurname() {
        return this.surname;
    }

    public static PersonV2Builder getBuilder() {
        return new PersonV2Builder();
    }

    public static class PersonV2Builder {

        private final PersonV2 pver2 = new PersonV2();


        private PersonV2Builder() {
        }

        public PersonV2Builder name(final String nameParam) {
            this.pver2.name = nameParam;
            return this;
        }


        public PersonV2Builder surname(final String surnameParam) {
            this.pver2.surname = surnameParam;
            return this;
        }


        public PersonV2Builder email(final String emailParam) {
            this.pver2.email = emailParam;
            return this;
        }


        public PersonV2Builder phone(final String phoneParam) {
            this.pver2.phone = phoneParam;
            return this;
        }


        public PersonV2Builder department(final String departmentParam) {
            this.pver2.department = departmentParam;
            return this;
        }


        public PersonV2Builder no(final String noParam) {
            this.pver2.no = noParam;
            return this;
        }


        public PersonV2Builder birthdate(final Date birthdateParam) {
            this.pver2.birthdate = birthdateParam;
            return this;
        }

        public PersonV2 buildV1() {
            // Validation v1
            return this.pver2;
        }

        public PersonV2 buildV2() {
            // Validation v2
            return this.pver2;
        }

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
        PersonV2 other = (PersonV2) obj;
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
