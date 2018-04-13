package question_006;

public class Question_006 {
    public static void main(String[] args) {
        int sumOfSquares = 0;
        for (int i = 1; i <= 100; i++) {
            sumOfSquares += Math.pow(i, 2);
        }

        int squareOfSum = 0;
        for (int i = 0; i <= 100; i++) {
            squareOfSum += i;
        }
        squareOfSum = (int) Math.pow(squareOfSum, 2);

        int difference = sumOfSquares - squareOfSum;
        System.out.printf("The difference between the sum of the squares of the first one hundred natural numbers " +
                "and the square of the sum is %,d\n", difference);
    }
}
