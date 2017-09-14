---
layout: examHandoutNoName
num: e02
ready: true
desc: "Final Exam Handout"
exam_date: 2017-09-14 09:30:00.00-7
---

<style>
body {
 font-size: 14px;
}

</style>

# Example `pytest` test cases from lab03

<div style="width:40em;">

```
import pytest

def test_perimRect_1():
   assert perimRect(4,5)==18

def test_perimRect_2():
   assert perimRect(7,3)==20

def test_perimRect_3():
   assert perimRect(2.1,4.3)==pytest.approx(12.8)
   
```

# Code for `indexShortest_a`

No hints on this one.

{% highlight python linenos %}
def indexShortest_a(slist):
    if type(slist)!=list:
        raise ValueError("not a list")
    if slist==[]:
        raise ValueError("it's empty")

    soFar = 0
    for i in range(0,len(slist)): 
        if type(slist[i])!=str:     
            raise ValueError("found non-string")
        if len(slist[i]) < len(slist[soFar]):
            soFar = i
    return soFar
{% endhighlight %}


# Code for `indexShortest_b`

Hint: Pay attention to the indentation of line 13

{% highlight python linenos %}
def indexShortest_b(slist):
    if type(slist)!=list:
        raise ValueError("not a list")
    if slist==[]:
        raise ValueError("it's empty")

    soFar = 0
    for i in range(0,len(slist)): 
        if type(slist[i])!=str:   
            raise ValueError("found non-string")
        if len(slist[i]) < len(slist[soFar]):
            soFar = i
        return soFar
{% endhighlight %}


<div style="page-break-before:always;">
</div>

<div style="font-size: 16px; font-weight:bold; font-family: Arial Narrow, Arial, sans-serif; border: 1px solid black; padding: 2px; margin: 4px; text-align: center; margin-left: auto; margin-right: auto; width: 40em;">
Handout for CMPSC 8, Final Exam, M17, Page 2
</div>

# Code for `indexShortest_c`

Hint: pay attention to line 11

{% highlight python linenos %}
def indexShortest_c(slist):
    if type(slist)!=list:
        raise ValueError("not a list")
    if slist==[]:
        raise ValueError("it's empty")

    soFar = 0
    for i in range(0,len(slist)): 
        if type(slist[i])!=str:     
            raise ValueError("found non-string")
        if len(slist[i]) <= len(slist[soFar]):
            soFar = i
    return soFar
{% endhighlight %}


# Code for `indexShortest_d`

Hint: again, pay attention to line 11

{% highlight python linenos %}

def indexShortest_d(slist):
    if type(slist)!=list:
        raise ValueError("not a list")
    if slist==[]:
        raise ValueError("it's empty")

    soFar = 0
    for i in range(0,len(slist)):
        if type(slist[i])!=str:  
            raise ValueError("found non-string")
        if slist[i] < slist[soFar]:
            soFar = i
    return soFar
{% endhighlight %}
 

</div>