# Lesson 6 - Boolean Logic

## Booleans in Real Life

Boolean logic is yet another term you have likely been using your whole life and just didn't know the fancy word for!
Phrases such as "If the store has fresh tomatoes, then buy three" and "While you have flyers in your hands, pass them
out to people walking by" both fall into boolean logic.

At the core of boolean logic is a conditional: if _some condition_ then do _something_, while _some condition_ do
_something_, until _you've finished your homework_ you can not _go outside_, and so many more! These conditional phrases
are fundamental to programming.

## Create a New Project

Go ahead and create a new project, and name this one "BooleanLearning"

```java
package aetherial;

public class BooleanLearning {

    public static void main(String[] args) {

    }

}
```

## Boolean Comparison

As mentioned in a previous lesson, `boolean` is a Java type and has two possible values: `true` and `false`. Java also
has operators that allow us to compare values and variables, that result in a `boolean` value.

* `>` Right angle bracket
    * "Is the value on the left greater than the value on the right?"
* `<` Left angle bracket
    * "Is the value on the left less than the value on the right?"
* `>=` Right angle bracket followed by an equals symbol
    * "Is the value on the left greater than or equal to the value on the right?"
* `<=` Left angle bracket followed by an equals symbol
    * "Is the value on the left less than or equal to the value on the right?"
* `==` Two equal signs
    * "Are the values on both sides equal to each other?"
* `!=` Exclamation mark followed by an equals symbol
    * "Are the values on both sides not equal to each other?"

### Comparing Numbers

You can write this program to follow along, or wait until the next section.

```java
package aetherial;

public class BooleanLearning {

    public static void main(String[] args) {
        int feetInYard = 3;
        int feetInMile = 5280;
        // 5280 is divisible by 3!
        int yardsInMile = feetInMile / feetInYard;

        boolean isYardsInMileExact = feetInMile % feetInYard == 0;
        boolean isYardSmallerThanMile = feetInYard < feetInMile;
        boolean isYardEqualToThreeFeet = feetInYard == 3;
        boolean isMileEqualToOrMoreThanSixThousand = feetInMile >= 6000;
        boolean isFiveYardsGreaterThanMile = feetInMile < feetInYard * 5;

        System.out.println("Full yards in a mile: " + yardsInMile);
        System.out.println("True or False: A mile has an exact number of yards? " + isYardsInMileExact);
        System.out.println("True or False: A yard smaller than a mile? " + isYardSmallerThanMile);
        System.out.println("True or False: There are three feet in a yard? " + isYardEqualToThreeFeet);
        System.out.println("True or False: There are 6,000 or more feet in a mile? " + isMileEqualToOrMoreThanSixThousand);
        System.out.println("True or False: Five yards is longer than a mile? " + isFiveYardsGreaterThanMile);
    }

}
```

Output

```text
Full yards in a mile: 1760
True or False: A mile has an exact number of yards? true
True or False: A yard smaller than a mile? true
True or False: There are three feet in a yard? true
True or False: There are 6,000 or more feet in a mile? false
True or False: Five yards is longer than a mile? false
```

Intellij will most likely highlight some of this code and put a light-colored squiggly under some parts. This is just
Intellij trying to help us write "better" programs by looking for _constant conditions_, conditions that always result
in `true` or `false`. For this lesson, we are going to ignore Intellij's little warnings and tips! Red squiggles are
still bad though, you should definitely get those checked out!

In this example, I even managed to sneak some math in there! As it turns out, boolean comparison operations have a lower
precedence than math operators, but a higher precedence than the assignment operator.

### Your Turn!

I am going to give you some starter code here, and you will need to make changes to answer the very important questions
that are printed to the console. Your code additions and changes will need to start below:
`// ### Your code goes below here! ###`.

```java
package aetherial; // Your package name will likely be different!

public class BooleanLearning {

    public static void main(String[] args) {
        int circleRadius = 4;
        int squareSideLength = 8;

        int circleDiameter = circleRadius * 2;
        int squarePerimeter = squareSideLength * 4;
        // We are just going to use the short value for PI in this code
        double circlePerimeter = 2 * 3.14 * circleRadius;
        double circleArea = 3.14 * circleRadius * circleRadius;
        int squareArea = squareSideLength * squareSideLength;

        // ### Your code goes below here! ###
        // Create boolean variables that answer the questions from the print statements below.

        // Change these print statements to include the answer at the end like in the example above!
        System.out.println("True or False: The circle has more area than the square? ");
        System.out.println("True or False: The diameter of the circle is equal to the side of the square? ");
        System.out.println("True or False: The Square has a larger perimeter than the circle? ");
    }

}
```

Your output should end up looking like:

```text
True or False: The circle has more area than the square? false
True or False: The diameter of the circle is equal to the side of the square? true
True or False: The Square has a larger perimeter than the circle? true
```

Remember that talk about _programming style_? There are so many choices about how to create the boolean variables that
answer the questions in the print statements. My code and your code are almost certainly going to look different, and
that is okay! There is more than one way to get the right answer in programming. So don't worry about programming the "
correct" solution, and just focus on getting "correct" results. In programming, solutions and results are two very
different things when it comes to the logic of the program!

I'll include one possible solution at the end of this lesson.

## Boolean Algebra

### Boolean Expressions

Boolean expression is another fancy term you've probably used without knowing before. In the sentence, "If you go to the
store, and they have fresh bananas, then buy five", `you go to the store` and `they have fresh bananas` are two
booleans (true/false questions) that are joined by `and`. This means you will buy five bananas, only if the answer to
both of those questions is `true`. When talking about conditions, the use of "and", "or", and "not" usually means you
are talking about a _boolean expression_.

* `AND`: `true` only if both the left and right side must evaluate to `true`. If either one or both sides are `false`,
  then the result is `false`.
* `OR`: `true` if either one or both sides are `true`. If both sides evaluate to `false`, then the result is `false`
* `NOT`: The opposite of the given boolean expression. `true` becomes `false`, and `false` becomes `true`.

In both math and computer science, we use _truth tables_. Which show every possible combination of inputs, and then the
output of various functions. These tables help us visualize how different combinations of `true` and `false` are used in
boolean expressions.

| X       | Y       | X AND Y | X OR Y  |
|---------|---------|---------|---------|
| `true`  | `true`  | `true`  | `true`  |
| `true`  | `false` | `false` | `true`  |
| `false` | `true`  | `false` | `true`  |
| `false` | `false` | `false` | `false` |

| X       | NOT X   |
|---------|---------|
| `true`  | `false` |
| `false` | `true`  |

The math community likes to use the letters `p`, `r`, and `q` for the variables, and other fancy symbols to represent "
and", "or", and "not", but we are not going to worry about that. After all, they are just symbols to represent
something! Most people are accustomed to using `x`, `y`, and `z` for variables, and I'll just use the full words for
operations.

#### Future Lesson

Boolean algebra is so important in programming, we will soon have a whole lesson dedicated to it! The truth tables above
are simple examples, but boolean expressions can get very complicated.

> _But isn't this lesson already about boolean algebra?_

This lesson is an _introduction_ to boolean algebra! There is so much more to learn!

### Java Boolean Algebra

* `&&` "AND", Two ampersand symbols
* `||` "OR", Two straight-pipe symbols
* `!` "NOT", Exclamation mark
    * Placed directly before the boolean expression. Note: a single `boolean` variable is considered to be a boolean
      expression.

You can review the order of operations for Java at
https://docs.oracle.com/javase/tutorial/java/nutsandbolts/operators.html if you want to see where these symbols fall in
precedence. Remember, top has the highest precedence!

### Boolean Algebra Practice

You can leave your code in the program from above, but to save space in this document, I am going to leave it out. When
I do this, you may see a comment which says something like: "previous code left out for brevity".

```java
package aetherial;

public class BooleanLearning {

    public static void main(String[] args) {
        // Previous code left out for brevity
    }

}
```

Create a few `boolean` variables:

* Is `14` an even number?
* Is `7` an even number?

_Hint: Both of these should use `%` and `==`. You can always review previous lessons if you forgot how to do something!_

Then create a few more `boolean` variables using boolean expressions:

* Are both `7` AND `14` even numbers?
* Is `7` OR `14` an even number?
* Is `7` NOT an even number?

Then print out the answers to the questions directly above. I'll be nice and provide the template print statements.

```java

package aetherial;

public class BooleanLearning {

    public static void main(String[] args) {
        // Previous code left out for brevity
        // ### Your code starts here! ###

        // Change the print statements to include your answers!
        System.out.println("True or False: 7 AND 14 are even numbers? ");
        System.out.println("True or False: 7 OR 14 is an even numbers? ");
        System.out.println("True or False: 7 is NOT an even number? ");
    }

}
```

Output:

```text
(Previous output left our for brevity)
True or False: 7 AND 14 are even numbers? false
True or False: 7 OR 14 is an even numbers? true
True or False: 7 is NOT an even number? true
```

Again, I will include a possible solution towards the bottom.

## Possible Solutions

**DO NOT WORRY IF YOUR CODE DOES NOT MATCH!!!** There are so many ways to accomplish the same goal in programming.

### Comparing Numbers

```java
package aetherial;

public class BooleanLearning {

    public static void main(String[] args) {
        int circleRadius = 4;
        int squareSideLength = 8;

        int circleDiameter = circleRadius * 2;
        int squarePerimeter = squareSideLength * 4;
        // We are just going to use the short value for PI in this code
        double circlePerimeter = 2 * 3.14 * circleRadius;
        double circleArea = 3.14 * circleRadius * circleRadius;
        int squareArea = squareSideLength * squareSideLength;

        // ### Your code goes below here! ###
        boolean isCircleBiggerThanSquare = circleArea > squareArea;
        boolean isCircleDiameterEqualToSquareSide = squareSideLength == circleDiameter;
        boolean isSquarePerimeterBiggerThanCirclePerimeter = circlePerimeter < squarePerimeter;

        // Change these print statements to include the answer at the end like in the example!
        System.out.println("True or False: The circle has more area than the square? " + isCircleBiggerThanSquare);
        System.out.println("True or False: The diameter of the circle is equal to the side of the square? " + isCircleDiameterEqualToSquareSide);
        System.out.println("True or False: The Square has a larger perimeter than the circle? " + isSquarePerimeterBiggerThanCirclePerimeter);
    }

}
```

### Boolean Algebra Practice

```java
package aetherial;

public class BooleanLearning {

    public static void main(String[] args) {
        // Previous code left out for brevity
        boolean isSevenEven = 7 % 2 == 0;
        boolean isFourteenEven = 14 % 2 == 0;

        boolean bothSevenAndFourteenAreEven = isSevenEven && isFourteenEven;
        boolean sevenOrFourteenIsEven = isSevenEven || isFourteenEven;
        boolean isSevenNotEven = !isSevenEven; // 7 % 2 != 0; would also work here!

        System.out.println("True or False: 7 AND 14 are even numbers? " + bothSevenAndFourteenAreEven);
        System.out.println("True or False: 7 OR 14 is an even numbers? " + sevenOrFourteenIsEven);
        System.out.println("True or False: 7 is NOT an even number? " + isSevenNotEven);
    }

}
```

## Recap

In this lesson, you learned about:

* Boolean comparison operators
* Boolean expression operators
* Boolean truth tables
* There are many correct solutions for even simple programs!

## Next Steps

I hope you took time in understanding this lesson. You can always come back to review as needed! Just like in all the
previous lessons, we will be using this lesson in all lessons going forward! Computer science and programming builds on
itself. Practice, practice, and more practice is how you will get better, just like with anything in life!

You've made it this far already, and you're doing a great job! When you are ready, move on to [Lesson 7](../lesson-008).