package com.timbuchalka;

public class Main {

    public static void main(String[] args) {
        String var4 = "this is private to main()";

        ScopeCheck scopeInstance = new ScopeCheck();
        scopeInstance.useInner();
        System.out.println("scopeInstance var4 is " + scopeInstance.getVar1());
        System.out.println(var4);

        scopeInstance.timesTwo();

        System.out.println("***************************************");
        ScopeCheck.InnerClass innerClass = scopeInstance.new InnerClass();
        innerClass.timesTwo();
    }
}
