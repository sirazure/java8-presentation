package com.sirazure.showcase.domain;

public class Pizza {

    public static class PizzaFactory {
        public static Pizza order() {
            return new Pizza();
        }
    }
}
