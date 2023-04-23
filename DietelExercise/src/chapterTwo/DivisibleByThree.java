package chapterTwo;

public class DivisibleByThree {
    public void divisibleByThree(int number){
        /*
            1) pass an integer number as a parameter
            2) determine if the integer number is divisible by 3 using modulo
            3) if it is divisible by 3 print number is divisible by three
            else print number is not divisible by 3
        */

        if (number % 3 == 0) {
            System.out.println("Number is divisible");
        }else {
            System.out.println("Number is not divisible");
        }
        }

    public static void main(String[] args) {
        DivisibleByThree divisibleByThree = new DivisibleByThree();
        divisibleByThree.divisibleByThree(6);
    }
}



