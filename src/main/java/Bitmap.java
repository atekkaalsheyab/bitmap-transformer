
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class Bitmap {

    //Read a file
    public void readFile (Path filePath) throws IOException {

        ArrayList<Byte> Bytes = new ArrayList<Byte>();
        // Specify the file path from which you want to read
    try {
        Scanner read = new Scanner(filePath);
        while (read.hasNextByte()){
            Bytes.add(read.nextByte());

        }
        for (int i = 0; i < Bytes.size(); i++) {
            System.out.println(Bytes.get(i));
        }
    } catch (IOException e) {
        System.out.println("Wrong"+ e.getMessage());
    }






    }

}
