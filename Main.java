package com.company;

import java.lang.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class Main {



    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> num1 = new ArrayList<Integer>();
        ArrayList<Integer> num2 = new ArrayList<Integer>();
        Random random = new Random();
        int n;
        int m;
        for (int i = 0; i < 100; i++) {
             n = random.nextInt(100);

            num1.add(n);
        }
        for (int i = 0; i < 50; i++) {
            m = random.nextInt(100);
            num2.add(m);
        }

        if (num1 == num2){
            System.out.println("Jsou stejné");
        }

        else {
            System.out.println("Pole se neshodují");

            for (int i = 99; i > 49 ; i++) {
                num1.remove(i);
            }
            for (int i = 0; i < 50; i++) {
                if (num1.get(i) != num2.get(i)){
                    num2.set(i, num1.get(i));
                }
            }
        }




    }
}
