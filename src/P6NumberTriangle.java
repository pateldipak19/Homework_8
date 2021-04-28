import java.util.Scanner;

public class P6NumberTriangle {

    public void P6_Triangle(int input) {
        //Logic for Triangle
        for (int i = 1; i <= input; i++) {

            for (int j = 1; j <= i; j++) {

                System.out.print(j);
            }
            System.out.println(" ");
        }
    }

    public static void main(String[] args) {
        Scanner num =new Scanner(System.in);    //create object
        System.out.println("Enter the value for no. of row : ");
        int input =num.nextInt();
        P6NumberTriangle tri =new P6NumberTriangle();//create object
        tri.P6_Triangle(input);//call triangle method in main method via Object
    }

}
