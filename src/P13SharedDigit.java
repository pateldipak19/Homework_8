/*
* created by dipak
*Write a method named hasSharedDigit with two parameters of type int.
Each number should be within the range of 10 (inclusive) - 99 (inclusive). If one of the numbers is not  within the range, the method should return false.
The method should return true if there is a digit that appears in both numbers, such as 2 in 12 and 23;  otherwise, the method should return false.
  */
public class P13SharedDigit {

    public static boolean hasSharedDigit(int a, int b) {
        int i = 0;
        int a1[] = new int[2];
        int b1[] = new int[2];
        boolean result = false;
        if (a >= 10 && a <= 99 && b >= 10 && b <= 99) {

            while (a > 0 && b > 0) {
                a1[i] = a % 10;
                a = a / 10;
                b1[i] = b % 10;
                b = b / 10;
                i++;
            }

            if (a1[0] == b1[0] || a1[0] == b1[1] || a1[1] == b1[0] || a1[1] == b1[1]) {
                result = true;
            }
        } else {
            result = false;
        }
        return result;
    }

    public static void main(String[] args) {

        System.out.println(hasSharedDigit(15, 55));
    }
}
