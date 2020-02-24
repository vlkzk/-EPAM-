import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class Tree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sa = new StringBuilder();
        String path = sc.nextLine();
        File files = new File(path);
        sa.append(files.getName()).append("\n");
        writeFile(getPathToWriteFile(), readFiles(files, sa));
        System.out.println(sa);
    }

    public static String readFiles(File files, StringBuilder sa) {
        if (files.isDirectory()) {
            for (File file : Objects.requireNonNull(files.listFiles())) {
                if (file.isFile()) {
                    sa.append("|     ").append(file.getName()).append("\n");
                } else {
                    sa.append("|").append("\n").append("|-----").append(file.getName()).append("\n");
                    readFiles(file, sa);
                }
            }
        }
        return String.valueOf(sa);
    }

    public static void writeFile(String pathToFile, String text) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(pathToFile))) {
            bw.write(text);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String getPathToWriteFile() {
        return "C:\\TaxiPark\\src\\main\\IOFundamentals\\resultTree.txt";
    }
}

