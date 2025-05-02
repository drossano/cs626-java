
// Import ArrayList class inside of the java.util package
import java.util.ArrayList;
// Import all classes inside of java.security package
import java.security.*;
// Java to illustrate calling of static members and methods without calling classname
import static java.lang.Math.*;
import static java.lang.System.*;

import java.util.Scanner;


public class LearnJava {
    // Java needs main method as entry point
    public static void main(String[] args) {
        // println prints lines like Console.WriteLine
        System.out.println("Hello, World!");

        System.out.println(
            "Integer: " + 10 +
            "Double: " + 3.14 +
            "Bool: " + true
        );

        // Just print doesn't do writeline
        System.out.print("Hello ");
        System.out.print("World! \n");

        // printf does formatted printing
        System.out.printf("pi = %.5f \n", Math.PI);

        // Scanner reads input
        // must import java.util.Scanner

        Scanner scanner = new Scanner(System.in);

        // read string input
        //String name = scanner.next();

        // read byte input
        //byte numByte = scanner.nextByte();

        // read int input
        //int numInt = scanner.nextInt();

        // read long input
        //long numLong = scanner.nextLong();

        // read float input
        //float numFloat = scanner.nextFloat();

        // read double input
        //double numDouble = scanner.nextDouble();

        // read boolean input
        //boolean bool = scanner.nextBoolean();
    }
}