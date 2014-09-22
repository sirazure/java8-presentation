package com.sirazure.showcase.domain;

public interface FlyingObject {
    default public void fly() {
        System.out.println("flying object");
    }
}