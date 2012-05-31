package com.tonylawrence.fluent;

import com.google.common.base.Predicate;

public class Predicates {
    public static Predicate<Integer> byEvenNumbers() {
        return new Predicate<Integer>() {
            @Override
            public boolean apply(Integer integer) {
                return integer % 2 == 0;
            }
        };
    }

    public static Predicate<Integer> bigValues() {
        return new Predicate<Integer>() {
            @Override
            public boolean apply(Integer integer) {
                return integer > 5;
            }
        };
    }
}
