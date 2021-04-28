import java.util.Scanner;

public class P7FirstLastDigitSum {
    public static int sumFirstAndLastDigit(int number){

        int i = 0,n=0,sum;
        int t=number;
        int count =0;

        if (number>=0){

            while (t!=0){
                n=count++;
                t=t/10;
            }
            int [] digit =new int[n+1];

            while (number>0){

                digit[i] = number % 10;
                number = number/10;
                i++;
            }
            sum = digit[0]+digit[n];
            return sum;
        }else {
            return -1;
        }
    }

    public static void main(String[] args) {

        Scanner num = new Scanner(System.in);
        System.out.println("Enter number for the first & last digit sum: ");
        int number=num.nextInt();

        if (number>0){
            System.out.println("Sum of first & last numbers: "+sumFirstAndLastDigit(number));
        }else {
            System.out.println(sumFirstAndLastDigit(number));
        }
    }

}
