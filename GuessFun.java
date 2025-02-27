import java.util.*;

class GuessFun {
    public static void main(String[] args) {                
        Scanner input = new Scanner(System.in);
        char playAgain = 'Y';
        int totalPoints = 0;

        while (playAgain == 'Y' || playAgain == 'y') {
            int secretNum = (int) (Math.random() * 100) + 1;
            System.out.println("Guess a number between 1 and 100:");
            int result = 0;

            for (int tries = 0; tries < 10; tries++) {
                int guess = input.nextInt();
                result = checkGuess(guess, secretNum);
                if (result == 1) {
                    totalPoints += (9 - tries);  
                    break;
                }
            }
            if (result == 0) {
                System.out.println("Sorry, you didn’t get it!");
            }
            System.out.print("Play again? (Y/N): ");
            playAgain = input.next().charAt(0);
        }
        System.out.println("Final Score: " + totalPoints);
        System.out.println("See you next time!");
    }

    static int checkGuess(int guess, int secret) {
        if (guess > secret) {
            System.out.println("Too big!");
            return 0;
        } else if (guess < secret) {
            System.out.println("Too small!");
            return 0;
        } else {
            System.out.println("Perfect match!");
            return 1;
        }
    }
}
