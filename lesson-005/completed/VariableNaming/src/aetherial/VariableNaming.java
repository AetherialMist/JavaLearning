package aetherial;

public class VariableNaming {

    public static void main(String[] args) {
        // This is a single line comment! Java will not try to run this line!
        int length = 12;
        int width = 4; // You can also put single line comments at the end of a line!
        //length = 12375;
        int perimeter = length * 2 + width * 2;

        /*
        This is a
        multi-line comment
        where all these lines are
        ignored by Java!
         */
        System.out.println("Perimeter of rectangle: " + perimeter);
    }

}