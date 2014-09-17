package ru.patashnik.projecteuler.problems;

public class Problem6 implements Problem {
    @Override
    public int getNumber() {
        return 6;
    }

    @Override
    public String getTitle() {
        return "Sum square difference";
    }

    @Override
    public String solve() {
        int sumOfSquares = 0;
        int totalSum = 0;
        for (int i = 1; i <= 100; i++) {
            sumOfSquares += i * i;
            totalSum += i;
        }

        return Integer.toString(totalSum * totalSum - sumOfSquares);
    }
}
