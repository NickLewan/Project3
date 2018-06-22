package Project3;
import java.util.Scanner;

//Written by: Nick Lewandowski
//Program asks for user to enter an integer, then sums up the three digits and gets a summation.
//Enter an integer: 744
//The sum of the digits is: 15

public class Modulo {
    public static void main(String [ ] args) {

        int integer, d1, d2, d3, summation;

    Scanner input = new Scanner(System.in);
    System.out.print("Enter an integer: ");
        integer = input.nextInt();
        d1 = integer/100;
        d2 = integer%100/10;
        d3 = integer%100%10;

        summation = d1 + d2 + d3;

    System.out.print("The sum of the digits is: " +summation);

    }
}
