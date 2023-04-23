package chapterTwo;

public class Multiples {

    /*
    pass two integer as a parameter
    check if the first number tripled can be multiplied by the second number doubled
    prints result
     */

    public void multiplesNumber(int number1, int number2){
        int first = number1 * 3;
        int second = number2 * 2;
        if (first % second == 0){
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Multiples multiples = new Multiples();
        multiples.multiplesNumber(7,9);
    }
}
