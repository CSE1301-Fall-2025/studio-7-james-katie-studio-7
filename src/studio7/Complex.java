public class Complex {
    private double real;
    private double imaginary;

    public Complex(double iniReal,double iniImaginary) {
        real = iniReal;
        imaginary = iniImaginary;
    }

    public Complex addition(Complex a) {
        Complex New = new Complex((a.real + this.real), (a.imaginary + this.imaginary));
        return New;
    }
    }
    
