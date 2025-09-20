package org.example.database.repository.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class TestClass {
    static int i = 5;
    static List<Double> sem = Arrays.asList(10.0, 5.0, 1.0, 0.25);

    public static void main(String[] args) {
        Optional<Double> reduce = sem.parallelStream().reduce((a, e) -> a / e);
        System.out.println(reduce.get());
        sem.forEach(int_ -> {
            System.out.println(int_);
        });
        int a = 5;
        new Amogus() {
            @Override
            public void doOp() {
                i++;
                System.out.println(i);
            }
        }.doOp();
    }
}
