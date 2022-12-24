package com.epam.conditions;

public class CoordinatePane {

    public void printQuadrant(int x, int y) {
        if (x == 0 && y == 0) {
            System.out.println("zero");
            return;
        }
        String[][] pane = {{"third", "second"}, {"fourth", "first"}};
        System.out.println(pane[x > 0 ? 1 : 0][y > 0 ? 1 : 0]);
    }
}

