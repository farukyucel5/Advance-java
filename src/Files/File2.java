package Files;

import java.io.*;
import java.util.Scanner;

public class File2 {
    public static void main(String[] args) {
      getInfo();

      readFile();
      writeFile();
      readFile();

    }

    public static void createFile() {
        File file1=new File("C:\\Users\\Lenovo\\OneDrive\\Masaüstü\\intejij_project\\Files\\Students.txt");
        try {
            if(file1.createNewFile())
            {
                System.out.println("The file has just created");
            }else {
                System.out.println("The file  already exists!");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public static void getInfo() {
        File file1=new File("C:\\Users\\Lenovo\\OneDrive\\Masaüstü\\intejij_project\\Files\\Students.txt");
        if(file1.exists()) {
            System.out.println("The file name: "+file1.getName());
            System.out.println("The file path: "+file1.getAbsolutePath());
            System.out.println("can we write the file? "+file1.canWrite());
            System.out.println("Is the file readable? "+file1.canRead());
            System.out.println("The size of the file: "+file1.length()+" byte");
        }

    }

    public static void readFile() {
        File file1=new File("C:\\Users\\Lenovo\\OneDrive\\Masaüstü\\intejij_project\\Files\\Students.txt");
        System.out.println("================================");
        try {
            Scanner reader=new Scanner(file1);
            System.out.println("THE FİLE CONTENT");
            while (reader.hasNextLine())
            {
                String line=reader.nextLine();
                System.out.println(line);
            }
            reader.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public static void writeFile() {
        try {
            BufferedWriter writer=new BufferedWriter(new FileWriter("C:\\Users\\Lenovo\\OneDrive\\Masaüstü\\intejij_project\\Files\\Students.txt",true));
            writer.newLine();
            writer.write("I appended a new line to the file");
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
