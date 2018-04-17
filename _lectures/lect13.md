---
num: "Lecture 13"
desc: "Review of Accum Pattern, Recursion"
ready: false
date: 2017-09-06 09:30:00.00-7:00
---

* Review: <https://ucsb-cs8-m17.github.io/hwk/ic02/>

* Code: <https://github.com/ucsb-cs8-m17/Lecture13_0906>

* Review of Accum Pattern

* Raising exceptions and testing for exceptions

```
import pytest

def countAs(s):
   " count a and A in string s "
   if type(s)!=str:
      raise ValueError('parameter to countAs should be of type str')
   count = 0
   for c in s:
      if c=='a' or c=='A':
         count = count + 1
   return count


def test_countAs_1():
    with pytest.raises(ValueError):
       result = countAs(-42)
       
def test_countAs_2():
   assert countAs("Santa Ana")==4


```


* Finding min and max

* Recursion

   * first 
   * rest
