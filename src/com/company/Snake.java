package com.company;

import java.awt.*;

public class Snake {
    Head myHead;
    int SIZE;
    Color color;
    String direction;


    public Snake(){
        myHead = new Head();
        SIZE = 2;
        color = Color.green;
        direction = "right";

    }


    public void move(){
        if(direction == "left"){
            myHead.x--;
        }
        if(direction == "right"){
            myHead.x++;
        }
        if(direction == "up"){
            myHead.y--;
        }
        if(direction == "down"){
            myHead.y++;
        }
    }



}
