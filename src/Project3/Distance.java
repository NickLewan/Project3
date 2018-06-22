package Project3;
import java.util.Scanner;
import java.lang.Math;

//Written by: Nick Lewandowski
//Program asks user to enter in (x1,x2) and (y1,y2), then the program calculates the distance formula and displays it

public class Distance {
    public static void main(String [ ] args) {
          double X1, X2, Y1, Y2, first, second, result;

    Scanner input = new Scanner(System.in);

    System.out.print("Enter x1 and y1: ");
            X1 = input.nextDouble();
            Y1 = input.nextDouble();
    System.out.print("Enter x2 and y2: ");
            X2 = input.nextDouble();
            Y2 = input.nextDouble();
            first = Math.pow(X2-X1,2);
            second = Math.pow(Y2-Y1,2);
            result = Math.sqrt(first + second);

    System.out.print("The distance is " + result);

    }
}
