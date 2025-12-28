import java.io.*;

public class FileHandlingUtility {

    // Write data into file
    public static void writeFile(String fileName) {
        try {
            FileWriter fw = new FileWriter(fileName);
            fw.write("Welcome to CODTECH Internship\n");
            fw.write("This is Task-1 File Handling Utility");
            fw.close();
            System.out.println("File written successfully.");
        } catch (IOException e) {
            System.out.println("Error while writing file.");
        }
    }

    // Read data from file
    public static void readFile(String fileName) {
        try {
            FileReader fr = new FileReader(fileName);
            BufferedReader br = new BufferedReader(fr);

            String line;
            System.out.println("\nReading file content:");
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            br.close();
        } catch (IOException e) {
            System.out.println("Error while reading file.");
        }
    }

    // Modify file (append data)
    public static void modifyFile(String fileName) {
        try {
            FileWriter fw = new FileWriter(fileName, true);
            fw.write("\nFile modified successfully.");
            fw.close();
            System.out.println("\nFile modified.");
        } catch (IOException e) {
            System.out.println("Error while modifying file.");
        }
    }

    public static void main(String[] args) {
        String fileName = "data.txt";

        writeFile(fileName);   // Write
        readFile(fileName);    // Read
        modifyFile(fileName);  // Modify
        readFile(fileName);    // Read again
    }
}
