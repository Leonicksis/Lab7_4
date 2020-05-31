package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        File input = new File("Input.txt");
        String Res="";
        try (Scanner scan = new Scanner(input)) {
            while (scan.hasNextLine()) {
                String buf = scan.nextLine();
                for (int i=0; i<buf.length()-2; i++)
                {
                    if (buf.charAt(i)!=buf.charAt(i+1))
                    {
                        Res+=buf.charAt(i);
                    }
                }
                Res+=buf.charAt(buf.length()-1);
                Res+="\n\r";
            }
            System.out.println(Res);
        }
        catch (FileNotFoundException exp) {
            System.out.println("I don't see file, bro :C");
        }
    }
}