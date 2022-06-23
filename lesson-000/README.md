# Lesson 0 - Integrated Development Environment (IDE)

[Next Lesson - Lesson 1](../lesson-001/README.md)

## Terminology

See the [terminology](../terminology.md) page. The first time unfamiliar terminology is used, there will usually be a
hyperlink to the terminology page. If not, there is always [Google](https://google.com).

## Getting Started

Sure you could write raw Java files using Microsoft Notepad, but you will not be able to run the code unless you install
Java onto your computer. So let us install Java to get started.

### Install Java

1. Go to [Adoptium's Website](https://adoptium.net/) and download the "Latest [LTS](../terminology.md) Release"
   installer for your [OS](../terminology.md).
    * What is Adoptium? It is an [open-source](../terminology.md) implementation of Java.
    * Why use Adoptium? Because it is free and widely used by the Java community. Otherwise, you have to pay money to
      Oracle, and nobody wants to do that when there is a perfectly good, free version available.
    * Why do I need to install Java, I thought it was a programming language for files? Well yes, kind of. What you are
      installing is called the [Java Virtual Machine](../terminology.md) (JVM). The JVM is what actually runs your code;
      there are some steps in-between, but we will cover that much later. On top of that, you are downloading the Java
      core library. Java contains a massive [library](../terminology.md) of code that you use to crete your code. Trust
      me, you do _not_ want to start from the very bottom.
2. Run the installer. You should be fine to accept all the defaults.
    * Be careful of any [bloat-ware](../terminology.md), and make sure to uncheck it!
        * Usually asks questions such as: "Would you also like to install this other software while we install what you
          actually want?"
    * Pay attention to _where_ Java is being installed, as you may need this information later.
        * On Windows, it should install somewhere like `C:\Program Files\Eclipse Adoptium\jdk-VERSION-hotspot`

### Java is installed, now I can program right?!

If you pain and suffering, sure. If you have even a shred of dignity, you will also want to install
an [Integrated Development Environment](../terminology.md) (IDE). Think of this as software that helps you write
software. Java text files are exactly just that, text files. They sure are human-readable (hopefully), but the JVM that
actually runs your code, has absolutely no _idea_ (future pun incoming) what to do with them. You have
to [compile](../terminology.md) (transform) your text files into special files called "Java
[byte-code](../terminology.md)" that the JVM understands and are most definitely not human-readable. We will 
actually take a quick look at Java byte-code later, so you can see how unreadable it really is.

Installing Java on your computer gives you the ability to run the `javac` command on a terminal; "javac" simply means "
Java compile" followed by your program files. If anyone ever tells you to compile your code manually using
`javac`, never speak to them again, seriously. Any sane person will use an IDE to write their program and then make the
IDE compile the code for them. For this reason, I am not going to explain using `javac`.

There are many "flavors" (options) of IDEs out there that can be used for Java programming: Visual Studio Code,
NetBeans, Eclipse, etc. The one this guide uses, and one of the most popular by far, is called Intellij IDEA
(there's the pun).

### Install Intellij IDEA

1. Go to the [Jetbrains IDEA Website](https://www.jetbrains.com/idea/download/).
2. Download the "Community" version.
    * The only real reason to get Ultimate is for Spring support (a [framework](../terminology.md) built on Java).
    * Again, you should be fine using all the default installation options, be ever vigilant watching for bloat-ware.

### _Now_ can I finally write a program?

Yes! But not in this lesson, you are done here, go on to [Lesson 1](../lesson-001)!