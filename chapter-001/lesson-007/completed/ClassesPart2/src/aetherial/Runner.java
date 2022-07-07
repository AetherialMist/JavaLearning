package aetherial;

public class Runner {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int x = 15;
        int y = 6;
        int z = calculator.mult(x, y);

        System.out.println("Z: " + z);
        System.out.println("X: " + x);
        System.out.println("Y: " + y);

        // This is called 'in-lining' when we call methods inside the
        // parameters of another method.
        System.out.println(calculator.add(x, y));
        System.out.println(calculator.sub(x, y));
        System.out.println(calculator.div(x, y));
    }

}