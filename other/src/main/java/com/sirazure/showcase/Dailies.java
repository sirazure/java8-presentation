package com.sirazure.showcase;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target({ ElementType.TYPE})
public @interface Dailies {
    Daily[] value();
}
