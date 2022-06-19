# Creating Your First Repository

## Install Git

### Windows

1. Download Git from the [Git Website](https://git-scm.com/downloads)
    * You should be fine using all the default options during installation
2. To open a Git Terminal
    1. Open a File Browser, preferably in a non-OS protected folder.
    2. Right-click inside the folder and select "Git Bash Here".

### Linux

1. Open a terminal
2. Run: `sudo apt-get install git`
3. To open a Git Terminal
   1. The normal terminal is also your git terminal!

## Initial Git Setup

1. Open a Git Terminal
2. Run the following commands:

   _Note: Do not include the "`$`", this is used to indicate a command to execute._
   ```bash
   $ git config --global user.name "YOUR_NAME"
   $ git config --global user.email YOUR_EMAIL
   ```

   _Example_
   ```bash
   $ git config --global user.name "Aetherial Mist"
   $ git config --global user.email aetherialmist@gmail.com
   ```

You only need to complete this setup once per computer. This tells git _who_ is running commands and to associate file
changes to you.

## Create a GitHub Account

Git is great for tracking your file changes, but what happens if your hard drive fails, and you lose all your code?
First you cry, and second you hope that you stored a copy of all your code in a "_remote repository_". A remote
repository works exactly the same as the repository on your computer, just on a different computer somewhere in "the
cloud". For this reason, the repository on your computer is often called the "local repository".

Just as you can save a chunk of file history in your local repo (called _committing_), you can also save all these
changes on a remote repo (called _pushing_). You will often here programmers say you should _commit_ and _push_ your
code often. This is so you have a backup, and smaller change logs between commits, of all your code.

GitHub is a common place used to create and store remote Git repositories. You can have private repositories that only
you, and people you give access to, can view. You can also have public repos, which anyone on the internet can look at
and ~~judge mercilessly~~ look at (and use your code themselves!).

GitHub is not the only hosting servers for your remote repos. The other common option is Bitbucket.

* GitHub = A hub for storing your git repos
* Bitbucket = A place, "bucket" if you will, to store all your bits (files)

Programmers are very creative people.