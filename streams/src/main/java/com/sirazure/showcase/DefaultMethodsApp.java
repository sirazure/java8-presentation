package com.sirazure.showcase;


import com.sirazure.showcase.domain.FlyingAnimal;
import com.sirazure.showcase.domain.FlyingObject;
import com.sirazure.showcase.domain.SwimmingObject;

public class DefaultMethodsApp {
    public static void main(String[] args) {
        new Bat().fly();
        new Ubot().swimm();
        new Plane().fly();
        new GermanUbot().swimm();
        new RoboBat().fly();
    }

    static class Bat implements FlyingAnimal {}

    static class Ubot implements SwimmingObject {}

    static class Plane implements FlyingObject {}

    static class GermanUbot implements SwimmingObject {
        @Override
        public void swimm() {
            System.out.println("schwimmen schwimmen");
        }
    }

    static class RoboBat implements FlyingAnimal, FlyingObject {
        @Override
        public void fly() {
            FlyingObject.super.fly();
            FlyingAnimal.super.fly();
        }
    }
}
