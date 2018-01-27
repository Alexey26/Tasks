package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class c {
    public static void main(String[] args) throws IOException {
        BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
        boolean o = true;
        String str = buff.readLine();
        char[] ch = str.toCharArray();
        for(int i = 0; i < ch.length/2; i++) {
            if (ch[i] != ch[ch.length-i-1]) {
                o = false;
                break;
            }
        }
        if (o == true) {
            System.out.println("Палиндром");
        }
        else {
            System.out.println("Не палиндром");
        }
    }
}