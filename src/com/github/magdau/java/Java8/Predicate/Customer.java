package com.github.magdau.java.Java8.Predicate;

import java.util.function.Predicate;

public class Customer {

    private Integer id;
    private Integer numberCard;
    private String firstName;
    private String lastName;
    private Integer age;
    private String gender;

    public Customer(Integer id, Integer numberCard, String firstName, String lastName, Integer age, String gender) {
        this.id = id;
        this.numberCard = numberCard;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
    }

    public Integer getId() {
        return id;
    }

    public Integer getNumberCard() {
        return numberCard;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Integer getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", numberCard=" + numberCard +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }

    public static Predicate<Customer> isAdult() {
        return w -> w.getAge() > 18;
    }

    public static Predicate<Customer> isFemale() {
        return w -> w.gender.equals("F");
    }
}

