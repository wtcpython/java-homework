// Exercise 17.2
package com.wtc.homework;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Random;

public class CreateBinaryData {
    public static void main(String[] args) throws IOException {
        DataOutputStream dos = new DataOutputStream(new FileOutputStream("Exercise17_02.dat", true));
        Random r = new Random();
        for (int i = 0; i < 100; i++) {
            dos.writeInt(r.nextInt(1, 100));
        }

        dos.close();
        System.out.println("Done");
    }
}
