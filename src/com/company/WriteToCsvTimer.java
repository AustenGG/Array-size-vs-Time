package com.company;
import java.time.Instant;

import javax.swing.*;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.PrintWriter;

import java.util.Arrays;

public class WriteToCsvTimer {

    public static void main(String[] args) {

        String filepath = "TestTimer.csv";

        saveRecord(filepath);

    }

    public static void saveRecord(String filepath){
        try
        {
            FileWriter fw = new FileWriter(filepath, true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);

            for (int n = 1000; n < 100000; n += 10000 ) {

                long initiated =   Instant.now().toEpochMilli();

                int data[] = new int[n];

                System.out.println(Arrays.toString(data));

                long completed =   Instant.now().toEpochMilli();

                long duration = completed-initiated;

                pw.println( duration + "\n");

            }

            pw.flush();
            pw.close();
            JOptionPane.showMessageDialog(null, "Record saved!");
        }
        catch(Exception E){

            JOptionPane.showMessageDialog(null, "Record not saved!");

        }
    }
}







