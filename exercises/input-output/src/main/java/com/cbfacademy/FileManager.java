package com.cbfacademy;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileManager {

    public List<String> readFile(String filename) {
        List<String> lines = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                lines.add(line);
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }

        return lines;
    }

    public void copy(String inputFile, String outputFile) {
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile));
             BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {

            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line);
                writer.newLine(); // Add newline for each line
            }

        } catch (IOException e) {
            System.out.println("Error copying file: " + e.getMessage());
        }
    }
}


// ## :pushpin: File Input/Output

// ### Part 1

// Create a class called `FileManager` with the following methods:

// - `public List<String> readFile(String filename)` - returns a `List<String>` object, where each list item is a line from the specified file
// - `public void copy(String inputFile, String outputFile)` - copies the contents of a text file at the path defined by `inputFile` to the path defined by `outputFile`. Creates `outputFile` if it doesn't exist and overwrites it, if it does

// #### :bookmark: Note:
// The paths to `inputFile` and `outputFile` are relative to the root directory of this repository (e.g. `exercises/input-output/src/main/resources/exercise.txt`)
