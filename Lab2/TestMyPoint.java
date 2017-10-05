package Lab2;

/**
 * Created by cebo4 on 9/12/2017.
 */
public class TestMyPoint {

    public static void main(String[] args){
        MyPoint p1 = new MyPoint();
        MyPoint p2 = new MyPoint(10, 30.5);

        System.out.println(p1.distance(p2));
    }
}
