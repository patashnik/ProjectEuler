package ru.patashnik.projecteuler.problems;

import ru.patashnik.projecteuler.util.Divider;

public class Problem12 implements Problem {
    @Override
    public int getNumber() {
        return 12;
    }

    @Override
    public String getTitle() {
        return "Highly divisible triangular number";
    }

    @Override
    public String solve() {
        long triangle = 0;
        long size = 0;

        while (true) {
            ++size;
            triangle += size;
            int divCount = Divider.count(triangle);
            if (divCount >= 500) {
                break;
            }
        }

        return Long.toString(triangle);
    }
}
