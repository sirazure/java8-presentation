package com.sirazure.showcase;

import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Target;
import java.time.DayOfWeek;

@Repeatable(value = Dailies.class)
@Target({ ElementType.TYPE })
public @interface Daily {
    DayOfWeek value() default DayOfWeek.MONDAY;
}
