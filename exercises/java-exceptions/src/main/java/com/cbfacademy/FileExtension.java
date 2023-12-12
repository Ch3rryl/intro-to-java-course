package com.cbfacademy;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FileExtension {
    public boolean check(String filename) throws FilenameException {
        if(filename == null || file.isEmpty())  {
            throw new FilenameException("Filename is null or empty"); 

        } 
        return filename.endsWith(".java");
} 

public Map<String, Integer> map(List<String> filenames) {
        Map<String, Integer> result = new HashMap<>();

        for (String filename : filenames) {
            try {
                result.put(filename, check(filename) ? 1 : 0);
            } catch (FilenameException e) {
                result.put(filename, -1);
            }
        }

        return result;
    }
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


// The goal of this exercise is to practise:
// - Creating custom exceptions
// - Handling exceptions

// For the exercises below, we've provided the starter project above.

// ## :pushpin: Exceptions

// ### Question 1

// Is the following code legal?

// ```java
// try {

// } finally {

// }
// This valid. 
// ```

// ### Question 2

// What exception types can be caught by the following handler?
// ```java
// catch (Exception e) {
    
// }
// The catch block you provided catches exceptions of type Exception or any of its subclasses. In Java, Exception is a base class for all checked exceptions. Therefore, any exception that is a subclass of Exception can be caught by this handler.
// ```

// What is wrong with using this type of exception handler?
// Because an exception is caught by its type, it is better to define exceptions for specific purposes than to use the general exception types for multiple purposes. Throwing general exception types makes code hard to understand and maintain and defeats much of the advantage of the Java exception-handling mechanism.

// ### Question 3

// Is there anything wrong with the following exception handler as written? Will this code compile?

// ```java
// try {

// } catch (Exception e) {

// } catch (ArithmeticException a) {

// }
// Yes, there is an issue with the provided exception handler code. In Java, when you have multiple catch blocks, they must be ordered from the most specific (subclasses) to the most general (superclasses). In your code, the catch block for ArithmeticException comes after the catch block for Exception, which is not allowed.
// ```

// ### Question 4

// ```java
// int[] A; 
// A[0] = 0;
// ```

// The above code produces (choose 1):

// - [ ] an error
// - [ ] a checked exception
// - [ ] an unchecked exception
// - [ ] a compile error
// - [ ] no exception

// ### Question 5

// The JVM starts running your program, but the JVM can't find the Java platform classes. 
// (The Java platform classes reside in classes.zip or rt.jar.)

// What happens (choose 1):

// - [ ] an error
// - [ ] a checked exception
// - [ ] an unchecked exception
// - [ ] a compile error
// - [ ] no exception

// The specific error that might occur in this situation is often a NoClassDefFoundError or a similar class-loading-related error.

// ## :pushpin: Custom Exceptions



