package com.cbfacademy;

public class FilenameException extends Exception {
    System.out.println("test"); 
}


// ---
// Create a custom (checked) exception class called `FilenameException`.
// Create a class called `FileExtension` with the following methods:

// - `boolean check(String filename)`
// - `Map<String, int> map(List<String> filenames)`

// The `check` method should:
// - return `true` when the file extension is `.java`
// - return `false` when the file extension is not `.java`
// - throw a custom checked exception called `FilenameException` (that you must create) when the file name is `null` or an empty string.

// The `map` method should:
// - check each provided file's extension and map the returned value as 1 if true or 0 if false
// - map `-1` when an exception occurs

// **Example**

// For the following list of file names: `Arrays.asList("App.java", "App.txt", null, "App.md")`, the `map` method should return a map with the following entries:

// ```txt
// {"App.java", 1},
// {"App.txt", 0},
// {null, -1},
// {"App.md", 0}
// ```

// ---