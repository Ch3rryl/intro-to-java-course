// package com.cbfacademy;

// import java.io.FileInputStream;
// import java.io.IOException;
// import java.io.InputStreamReader;
// import java.io.LineNumberReader;
// import java.util.List;

// public class FileManager {
//     public List<String> readFile(String name) {

//         String FilePath = "/exercises/input-output/src/main/resources/exercise.txt";

//         try (
//             FileInputStream myFileStream = new FileInputStream(FilePath); 
//             InputStreamReader readMyStream = new InputStreamReader(myFileStream); 
//             LineNumberReader myLineNumReader = new LineNumberReader(readMyStream);
//         ) {
//             String outputLine = new myLineNumReader.readLine(); 
//             while(outputLine != null) {
//                 System.out.printf(myLineNumReader.getLineNumber(), outputLine);
//                 outputLine = myLineNumReader.readLine(); 
//             }
            
//         } catch (IOException e) {
//             System.out.println("This is an exception message:" + e.getMessage());
    

// }

//     String inputFile = "/exercises/input-output/src/main/resources/exercise.txt";
//     String outputFile = outputFile; 

//      public void copy(String inputFile, String outputFile) {
      



//      }   
        
//     } 

    
// }

// ## :pushpin: File Input/Output

// ### Part 1

// Create a class called `FileManager` with the following methods:

// - `public List<String> readFile(String filename)` - returns a `List<String>` object, where each list item is a line from the specified file
// - `public void copy(String inputFile, String outputFile)` - copies the contents of a text file at the path defined by `inputFile` to the path defined by `outputFile`. Creates `outputFile` if it doesn't exist and overwrites it, if it does

// #### :bookmark: Note:
// The paths to `inputFile` and `outputFile` are relative to the root directory of this repository (e.g. `exercises/input-output/src/main/resources/exercise.txt`)
