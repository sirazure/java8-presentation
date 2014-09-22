package com.sirazure.showcase.domain;

import static com.sirazure.showcase.domain.Pizza.PizzaFactory;

public class Office {

    public void performWork(Programmer programmer) {
        Pizza pizza = PizzaFactory.order();
        Code code = programmer.program(pizza);
        System.out.println(code.getProgram());
    }
}
