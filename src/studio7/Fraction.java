public class Fraction {
    private int denominator;
    private int numerator;

    public Fraction(int iniDen, int iniNum) {
        denominator = iniDen;
        numerator = iniNum;
    }

    public Fraction Multiply(Fraction a) {
        denominator = this.denominator*a.denominator;
        numerator = this.numerator*a.numerator;
        Fraction New = new Fraction(denominator,numerator);
        return New;
    }

    public Fraction Addition(Fraction a) {
        denominator = this.denominator*a.denominator;
        numerator = (this.denominator*a.numerator)+(this.numerator*a.denominator);
        Fraction New = new Fraction(denominator,numerator);
        return New;
    }

    public String reciprocal() {
        return denominator + "/" + numerator;
    }
}
