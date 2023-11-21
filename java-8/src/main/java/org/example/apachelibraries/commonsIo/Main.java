package org.example.apachelibraries.commonsIo;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.util.Timer;

public class Main {
    public static void main(String[] args) {
        try {
            /*Write a program to copy a file from one location to another using Commons IO library.*/
            File srcFile = new File("src/main/java/org/example/apachelibraries/commonsIo/file.txt");
            File file = new File("src/main/java/org/example/apachelibraries/commonsIo/folder/newFile.txt");

            FileUtils.copyFile(srcFile, file);

            /*Write a program to delete a specific file or directory using Commons IO library.*/
            //FileUtils.delete(file);

            /*Create a program to calculate the total size of a directory using Commons IO library.*/
            System.out.println(FileUtils.sizeOfDirectory(new File("src/main/java/org")));
            System.out.println(FileUtils.sizeOf(srcFile));

            /*Develop a program to compare the contents of two files using Commons IO library.*/

            boolean x = FileUtils.contentEquals(srcFile, new File("src/main/java/org/example/apachelibraries/commonsIo/file.txt"));
            System.out.println(x);


            //FileUtils.deleteDirectory(new File("src/main/java/org/example/apachelibraries/commonsIo/folder"));
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
