import java.util.Scanner;

public class P10ArmstrongNumber {
    public void armstrong(int number) {
        int n = 0, temp, i = 0, sum = 0;
        temp = number;

        while (temp > 0) {
            temp = temp / 10;
            n = n + 1;
        }

        temp = number;
        int digit[] = new int[n];
        while (temp > 0) {
            digit[i] = temp % 10;

            sum = sum + (digit[i] * digit[i] * digit[i]);
            temp = temp / 10;
            i++;
        }

        if (number == sum) {
            System.out.println("Given number " + number + " is armstrong number");

        } else {
            System.out.println("Given number " + number + " is not armstrong number");
        }
    }

    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = num.nextInt();

        P10ArmstrongNumber obj = new P10ArmstrongNumber();
        obj.armstrong(number);
    }
}
