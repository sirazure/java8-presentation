package com.sirazure.showcase;

import com.sirazure.showcase.domain.*;
import com.sirazure.showcase.domain.Pizza.PizzaFactory;

public class LambdaApp {

    public static void main(String[] args) {
        Office local = new Office();

        local.performWork(new Programmer() {
            @Override
            public Code program(Pizza pizza) {
                return new Code("java 7 app");
            }
        });


        local.performWork(pizza -> new Code("java 8 app"));



        producePizza(PizzaFactory::order);
    }


    public static void producePizza(PizzaProducer producer) {
        //do something
    }
}
