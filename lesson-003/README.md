# Lesson 3 - Intro to Types Part 2

[Previous Lesson - Lesson 2](../lesson-002)

[Next Lesson - Lesson 4](../lesson-004)

## Math

No, stop running away! I promise no complicated math! And we'll make Java do all the hard work!

Last lesson you were introduced to Java primitive types, but we didn't really do anything with them besides printing
(which you're a total pro at doing now!). I teased that Java is able to understand math the same way we do, and in this
lesson we are going to show that!

## Create Another Project

At this point your "projects" folder should look something like:

```text
JavaProjects
|-- HelloWorld
|-- PrintingTypes
```

We are going to add another project for this lesson, and let's call it "PrintingMath". The process is the same as
before, so review the previous [lessons](../lesson-001/README.md) if you aren't sure. Remember to make that initial
package and `main` Class!

## Java Math Operators

Java has a set of symbols that are used for math. They are as follows:

* `+` Addition
* `-` Subtraction
* `*` Multiplication (the asterisk symbol)
* `/` Division (forward slash)
* `%` Modulo (percent sign)

Whoa! What in the world is "Modulo"??? The `%` operator is mostly used with Integer math (whole numbers). Integers do
not have factions, so while division gives you how many times the second number fits in the first number, modulo gives
you the remainder. So `7 / 4` we know would be `1.75`, but Integer math does not allow that! Instead, we will find that
Java treats `7 / 4` as `1`, because `4` only fits into `7` one time. If we use the _modulo_ operator instead, so `7 % 4`
we end up with `3`! We took out as many "fours" as we could from `7` and we were left with `3`. For this reason,
_modulo_ is often called the _remainder_ operator.

## Oder of Operations

With these operators in mind, we can make Java do math! And Java follows _almost_ the same basic math rules as us! In
school, you probably learned about "PEMDAS" or Parenthesis, Exponents, Multiplication, Division, Addition, Subtraction
in that exact order. Java works ever so slightly differently!

1. Parenthesis
2. Multiplication and Division, left to right (we will show this soon)
3. Addition and Subtraction, left to right

Java does not have a nice symbol used for exponents, unfortunately that process is a bit more complicated and will be
introduced in a later lesson.

## Integer (whole number) Math

Let's start by just adding two `int`s together. You can look back to the previous [lesson](../lesson-002/README.md)
for a refresher if needed. Remember that `int`s are whole numbers, and Java assumes you are using `int`s in most cases.
I picked `12` and `5` to be added, but you can pick any two numbers you want, as long as the first is bigger than the
second.

```java
package aetherial;

public class PrintingMath {

    public static void main(String[] args) {
        System.out.println(14 + 5);
    }

}
```

Output (using example above)

```text
19
```

Neat! That is pretty boring though. I know, I know, we have to start somewhere though.

### Integer Division

Add another print statement below the first one, this time with `14 / 5` and run again.

Output

```text
19
2
```

Okay, we talked about this earlier in the lesson, Integer math does not allow fractions. They simply get "dropped", also
called "truncated".

### Integer Modulo

Let's use that fancy new modulo operator! Another print statement! `14 % 5` go!

Output

```text
19
2
4
```

One way to think of modulo, is to keep subtracting the second number from the first until the first number is no longer
big enough, and then return whatever is left. We will manually do this in a later lesson!

# Integer Multiplication and Division

We talked before that Java treats multiplication and division with the same _precedence_ level, meaning they will be
solved left to right, regardless of the operation used.

To showcase this, we are going to make a print statement with several operations. `6 * 4 / 3`

Output

```text
19
2
4
8
```

Now another print statement, `6 / 4 * 3` go!

Output

```text
19
2
4
8
3
```

If Java had done multiplication before division (like in PEMDAS), then the final line would have been `0` (6 / 12). But
that did not happen! Instead, we got:

`6 / 4 * 3` --> `1 * 3` --> `3`

Finally, some parenthesis! `5 * (2 + 3)` notice how we MUST but the `*` between the `5` and `(`. In regular math, we can
use a shorthand like `5(2 + 3)`, but Java does not understand this!

Output

```text
19
2
4
8
3
25
```

### Current Program

```java
package aetherial;

public class PrintingMath {

    public static void main(String[] args) {
        System.out.println(14 + 5);
        System.out.println(14 / 5);
        System.out.println(14 % 5);
        System.out.println(6 * 4 / 3);
        System.out.println(6 / 4 * 3);
        System.out.println(5 * (2 + 3));
    }

}
```

## Double Math

Keep all your print statements from Integer Math, we are just going to keep adding more!

To use `double`s instead of `int`s, just add a decimal place! We will not be using modulo with `double`s, and you will
see _why_ in a few seconds (it's not accurate at all).

* `5.0 + 3.0`
* `5.0 + 3.87`
* `5.1 - 3.87`
* `5.0 * 3.0`
* `5.1 * 3.0`
* `5.1 / 2.5`
* `5.0 / 3.5`

**_WARNING_**: We are going to get some _weird_ results.

Output

```text
(I am leaving out the Integer section)
8.0
8.870000000000001
1.2299999999999995
15.0
15.299999999999999
2.04
1.4285714285714286
```

You may not even get the exact same results shown here!

**_WHAT IS HAPPENING? THAT IS NOT MATH!_**

It's okay, take deep breaths! Let's talk about this.

The problem originates from the fact computers only understand `1`s and `0`s. Decimal points don't exist in that format.
So `double`s and `float`s are both treated as "floating point numbers", the key word being "floating", not precise.
Later we will introduce a special _type_ that can retain exact precision of decimal numbers. But for now, we will just
continue using `double`s. You can use our good friend Google, to learn more about why Java floating point numbers are
not very accurate.

### Current Program

```java
package aetherial;

public class PrintingMath {

    public static void main(String[] args) {
        System.out.println(14 + 5);
        System.out.println(14 / 5);
        System.out.println(14 % 5);
        System.out.println(6 * 4 / 3);
        System.out.println(6 / 4 * 3);
        System.out.println(5 * (2 + 3));

        System.out.println(5.0 + 3.0);
        System.out.println(5.0 + 3.87);
        System.out.println(5.1 - 3.87);
        System.out.println(5.0 * 3.0);
        System.out.println(5.1 * 3.0);
        System.out.println(5.1 / 2.5);
        System.out.println(5.0 / 3.5);
    }

}
```

## Mixing Types With Math

What happens if we mix types? `int`s and `double`s? Let's find out!

* `4 * 2.3`
* `2 / 3.7`
* `3.7 / 2`
* `12 + 5.8`
* `"Hello" + ", world!"`
* `"Hello" + 12`
* `"Hello" + 12 * 3.5`
* `"Hello" + 12 + 3.5`

**_Hey! You tried sliding some `String`s in there!_**

Sure did! Let's see what happens!

Output

```text
(leaving out the previous sections)
9.2
0.5405405405405405
1.85
17.8
Hello, world!
Hello12
Hello42.0
Hello123.5
```

So it looks like anytime there is a `double` in the equation, the result is still a `double` (ignoring the lines
with `String`s!).

Now what happened in those lines with `String`s?

* `"Hello" + ", world!"` The `String`s were combined into one big `String`
* `"Hello" + 12` The `12` was just added to the end of the `String`
* `"Hello" + 12 * 3.5` The two numbers were multiplied, then added to the end of the `String`
* `"Hello" + 12 + 3.5` Each number was added to the end of the `String` on at a time to make one big `String`

**_What is happening!?!?_**

### Current Program

```java
package aetherial;

public class PrintingMath {

    public static void main(String[] args) {
        System.out.println(14 + 5);
        System.out.println(14 / 5);
        System.out.println(14 % 5);
        System.out.println(6 * 4 / 3);
        System.out.println(6 / 4 * 3);
        System.out.println(5 * (2 + 3));

        System.out.println(5.0 + 3.0);
        System.out.println(5.0 + 3.87);
        System.out.println(5.1 - 3.87);
        System.out.println(5.0 * 3.0);
        System.out.println(5.1 * 3.0);
        System.out.println(5.1 / 2.5);
        System.out.println(5.0 / 3.5);

        System.out.println(4 * 2.3);
        System.out.println(2 / 3.7);
        System.out.println(3.7 / 2);
        System.out.println(12 + 5.8);
        System.out.println("Hello" + ", world!");
        System.out.println("Hello" + 12);
        System.out.println("Hello" + 12 * 3.5);
        System.out.println("Hello" + 12 + 3.5);
    }

}
```

## Type Promotion

What happened was the header of this new section you're reading: "Type Promotion". This actually happened with just
the `int` and `double` combined math too, it just wasn't as clear to see.

Java doesn't know how to directly add an `int` with a `double`. But it does know how to add two `double`s together!
You can also turn any `int` into a `double` by simply adding `.0` to the end of it! Java knows this too, so Java
converts the `int` into a `double` (_promotion_), and **then** does the math. The same applies for all the other math
operators.

In the case of `String`s, this whole time we have been printing number types, and if you recall from the previous
lesson, Java will convert the numbers to `String`s in order to print them. This combined with Java's ability to combine,
or _add_, `String`s together using the `+` operator, ends with similar logic as above. This process of combining
multiple `String`s into one big `String` is called "String Concatenation".

Java knows how to _promote_ `double`s and `int`s to `String`s, and combine `String`s together, so that is what Java
does!

Java will automatically _promote_ types when required, but Java can **_NOT_** _demote_ types on its own. Remember 
that Java does follow its own version for "order of operations". You can use Google to see the full list for 
operation precedence, but there are a _lot_ of operations we have not discussed yet (3 out of 15 if you count 
parenthesis).

**_"on its own," that means there is a way?_**

Yes, but we will cover that in a later lesson!

## Recap

In this lesson, you learned about:

* Using Java number types for math
* Java order of operations
* Automatic type promotion
* String Concatenation

## Next Steps

This lesson started off slow, but that was an interesting finish! I encourage you to experiment with the math operators
on your own. What happens if you _add_ a number first with a `String` second? Intellij will go a good job at making sure
you don't do something that is not allowed in java (like using multiplication on a `String`), watch for those red
squiggles!

Once you have satiated your curiosity, move on to the next lesson, [Lesson 4](../lesson-004).