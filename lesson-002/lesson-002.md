# Lesson 2 - Types and Objects

## Types in the real world

In the real world, we have lots of _types_ that we use daily: single words, sentences, paragraphs, whole numbers,
decimal numbers, nouns, verbs, adjectives, and so many more! We just don't typically _think_ about all these
"things" as _types_, but they are!

If a person tells you they drive a **Truck**, you likely have at least some knowledge about what they are talking about,
and what trucks are used for -- typically pulling trailers or other heavy stuff. What you don't know is what brand of
truck is it, how much horsepower it has, the color, and you don't really care. What you do care about, is that you can
pull trailers with it! This actually ends up being a huge topic in computer science and will have multiple lessons
dedicated to later on.

Similarly, if I asked you what `2 + 4` is, you would _know_ that I asked you to add two numbers together. This
combines _syntax_ with _types_. Taking a step back to basic algebra class, I asked you what a "Number Plus another
Number" is. And that is something Java also understands!

## Types in Java

Just as we have types in the real world, Java has its own definition of types. For now, we will only worry about Java
"_primitive types_" plus one regular type.

Java has 8 primitive types:

* `byte` Whole numbers ranging from `-128` to `127` ([inclusive](../terminology.md))
* `short` Whole numbers ranging from `-32,768` to `32,767` (inclusive)
* `int` Whole numbers ranging from `-2,147,483,648` to `2,147,483,647` (inclusive)
* `long` Whole numbers ranging from `-9,223,372,036,854,775,808` to `9,223,372,036,854,775,807` (inclusive)
* `float` Decimal numbers with whole numbers equal to an `int` and up to 7 decimal places. (has additional special
  properties discussed later)
* `double` Decimal numbers with whole numbers equal to a `long` and up to 16 decimal places.
* `boolean` Either `true` or `false`, you can think of it as "yes" or "no", but for computers.
* `char` A single letter, or _character_, between single quotes `'`. Examples: `'A'`, `'9'`, `'Æ'`.
    * **Hey you put a number in there!** No I did not. As soon as I put that single digit "number" between single
      quotes, it became a `char`.
    * There will be more on `char`s in a later chapter! As they too have special properties.

The "one regular type" we also care about right now is called the `String`. A `String` is an ordered collection of
`char`s (without their single quotes) all between double quotes. In the previous chapter, when you used
`System.out.println("Hello world!")`, `"Hello world!"` was a `String`! I had already tricked you into using a Java type
without telling you!

## Type Assumptions

You may have noticed that there is a **lot** of overlap between the number types. So how does Java tell the different
between them? Well that is one very complicated question to answer fully, the short answer though, is that Java will
make _assumptions_ about the exact type of number being used.

Without additional information about which type a number is (we will learn about how to do this soon), here are the
basic assumptions Java will use:

* Any whole number is an `int` (you can NOT have a decimal point!!!)
* Any decimal number is a `double`
* Anything between double quotes is a `String`
* `true` and `false` are `booleans` (unless between double quotes!)
* Any single character being single quotes is a `char`
    * If you try putting more than a single character between single quotes, you will get a "syntax error"

And in most cases, this is completely correct!

## [Syntax](../terminology.md) Errors

Intellij will underline any syntax error with a red squiggle, and trying to run your application will output an error
that may include messages like "java: not a statement". Thankfully, Intellij will also usually include a hyperlink you
can click on to go to that exact location in your code where the error happened!

## Practice Using Types

### Create a new project

Create a new project called "PrintingTypes" following the instructions from last chapter, and create the `main` Class.
Your starting point should look similar to this:

```java
package aetherial;

public class PrintingTypes {

    public static void main(String[] args) {

    }

}
```

### Using System.out.println

Remember how before I told you that anything between the parenthesis of `System.out.println();` will be printed to the
console (output)? Previously we used a `String` to print out words, but we can print out any Java type! So let's go
ahead and print a few examples.

We are going to print: a whole number (`int`), a decimal number (`double`), a `boolean`, a `String`, and a `char`. You
can use any valid value for these types, but below is an example program.

```java
package aetherial;

public class PrintingTypes {

    public static void main(String[] args) {
        System.out.println(5);
        System.out.println(12.7);
        System.out.println(true);
        System.out.println("Hello World!");
        System.out.println('A');
    }

}
```

Notice how we put each `System.out.println();` on its own line in the file. This makes it easier to read!

Your console output should look similar to the following (using whatever values for the types you specified):

```text
"C:\Program Files\Eclipse Adoptium\jdk-17.0.1.12-hotspot\bin\java.exe" bla bla bla I am going to stop including this in the future
5
12.7
true
Hello World!
A

Process finished with exit code 0
```

### Code Readability

Java only cares about _syntax_, but as humans we also care about _format_. You have probably noticed the indentation
used within the code files already. This indentation makes our code easier to read and understand.

Technically speaking, the following is still proper Java syntax and will run, but is a pain for us to read:

_Ignore this @formatter nonsense, you can enable a setting to disable formatting for sections of code and files which is
sometimes useful. (I'm writing this whole guide using Intellij IDEA !)_

@formatter:off 
```java
package aetherial;public class PrintingTypes{public static void main(String[] args){System.out.println(5);System.out.println(12.7);System.out.println(true);System.out.println("Hello World!");System.out.println('A');}}
```
@formatter:on

You can try this yourself, or just take my word (I promise I'm good for it!).

Intellij will handle a lot of _format_ automatically while you type. A generally good "coding practice" (you will hear
this phrase a _lot_), is to "reformat" your code regularly.

1. Make sure you do not have anything highlight with your mouse cursor. Just have the blinking little text cursor at the
   end of a line anywhere in the file.
2. At the very top from the Menu Bar, navigate to `Code -> Reformat Code` and select it (`left-click`).
3. Intellij will do all the hard word to format your code back to a human-readable format!
    * Assuming you do not have any [_syntax_](../terminology.md) errors! Errors in this context, simply meaning invalid
      syntax.

### Everything Prints as a String

When you print types to the console, us humans like to be able to read it. So Java goes through a process to convert
everything into a `String` before printing it out. The numbers and other types are still their respective types, they
just _temporarily_ get treated as `String`s for printing. This is convenient for us, because the way Java actually
handles numbers and types is not human-readable at all.

## Recap

In this lesson, you learned about:

* Java primitive types
* The `String` type
* Code format
* Printing multiple types to the console
* Java assumptions

## Next Steps

This was a lot of information to take in at once. I encourage you to re-read through this lesson a few times, as we are
going to be expanding on this knowledge in all future lessons. Programming builds on top of itself, what you learn on
day 1, will be used every single day after that, and the same goes for day 2, day 3, day 4, ... day when you stop
programming (hopefully you never give up!).

So unlike school, where they teach memorization, test on the topic, and then never talk about it again and move onto the
next topic, rinse and repeat; programming will always reuse previously learned information to continue building, and
that new information will get reused, and so on. So why did I basically just say the same thing twice? Because it is
that important!

Time to head to [Lesson 3](../lesson-003/lesson-003.md)! (Feel free to take breaks, get up and stretch, refill your
water, etc.!)