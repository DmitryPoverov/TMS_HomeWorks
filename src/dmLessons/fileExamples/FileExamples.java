package dmLessons.fileExamples;

import java.io.File;
import java.io.IOException;

public class FileExamples {
    public static void main(String[] args) throws IOException {

        /**
        *               OutputStream.write()
        * Application -----------------------> File
        *                     Writer
        *
        *                InputStream.read()
        * Application <----------------------- File
        *                     Reader
        */

        File f1 = new File("src/dmLessons/resources/test.txt");
        System.out.println(f1.createNewFile());

        File f2 = new File("src/dmLessons/resources");

        System.out.println("File has a name: " + f1.getName());
        System.out.println("File has a parent: " + f1.getParent());
        System.out.println("File has the length: " + f1.length() + "byte");
        System.out.println("exist: " + f1.exists() + ", isFile: " + f1.isFile() + ", isDirectory: " + f1.isDirectory());

        System.out.println("Folder has a name: " + f2.getName());
        System.out.println("exist: " + f2.exists() + ", isFile: " + f2.isFile() + ", isDirectory: " + f2.isDirectory());
        System.out.println("The relative path: " + f2.getPath());
        System.out.println("The absolute path: " + f2.getAbsolutePath());
    }
}
