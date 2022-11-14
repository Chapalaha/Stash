package com.example.stash;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.RequiresApi;

import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.HashMap;

public class BinaryCode {


    public static String alphaToBinary(String engRus) {

        StringBuilder answer = new StringBuilder();

        for (int i = 0; i < engRus.length(); i++) {
            char c = engRus.charAt(i);

            answer.append(Integer.toBinaryString(c)).append(" ");
        }


        answer = new StringBuilder(answer.substring(0, answer.length() - 1));
        return answer.toString();
    }


    public static String binaryToAlpha(String binaryString) {
        StringBuilder stringBuilder = new StringBuilder();
        int charCode;
        String[] parts = binaryString.split(" ");
        for (String part : parts) {
            charCode = Integer.parseInt(part, 2);
            String returnChar = Character.toString((char) charCode);
            stringBuilder.append(returnChar);
        }
        return stringBuilder.toString();
    }


}