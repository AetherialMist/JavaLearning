# Git

_NOT GitHub!_

_Your best friend, and sometimes your worst enemy (because it cares)_

## What is git?

According to the [Git homepage](https://git-scm.com/):

```text
Git is a free and open source distributed version control system designed to handle everything from small to very
large projects with speed and efficiency.

Git is easy to learn and has a tiny footprint with lightning fast performance. It outclasses Source Control Management
(SCM) tools like Subversion, CVS, Perforce, and ClearCase with features like cheap local branching, convenient
staging areas, and multiple workflows.
```

The key take-away is that git is a Version Control System (VCS) designed for programmers, by programmers.

In simple terms, git is a way to track all changes, and the entire edit history of files (in chunks). If you have not
already, at some point while programming you will have deleted an old piece of code that you suddenly need again.
Assuming you _committed_ that code in the past (saved a chunk of history), you can
"_go back in time_" and retrieve it!

## Why use git?

Git was created out of the frustration and hatred of an older VCS/SCM called BitKeeper, for the purpose of continued
development of the Linux kernel (the heart of the Linux OS lineup). Since then, git has become the
**standard** for software source management. The functionality which git provides is unmatched by the other options out
there, to the point where the others have tried to mimic git, but just can't stand on the same pedestal.

## How does git work?

Simple answer: Files.

Files are how computers store information. Cat pictures? Files. Word documents? Files. The operating system (OS)
running your computer? A bunch of files. Files being stored, also called persisted, on some form of physical device
(Hard-Disk Drive, Solid-State Drive, CD, Floppy Disk, etc.) is what allows users like us to turn of our electronics,
pull the battery out (if possible), put the battery back in, start the device, and our cat pictures are still there
waiting for our viewing pleasure!

Fun fact! What we call "Folders" on our computers, are actually just Files that contain a list of where other Files are
located. The OS running your computer just provides a Graphical User Interface (GUI) which displays Folders differently
than Files.

This is all interesting information, but what we specifically care about as programmers are text files (like what you
are reading right now!). Git provides the ability to track and manage additions, deletions, changes, movements, and so
much more of files.

How does git know which files to track? Well it has to start somewhere, and this location is called the "_repository
root_", sometimes just called _"root"_ or _"root folder"_. From this location, git does all the heavy lifting for us.
Any file in this same location, or in a folder/sub-folder of this location, will be tracked! All the files being
maintained by git at a repository root, is simply referred to as a "_repository_".

But what if I have files I do not want tracked? Git will look for a special file titled "`.gitignore`", with no
additional file extension (png, jpeg, docx, etc.). This file is a text document that contains the names and paths of
files you do NOT want to track. The use of this "simple" text file can actually become advanced fairly quickly. I
recommend Google if you have any questions on using the .gitignore file.

## Terminology Review

| Term              | Meaning                                                                |
|-------------------|------------------------------------------------------------------------|
| `file`            | Data persisted on a physical device (often called a _physical medium_) |
| `repository`      | A collection of files managed by git                                   |
| `repo`            | Abbreviation for repository                                            |
| `repository root` | The "root", or parent, folder of the repository                        |