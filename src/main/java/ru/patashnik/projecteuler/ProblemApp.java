package ru.patashnik.projecteuler;

import ru.patashnik.projecteuler.problems.*;

public class ProblemApp {

    public static void main(String[] args) {
        Problem pb = new Problem18();

        long startTime = System.currentTimeMillis();
        String result = pb.solve();
        long endTime = System.currentTimeMillis();

        System.out.println("Number:  " + pb.getNumber());
        System.out.println("Problem: " + pb.getTitle());
        System.out.println("Result:  " + result);
        System.out.println("Elapsed: " + (endTime - startTime) + " ms.");
    }
}
