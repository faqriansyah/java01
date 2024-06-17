package classes;

// Mengimpor library yang diperlukan
import java.io.File; // Import File class for better path handling
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Vediplus {

    private static final String FILE_PREFIX = "D:/iyan/software/java01/files/"; // Centralized file path prefix
    private final Scanner scanner = new Scanner(System.in); // Single Scanner instance for user input

    public void start() {
        System.out.println("Welcome to Vediplus!");
        System.out.println("1. Read a Text");
        System.out.println("2. Create a New Text");
        System.out.print("> ");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                readText();
                break;
            case 2:
                createText();
                break;
            default:
                System.out.println("Invalid Choice.");
        }
    }

    private void readText() {
        System.out.print("Enter file name: ");
        String filename = scanner.nextLine().trim(); // Trim leading/trailing whitespace

        try (Scanner fileScanner = new Scanner(new File(FILE_PREFIX + filename + ".txt"))) {
            while (fileScanner.hasNextLine()) {
                System.out.println(fileScanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found.");
        }
    }

    private void createText() {
        System.out.print("Enter file name: ");
        String filename = scanner.nextLine().trim();

        System.out.println("Enter text content:");
        String text = scanner.nextLine();

        try (FileOutputStream outputStream = new FileOutputStream(FILE_PREFIX + filename + ".txt")) {
            outputStream.write(text.getBytes());
            System.out.println("Text successfully written to file.");
        } catch (IOException e) {
            System.out.println("Error: Could not write to file.");
        }
    }

    public static void main(String[] args) {
        Vediplus editor = new Vediplus();
        editor.start();
    }
}
