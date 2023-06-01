public class Main {
    public static void main(String[] args) {
        Complex number1 = Complex.createComplex(1,2);
        Complex number2 = Complex.createComplex(3,4);
        System.out.println(number1.add(number2));
        System.out.println(number1.subtract(number2));
        System.out.println(number1.multiply(number2));
        System.out.println(number1.divide(number2));
    }
}