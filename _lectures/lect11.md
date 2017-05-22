---
num: "Lecture 11"
desc: "Factory Design Pattern, instanceof as a code smell, Parsing"
ready: false
date: 2016-11-02 12:30:00.00-7:00
---


H14 problem, Q4:

See: <https://github.com/UCSB-CS56-F16/Head-First-Design-Patterns/blob/master/src/edu/ucsb/cs56/pconrad/hfdp/CS56_F16_H14_Q4.java>

Try running this and you'll see the problem.

* `instanceof` as a code smell: <http://smsohan.com/blog/2011/11/01/using-instanceof-is-mostly-code-smell/>

What is a code smell?

* See: <https://ucsb-cs56-pconrad.github.io/topics/code_smells/>

# So, why do we have `instanceof` all in the [lab06](/lab/lab06) code?

Great question.  To be honest, we shouldn't.  Kyle Dewey already wrote a version of this code that does a refactoring using the Visitor Pattern (see the Appendix of HFDP, pages 634-635).    However, trying to understand the visitor pattern *at the same time* that you are already dealing with understanding tokenizing, parsing and interpreting ASTs seemed a little too much to take on at once.

We'll come back and try to understand how to refactor the evaluator code for [lab06](/lab/lab06) that code out once we understand
the whole process of parsing a bit more.
