import java.util.Scanner;

public class P12PrimeOrNot {
    public void primeNumber(int number) {
        boolean result = false;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                result = false;
                break;
            } else {
                result = true;
            }
        }

        if (number == 1 || number == 2) {
            System.out.println("Given number" + "\t" + number + "\t" + "Is Prime number");
        } else if (result == false) {
            System.out.println("Given number " + "\t" + number + "\t" + "Is Not Prime number");
        } else {
            System.out.println("Given number " + "\t" + number + "\t" + "Is Prime Number");
        }
    }
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.println("Enter the number:" + "\t");
        int number = num.nextInt();
        P12PrimeOrNot prime = new P12PrimeOrNot();
        prime.primeNumber(number);

    }
}



