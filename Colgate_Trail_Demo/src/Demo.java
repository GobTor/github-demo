import java.util.*;

public class Demo {
    //The purpose of this file is to demo a game to make sure the logistics of everything works
    public String player;

    public Demo(String player){
        this.player = player;
    }

    public void playGame(){
        title();
    }
    public void title(){
        System.out.println("welcome " + player +  " to the demo game");
        roomOne();
    }

    public void roomOne(){
        System.out.println("we begin our journey in a dark room");
        System.out.println(player + " has no idea how they got there or ");
    }

}
