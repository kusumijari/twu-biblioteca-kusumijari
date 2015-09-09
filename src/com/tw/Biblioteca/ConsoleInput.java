//Receives input fromt the user

package com.tw.biblioteca;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleInput {

    String message;

    public String getInput() {
        BufferedReader bufferedReader = new BufferedReader (new InputStreamReader(System.in));
        try {
            message = bufferedReader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return message;
    }
}
