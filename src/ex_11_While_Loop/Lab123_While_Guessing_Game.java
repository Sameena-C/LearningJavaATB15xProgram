package ex_11_While_Loop;

import java.util.Random;
import java.util.Scanner;

public class Lab123_While_Guessing_Game {
    public static void main(String[] args) {
        //Guess a number from 1 to 100
        //num=56
        //90, num <, 50, number is >, 55, 56 times = 9

        Random random = new Random();
        int numberToGuess = random.nextInt(100);
       // System.out.println(numberToGuess);
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a number");
        int guess;
        int attempts = 0;
        while (true){
            if(!scanner.hasNextInt()){
                System.out.println("Invalid Input");
                scanner.next(); //Consume Invalid token
                continue;
            }
            guess=scanner.nextInt();
            attempts++;

            if(guess < numberToGuess)
            {
                System.out.println("Too Low number, Try again!!");
            } else if (guess > numberToGuess) {
                System.out.println("Too High number, Try again!!");
            }
            else {
                System.out.println("Hurray guessed the correct number!!");
                System.out.println("You have taken ->"+attempts + " attempts");
                break;
            }
        }
        scanner.close();
        System.out.println("Number to guess was => "+numberToGuess);
    }
}
