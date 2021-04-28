public class P5PalindromeNumber {

    public static boolean isPalindrome(int number){

        int r,reverse=0;
        int trail=number;

        if (trail <0){
            trail = number;
        }

        while (trail>0) {

            r=trail % 10;
            reverse=reverse*10+r;
            trail = trail/10;
        }
        if (number == reverse || number == (-reverse)){
            return true;
        }else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(12354));
        System.out.println(isPalindrome(1235321));
        System.out.println(isPalindrome(-12341));
        System.out.println(isPalindrome(-11211));


    }
}
