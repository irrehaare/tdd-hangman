package com.irrehaare;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputReader {
    private InputReader() {
    }

    public static String getInput() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter String:\r\n");
        return br.readLine();
    }
}
