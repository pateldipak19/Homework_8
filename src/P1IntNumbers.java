/*
* created by dipak
* Read 10 numbers from the console entered by the user and print the sum of those  numbers.
-Use the hasNextInt() method from the scanner to check if the user has entered an int value.
-If hasNextInt() returns false, print the message Invalid Number. Continue reading until you have read  10 numbers.
-Use the nextInt() method to get the number and add it to the sum.
-Before the user enters each number, print the message Enter number #x: where x represents the  count, i.e. 1, 2, 3, 4, etc.
-For example, the first message printed to the user would be Enter number #1:, the next Enter number  #2:, and so on.
*/



import java.util.Scanner;

public class P1IntNumbers {

    double arr[] = new double[10];

    public boolean hasNextInt() {

        double counter;
        Scanner scanner = new Scanner(System.in);

        boolean result = true;
        int i = 0;

        while (i < 10) {
            System.out.print("Enter number: ");
            counter = scanner.nextDouble();
            if (counter % 1 != 0) {

                result = false;
                System.out.println("invalid");

                do {

                    System.out.println("enter correct number: ");
                    counter = scanner.nextDouble();
                } while (counter % 1 != 0);
            }
            arr[i] = counter;
            i++;
        }
        scanner.close();
        return result;
    }

    public void nextInt() {
        double sum = 0;
        for (int a = 0; a < 10; a++) {
            int k = a + 1;
        }
        System.out.println(sum);
    }


    public static void main(String[] args) {
        P1IntNumbers obj = new P1IntNumbers();
        System.out.println(obj.hasNextInt());
        obj.nextInt();

    }
}
