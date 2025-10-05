import java.util.*;

class numberGuess {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int userNum, numOfTries = 5, setNum = (int) (Math.random() * 10) + 1;

        System.out.println("""
                This is a number guessing game!
                -> The number is between 1-10.
                -> You have got 5 tries.
                
                Good luck! \n""");

        System.out.print("Guess the number: ");
        userNum = scan.nextInt();

        while (numOfTries > 1 ) {
            if (userNum > setNum) {
                System.out.println(userNum + " is higher, guess again!");
            } else if (userNum < setNum) {
                System.out.println(userNum + " is lesser, guess again!");
            } else {
                System.out.println("You got it!");
                return;
            }

            numOfTries -= 1;
            System.out.println();
            System.out.println("You have " + numOfTries + " tries.");
            System.out.print("Guess again: ");
            userNum = scan.nextInt();

        }






    }
}
