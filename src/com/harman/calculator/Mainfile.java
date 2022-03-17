package com.harman.calculator;

public class Mainfile {
    public static void main(String[] args) {
        Addition ob_add = new Addition();
        Division1 ob_div = new Division1();
        Substraction ob_sub = new Substraction();
        int x =10 ,y = 20 , result1, result2, result3;
        result1 = ob_add.add(x,y);
        result2 = ob_div.div(x,y);
        result3 = ob_sub.sub(x,y);
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);

    }
}
