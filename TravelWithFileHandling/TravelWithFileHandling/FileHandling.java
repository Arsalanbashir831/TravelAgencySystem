package TravelWithFileHandling;

import javax.swing.*;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class FileHandling {

    public static void createFile(){
        File file=new File("D:\\ArsalanTravelGui\\src\\travel\\TravelFile.txt");
        try {
            file.createNewFile();
            System.out.println("file created");
        } catch (IOException e) {
            System.out.println("error occured");
        }
    }
    public static void writeFile(JTextArea textArea){
        createFile();
        try {
            BufferedWriter bw=new BufferedWriter(new FileWriter("D:\\ArsalanTravelGui\\src\\travel\\TravelFile.txt"));
            bw.write(textArea.getText());
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
