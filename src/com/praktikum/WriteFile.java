package com.praktikum;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.ArrayList;

public class WriteFile {
    public void writeNumber(ArrayList<String> data) {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("dataNumber.txt", true));
            bw.write(String.valueOf(data));
            bw.flush();
            bw.newLine();
            bw.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void WriteString(ArrayList<String> data) {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("dataString.txt", true));
            bw.write(String.valueOf(data));
            bw.flush();
            bw.newLine();
            bw.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
