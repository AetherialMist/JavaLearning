# Lesson 0: Setting up your environment

_Unless you really hate yourself and prefer using Note Pad_

## Overview

This lesson covers all the various tools you will need to install and setup to get started.

## git

_Your best friend and sometimes your worst enemy, but only because it cares_

### What is git?

According to the [Git homepage](https://git-scm.com/):

```text
Git is a free and open source distributed version control system designed to handle everything from small to very
large projects with speed and efficiency.

Git is easy to learn and has a tiny footprint with lightning fast performance. It outclasses Source Control Management
(SCM) tools like Subversion, CVS, Perforce, and ClearCase with features like cheap local branching, convenient
staging areas, and multiple workflows.
```

The key take-away is that git is a Version Control System (VCS) designed for programmers, by programmers.
In simple terms, git is a way to track all changes and the entire edit history of files (in chunks). If you
have not already, at some point while programming you will have deleted an old piece of code that
you suddenly need again. Assuming you committed that code in the past (saved a chunk of history), you can
"go back in time" and retrieve it.

### Why use git?

Git was created out of the frustration and hatred of an older VCS/SCM called BitKeeper, for the purpose of
continued development of the Linux kernel (the heart of the Linux OS lineup). Since then, git has become the
standard for software source management. The functionality which git provides is unmatched by the other
options out there, to the point where the others have tried to mimic git, but just can't stand on the same pedestal.

### Terminology

Since we are going to be using git, there is some general terminology which will be used going forward that should
be understood.

| Term              | Meaning                                         |
|-------------------|-------------------------------------------------|
| `repository`      | A collection of files managed by git            |
| `repository root` | The "root", or parent, folder of the repository |

## GitHub

_GitHub and Git are not one and the same!_








## Tool Installations

Download and install the following in order:

1. [Git](https://git-scm.com/downloads)
    * This is the standing in Version Control Systems (VCS)
    * You should be fine using all the default options during installation
    * Once installed you will need to open the Git Bash terminal by right-clicking inside a folder in the file browser,
      and selecting `Git Bash Here` then run the following commands:
      ```bash
      $ git config --global user.name "YOUR_NAME"
      $ git config --global user.email YOUR_EMAIL_ASSOCIATED_WITH_GITHUB
      ```
2. [Java 17](https://adoptium.net/)
    * Adoptium Temurin 17 (LTS)
    * This is a free open-source implementation of Java that is the community standard choice
    * You should be fine using all the default options during installation
3. [Intellij IDEA](https://www.jetbrains.com/idea/)
    * This is going to be your Java Integrated Development Environment (IDE)
    * You should be fine using all the default options during installation
    * Comes with `Git` and `Maven` built-in support
    * You can use the free Community Edition, you shouldn't need the paid edition for anything while learning

## GitHub

_Git and GitHub are not the same thing!_

Git is version control software for repositories, or "repos" for short. GitHub is a cloud place to store copies of
repositories. Another popular cloud storage is BitBukkit, but we will use GitHub since it is the preferred choice for
open-source code.

Go to [github.com](https://github.com/) and create a free account.

You will need to add a SSH key to you GitHub account to enable easier repo access. You can use the Git bash terminal to
run the following steps:

1. [How to create your SSH key](https://docs.github.com/en/authentication/connecting-to-github-with-ssh/generating-a-new-ssh-key-and-adding-it-to-the-ssh-agent)
    * When prompted for a passphrase, you can just press `ENTER` to skip (and again on verification). This means you
      will not need to type your password everytime you use git `push`/`pull`.
2. [How to add your SSH key](https://docs.github.com/en/authentication/connecting-to-github-with-ssh/adding-a-new-ssh-key-to-your-github-account)

```bash
# Generate key
$ ssh-keygen -t ed25519 -C "REPLACE_ME_EMAIL_ASSOCIATED_WITH_GITHUB"

# Verify ssh-agent is running
$ eval "$(ssh-agent -s)"
# Should return something like "Agent pid 51345"

# Add the key to the sSh-agent
$ ssh-add ~/.ssh/id_ed25519

# Copy the public half of the SSH key to your clipboard
$ clip < ~/.ssh/id_ed25519.pub

# Follow remaining instructions in Step 2.
```

## Clone This Project

1. Create a folder for all your projects. I recommend a folder high level folder (close to the drive letter)
   named `gits` or `repos`.
    * Example: `D:\Gits\`
2. In the folder you just created, right-click and select `Git Bash Here`
3. Type in:
   ```bash
   $ git clone git@github.com:cordell-stocker/JavaLearning.git
   ```