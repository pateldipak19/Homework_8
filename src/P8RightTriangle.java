import java.util.Scanner;

public class P8RightTriangle {

    public void rightTriangle(int number){
        for (int i=1;i<=number;i++){
            for (int j=1;j<=i;j++){
                System.out.print("@");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner num=new Scanner(System.in);
        System.out.print("Enter the Value for no.of row ="+"\t");
        int number= num.nextInt();
        P8RightTriangle triangle=new P8RightTriangle();
        triangle.rightTriangle(number);
    }
}
