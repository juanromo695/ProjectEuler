package question_001;

public class Question_001_Alternative_1 {
    public static void main(String[] args) {
        int sumOfMultiples = 0;

        for (int i = 0; i < 1_000; i += 3) {
                sumOfMultiples += i;
        }

        for (int i = 0; i < 1_000; i += 5) {
            sumOfMultiples += i;
        }

        for (int i = 0; i < 1_000; i += 15) {
            sumOfMultiples -= i;
        }

        System.out.println(sumOfMultiples);
    }
}
