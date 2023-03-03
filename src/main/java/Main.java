/**
 * Created by iyasuwatts on 10/17/17.
 */
import java.util.Scanner;
import java.time.Duration;
import java.time.Instant;
public class Main {

    public static void main(String[] args){
        
        int number = getInputNumber();
        
        int sum = sumOfNumbers(number);

        System.out.println(sum);

        int gSum = gaussianSumOfNumbers(number);

        System.out.println(gSum);

    }
    static int getInputNumber() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter any a positive number: ");

        // This method reads the number provided using keyboard
        int num = scan.nextInt();

        // Closing Scanner after the use
        scan.close();
        return num;
    }

    // do this one and the lab is complete. really.
    // return the sum of 0 to n... if n == 3, the result should be 6
    static int sumOfNumbers(int n) {
        final long startTimeOne = System.currentTimeMillis();
        int i;
        int sum = 0;
        for (i = 1; i <= n; i++) {
            sum = sum + i;
        }
        final long endTimeOne = System.currentTimeMillis();
        System.out.println("Total execution time is " + (endTimeOne - startTimeOne));
        System.out.print("Sum of all numbers from 1 to " +n +" is:");
        return sum;

    }

    // for Extra Credit
    // Gaussian formular: Sum = n*(n+1)/2
    static int gaussianSumOfNumbers(int n) {
        final long startTimeTwo = System.currentTimeMillis();
        int gSum = n*(n+1)/2;
        final long endTimeTwo = System.currentTimeMillis();
        System.out.println("Total execution time using Gaussian method is " + (endTimeTwo - startTimeTwo));
        System.out.print("Sum of all numbers from 1 to " +n +" using Gaussian formular is:");
        return gSum;
    }
   
    // for Extra extra credit - compare the methods and show which one is faster
    // google "how to time some java code"
    // use "System.currentTimeMillis()" to ask the system what time it is.
}
