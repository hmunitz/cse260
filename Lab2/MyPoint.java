package Lab2;

/**
 * Created by cebo4 on 9/12/2017.
 */
public class MyPoint {
    private double x;
    private double y;

    public MyPoint(){
        x = 0;
        y = 0;
    }

    public MyPoint(double x, double y){
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double distance(MyPoint other){
        return distance(other.getX(), other.getY());
    }

    public double distance(double a, double b){
        return Math.sqrt(Math.pow(a-x, 2) + Math.pow(b-y, 2));
    }


}
