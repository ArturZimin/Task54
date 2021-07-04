package by.minsk.itakademy.arturzimin;

import java.io.File;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int[] array = new int[100];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10);
            System.out.println(i);
        }

        ThreadExemple threadExemple=new ThreadExemple();
        threadExemple.run("C:\\Users\\Office\\IdeaProjects\\Task54(04_07_2021)\\file.txt",array);
        threadExemple.start();

        ThreadExemple threadExemple1=new ThreadExemple();
        threadExemple1.run("C:\\Users\\Office\\IdeaProjects\\Task54(04_07_2021)\\file.txt",array);
        threadExemple1.start();

        ThreadExemple threadExemple2=new ThreadExemple();
        threadExemple2.run("C:\\Users\\Office\\IdeaProjects\\Task54(04_07_2021)\\file.txt",array);
        threadExemple2.start();

        ThreadExemple threadExemple3=new ThreadExemple();
        threadExemple3.run("C:\\Users\\Office\\IdeaProjects\\Task54(04_07_2021)\\file.txt",array);
        threadExemple3.start();

        ThreadExemple threadExemple4=new ThreadExemple();
        threadExemple4.run("C:\\Users\\Office\\IdeaProjects\\Task54(04_07_2021)\\file.txt",array);
        threadExemple4.start();

        ThreadExemple threadExemple5=new ThreadExemple();
        threadExemple5.run("C:\\Users\\Office\\IdeaProjects\\Task54(04_07_2021)\\file.txt",array);
        threadExemple5.start();

    }
}
