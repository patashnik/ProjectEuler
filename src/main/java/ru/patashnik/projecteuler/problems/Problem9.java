package ru.patashnik.projecteuler.problems;

public class Problem9 implements Problem {
    @Override
    public int getNumber() {
        return 9;
    }

    @Override
    public String getTitle() {
        return "Special Pythagorean triplet";
    }

    @Override
    public String solve() {
        int a = 0, b = 0, c = 0;

        loop:
        while (a < 1000) {
            ++a;
            b = a + 1;
            while (b < 1000) {
                ++b;
                c = b + 1;
                while (c < 1000) {
                    ++c;
                    if ((a + b + c) == 1000 && ((a * a + b * b) == c * c)) {
                        break loop;
                    }
                }
            }
        }

        return Integer.toString(a*b*c);
    }
}
