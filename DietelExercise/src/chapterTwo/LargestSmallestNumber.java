package chapterTwo;

import java.util.Scanner;

public class LargestSmallestNumber {
    public void largestSmallestNumber() {
        Scanner input = new Scanner(System.in);
        int largestNumber = 0;
        int smallestNumber = 0;

        int number = 0;
        while (number < 5) {

            System.out.print("Enter a number: ");
            int userInput = input.nextInt();
            number++;

            if (userInput > largestNumber) {
                largestNumber = userInput;
            }
            else if (userInput < largestNumber) {
                smallestNumber = userInput;
            }
        }
        System.out.println("Your Largest Number is: " + largestNumber + " Your smallest Number is: " + smallestNumber);

    }

    public static void main(String[] args) {
        LargestSmallestNumber largestSmallestNumber = new LargestSmallestNumber();
        largestSmallestNumber.largestSmallestNumber();
    }
}
