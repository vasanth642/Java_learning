package cia1.java.C;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;

public class Exceptionlogger {
    public static void logException(Exception e) {
        try (FileWriter fw = new FileWriter("exceptions.log", true)) {
            fw.write(LocalDateTime.now() + " - " + e.toString() + "\n");
        } catch (IOException ex) {
            System.out.println("Error writing log: " + ex);
        }
    }

    public static void main(String[] args) {
        try {
            int a = 5 / 0;  // Divide by zero
        } catch (Exception e) {
            logException(e);
        }

        try {
            String s = null;
            System.out.println(s.length());  // Null reference
        } catch (Exception e) {
            logException(e);
        }

        try {
            int[] arr = new int[5];
            System.out.println(arr[10]);  // Index out of bounds
        } catch (Exception e) {
            logException(e);
        }

        System.out.println("Exceptions logged to exceptions.log");
    }
}
