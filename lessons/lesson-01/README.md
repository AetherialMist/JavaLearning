# Lesson 1: Hello World

_Everyone's first program_

## Overview

In this lesson we will cover how to create a simple Java application using Maven, and add Git version control to the
final product and push to GitHub.

We are going to cover a lot of bases with this lesson:

* Java & Java Structure & Java Entrypoint
* Maven
* Git
* GitHub

## Getting Started With Maven

---

NOTE

This guide is using Intellij IDEA version 2021.2.3

Newer versions may be structured differently and require searching for the equivalent options in the instructions below.

---

1. Create a folder for all your projects. I recommend a folder high level folder (close to the drive letter)
   named `gits` or `repos`.
2. Open Intellij Idea
3. Select: `File -> New -> Project...`
    * If no open projects are cached, you may have a special starting menu with a `New Project` button or something
      similar.
4. Select `Maven` from the left side panel
5. At the top middle, set the `Project SDK:` to Java 17
    * May show as just `17`
    * May need to select `Add JDK...` and browse to the Java 17 install location
        * Probable Location: `C:\Program Files\Eclipse Adoptium\jdk-VERSION-hotspot`
6. Click `Next` at the bottom right.
7. Change the project location to be in your git folder created in step 1, and set the project name to `HelloWorld`
    * Name: `HelloWorld`
    * Example Location: `D:\Gits\HelloWorld`
    * Notice how the name appears in the location. Intellij will create the project's folder if it does not already
      exist, and warn you if you try to use an existing folder.

This will create a bunch of folders and files for you starting out. We will start with the project's `pom.xml`, also
referred to as the project's POM.

Your POM file should look something like this:

```xml
<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0"
         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
    <modelVersion>4.0.0</modelVersion>

    <groupId>org.example</groupId>
    <artifactId>HelloWorld</artifactId>
    <version>1.0-SNAPSHOT</version>

    <properties>
        <maven.compiler.source>17</maven.compiler.source>
        <maven.compiler.target>17</maven.compiler.target>
    </properties>

</project>
```

Try not to get too caught-up trying to figure out all the community standards and naming conventions. You will learn as
you go!

* `groupId` This is similar to an author ID. There are a few different naming conventions on how you should set this.
  Follow [this link](https://maven.apache.org/guides/mini/guide-naming-conventions.html) for the Apache Maven
  explanation.
    * For personal projects, I recommend just using an online alias all lowercase.
        * Example: `king.pineapple`
        * Which would read as "Pineapple King", as "domain" naming should appear backwards. (There is a good reason for
          this which I am not going to explain here, you can Google it)
* `artifactId` This is the name of this project. Generally this should be all lowercase with dashes '`-`' for spaces.
    * Change this ID to `hello-world` to match naming conventions.
* `version` This is the version of this project, the community standard is to use Semantic Versioning, or "SemVer". The
  details can be found at [semver.org](https://semver.org/).
    * Change the version to `0.1.0-SNAPSHOT` to match community standards.
* `properties`
    * `maven.compiler.source` The version of Java this project is written in.
    * `maven.compiler.target` The version of Java this project should be compiled to.
    * For now, these two should always match versions.
    * We are going to add another property:
      ```xml
      <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
      ```
        * This tells Maven what text-encoding the source code is written using. This information can be found at the
          bottom right of Intellij IDEA: `COL:ROW LINE_ENDINGS TEXT_ENCODING TAB_FORMAT OTHER_THINGS`

Your final POM should look like:

```xml
<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0"
         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
    <modelVersion>4.0.0</modelVersion>

    <groupId>king.pineapple</groupId>
    <artifactId>hello-world</artifactId>
    <version>0.1.0-SNAPSHOT</version>

    <properties>
        <maven.compiler.source>17</maven.compiler.source>
        <maven.compiler.target>17</maven.compiler.target>
        <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
    </properties>

</project>
```

## Creating the Java files

In the `Project` bar on the left of the IDE you should find a `src` folder. This is the source folder for all your code.
Inside `src` should be a folder named `main`, and inside that one a folder named `java`. This `java` folder is where you
will start to add your code.

1. Right-click the `java` folder
2. Select `New -> Package` and name it the same as your `groupId` from the POM file, then press `ENTER`.
    * You can think of Packages as `Java folders`. They appear similar but packages have special meaning in Java.
3. Right-click the package you just created, and select `New -> Package` again, and name this one `lesson01`
4. Right-click the `lesson01` package, and select `New -> Java Class` and name the file `HelloWorld`
    * You can use the `up` and `down` arrows on your keyboard to select the Java Class type, make sure that `Class` is
      highlighted.

You should have a file that looks similar to:

```java
package king.pineapple.lesson01;

public class HelloWorld {

}
```

Inside the curly braces `{` and `}` after `public class HelloWorld`, add the following:

```java
    public static void main(String[]args){

    }
```

This is the entrypoint of any Java application. Java will look for the class
containing `public static void main(String[] variableName)` to know where to start code execution.

Inside the curly braces `{` and `}` after `public static void main(String[] args)`, add the following:

```java
        System.out.println("Hello World!");
```

`System.out.println("SOME_MESSAGE")` will print the message to the console when executed.

Your final application should look like:

```java
package king.pineapple.lesson01;

public class HelloWorld {

    public static void main(String[] args) {
        System.out.println("Hello World!");
    }

}
```

All that is left to do is run it!

1. On the right of the IDE, you should find a `Maven` tab (it may already be open!)
    * Option 1: In the Maven tab
        1. Click the "Refresh" button. This re-syncs you project(s).
        2. Open your project `hello-world`
        3. Open `Lifecycle`
        4. Double left-click `clean`
        4. Double left-click `install`
    * Option 2:
        1. Click the "Refresh" button. This re-syncs you project(s).
        2. Click the `m` button. The tooltip when you hover should say "Execute Maven Goal"
        3. Type in `clean install` so that the full text line says `mvn clean install`
        4. Press `ENTER`
2. Right-click the `HelloWorld` file, select `Run 'HelloWorld.main()'`

A terminal at the bottom of the IDE will open with the output of your first program!

```text
A_BUNCH_OF_RANDOM_STUFF_THAT_YOU_CAN_IGNORE_FOR_NOW
Hello World!

Process finished with exit code 0
```

Congratulations on your Hello World!

## Adding Git Version Control



