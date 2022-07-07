# 1.7 - Classes Continued

## Create Another Project

You can call this project `ClassesPart2`.
Remember, we are using the name `Runner` for the `class` containing the main method now!

```java
package aetherial;

public class Runner {

    public static void main(String[] args) {
        
    }

}
```

Also go ahead and create a `class` called `Calculator` with a _default constructor_.

```java
package aetherial;

public class Calculator {
    
    public Calculator() {
        
    }

}
```

## Multiple Method Parameters

In the previous lesson, we only created a single method with a single parameter. This time we will create multiple 
methods with multiple parameters!

Here are the _method signatures_ we are going to implement:

* `public int mult(int x, int a)`
* `public int add(int a, int b)`
* `public int sub(int x, int y)`
* `public int div(int x, int y)`

Notice how when we have more than one argument, we separate them with a comma `,`. And each parameter must have a type.

### The `return` Keyword

In the previous lesson, our method had a _return type_ of `void`, meaning the method _returns_ nothing. But if you 
have not already realized, the method signatures I gave you above all have a _return type_ of `int`. So the question 
is: how do we _return_ something from a method, and what does that do?

The format for a _return statement_ is simple: ideally as the last line in the method scope, we use `return VALUE;`. 
Once the program hits a _return statement_, the method stops executing, and returns the value to the caller.

> _Who is the "caller"?_

This one is an easy answer, you _called_ the `print` method on your `Printer` instance in the last lesson. That 
method had a return type of `void`, so it did not return anything, instead it just executed some code then stopped.

Go ahead and implement the `mult` method like below:

```java
package aetherial;

public class Calculator {
    
    // Java will create this exact constructor for us if 
    // we do not create any of our own constructors.
    public Calculator() {
        
    }
    
    public int mult(int x, int a) {
        return x * a;
    }

}
```

### Using Returned Values

Now back in your `Runner` class

1. Create a `Calculator` 
2. A new `int` variable
3. Set the variable to the result of a call to your new `mult` method
4. Print the variable

```java
package aetherial;

public class Runner {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int x = calculator.mult(15, 6);

        System.out.println(x);
    }

}
```

Your `mult` method returns an `int` value, so we can use the result of _calling_ your `mult` method anywhere we can 
use an `int`.

Now let us make this a little more complex:

```java
package aetherial;

public class Runner {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int x = 15;
        int y = 6;
        int z = calculator.mult(x, y);
        
        System.out.println("Z: " + z);
    }

}
```

We used variables as arguments for our method!

### The Java Stack

To start off, we are going to demonstrate the Java Stack.

> _You haven't even told me what this Java Stack is yet..._

That is because I believe the better approach is to demonstrate the Java Stack first, then explain what is happening.

Change your implementation of the `mult` method from above to look like:

```java
package aetherial;

public class Calculator {
    
    // Constructor left out for brevity
    
    public int mult(int x, int a) {
        x = x * a;
        return x;
    }

}
```

Notice how we reassign the variable `x` that was given to the method. Then update the `Runner` to include a few more 
print statements.

```java
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
    }

}
```

Output:

```text
Z: 90
X: 15
Y: 6
```

> _Why wasn't `x` changed???_

If you recall in the previous lesson, I mentioned that the variable names in the parameters do not have to match the 
names of the variables we pass in. Even though our variables is called `x`, and the variable for the method is also 
called `x`, they are **not** the same variable! The program worked just fine with our variable `y` being passed as 
parameter `a`.

So why did the variable we passed in for `x` not change in our main method? When you call a method, and pass in 
parameters, Java actually gives _copies_ of the values stored in the variables to the method. This is why changes to 
`x` or `a` inside the `mult` method, will not change the values of `x` and `y` in our main method.

This process is a little more complex with non-primitive types though. We will get to that in a later lesson.

### Implement Remaining Methods

Go ahead and create the remaining methods: `add`, `sub` (subtract), and `div` (divide). Such that the additional 
print statements below give the expected answers:

```java
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
```

> _Wait, `System.out.println` is a method?!_

I was wondering when you would finally ask that! Yes, `println` is a method of `System.out`. `System` is a `class` 
in Java with many useful methods and other parts. `out` is not a method itself, but is a "static class attribute", 
that has a method of `println`.

> _What is a static class attribute????_

Probably your favorite answer from me by now, we'll explain that in detail in a future lesson! Don't worry about it 
right now!

## Recap

In this lesson you learned about:

* Creating methods with multiple parameters
* The Java Stack
* In-lining method calls