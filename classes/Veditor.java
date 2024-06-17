package classes;

// Mengimpor library yang diperlukan
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

@SuppressWarnings("unused")
public class Veditor {
    private static final String FILE_PREFIX = "D:/iyan/software/java01/files/";
    private final Scanner scn = new Scanner(System.in);
    
    private void Vveditor() {
        System.out.println("Welcome to Veditor, what do you want to do?");
        System.err.println("1. Read A Text");
        System.out.println("2. Create a New Text");
        System.out.print("> ");

        int choice = scn.nextInt();

        switch (choice) {
            case 1:
                Vread();
                break;
            case 2:
                Vwrite();
                break;
            default:
                System.out.println("Get out of here");
        }
    }

    @SuppressWarnings("resource")
    private void Vread() {
        System.out.print("Nama file : ");
        String filename = scn.nextLine().trim();

        try {
            FileInputStream fis = new FileInputStream("D:/iyan/software/java01/files/" + filename + ".txt");
            int tx;
            while ((tx = fis.read()) != -1) {
                System.out.print((char) tx);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @SuppressWarnings("resource")
    public static void Vwrite() {
        Scanner vwt = new Scanner(System.in);
        System.out.println("Nama file ");
        System.out.print("> ");
        String filename = vwt.nextLine();

        System.out.println("text");
        System.out.print("> ");
        String text = vwt.nextLine();

        try {
            FileOutputStream fos = new FileOutputStream("D:/iyan/software/java01/files/" + filename + ".txt");
            byte b[] = text.getBytes();
            fos.write(b);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
