package org.example;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;


// throws - in semnatura metodei
// try { ........} catch(Clasa obiect) { .... }
// throw

// throwable - exception - runtime exception unchecked ,
                          // checked  try catch sau throws
public class Main {
    private static final Logger LOGGER = Logger.getLogger("nume");
    public static void main(String[] args){

        //  i/o : intrare, algo, iesire
        // exceptii
        // colectii - incepem

        processFile();
    }


    private static void processFile()  {

        FileHandler fh = null;
        try {
            fh = new FileHandler("logaplicatie.%u.%g.txt", true);
        } catch (IOException e) {
            e.printStackTrace();
        }
        fh.setFormatter(new SimpleFormatter());
        LOGGER.addHandler(fh);


        LOGGER.info("intra in main, porneste programul");
        String fileName=null;
        boolean succes =false;
        while(!succes) {
            try {
                Scanner sc = new Scanner(System.in);
                fileName = sc.nextLine();
                FileReader fr = new FileReader(fileName);
                succes=true; // nu ajunge aici daca da exceptie mai sus
                LOGGER.info("clientul asta a introdus nume bun de fisier ");
                LOGGER.info(fileName);
                BufferedReader br = new BufferedReader(fr);
                String line;
                while ((line = br.readLine()) != null) {
                    String uppercase = line.toUpperCase();
                    System.out.println(uppercase);
                    LOGGER.info(line+":"+uppercase);
                }
            } catch (IOException e) {
                //e.printStackTrace();
                LOGGER.severe("fisierul nu a fost gasit, mai incercam ");
            }
        }

        //alte operatii
        System.out.println("aici continuam sa facem altele ");
    }
}