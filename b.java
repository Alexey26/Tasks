package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b {
    public static void main(String[] args) throws IOException {
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        String str = buf.readLine();
        final int myconst = 255;
        int[] s = new int[myconst];
        int[] o = new int[myconst];
        str = str.replaceAll("\\W","");
        char[] chArray = str.toCharArray();
        for(int i = 0; i < chArray.length; i++){
            s[chArray[i]]++;
        }
        int max = s[0];
        for(int i = 0; i < myconst; i++) {
            if (max < s[i]) {
                max = s[i];
            }
        }
        for(int i = 0; i < myconst; i++) {
            if (max == s[i]) {
                o[i] = i;
            }
            if (o[i] != 0) {
                char c = (char) o[i];
                System.out.print(c);
            }
        }
    }
}