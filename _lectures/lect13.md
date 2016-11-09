---
num: "Lecture 13"
desc: "tbd"
ready: false
date: 2016-11-09 12:30:00.00-7:00
---

# lab06: some context and high level help

Let's look at the big picture of lab06:

In particular, this [segment of code](https://github.com/UCSB-CS56-F16/lab06_starter_code/blob/master/src/edu/ucsb/cs56/pconrad/parsing/InterpreterInterface.java#L24)

```java
  public int tokenizeParseAndEvaluate(final String input)
	   throws TokenizerException, ParserException, EvaluatorException {
   	   return evaluate(parse(tokenize(input)));
  }
```    

