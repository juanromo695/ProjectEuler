package question_001;

public class Question_001 {

    public static void main(String[] args) {
        int sumOfMultiples = 0;
        for (int i = 0; i < 1_000; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                sumOfMultiples += i;
            }
        }
        System.out.printf("Sum of all the multiples of 3 or 5 below 1,000 is %,d.\n", sumOfMultiples);
    }
}
