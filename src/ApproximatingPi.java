import java.util.Scanner;

//Written by: Nick Lewandowski
//Program states the formula for the general formula of computing Pi, then shows the result of this formula

public class ApproximatingPi {
    public static void main(String [ ] args) {
        double a, b, c, d, e, f, g, h,i, result;

        a = 4;
        b = 1.0;
        c = 1;
        d = (c/3);
        e = (c/5);
        f = (c/7);
        g = (c/9);
        h = (c/11);
        i = (c/13);
        result = (b-d+e-f+g-h+i);

    Scanner input = new Scanner(System.in);

    System.out.println("Pi can be computed using a general formula: 4 * (1.0 - 1/3 + 1/5 - 1/7 + 1/9 - 1/11 + 1/13 - ...");
    System.out.print("The result of this formula is: " + (a * result));

    }
}

