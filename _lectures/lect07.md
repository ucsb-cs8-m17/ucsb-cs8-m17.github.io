---
num: "Lecture 7"
desc: "print vs. return"
ready: false
date: 2017-08-22 09:30:00.00-7:00
---

Code from today's lecture: <https://github.com/ucsb-cs8-m17/Lecture7_0822>

Terminal session from today's lecture:

```
169-231-165-195:~ pconrad$ idle3
^Z
[1]+  Stopped                 idle3
169-231-165-195:~ pconrad$ bg
[1]+ idle3 &
169-231-165-195:~ pconrad$ python3 -m pytest printVsReturn01.py 
======================== test session starts =========================
platform darwin -- Python 3.6.2, pytest-3.2.1, py-1.4.34, pluggy-0.4.0
rootdir: /Users/pconrad, inifile:

==================== no tests ran in 0.00 seconds ====================
ERROR: file not found: printVsReturn01.py
169-231-165-195:~ pconrad$ pwd
/Users/pconrad
169-231-165-195:~ pconrad$ cd 
169-231-165-195:~ pconrad$ cd ~
169-231-165-195:~ pconrad$ cd github/ucsb-cs8/Lecture6_0817/
169-231-165-195:Lecture6_0817 pconrad$ ls
LICENSE			lect6demo.py
README.md		lect7
__pycache__		musicFirstSteps.py
convert.py
169-231-165-195:Lecture6_0817 pconrad$ cd lect7/
169-231-165-195:lect7 pconrad$ ls
printVsReturn01.py	turtleDemoLect7.py
169-231-165-195:lect7 pconrad$ python3 -m pytest printVsReturn01.py 
========================= test session starts =========================
platform darwin -- Python 3.6.2, pytest-3.2.1, py-1.4.34, pluggy-0.4.0
rootdir: /Users/pconrad/github/ucsb-cs8/Lecture6_0817/lect7, inifile:
collected 5 items                                                      

printVsReturn01.py .F.F.

============================== FAILURES ===============================
____________________________ test_isOdd_3 _____________________________

    def test_isOdd_3():
>       assert isOdd(3)
E       assert None
E        +  where None = isOdd(3)

printVsReturn01.py:31: AssertionError
____________________________ test_isOdd_13 ____________________________

    def test_isOdd_13():
>       assert isOdd(13)
E       assert None
E        +  where None = isOdd(13)

printVsReturn01.py:37: AssertionError
================= 2 failed, 3 passed in 0.04 seconds ==================
169-231-165-195:lect7 pconrad$ python3 -m pytest printVsReturn01.py 
========================= test session starts =========================
platform darwin -- Python 3.6.2, pytest-3.2.1, py-1.4.34, pluggy-0.4.0
rootdir: /Users/pconrad/github/ucsb-cs8/Lecture6_0817/lect7, inifile:
collected 5 items                                                      

printVsReturn01.py F.F.F

============================== FAILURES ===============================
____________________________ test_isOdd_0 _____________________________

    def test_isOdd_0():
>       assert not isOdd(0)
E       AssertionError: assert not 'stub you fool you'
E        +  where 'stub you fool you' = isOdd(0)

printVsReturn01.py:28: AssertionError
____________________________ test_isOdd_4 _____________________________

    def test_isOdd_4():
>       assert not isOdd(4)
E       AssertionError: assert not 'stub you fool you'
E        +  where 'stub you fool you' = isOdd(4)

printVsReturn01.py:34: AssertionError
____________________________ test_isOdd_14 ____________________________

    def test_isOdd_14():
>       assert not isOdd(14)
E       AssertionError: assert not 'stub you fool you'
E        +  where 'stub you fool you' = isOdd(14)

printVsReturn01.py:40: AssertionError
================= 3 failed, 2 passed in 0.04 seconds ==================
169-231-165-195:lect7 pconrad$ 
169-231-165-195:lect7 pconrad$ python3
Python 3.6.2 (v3.6.2:5fd33b5926, Jul 16 2017, 20:11:06) 
[GCC 4.2.1 (Apple Inc. build 5666) (dot 3)] on darwin
Type "help", "copyright", "credits" or "license" for more information.
>>> if ("is stub"):
...   print ("x")
... 
x
>>> 
```
