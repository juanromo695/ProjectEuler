package question_002;

import java.util.ArrayList;
import java.util.List;

public class Question_002 {

    private static List<Integer> computedFibonacciNumbers = new ArrayList<>();

    public static void main(String[] args) {
        int sumOfEvenFibonacciNumbers = 0;

        for (int i = 1; ; i++) {
            int computedFibonacciNumber = computeFibonacciNumber(i);

            if (computedFibonacciNumber > 4_000_000) {
                break;
            }

            if (computedFibonacciNumber % 2 == 0) {
                sumOfEvenFibonacciNumbers += computedFibonacciNumber;
            }
        }
        System.out.println(sumOfEvenFibonacciNumbers);
    }

    private static int computeFibonacciNumber(int n) {
        if (n == 1) {
            return 1;
        } else if (n == 2) {
            return 2;
        } else if (n - 3 < computedFibonacciNumbers.size()) {
            return computedFibonacciNumbers.get(n - 3);
        } else {
            int computedFibonacciNumber = computeFibonacciNumber(n - 1) + computeFibonacciNumber(n - 2);
            computedFibonacciNumbers.add(computedFibonacciNumber);
            return computedFibonacciNumber;
        }
    }
}
