package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        File myObj = new File("input.txt");
        Scanner myReader = new Scanner(myObj);
        String tempRead = myReader.nextLine();
        int tempReadLength = tempRead.length();
        StringBuilder gammaRate = new StringBuilder();
        StringBuilder epsilonRate = new StringBuilder();
        List<Integer> bitList = new ArrayList<>(Arrays.asList(new Integer[tempReadLength]));
        for(int i = 0; i < tempReadLength; i++){
            bitList.set(i, 0);
        }
        while(myReader.hasNextLine()){
            for(int i = 0; i < tempReadLength; i++){
                if(tempRead.charAt(i) == '1')
                    bitList.set(i, bitList.get(i) + 1);
                else if (tempRead.charAt(i) == '0')
                    bitList.set(i, bitList.get(i) - 1);
            }
            tempRead = myReader.nextLine();
        }
        
        for(int i = 0; i < tempReadLength; i++){
            if(bitList.get(i) >= 0) {
                gammaRate.append('1');
                epsilonRate.append('0');
            }
            else {
                epsilonRate.append('1');
                gammaRate.append('0');
            }
        }
        System.out.println(tempReadLength);
        System.out.println(gammaRate);
        System.out.println(epsilonRate);
        System.out.println(Integer.parseInt(gammaRate.toString(), 2) * Integer.parseInt(epsilonRate.toString(), 2));
    }
}
