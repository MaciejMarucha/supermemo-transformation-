package p1;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Main {
//zrobic przypadek kiedy sa 2,3 zdania do jednego
    public static void main(String args[]) throws FileNotFoundException {

        try {
            String fileName = args[0];
            String newFileName = args[1];
            List<String> allLines = Files.readAllLines(Paths.get(fileName));
            PrintWriter writer = new PrintWriter(Paths.get(newFileName).toFile(), StandardCharsets.UTF_8);
            for (int i = 0, lineNumber = 1; i < allLines.size(); i++) {
                if (!isNumeric(allLines.get(i))) {
                    if (!allLines.get(i).equals("")) {
                        writer.println(allLines.get(i));
                        lineNumber++;
                    } else {
                        System.out.println("To jest pusty wiersz");
                    }
                    if (lineNumber > 0 && (lineNumber % 3 == 0)) {
                        writer.println();
                        lineNumber++;
                    }
                }
            }
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static boolean isNumeric(String strNum) {
        if (strNum == null) {
            return false;
        }
        try {
            int d = Integer.parseInt(strNum);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }
}
