package com.company;

import java.awt.*;
import java.util.Random;

public class Apple {
    int x, y;
    Color color;
    int SIZE;
    Random rn;

    Apple(){
        rn = new Random();
        x = rn.nextInt(15);
        y = rn.nextInt(15); /*rn.nextInt();*/
        SIZE = -1 * (rn.nextInt(3) + 1);
        color = new Color(rn.nextInt(256), rn.nextInt(256), rn.nextInt(256));
    }
}
