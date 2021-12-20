package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        File myObj = new File("input.txt");
        Scanner myReader = new Scanner(myObj);
        int measurement = 0;
        int firstTempDepth = myReader.nextInt();
        int secondTempDepth = myReader.nextInt();
        int thirdTempDepth = myReader.nextInt();
        int tempDepth;
        while(myReader.hasNextInt()){
            tempDepth = myReader.nextInt();
            if(firstTempDepth + secondTempDepth + thirdTempDepth < secondTempDepth + thirdTempDepth + tempDepth){
                measurement += 1;
            }
            firstTempDepth = secondTempDepth;
            secondTempDepth = thirdTempDepth;
            thirdTempDepth = tempDepth;
        }

        System.out.println(measurement);
    }
}
