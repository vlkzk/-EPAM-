package Hardcore.ExecutionSteps;

public class Parser {
    public static String getPartString(String startLine) {
        String partLine = "";
        String[] parts = startLine.split(":", 2);
        for (int i = 0; i < parts.length; i++) {
            partLine = parts[parts.length - 1].trim();
        }
        return partLine;
    }

    public static String parseLineForWordsOnMiddle(String startLine) {
        String partLine = "";
        String[] parts = startLine.split(":", 2);
        for (int i = 0; i < parts.length; i++) {
            partLine = parts[parts.length - 1].trim();
        }
        String[] partsLine = partLine.split(" ", 3);
        for (int i = 0; i < partsLine.length; i++) {
            partLine = partsLine[partsLine.length - 3] + " " + partsLine[partsLine.length - 2].trim();
        }
        return partLine;
    }
}
