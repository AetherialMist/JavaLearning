package aetherial;

public class BooleanLearning {

    public static void main(String[] args) {
//        int circleRadius = 4;
//        int squareSideLength = 8;
//
//        int circleDiameter = circleRadius * 2;
//        int squarePerimeter = squareSideLength * 4;
//        // We are just going to use the short value for PI in this code
//        double circlePerimeter = 2 * 3.14 * circleRadius;
//        double circleArea = 3.14 * circleRadius * circleRadius;
//        int squareArea = squareSideLength * squareSideLength;
//
//        // ### Your code goes below here! ###
//        boolean isCircleBiggerThanSquare = circleArea > squareArea;
//        boolean isCircleDiameterEqualToSquareSide = squareSideLength == circleDiameter;
//        boolean isSquarePerimeterBiggerThanCirclePerimeter = circlePerimeter < squarePerimeter;
//
//        // Change these print statements to include the answer at the end like in the example!
//        System.out.println("True or False: The circle has more area than the square? " + isCircleBiggerThanSquare);
//        System.out.println("True or False: The diameter of the circle is equal to the side of the square? " + isCircleDiameterEqualToSquareSide);
//        System.out.println("True or False: The Square has a larger perimeter than the circle? " + isSquarePerimeterBiggerThanCirclePerimeter);

        boolean isSevenEven = 7 % 2 == 0;
        boolean isFourteenEven = 14 % 2 == 0;

        boolean bothSevenAndFourteenAreEven = isSevenEven && isFourteenEven;
        boolean sevenOrFourteenIsEven = isSevenEven || isFourteenEven;
        boolean isSevenNotEven = !isSevenEven;

        System.out.println("True or False: 7 AND 14 are even numbers? " + bothSevenAndFourteenAreEven);
        System.out.println("True or False: 7 OR 14 is an even numbers? " + sevenOrFourteenIsEven);
        System.out.println("True or False: 7 is NOT an even number? " + isSevenNotEven);
    }

}