import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class RandomNumberRunner {
    public static void main(String[] args) {
        Random random = new Random();
        int randomNumber = random.nextInt(100);
        System.out.println("RandomNumber:"+randomNumber);

        Scanner scanner = new Scanner(System.in);
        boolean guessingNumber = false;

        while (!guessingNumber) {
            System.out.println("Guess a number which matches with the random number from 0 to 100");

            try {
                int userInput = scanner.nextInt();

                if (randomNumber == userInput) {
                    System.out.println("Guessed the correct number");

                    guessingNumber=true;
                } else {
                    System.out.println("It is a wrong guess");
                }
            }
            catch(InputMismatchException exception){
                System.out.println("guess is Wrong");
            }

                }

        scanner.close();

    }
}

