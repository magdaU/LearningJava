package com.github.magdau.java.Java8.Predicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateMain {

    public static void main(String[] args) {
        List<Customer> customers = new ArrayList<>();
        customers.add(new Customer(1, 3344, "Krzysztof1", "Kowalski", 11, "M"));
        customers.add(new Customer(2, 3334, "Krzysztof2", "Kowalski", 15, "F"));
        customers.add(new Customer(3, 3354, "Krzysztof3", "Kowalski", 20, "F"));
        customers.add(new Customer(4, 3364, "Krzysztof4", "Kowalski", 30, "M"));

        List<Customer> customers1 = customers.stream()
                .filter(customer -> customer.getAge() > 18 && customer.getGender().equals("F"))
                .collect(Collectors.toList());

        List<Customer> customers2 = customers.stream()
                .filter(adultWomen())
                .collect(Collectors.toList());

        System.out.println(customers1.toString());
        System.out.println(customers2.toString());
    }

    private static Predicate<Customer> adultWomen() {
        return Customer.isAdult().and(Customer.isFemale());
    }
}
