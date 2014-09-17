package ru.patashnik.projecteuler.problems;

import java.util.ArrayList;
import java.util.List;

public class Problem5 implements Problem {
    @Override
    public int getNumber() {
        return 5;
    }

    @Override
    public String getTitle() {
        return "Smallest multiple";
    }

    @Override
    public String solve() {
        int multiple = 1;
        List<Integer> dividers = new ArrayList<>();

        for (int i = 20; i >= 1; i--) {
            boolean found = false;
            for (Integer divider : dividers) {
                if (divider % i == 0) {
                    found = true;
                    break;
                }
            }
            if (found) {
                continue;
            }
            dividers.add(i);
        }

        while (true) {
            boolean found = false;
            for (Integer divider : dividers) {
                if (multiple % divider != 0) {
                    found = false;
                    break;
                }
                found = true;
            }
            if (found) {
                break;
            }
            multiple++;
        }

        return Integer.toString(multiple);
    }
}
