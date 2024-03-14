package TestArrayGenerator;

import java.util.ArrayList;

public class TestArrayGenerator {
    private int base = 2;
    private int minExponent = 2;
    private int maxExponent = 5;
    private ArrayList<Integer> inputSizes;

    public TestArrayGenerator() {
        fillInputSizes();
    }

    public ArrayList<Integer> getInputSizes() {
        return inputSizes;
    }

    private void fillInputSizes() {
        var arrayList = new ArrayList<Integer>();
        var num = evaluateExponent(this.base, this.minExponent - 1);
        for (int k = this.minExponent; k <= this.maxExponent; k++) {
            num *= base;
            arrayList.add(num);
        }
        this.inputSizes = arrayList;

    }

    private Integer evaluateExponent(int base, int exponent) {
        if (exponent < 0) {
            throw new IllegalArgumentException("Only integral exponents >= 0 allowed.");
        }
        if (base == 0) {
            return 0;
        }
        if (exponent == 0) {
            return 1;
        }

        int currentVal = 1;
        for (int k = 1; k <= exponent; k++) {
            currentVal *= base;
        }

        return currentVal;
    }
}
