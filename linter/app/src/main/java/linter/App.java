/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package linter;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class App {
    public String getGreeting() {

        return "Hello World!";
    }

    public static void main(String[] args) {
        Path p = Paths.get("./app/src/main/resources/gates5.js");
        System.out.println(checkLine(p));
    }

    public static String checkLine(Path p ){
        String result = "";
        BufferedReader read = null;
            try {
                read = Files.newBufferedReader(p);
                String line = read.readLine();
                int lineNumber = 1;

                while(line != null){
                    if(!line.endsWith(";") && !line.isEmpty() &&!line.endsWith("{") && !line.endsWith("}") && !line.contains("if") && !line.contains("else") ){
                        result = result +"Line "+lineNumber+ " Missing semicolon."+"\n";
                    }
                    lineNumber++;
                    line = read.readLine();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }finally {
                if(read !=null){
                    try {
                        read.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
            return result;



    }
}
