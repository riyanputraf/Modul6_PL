package com.praktikum;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;


public class ReadFile {

    public void readNumber() {
        try {
            BufferedReader br = new BufferedReader(new FileReader("dataNumber.txt"));
            String isi;
            System.out.println("Data File Number : ");
            while ((isi = br.readLine()) != null) {
                System.out.println(isi);
            }
        } catch (FileNotFoundException e) {
            System.out.println(e);

        } catch (Exception e) {
            System.out.println("error dalam membaca file");
        }

    }


    public void readString() {
        try {
            BufferedReader br = new BufferedReader(new FileReader("dataString.txt"));
            String isi;
            System.out.println("Data File String : ");
            while ((isi = br.readLine()) != null) {
                System.out.println(isi);
            }
        } catch (FileNotFoundException e) {
            System.out.println(e);

        } catch (Exception e) {
            System.out.println("error dalam membaca file");
        }

    }


}
