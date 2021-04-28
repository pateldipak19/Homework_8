import java.util.Scanner;

public class P11EvenDigitSum {

    public static int getEvenDigitSum(int number) {
        int sum = 0, temp, n = 0, i = 0;
        if (number >= 0) {

            temp = number;

            while (temp > 0) {
                temp = temp / 10;
                n = n + 1;
            }
            int digit[] = new int[n];
            temp = number;

            while (temp > 0) {
                digit[i] = temp % 10;

                if (digit[i] % 2 == 0) {
                    sum = sum + digit[i];
                }
                temp = temp / 10;
                i++;
            }
            return sum;
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.println("Enter the number for the sum : " + "\t");
        int number = num.nextInt();
        if (number >= 0) {
            System.out.println("Sum of Even digit = " + "\t" + getEvenDigitSum(number));
        } else {
            System.out.println(getEvenDigitSum(number));
        }
    }
}
