import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class RowsInReverse {

    private static String dir() {
        String path = System.getProperty("user.dir") + File.separator + "src" + File.separator + "main" + File.separator + "OptionalTask" + File.separator;
        String clDir = Poem.class.getName().replace(Poem.class.getSimpleName(), "").replace(".", File.separator);
        return path + clDir;
    }

    public static void main(String[] args) {
        String fileName = dir() + "poem.txt";
        String fileNameReverse = dir() + "poemInReverse.txt";
        List<String> poem = new ArrayList<>();
        String readedLine;
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            while ((readedLine = reader.readLine()) != null) {
                poem.add(readedLine);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        List<String> reversPoem = new ArrayList<>();
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileNameReverse))) {
            for (int i = poem.size() - 1; i >= 0; i--) {
                String line = poem.get(i);
                reversPoem.add(line);
            }
            for (String s : reversPoem) {
                writer.write(s + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
