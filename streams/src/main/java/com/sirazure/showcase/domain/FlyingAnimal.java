package com.sirazure.showcase.domain;

public interface FlyingAnimal {
    default public void fly() {
        System.out.println("flying live creature");
    }
}