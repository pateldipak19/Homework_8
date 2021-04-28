import java.util.Scanner;

public class P14Dimond {
    int i = 0, j = 1, r = 0;

    public void shape() {

        System.out.print("Input number of rows: ");
        Scanner in = new Scanner(System.in);
        r = in.nextInt();
        while (i <= r) {
            j = 1;
            while (j <= r - i) {
                System.out.print(" ");
                j++;}
            j = 1;
            while (j <= 2 * i - 1) {
                System.out.print("*");
                j++;}
            System.out.print("\n");
            i++;
        }
        i = r - 1;

        while (i >= 1) {
            j = 1;
            while (j <= r - i) {
                System.out.print(" ");
                j++;}
            j = 1;
            while (j <= 2 * i - 1) {
                System.out.print("*");
                j++;}
            System.out.print("\n");
            i--;
        }
    }

    public static void main(String[] args) {
        P14Dimond obj = new P14Dimond();
        obj.shape();
    }
}
