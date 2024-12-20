package Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class CheckedExceptions {
    //FileNotFoundException is a child of IO exception

    public static void main (String args[]) throws IOException {
        System.out.println("program started");
        System.out.println("program in progress");

        FileInputStream file=new FileInputStream("/home/noemi/Documents/Java Course");
        System.out.println(file.read());

        System.out.println("program is completed");
    }
}
