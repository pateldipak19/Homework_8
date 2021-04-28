public class P16Point {


    int x,y;
    public P16Point(){

    }
    public P16Point(int x,int y){
        this.x=x;
        this.y=y;
    }
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
    public void setX(int x){
        this.x=x;

    }
    public void setY(int y){
        this.y=y;
    }
    public double distance(){
        double dist=0;

        dist=Math.sqrt((0-x)*(0-x)+(0-y)*(0-y));
        return dist;
    }
    public double distance(int x, int y){
        this.x=x;
        this.y=y;

        double dist=0;

        dist = Math.sqrt((6-x)*(6-x)+(5-y)*(5-y));
        return dist;
    }
    public double distance(double a, double b){
        double dist=0;
        dist=Math.sqrt((a-x)*(a-x)+(b-y)*(b-y));
        return dist;
    }

    public static void main(String[] args) {
        P16Point first = new P16Point(6, 5);
        P16Point second = new P16Point(3, 1);
        System.out.println("distance(0,0)= " + first.distance());
        System.out.println("distance(second)= " + first.distance(3,1));
        System.out.println("distance(2,2)= " + first.distance(2, 2));
        P16Point point = new P16Point();
        System.out.println("distance()= " + point.distance());

    }




}
