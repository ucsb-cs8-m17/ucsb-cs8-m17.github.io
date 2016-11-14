---
layout: lab
num: lab06
ready: true
desc: "Recursive Descent Parsing"
assigned: 2016-11-07 12:30:00.00-8
due: 2016-11-14 23:59:00.00-8
starter_repo: "https://github.com/UCSB-CS56-F16/lab06_starter_code"
javadoc_prefix: "https://ucsb-cs56-f16.github.io/lab06_starter_code_javadoc/javadoc/"
tutorial_repo: "https://ucsb-cs56-pconrad.github.io/tutorials/parsing/"
submit_cs_link: "https://submit.cs.ucsb.edu/form/project/598/submission"
submit_cs_join_groups: "https://submit.cs.ucsb.edu/p/598/group"
course_github_organization: UCSB-CS56-F16
---

<style>
 div.tip {
   
   margin-left:auto; 
   margin-right:auto; 
   width:80%; 
   border: 10px inset red; 
   padding: 0.5em;
   margin-top: 1em;
   margin-bottom: 1em;
 }
</style>

<p style="display:none">
http://ucsb-cs56-f16.github.io/lab/lab06
</p>


# Summary #

In this assignment, you will add some features to an existing parser and interpreter of arithmetic expressions.

You should start by reading the [CS56 Parsing Tutorial]({{page.tutorial_repo}}).   It contains important background
information about parsing, grammars, tokens, etc.   

<div class="tip" markdown="1">

The remainder of this writeup assumes that you have thoroughly read and understood the information in the [CS56 Parsing Tutorial]({{page.tutorial_repo}}).  

*If you have not, it will not make any sense to you.*

</div>

# A first look at the starter code for this assignment

The starter code for this assignment, and javadoc that goes along with it is here:

* <{{page.starter_repo}}>
* <a href="{{page.javadoc_prefix}}" data-ajax="false">{{page.javadoc_prefix}}</a>

Don't do anything with the starter code yet other than just look at it&mdash;there is a specific way that you'll set up your repo for this assignment and pull that starter code in, and instructions on that appear later in this lab description.  At this point, I'm just giving you the link so that you can refer to the repo as you read these instructions.

The provided starter code may or may not have bugs; it is your responsibility to test things thoroughly.

# Not a lot of code, but a lot of challenge

The bulk of the difficulty of this assignment is expected to be in determining exactly what in the existing interpreter must be modified, without dramatically changing how the interpreter works.   

The amount of new code you need to add is relatively small, and the code is relatively straightforward.  

However, figuring out exactly what code you need to add, and where to add it, may be moderately to very challenging.   <em>This is typical of a good bit of the coding that you do in real-world development projects</em>.

# What You'll Implement #

The starter code you are given implements an intepreter for integer expressions involving `+`, `-`, `*`, `/`, parentheses, and unary minus (minus sign in front of an expression.)

Your task is to update all three components of the starter code&mdash;the tokenizer, parser, and interpreter&mdash;to handle the following new features:

- Six comparison operators, (`==`, `!=`, `<`, `<=`, `>`, `>=`) returning 0 for false, and 1 for true
- An exponent operator, `**` (i.e. `3**2` evalutes to $$ 3^2 = 9 $$ and `2**3` evaluates to $$ 2^3 = 8 $$.

The exponent operator associates to the right rather than the left:

* `2**3**2` should be intepreted as `2**(3**2)`, i.e. $$ 2^9 = 512 $$
* `2**3**2` should be NOT intepreted as `(2**3)**2`, i.e. $$ 8^2 = 64 $$

This is not the same as addition and multiplication, which associate to the left.  Fortunately, this detail has already been taken
care of for you by careful design of the grammar.  Provided you implement the grammar correctly, there won't be any problem with 
implementing the correct "associativity" of the operators.

# How the grammar will change

As a reminder from the [CS56 Parsing Tutorial]({{page.tutorial_repo}}), the starter code handles the following grammar:

```
expression ::= additive-expression
additive-expression ::= multiplicative-expression ( ( '+' | '-' ) multiplicative-expression ) *
multiplicative-expression ::= primary ( ( '*' | '/' ) primary ) *
primary ::= '(' expression ')' | INTEGER | '-' primary
```

Instead, you'll modify it to implement this grammar:

```
expression ::= comparison-expression
comparison-op ::= '==' | '!=' | '<' | '<=' | '>' | '>='
comparison-expression ::= additive-expression ( comparison-op additive-expression ) *
additive-expression ::= multiplicative-expression ( ( '+' | '-' ) multiplicative-expression ) *
multiplicative-expression ::= exponent-expression ( ( '*' | '/' ) exponent-expression ) *
exponent-expression ::= primary '**' exponent-expression | primary
primary ::= '(' expression ')' | INTEGER | '-' primary
```



# Comparison operators

All six of the comparison operators compare the integer values on the left and right.  They will each return a true or false value, with true represented as the integer `1`, and false represented as the integer `0`.    Accordingly, there is still only one *type* in the system, namely *integer*.

In the tokenizer, adding these operators will entail handling `==`, `!=`, `<`, `<=`, `>`, and `>=` as fundamentally new tokens.  You'll need to defined new classes for these tokens that extend the [`Token`]({{page.javadoc_prefix}}edu/ucsb/cs56/pconrad/parsing/tokenizer/Token.html){: data-ajax="false" } class defined in `src/edu/ucsb/cs56/pconrad/parsing/tokenizer/Token.java`.   As models, you might look at the classes that currently extend that class.  You can figure out what those are from looking at the javadoc for [`class edu.ucsb.cs56.pconrad.parsing.tokenizer.Token`]({{page.javadoc_prefix}}edu/ucsb/cs56/pconrad/parsing/tokenizer/Token.html){: data-ajax="false" } and looking at the list of "Direct Known Subclasses".

You get to make some design decisions.  One of them is this:

* You can decide to either add six entirely new Token classes, e.g. `EqualsToken`, `NotEqualsToken`, etc.
* Or, you could implement just one class, e.g. `ComparisonOperatorToken`, or `CompOpToken`, or whatever you want to call it, that in some way handles the variation among the six different operators (in the same way that there is only one class for `IntToken`, even though with 32 bits, there are in fact over four billion different possible integer tokens.

In order to leave that decision up to you, the tests are decoupled from the actual implementation of the specific concrete classes that extend `Token` by means of a Factory object.   The `TokenFactory` is an interface that specifies the names of methods to produce every kind of token that is needed in a test case.      There is a `DefaultTokenFactory` class where you specify the concrete classes that actually correspond to the various tokens.    

# Updating the Parser

As a reminder, the code you started with implements this grammar, based on one found on the Wikipedia page for [Operator Precedence Parser](https://en.wikipedia.org/wiki/Operator-precedence_parser) (retrieved 06/13/2016):

```
expression ::= additive-expression
additive-expression ::= multiplicative-expression ( ( '+' | '-' ) multiplicative-expression ) *
multiplicative-expression ::= primary ( ( '*' | '/' ) primary ) *
primary ::= '(' expression ')' | INTEGER | '-' primary
```

Instead, you'll be implementing this grammar that has two additional levels:

```
expression ::= comparison-expression
comparison-op ::= '==' | '!=' | '<' | '<=' | '>' | '>='
comparison-expression ::= additive-expression ( comparison-op additive-expression ) *
additive-expression ::= multiplicative-expression ( ( '+' | '-' ) multiplicative-expression ) *
multiplicative-expression ::= exponent-expression ( ( '*' | '/' ) exponent-expression ) *
exponent-expression ::= primary '**' exponent-expression | primary
primary ::= '(' expression ')' | INTEGER | '-' primary
```

* `comparison-expression` for handling comparison operators
* `exponent-expression` for handling exponentiation operators

This involves not only modifying the parsing code that implements the productions, but adding new kinds of AST nodes as well.

# Modifying the interpreter

The interpreter will also need to be modified to handle the seven new operators (six comparison operators, and exponent operator).

Expressions involving comparison operators will be evaluated and will return either `1` for true, or `0` for false.   This means that there is a new type of entity that can be part of the Abstract Syntax Trees (ASTs).  You'll need to understand the code that implements the ASTs, and determine what needs to be changed to allow for this new structure.   

You'll do something similar for the exponent operator.

The `main` function defined in `src/edu/ucsb/cs56/pconrad/parsing/Main.java` provides a "Read/Eval/Print" loop (REPL) for the combined tokenizer/parser/interpreter.    This is sometimes also called a "Command Line Interface", though we don't really have any commands, except for "q" for quit.  This should work properly with the new operations you have added, and you **should not** modify `main` in any way.

# Understanding the Starter Code

The starter code you are given is fairly complex.    The [CS56 Parsing Tutorial]({{page.tutorial_repo}}) has lots of information to help you.  We are not going to repeat that information here&mdash;we are only going to suggest&mdash;again&mdash;that you thoroughy read that tutorial.


# Javadoc for the Starter Code #

Javadoc for the starter code in [cs56-parsing-assignment]({{page.starter_repo}}) is available:

* [lab06_starter_code_javadoc]({{page.javadoc_prefix}}index.html){: data-ajax="false" }

# Getting Started #

Please create a private repo in the {{page.course_github_org}} organization with the name <tt>{{page.num}}_yourgithubid</tt>,

<strong>If working in a pair</strong>

* use the name  <tt>{{page.num}}_yourgithubid1_yourgithubid2</tt>.   THE TWO GITHUB IDs SHOULD BE IN  ALPHABETICAL ORDER (strictly speaking, lexicographic order.)  Create the repo using one githubid, and then add the second githubid as a collaborator with admin access.
* register your pair on submit.cs at: <{{page.submit_cs_join_groups}}>

<div class="tip" markdown="1">
Note: You need to `git clone ...` that repo into your directory before you proceed with the
rest of the instructions.
</div>


Then, add a remote for the starter code:

`git remote add starter ` <tt>{{page.starter_repo}}.git</tt>

You can then do a `git pull starter master` to bring this code into your repository.

<div class="tip" markdown="1">
When you pull in this code, you may end up with merge conflicts in `README.md` and possibly in `.gitignore`.

To resolve these, just edit those two files, and get rid of lines that look like these (your SHA commit hash will be different from the one shown):

* `<<<<<<< HEAD`  
* `========`
* `>>>>>>> 0fe9c0565c5150b3a72df6c3a563213f565b3cc9`

These lines mark the beginning and end of the parts that differ.  Edit the rest of the file as needed.

Then `git add README.md`; `git add .gitignore`, and do a commit.   That "resolves the merge conflict".

You might also get thrown into vim here or at some future point in the course of this lab.  To get out, use `<ESC>:wq` (that's hit the esc key, then type colon, then wq).

</div>


In the unlikely event that any problems are discovered in the starter code, you will be able to do a second or third `git pull starter master` after the instructional staff fix the starter code problems.   That additional `git pull` will update your code accordingly.   If you have already made modifications, there may be merge conflicts, but you'll be able to handle those with no problem.

Once you've done the `git pull starter master` to bring in the starter code:

1. Try doing an `ant test` on the starter code.  The code should compile, and the tests should pass.
2. Try running the code with `ant jar && java -jar build/jar/CS56Parser.jar`.  You should get a prompt for a "read-eval-print" loop 
    where you can type in expressions, and the parser will evaluate them.

If that works, you are now ready to pull in the tests for the additional features, i.e. the addition of the `==` and
`!=` operators.  These tests will "break" the code, in that it will initially no longer compile.  We have organized the tests so that they incrementally build on top of each other, allowing you to first get your tokenizer working, then your parser, and finally your evaluator.

To bring the tests for the tokenizer into your repository, run the following command:

* `git pull starter update_tokenizer`

<div class="tip" markdown="1">

When you do the `git pull starter update_tokenizer`, you might get thrown into vim with the message at the top 
of the screen `Merge branch ...` etc. 

This is an automatic commit message, because pulling in the starter code is doing a commit.

To finish the commit, use this sequence of keys to save and quit from vim: `<ESC>:wq` (that's hit the esc key, then type colon,
then wq). 

</div>


If you run `ant clean && ant test`, you should see that it no longer compiles.  Your first job will be to make the code compile, by writing "stubs" for all of the objects, methods, etc. that the tests imply must exist before the test could even compile, much less pass.  Stubs usually do relatively silly things like `return null;`, but they nonetheless will allow code to at least compile with failing tests.  Further details are available in the following sections.  **Before** making any edits, be sure to at least read the **Restrictions** section, which specifies what you may and may not change.

Your second job will be, once the code compiles, to make all of the tests pass.  Further details are available in the following sections.

Your third job will be to try to come up with additional tests that might expose bugs in your code that the supplied 
tests do not find.   How many of those you come up with will be up to you.  Keep in mind that as with the Polynomial
lab earlier in the quarter, there may be "secret tests" that are not revealed to you that might be part of your grade.  Further details are available in the following sections.

Once you have your tokenizer compiling and passing all the tests, you're ready to start on the parser.  You can bring in tests for the parser like so:

* `git pull starter update_parser`

You should follow the same development procedures to update the parser as you did with the tokenizer.

Once the tokenizer is compiling and passing all the tests, you can start on the evaluator, which is the last component you'll need to implement.  Tests for the evaluator can be brought in like so:

* `git pull starter update_evaluator`

When you've done those three things, and all tests are passing, you are ready to submit.

## Submitting ##


You'll submit via submit.cs here: {{}}

In contrast to some of your previous submissions, you should **not** make a publicly accessible Javadoc for your code.
A large portion of the work for this lab is in how you structure your classes and methods, which usually will be included with the Javadoc.   Instead, you can view your javadoc by looking at the files you generate in a browser.   

# Restrictions #

You may **not** modify the following files:

- `src/edu/ucsb/cs56/pconrad/parsing/Main.java`
- `src/edu/ucsb/cs56/pconrad/parsing/InterpreterInterface.java`
- `src/edu/ucsb/cs56/pconrad/parsing/tokenizer/TokenFactory.java`
- `src/edu/ucsb/cs56/pconrad/parsing/syntax/ASTFactory.java`

The above restrictions are not arbitrary.  If any changes are made to the above files, it very likely indicates that your code will fail to pass the tests on submit.cs    This is also somewhat realistic of a production setting, where certain implementation details are fixed.

Other than the above restrictions, you may make any modifications necessary to make the tests pass.
This includes adding in new files and modifying existing files.

# General Suggestions #

As previously stated, you should first focus on getting the tests for the tokenizer to pass, then the tests for the parser to pass, and finally the tests for the evaluator to pass.

While it's possible to pull in all the tests at once, you'll be making much more work for yourself if you do this; in this case, effectively, you won't be able to properly test anything until **all** code has been written.

Additionally, because each component builds on the other (i.e., the parser needs the tokenizer, and the evaluator needs the parser), this becomes a practical problem if we apply end-to-end testing.

For example, your evaluator and parser might work just fine, but if your tokenizer is broken, we cannot run `Main`, so we can't actually test the tokenizer and the parser easily.

It is expected that some edits will need to span multiple components.

For example, if an AST node were removed, then this would require modifications to both the parser and the evaluator, as both deal with AST nodes (the parser produces them while the evaluator uses them).
That said, if edits in one component require many edits in other components, you might want to stop and rethink your design.
This isn't necessarily wrong, and you are free to make such edits, but you might be making a lot more work for yourself than necessary.

While the provided code has been heavily tested internally, it is not guaranteed to be bug-free.
Additionally, it is not guaranteed to be entirely clean; you might take issue with some of the design choices made.
While your focus should be on getting everything up and running, if cleaning up the code will make your life easier, then feel free to do so.

You will likely spend much more time *thinking* about the code you want to write as opposed to *actually writing* code.
This may feel frustrating, especially if you're used to measuring process by the number of lines of code you've written.
**This is normal.**
In professional development settings, developers often average only about [8-10 lines of code written per day](http://codebetter.com/patricksmacchia/2012/01/23/mythical-man-month-10-lines-per-developer-day/).
Most time is spent figuring out what needs to be written.


# Suggested Order of Work for Getting the Tests to Compile #

This section provides some hints on how to get things to compile, broken down by the component.

## Tokenizer ##

Start by implementing the `makeEqualsToken` and the `makeNotEquals` methods in `DefaultTokenFactory` (`src/edu/ucsb/cs56/pconrad/parsing/tokenizer/DefaultTokenFactory.java`), which are now required by the updated `TokenFactory` interface (`src/edu/ucsb/cs56/pconrad/parsing/tokenizer/TokenFactory.java`).
This will require you to add tokens for `==` and `!=`.
There are a variety of ways to accomplish this; the only constraint is that these new tokens must implement the `Token` interface (`src/edu/ucsb/cs56/pconrad/parsing/tokenizer/Token.java`).

Then continue with implementations of the other four comparison operator tokens, and the exponent operator token.  This is necessary just to get the code to compile.

Then, to get the tests to pass, modify the `Tokenizer.java` to add in the new states and transitions needed to recognize the new tokens you have added.

## Parser ##

You will first need to get `DefaultASTFactory` (`src/edu/ucsb/cs56/pconrad/parsing/syntax/DefaultASTFactory.java`) compiling by providing implementations for the `makeEqualsNode` and `makeNotEqualsNode` methods, which are now required by the updated `ASTFactory` interface (`src/edu/ucsb/cs56/pconrad/parsing/syntax/ASTFactory.java`).  This will require editing or adding files to the code in `syntax`.

Continue with the four other comparison operators, and the exponent operator.

If you add in whole AST nodes, they must implement the `AST` interface (`src/edu/ucsb/cs56/pconrad/parsing/syntax/AST.java`).

Then, focus on the code in `Parser.java` and making it correspond to the new productions in the grammar.  

Depending on how you approach the problem, you may (or may not) find it necessary to modify the `OperatorScaffold`, since it currently is based on an assumption that every operator will be a single character, which is no longer true.     There are ways of writing the code that require this file to change, and other ways that don't.  Which approach you take is up to you.

## Evaluator ##

Depending on how you implemented the tokenizer and the parser, it is possible that the evaluator tests compile as-is.

However, it is likely that even if the code compiles, the tests won't actually pass.   So you'll need to modify code, likely in `Evaluator.java` to properly evaluator the new kinds of ASTs that now exist in the language.


# Suggested Order of Work for Getting the Tests to Pass #

This section provides some hints on how to get the tests to pass, broken down by the component.

## Tokenizer ##

The bulk of the work will be in recognizing the new tokens.
This will likely entail adding in new states to the `Tokenizer`.
If you do end up adding new states, you may want to draw out the state machine representing what you are handling first, in order to make sure your fundamental design is correct.
Ideally, you should avoid adding in a state unless you are absolutely sure it needs to be there; extra states mean extra code, which means more room for bugs to come into play.

## Parser ##

The parser itself will also need to be modified to add in the new production, which will (somewhat ironically) likely be the smallest edit you need to perform for the parser.

## Evaluator ##

Once again, depending on your design, it is likely that actually updating the evaluator to handle the new types of ASTs will be a relatively small change.

# Suggestions for Devising Your Own Tests #

As previously stated, while the provided code has been heavily tested internally, the provided test suite is severely lacking.
The provided tests are mostly just to jump-start things when it comes to writing your own tests.
In fact, it might be prudent to write your own tests for things *before* even starting on the tokenizer.

For the tokenizer, you should write tests which cover every kind of token which can be created.
Because whitespace is treated specially, you should also have tests ensuring that extra whitespace in different spots (e.g., before a number) does not negatively impact the result.

For the parser, you should write tests which collectively cover every alternative of every production at least once.
For example, you should have a test for each operator.
As another example, for productions involving a repeat like `e*`, you should have a case for zero, one, and two instances of `e`.

For the evaluator, you should have tests for every kind of operator, including special cases like division by zero.

Whenever you're in doubt, write a test.
This means that if you see code you're not confident about, you should immediately write a test to try to expose a bug in it.


<div class="tip" markdown="1">
## Some Hints:

Consider the following cases:

* What should happen if there is whitespace or something unexpected in the middle of a `==` or `!=` token, e.g. if the input is `2=3` or `2! =3` ?
* What should happen if the input ends in the middle of a `==` or `!=` token, e.g. `2+3=` or `4/5!` ?

</div>

# Submission

Please submit your work two ways:

* Please make a submission on submit.cs at: <{{page.submit_cs_link}}>
    *   If working in a pair: Please register your pair on submit.cs using the "Join Groups" feature.
* UPDATE: Submission via submit.cs is sufficient (the text below has been removed). 
* <s>Please also submit via Gauchospace by providing a link to your repository in the normal way.  </s>
    *   <s>If working in a pair, both pair partners should submit on Gauchospace, but only one submission per pair
    is needed on submit.cs</s>

Be sure that <b>if you are working in a pair</b>, that you have added your group via the "Join Groups" feature <{{page.submit_cs_join_groups}}> 

----

Credits: This lab primarily written by Kyle Dewey, with edits by Phill Conrad.  Additional helpful suggestions from Hiranya Jayathilaka, and others.


<div style="display:none">
http://ucsb-cs56-f16.github.io/lab/lab06/
</div>





