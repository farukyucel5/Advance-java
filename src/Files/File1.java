package Files;

import java.io.File;
import java.io.IOException;

public class File1 {
    public static void main(String[] args) {
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
}
