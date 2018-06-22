
package Project3;
import java.util.Scanner;
import java.lang.Math;

//Written by: Nick Lewandowski
//Program asks user to enter the temperature and wind speed, then calculates the wind chill index

public class WindChill {
    public static void main(String [ ] args) {
        double temp, windspeed, index, exponent1 ;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter temperature (Fahrenheit): ");
            temp = input.nextDouble();

        System.out.print("Enter wind speed(mph): ");

            windspeed = input.nextDouble();
            exponent1 = Math.pow(windspeed, 0.16);
            index = (35.74 + (0.6215 * (temp)) - (35.75 * (exponent1)) + (0.4275 * (temp) * (exponent1)));

        System.out.print("The wind chill index is: " + index );


    }
}
