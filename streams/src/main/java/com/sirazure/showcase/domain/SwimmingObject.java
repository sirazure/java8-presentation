package com.sirazure.showcase.domain;

public interface SwimmingObject {
    default public void swimm() {
        System.out.println("swimming object");
    }
}