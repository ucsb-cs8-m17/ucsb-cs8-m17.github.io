#!/usr/bin/env python3

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


if __name__=="__main__":
    values = [
        ["ant","dog","bear","horse"],
        ["tiger","cow","cat","monkey"],
        ["rat","pig","fish","ox"]
    ]
        
    functions = [
        indexShortest_a,
        indexShortest_b,
        indexShortest_c,
        indexShortest_d
        ]
    for f in functions:
        print("")
        for v in values:
            print("{}({})={}".format(f.__name__,repr(v),repr(f(v))))
