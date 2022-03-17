package com.harman.calculator;

public class Mainfile {
    public static void main(String[] args) {
        Addition ob_add = new Addition();
        Division1 ob_div = new Division1();
        int x =10 ,y = 20 , result1, result2;
        result1 = ob_add.add(x,y);
        result2 = ob_div.div(x,y);
        System.out.println(result1);
        System.out.println(result2);

    }
}
