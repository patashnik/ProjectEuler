package ru.patashnik.projecteuler.problems;

public class Problem4 implements Problem {
    @Override
    public int getNumber() {
        return 4;
    }

    @Override
    public String getTitle() {
        return "Largest palindrome product";
    }

    @Override
    public String solve() {
        int startValue = 100;
        int endValue = 999;
        int palindrome = 0;

        while (endValue >= startValue) {
            int nextValue = endValue;
            while (nextValue >= startValue) {
                int product = endValue * nextValue;
                int productCopy = product;
                int[] digits = new int[6];
                int size = 0;
                while (productCopy > 0) {
                    digits[size++] = productCopy % 10;
                    productCopy = productCopy / 10;
                }

                if (product >= 100000) {
                    if (digits[5] == digits[0]
                            && digits[4] == digits[1]
                            && digits[3] == digits[2]) {
                        if (product > palindrome) {
                            palindrome = product;
                        }
                    }
                } else {
                    if (digits[4] == digits[0]
                            && digits[3] == digits[1]) {
                        if (product > palindrome) {
                            palindrome = product;
                        }
                    }
                }
                nextValue--;
            }
            endValue--;
        }

        return Integer.toString(palindrome);
    }
}
