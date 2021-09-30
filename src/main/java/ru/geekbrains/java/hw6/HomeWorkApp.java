package ru.geekbrains.java.hw6;

import java.util.Random;

public class HomeWorkApp {

    public static void main(String[] args) {
        MyTreeMap<Integer, Integer> map;
        int rand, max, min, NUMBER_OF_TREES;
        max = 100; min = -100; NUMBER_OF_TREES = 100_000;
        int countOfDisbalanced=0;
        for (int i = 0; i < NUMBER_OF_TREES; i++) {
            map = new MyTreeMap<>();
            while(map.height()<5){
                rand=(int)(Math.random()*((max-min)+1))+min;
                map.put(rand,rand);
            }
            if(!map.isBalanced()){
                countOfDisbalanced++;
            }
        }
        String str = String.format("Процент несбалансированных деревьев: %.5f", (float)countOfDisbalanced/NUMBER_OF_TREES);
        System.out.println(str);
    }

}
