package pl.lublin.wsei.java.cwiczenia.test;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class TestFileRead {

    public static void main(String[]args) throws java.io.IOException {
        try{

            String contents = new String(Files.readAllBytes(Paths.get("gusInfoGraphi")));
            System.out.println("ZAWARTOSC PLIKU gusInfoGraphi.xml");
            System.out.print(contents);
        }
        catch (IOException e) {
            System.out.println("Blad w wczytywaniu pliku gusInfoGraphi.xml =>"+e.getLocalizedMessage());
            e.printStackTrace();
        }

    }


}
