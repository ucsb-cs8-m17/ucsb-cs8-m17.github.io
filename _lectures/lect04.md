---
num: "Lecture 4"
desc: "logging in from Mac via ssh, Windows via MobaXTerm"
ready: false
date: 2017-08-15 09:30:00.00-7:00
---

# Code from today's lecture

<https://github.com/ucsb-cs8-m17/Lecture4_0815>

# Logging into CSIL from MacOS or Linux

```
ssh -X pconrad@csil-21.cs.ucsb.edu
```

The first time you'll get a message such as:

```
ECDSA key fingerprint is SHA256:ANJ7ced3JXpxKnu8OhnS3f8Z0rE9aIKA+eHHgVlEzVc.
Are you sure you want to continue connecting (yes/no)? yes
```

Just say yes.

Machines are 01-48

CTRL/D can be used to exit.


For Windows, the program is MobaXTerm

To use it, look for "New Session" in upper left,

Then "ssh" upper left.

Then enter `csil-15.cs.ucsb.edu` (or whatever number)
where it asks for host.

Then, you'll be prompted for username and password.

# If you get this message when running `idle3`

or any other program that needs graphics...

```
_tkinter.TclError: no display name and no $DISPLAY environment variable
```

On Windows: Use MobaXTerm instead of a program such as PuTTY.

On Mac: You need to install XQuartz ... go to XQuartz.org, download, follow instructions, and try again.

Also: on Mac or Linux, maybe you forgot the -X part.
