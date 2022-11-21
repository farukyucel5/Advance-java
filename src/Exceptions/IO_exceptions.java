package Exceptions;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class IO_exceptions {
    public static void main(String[] args) {
        BufferedReader reader=null;
        int total=0;
        double average;
        int count=0;
        try {
             reader =new BufferedReader(new FileReader("src/Exceptions/Grades"));
             String line=null;
             while((line=reader.readLine())!=null)
             {
                 count++;
               total+=Integer.parseInt(line);
             }

            average=total/count;
            System.out.println("The average grade of the class: "+average);

        } catch (FileNotFoundException e) {
            System.out.println("The file you're trying to read not found");
        } catch (NumberFormatException e){
            System.out.println("The grades cannot consist any characters except for numbers");

        } catch (IOException e) {
            System.out.println("No line to read!!");
        } finally {
            try {
                reader.close();
            } catch (IOException e) {
                System.out.println("you cannot close the file which is not existed");
            }
        }

    }
}
