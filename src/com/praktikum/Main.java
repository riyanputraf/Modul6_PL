package com.praktikum;
/**
 * @author Riyan Putra Firjatullah
 * 202010370311328
 * Informatika
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /**
         * inString array untuk menampung data String
         * inNumber array untuk menampung data angka
         * Scanner input untuk inputan dari user
         * konfirmasi untuk memberikan notif kepada user
         */
        ArrayList<String> inString = new ArrayList<>();
        ArrayList<String> inNumber = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        String konfirmasi;

        do {
            try {
                System.out.print("Masukkan inputan : ");
                String inputan_user = input.nextLine();
                if (isNumeric(inputan_user)) {
                    inNumber.add(inputan_user);
                } else if (isString(inputan_user)) {
                    inString.add(inputan_user);
                }


            } catch (Exception e) {
                System.out.println(e);

            }

            System.out.println("Ingin lanjut ? y/n");
            konfirmasi = input.nextLine();


        } while (konfirmasi.equals("y"));


        System.out.println("ini data angka anda : ");
        for (String hasilN : inNumber) {
            System.out.println(hasilN);
        }
        System.out.println("Ini data String anda :");
        for (String hasilS : inString) {
            System.out.println(hasilS);
        }
        System.out.println("Ingin di save ? y/n");
        konfirmasi = input.nextLine();
        if (konfirmasi.equals("y")) {
            WriteFile writeFile = new WriteFile();
            writeFile.writeNumber(inNumber);
            writeFile.WriteString(inString);
            System.out.println("Your data has been save");
        }

        System.out.println("Ingin cek file anda ? y/n");
        konfirmasi = input.nextLine();
        if (konfirmasi.equals("y")) {
            ReadFile readFile = new ReadFile();
            readFile.readNumber();
            readFile.readString();
        }


    }

    /**
     * Method isNumeric untuk mengecek inputan berupa String atau angka
     * @param str String yang akan dicek mengandung angka
     * @return false jika str adalah inputan kosong atau hanya terdapat
     */
    private static boolean isNumeric(String str) {
        if (str != null && str.matches("[.-]+")) {
            return false;
        }
        /**
         * @param str.matches
         */
        return str.matches("[0-9.-]+");

    }

    private static boolean isString(String str) {
        return str != null && str.matches("[^0-9]+");
    }


}

