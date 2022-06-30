# Lesson 7 - User Input and Intro to Methods

## User Input

Up until now, our programs have only used _hard coded_ values, values that are the same each time the program runs. That
is boring. So this lesson I am going to introduce how to get input from the user running the program (which will still
likely be you).

### Create a New Project

Create a new project, name this one "SimpleInput".

### Scanner

Introducing some new magical code! The `Scanner` _type_.

```java
package aetherial;

import java.util.Scanner;

public class SimpleInput {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
    }

}
```

You may recognize something that looks familiar. When we print to the output, we use `System.out`. Now for input, we are
using `System.in`!

This fancy `Scanner` type requires a keyword called `new`. Notice how we are using the assignment operator `=`,
`Scanner` is not a Java primitive type, so we use the `new` keyword to create a _new_ `Scanner` value. This is how we
create _new_ values for all non-primitive types, with the only exception being the `String` (which you already know how
to make!).

The `Scanner` type needs one more important piece of information, a source of input, so we give it the _system's input_,
and we do this by putting `System.in` inside parenthesis.

Putting it all together, we get: `new Scanner(System.in)`.

> _Okay, I barely understand what is going on here... And you still haven't explained what "import" means at the top!_

For the `Scanner` type, just understand that it is now another type you can use. So now you have got Java primitives,
`String`, and `Scanner` all under your belt!. We are just creating a variable of this new type, which we will be able to
use in out programs to get input from the user at the keyboard.

Now about that `import java.util.Scanner;` near the top. If you recall all the way back to [Lesson 0](../lesson-000)
(yes, we are going back _that_ far!), when you installed Java, you installed two very important things.

First, the Java Virtual Machine (JVM). Intellij compiles the programs you create and then sends them to the JVM to run.
Without the JVM you would not be able to run your programs.

Second, the Java core library. This is a bunch of code that is already written, compiled, and ready for you to use 
in your programs! `Scanner` is a part of this _library_. When we want to use something from the Java library, we use 
the `import` keyword followed by the type we want to use, and we do this after the `package` line, but before the
`public class` line. Once we include an _import statement_ in our program, Java knows we want to use code from 
somewhere else.

> _How many types are in this "Java core library"?_

Well, I've been programming in Java for about eight years as of writing this sentence. I am still learning about 
types included in the core library. So I guess the answer is: **Very many**. A more precise 
number, would be about 4,389 non-primitive types in Java 17!

### Using Scanner - Intro to Methods

> _Okay, so we have a new type. What does it do? More math?_

Don't worry, the `Scanner` is not for math. As mentioned earlier in the lesson, we use the `Scanner` to get the 
user's input in our program. This is where _methods_ come in. All non-primitive types have special traits called 
"methods". We use these methods to interact with the type value stored in our variables.
