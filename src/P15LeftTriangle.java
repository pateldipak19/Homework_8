public class P15LeftTriangle {
    int rows=5;

    public void P15_LeftTriangle(int rows) {

        for (int x = 1; x <= rows; x++) {

            for (int i = 1; i <= x; i++) {
                System.out.print("* ");
            }

            System.out.println("");
        }

        System.out.println("");

    }

    public static void main(String[] args) {
        P15LeftTriangle obj = new P15LeftTriangle();
        obj.P15_LeftTriangle(obj.rows);
    }
}
