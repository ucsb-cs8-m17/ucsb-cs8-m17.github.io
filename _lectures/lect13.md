---
num: "Lecture 13"
desc: "Information about lab05 deadline, and legacy code progress"
ready: true
date: 2016-11-09 12:30:00.00-7:00
---

# Information about lab05 deadline, and legacy code progress

* tl;dr: communicate with your mentor, and everything will be fine.
* fail to communicate with your mentor, and you are going to have a bad time.

# Information about the next two Wednesdays

* will be explained in class.

# lab06: some context and high level help

Let's look at the big picture of lab06:

In particular, this [segment of code](https://github.com/UCSB-CS56-F16/lab06_starter_code/blob/master/src/edu/ucsb/cs56/pconrad/parsing/InterpreterInterface.java#L24)

```java
  public int tokenizeParseAndEvaluate(final String input)
	   throws TokenizerException, ParserException, EvaluatorException {
   	   return evaluate(parse(tokenize(input)));
  }
```    

Let's review the big picture:

* Tokenizing goes from `String` to `ArrayList<Token>`
    * The file [Tokenizer.java](https://github.com/UCSB-CS56-F16/lab06_starter_code/blob/master/src/edu/ucsb/cs56/pconrad/parsing/tokenizer/Tokenizer.java) is an implementation of the finite state automaton
* Parsing goes from `ArrayList<Token>` to `AST`
    * The file [Parser.jvaa](https://github.com/UCSB-CS56-F16/lab06_starter_code/blob/master/src/edu/ucsb/cs56/pconrad/parsing/parser/Parser.java) is an implementation of the context-free grammar.
* Evaluator goes from `AST` to plain old `int`

We can see that in this file:

* <https://github.com/UCSB-CS56-F16/lab06_starter_code/blob/master/src/edu/ucsb/cs56/pconrad/parsing/DefaultInterpreterInterface.java>
