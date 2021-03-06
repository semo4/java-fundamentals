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
//        System.out.println(checkLine(p));

        int [] arr = {11,22,33,44,55,66,77};
        System.out.println(binarySearch(arr,15));
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

    public static int binarySearch(int[] arr, int number){
        int low = 0;
        int high = arr.length-1;
        int mid = (low+high)/2;
        while(low<=high){
            if(arr[mid]<number){
                low = mid + 1;
            } else if(arr[mid]== number){
                return mid;
            }else{
                high = mid - 1;
            }
            mid = (low+high)/2;
        }
        return -1;
    }
}
