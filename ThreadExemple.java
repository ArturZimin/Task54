package by.minsk.itakademy.arturzimin;

import java.io.*;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class ThreadExemple extends Thread {




   public synchronized  void run(String path, int[] numbers) {
        try {
            for (int i = 0; i < numbers.length; i++) {
                int num = numbers[i];
            }
            String path1 = path;
            File file = new File(path1);
            if (!file.exists()) {
                file.createNewFile();
            }
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file,true));
            bufferedWriter.write(Arrays.toString(numbers));
            bufferedWriter.newLine();

            bufferedWriter.flush();
            bufferedWriter.close();
        } catch (IOException e) {
            throw new RuntimeException("Ups,filed to write into file: path" + e);

        }
    }
}