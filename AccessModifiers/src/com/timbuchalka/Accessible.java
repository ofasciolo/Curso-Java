package com.timbuchalka;

/*Challenge
* In the following interface declaration, what is the visibility of
*
* 1. the Accessible interface?
* 2. the int variable SOME_CONSTANT?
* 3. methodA?
* 4. methodB and C?
*
* Hint: think back to the lecture on interfaces before answering*/

interface Accessible {
    int SOME_CONSTANT = 100;
    public void methodA();
    void methodB();
    boolean methodC();
}

/* 1. package private
* 2. public
* 3. public
* 4. public */