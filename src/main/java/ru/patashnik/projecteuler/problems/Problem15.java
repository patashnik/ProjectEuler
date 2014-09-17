package ru.patashnik.projecteuler.problems;

import ru.patashnik.projecteuler.util.Factorial;

import java.math.BigInteger;

public class Problem15 implements Problem {
    @Override
    public int getNumber() {
        return 15;
    }

    @Override
    public String getTitle() {
        return "Lattice paths";
    }

    @Override
    public String solve() {
        // see: http://mathforum.org/library/drmath/view/66728.html

        return Factorial.fact(40).divide(Factorial.fact(20).multiply(Factorial.fact(20))).toString();
    }
}
