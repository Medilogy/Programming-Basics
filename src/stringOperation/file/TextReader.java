package stringOperation.file;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class TextReader {
    public static List<String> readFromFile(String path) {

        List<String> result = new ArrayList<>();
        BufferedReader reader = null;
        FileReader fileReader = null;

        try {
            fileReader = new FileReader(path);
            reader = new BufferedReader(fileReader);
            String line = null;
            //krok 1 -> odczytaj lnie i przypisz do zmiennej line
            //krok 2 -> sprawdz czy odczytana linia rozna od null
            while ((line = reader.readLine()) != null) {
                result.add(line);
            }

        } catch (java.io.IOException e) {
            e.printStackTrace();

        } finally {
            if (fileReader != null) {
                try {
                    fileReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return result;
    }

    //since java 1.7 krótsza wersja wczytywania pliku
    public List<String> readFileWithTryWithResources(String path) {
        List<String> results = new ArrayList<>();
        try {
            try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
                String line = null;
                while ((line = reader.readLine()) != null) {
                    results.add(line);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return results;
    }

    // with java new io
    // java.nio.Files
    public List<String> readFromFileWithNewIO(String path) {
        List<String> lines = new ArrayList<>();
        try {
            lines = Files.readAllLines(Paths.get(path));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return lines;
    }
}