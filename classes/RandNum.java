package classes;

import java.util.Random;
import java.util.Scanner;

public class RandNum {
    public static void main(String[] args) {
        Random rnd = new Random();
        @SuppressWarnings("resource")
        Scanner scn = new Scanner(System.in);

        int num = rnd.nextInt(10) + 1;

        System.out.println("Game tebak angka !");

        System.out.print("Tebak angka 1 - 10 : ");
        int value = scn.nextInt();

        if (num == value) {
            System.out.println("Jawaban benar : " + num);
        } else {
            System.out.println("Jawaban salah : " + num);
        }
    }
}
