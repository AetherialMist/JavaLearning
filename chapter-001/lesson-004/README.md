# 1.4 Variable Naming and Keywords

## Naming Variables

There are 3 common problems that programmers face every single day:

1. What to name things
2. Off by one errors

_(I know what I said, there are no typos here!)_

There is nothing stopping you from naming your variable `chickenNugget`, but you **_should_** name your variables in a
way such that the name describes the purpose of the variable. One way you can help yourself use meaningful names, is to
think about if another person were to look at your code, would they know what the variable is supposed to represent?

## (Optional) New Project

For this lesson, you can create a project to follow along, or just read. Whatever works better for you!

## Example Program

### Bad Variable Naming

Below is an example of bad variable naming.

```java
package aetherial;

public class BadVariableNaming {

    public static void main(String[] args) {
        int bubbles = 12;
        int tacos = 4;
        int waterBottle = bubbles * 2 + tacos * 2;
        System.out.println("Perimeter: " + waterBottle);
    }

}
```

Output

```text
Perimeter: 32
```

Now this is a very simple example, and by closely looking at what the program is doing, we can safely say the program is
calculating the perimeter of a rectangle. But as programs get bigger and more complicated, we can quickly forget
what `bubbles` represented.

### Better Variable Naming

Notice how I used "Better" instead of "Good". This is because everyone has an opinion, what is _good_ variable naming to
me, is likely going to be different from your definition of _good_ variable naming.

```java
package aetherial;

public class BetterVariableNaming {

    public static void main(String[] args) {
        int length = 12;
        int width = 4;
        int perimeter = length * 2 + width * 2;
        System.out.println("Perimeter of rectangle: " + perimeter);
    }

}
```

I even changed the words in the print statement! Now we know that we are talking about the perimeter of a rectangle, and
not a circle or some other shape.

Variable names can be almost as long or short as you want them to be. We could have easily used
`lengthOfTheRectangle` instead of just `length`. So why didn't I? Well, I made a judgement call. This small program only
uses one shape, a rectangle, so I decided just `length` was enough. I could have also used `rectangleLength`, all these
different naming options make logical sense for the program, but I made a choice.

This type of choice leads into a personal _programming style_. We've barely covered the very long list of choices
programmers encounter, and since humans are creatures of habit, our programming styles eventually show (especially in
complex programs). While I was a teacher's assistant for computer science in college, this was actually one of the ways
we used to determine cheating on program assignments. That is just how distinctive styles can be!

## Naming Conventions

Most of the Java programming language is built on, _drum roll_, Java! This means the original authors of Java have
already made several decisions which everyone considers to be the correct way. You may have already noticed how I've
been including some capitalization in my different variables. This is because of Java naming conventions.

Capitalization, or lack of, is extremely important in Java. Here are some of the naming conventions we need to follow
right now:

* `camelCase`
    * The first letter of the first word is always lowercase.
    * The first letter of all words after the first, are capitalized.
    * Used for:
        * Variable names
        * Method names (we'll talk about this in a future lesson)
    * Examples:
        * `lengthOfTheRectangle`
        * `mySuperCoolVariable`
        * `main` (the entry-point of our programs!)
* `PascalCase`
    * The first letter of all words are capitalized
    * Used for:
        * Class names
    * Examples:
        * `HelloWorld`
        * `PrintingMath`
        * `String`

## Reserved Words and Keywords

There are some names in Java which are _reserved_, meaning you can not use them for variable names. There are also
_keywords_, which are also _reserved_, that you can not use for Class names, method names, or variable names.

We've been using keywords a lot already, these are words like `public`, `static`, `void`, `int`, and `double`. Intellij
will usually turn these words into a different color than others.

We've also used one reserved word several times: `String`. Class names are considered to be reserved words, but since
they use PascalCase and variables use camelCase, we typically do not run into problems with our variable names.

Names of any kind, classes, variables, methods, etc. must be alphanumeric. Which means letters "a" through "z" (both
lower and capital) and numbers "0" through "9" are the only allowed characters. The names must also start with an
alphabetical letter, so `a0123` is valid, but `0abcd` (which starts with a number) is **not** valid.

There is a huge list of reserved words in Java, you can look at most of them here:
https://www.w3schools.com/java/java_ref_keywords.asp
. We'll eventually cover most of these.

## Comments

Sometimes while programming, you want to leave little notes. So how do you leave a note that isn't code? The answer 
is "comments"!

There are two main ways to create comments: single line comments and multi-line comments.

To make a single line comment, just use two forward slashes `//` followed by your note!

```java
package aetherial;

public class VariableNaming {

    public static void main(String[] args) {
        // This is a single line comment! Java will not try to run this line!
        int length = 12;
        int width = 4; // You can also put single line comments at the end of a line!
        int perimeter = length * 2 + width * 2;
        System.out.println("Perimeter of rectangle: " + perimeter);
    }

}
```

To make a multi-line comment, use a forward slash followed by an asterisk `/*` to signify that start, and an 
asterisk followed by a forward slash`*/` to signify the end!

```java
package aetherial;

public class VariableNaming {

    public static void main(String[] args) {
        int length = 12;
        int width = 4;
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
```

You can also comment out actual code! This is very useful while testing functionality, so you don't have to remember 
what you previously did!

```java
package aetherial;

public class VariableNaming {

    public static void main(String[] args) {
        int length = 12;
        //int length = 12375;
        int width = 4;
        int perimeter = length * 2 + width * 2;
        
        System.out.println("Perimeter of rectangle: " + perimeter);
    }

}
```

Since we commented out `int length = 12375`, that line will not be executed by Java!

Adding comments to code is a huge debate among the computer science industry. My personal stance on the matter is: 
If you are doing something _weird_, or you feel like some code deserves a comment or two or seven, just add the 
comment. Having graded programming assignments, and especially working professionally, **please** just add comments. 
I can not tell you how many times I have attempted to use someone else's code, only to find a huge confusion mess 
that takes me hours to unravel and figure out, and where if the original author had just included a few comments 
explaining what was happening, would have saved me all those hours.

Going forward in this guide, I will be adding little comments to my programs to help explain things!

## Recap

In this lesson, you learned about:

* Meaningful variable naming
* Naming conventions
* Reserved words and Keywords
* Adding comments to your code

## Next Steps

This was a small lesson, mostly just additional rules to keep in mind while programming in Java.

[Completed Code](completed)

[Previous](../lesson-003) | [Next](../lesson-005)