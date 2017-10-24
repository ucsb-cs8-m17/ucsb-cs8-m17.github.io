---
layout: examHandoutNoName
num: e01
ready: true
desc: "Midterm Exam E01 Handout"
exam_date: 2017-08-23 09:30:00.00-7
---

# Example `pytest` test cases from lab02

<div style="width:30em; font-size:144%">

```
import pytest

def fToC(fTemp):
   return fTemp - 32.0 # incorrect formula!

def cToF(cTemp):
   return cTemp + 32.0 # incorrect formula!
   
def test_fToC_freezing():
   assert fToC(32.0)==pytest.approx(0.0) 

def test_cToF_freezing():
   assert cToF(0.0)==pytest.approx(32.0) 

def test_fToC_boiling():
   assert fToC(212.0)==pytest.approx(100.0) 

def test_cToF_boiling():
   assert cToF(100.0)==pytest.approx(212.0)
```

</div>