# 1.3 - Variables

## The Box Analogy

Up to this point, we've just been printing types, which is not very interesting. This is going to change with the
introduction of _variables_.

You've probably dealt with variables in math class. But have no fear! We will not be solving equations to learn what
`x` is, we will already know what `x` is, the process for now will just look similar to math.

So, what is the "Box Analogy" you may ask. It is probably one of the worst, but most accurate, analogies in Computer
Science. Imagine you have a box that fits exactly **one** thing:

* You can put something into the box.
* You can look to see what is inside the box.
* You can give the box to someone else.
    * Then, _they_ can look to see what you put in the box.
* You can replace what is in the box.
* You can put _nothing_ in the box.
    * This ends up being quite dangerous!

This box sounds pretty great! And that is exactly what _variables_ are, a fancy box. The one addition to these boxes
when using Java, is the box is labeled with what _type_ is inside it (we just spent two whole lessons talking about
types!).

## Assignment

Introducing another special operator character: `=` the equals sign!

There are two ways for creating one of these boxes in Java (we will show real examples shortly):

1. `TYPE VARIABLE_NAME = VALUE;` Creates the box and immediately puts something in it, using the assignment operator.
2. `TYPE VARIABLE_NAME;` Creates an empty box, that we can put something into later.

After we have _declared_ (created) our box, anytime we reference `VARIABLE_NAME` in our code, Java knows that we are
talking about our box.

## Create Another Project

Alright, you know the drill. Create a new project and name this one "Variables".

We've already talked about types in previous lessons, and I did my best to format the types `like this` when I could. So
let's try making some variables!

```java
package aetherial;

public class Variables {

    public static void main(String[] args) {
        int x = 5;
        System.out.println(x);
    }

}
```

In this example, we are creating a variable called `x`, of type `int`, and assigning the value `5` to it. Then using our
fancy print statement we've used in every lesson, we ask Java to print `x`. Remember, since we _declared_ our variable
on a previous line (created a box and put something in it), Java knows that we are asking to print an `int`.

When we run our program, we see the following:

```text
5
```

## Flow of Execution

What happens if we switch the order, print first then create `x`? Let's try!

```java
package aetherial;

public class Variables {

    public static void main(String[] args) {
        System.out.println(x);
        int x = 5;
    }

}
```

First, we will probably notice that Intellij has turned the `x` in out print statement red. Red is bad. But we are going
to ignore this and run our application anyway.

You'll probably get some error message like:

```text
D:\Gits\JavaLearning\lesson-004\completed\Variables\src\aetherial\Variables.java:6:28
java: cannot find symbol
  symbol:   variable x
  location: class aetherial.Variables
```

Okay, so it's pretty clear that **order matters**. Java runs our programs from top to bottom. So if we want to use a
variable in our code, we have to make sure we've told Java the variable exists _before_ trying to use it somewhere. Go
ahead and fix the program to be like we first had it.

## Variable Math

Sit back down! The computer is still doing the actual math!

Let's make another variable, and print some math using our variables!

```java
package aetherial;

public class Variables {

    public static void main(String[] args) {
        int x = 5;
        int y = 7;
        System.out.println(x + y);
    }

}
```

Output

```text
12
```

This is a fairly straight-forward example:

1. We made two variables `x` and `y`, each of type `int`, and we set some value to them.
2. We added the two `int` variables together.
   * We told Java _earlier_ in the program what both `x` and `y` actually are.
   * `x` _represents_ 5
   * `y` _represents_ 7
3. We printed the result to the console.

### Persistent

Now to prove that the variables are still intact after using them to print:

```java
package aetherial;

public class Variables {

    public static void main(String[] args) {
        int x = 5;
        int y = 7;
        System.out.println(x);
        System.out.println(y);
        System.out.println(x + y);
        System.out.println(x);
        System.out.println(y);
    }

}
```

Output

```text
5
7
12
5
7
```

Nice! When we gave our boxes, _variables_, to Java, Java only looked in the boxes to see what was in there and did not
replace anything.

### Math During Assignment

We can also have Java do some math using previous variables, when creating new variables!

```java
package aetherial;

public class Variables {

    public static void main(String[] args) {
        int x = 5;
        int y = x + 7;
        System.out.println(x);
        System.out.println(y);
        System.out.println(x + y);
    }

}
```

Output

```text
5
12
17
```

How does this work? Remember our discussion about order of operations? Well, `=` assignment has one of the lowest
priorities of all the operations. So Java will do the math first, then store the final value in our box!

### Assignment After Declaration

```java
package aetherial;

public class Variables {

    public static void main(String[] args) {
        int x = 5;
        int y;
        x = 3;
        y = x + 7;
        System.out.println(x);
        System.out.println(y);
        System.out.println(x + y);
    }

}
```

Output

```text
3
10
13
```

So what happened this time?

1. We declared a variable `x` of type `int` to be `5`
2. We declared a variable `y` of type `int`, and did not set an _initial_ value
3. We changed the value of `x` to be `3`
4. We set the value of `y` to be `x + 7`

When we change the value of an already declared variable, we don't need to specify the type again, Java already knows
what the variable's type is. In fact, **if you try to redeclare the type**, Java will think you are creating a new
variable, but since you already have one with the same name, Java will print an error like "java: variable x is already
defined".

### Other Types

You can create variables using any of the types we've discussed so far; `int`, `double`, `String`, and all the others.
So feel free to experiment with some more variables!

## Recap

In this lesson, you learned about:

* Declaring variables
* Using existing variables to create/set new or existing variable

## Next Steps

[Completed Code](completed)

[Previous](../lesson-002) | [Next](../lesson-004)