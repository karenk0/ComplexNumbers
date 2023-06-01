public class Complex  {
    private float a, b;

    private Complex(float a, float b) {
        this.a = a;
        this.b = b;
    }

    public static Complex createComplex(float a, float b){
        return new Complex(a, b);
    }

    public Complex add(Complex number) {
        return new Complex(number.a + this.a, this.b + number.b);
    }

    public Complex subtract(Complex number) {
        return new Complex(this.a - number.a, this.b - number.b);
    }

    public Complex multiply(Complex number) {
        return new Complex(this.a * number.a - this.b * number.b, this.a * number.b + this.b * number.a);
    }

    public Complex divide(Complex number) {
        return new Complex((this.a * number.a + this.b * number.b) / number.a * number.a + number.b * number.b, -(this.a * number.b + this.b * number.a) / number.a * number.a + number.b * number.b);
    }

    @Override
    public String toString() {
        if(b < 0){
            return a + "" + b + "i";
        }
        else{
            return a + "+" + b + "i";
        }

    }
}