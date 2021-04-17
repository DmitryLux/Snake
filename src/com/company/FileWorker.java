package com.company;
import java.io.*;
import java.util.Scanner;

public class FileWorker {
    File file;

    public FileWorker(){
        file= new File("bestScore.txt");
        if(!file.exists()){
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    public void write(int bestScore){
        try {
            FileWriter writer = new FileWriter(file);
            writer.write(String.valueOf(bestScore));
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public String read(){
        String bestScore = "";
        try {
            FileReader reader = new FileReader(file);
            Scanner sc = new Scanner(reader);
            if(sc.hasNext()){
                bestScore = sc.nextLine();
            }else{
                bestScore = "0";
            }
            reader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return bestScore;
    }
}
