import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Poem {

    private static String dir() {
        String path = System.getProperty("user.dir") + File.separator + "src" + File.separator + "main" + File.separator + "OptionalTask" + File.separator;
        String clDir = Poem.class.getName().replace(Poem.class.getSimpleName(), "").replace(".", File.separator);
        return path + clDir;
    }

    public static void main(String[] args) {
        String fileName = dir() + "poem.txt";
        List<String> poem = new ArrayList<>();
        String readedLine;
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            while ((readedLine = reader.readLine()) != null) {
                poem.add(readedLine);
                poem.sort(new StringLengthListSort());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        for (String s : poem) {
            System.out.println(s);
        }
    }

    static class StringLengthListSort implements Comparator<String> {
        @Override
        public int compare(String s1, String s2) {
            return s2.length() - s1.length();
        }
    }
}
