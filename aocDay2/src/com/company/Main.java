package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Objects;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        File myObj = new File("input.txt");
        Scanner myReader = new Scanner(myObj);
        int horizontalPosition = 0;
        int depth = 0;
        int aim = 0;
        String tempString;
        while(myReader.hasNextLine()){
            tempString = myReader.next();
            if(Objects.equals(tempString, "forward")){
                int tempInt = myReader.nextInt();
                horizontalPosition += tempInt;
                depth += aim * tempInt;
            }
            else if(Objects.equals(tempString, "down")){
                aim += myReader.nextInt();
            }
            else if(Objects.equals(tempString, "up")){
                aim -= myReader.nextInt();
            }
        }

        System.out.println(horizontalPosition * depth);
    }
}
