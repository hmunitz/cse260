package Lab2;

/**
 * Created by cebo4 on 9/12/2017.
 */
public class Complex {
    private double realPart;
    private double imaginaryPart;

    public Complex(){
        realPart = 0;
        imaginaryPart = 0;
    }

    public Complex(double a){
        realPart = a;
        imaginaryPart = 0;
    }

    public Complex(double a, double b){
        realPart = a;
        imaginaryPart = b;
    }

    public double getRealPart() {
        return realPart;
    }

    public double getImaginaryPart() {
        return imaginaryPart;
    }

    public Complex add(Complex other){
        return new Complex(getRealPart()+other.getRealPart(),
                getImaginaryPart()+other.getImaginaryPart());
    }

    public Complex subtract(Complex other){
        return new Complex(getRealPart()-other.getRealPart(),
                getImaginaryPart()-other.getImaginaryPart());
    }

    public Complex multiply(Complex other){
        double a = getRealPart();
        double b = getImaginaryPart();
        double c = other.getRealPart();
        double d = other.getImaginaryPart();
        return new Complex(a*c - b*d, b*c + a*d);
    }

    public Complex divide(Complex other){
        double a = getRealPart();
        double b = getImaginaryPart();
        double c = other.getRealPart();
        double d = other.getImaginaryPart();
        return new Complex((a*c + b*d)/(Math.pow(c,2) + Math.pow(d,2)), (b*c - a*d)/(Math.pow(c,2) + Math.pow(d,2)));
    }

    public String toString(){
        double a = getRealPart();
        double b = getImaginaryPart();
        if(a == b && a == 0)
            return "0";
        String sA = a == 0 ? "" : ""+a;
        String sB = b == 0 ? "" : ""+b+"i";
        String plus = a == 0 || b == 0 ? "" : " + ";
        return sA+plus+sB;
    }
}
