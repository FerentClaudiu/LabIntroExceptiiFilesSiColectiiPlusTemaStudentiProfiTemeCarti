package org.example;


/*

6
8
9
-3
-5
-11




 */

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.StringTokenizer;

public class DemoFileText {

    public static void main(String[] args) {

        processTempFile(args[0]);

    }


    private static void processTempFile(String inputFile) {

        // read file
        // get all the values
        // print them

        Path filePath = Paths.get(inputFile);
        try {
            byte[] fileContent = Files.readAllBytes(filePath);
            String content =new String(fileContent);

            // calc avg
            double avg=0;
            double sum = 0;
            int i = 0;
            StringTokenizer st = new StringTokenizer(content);
            boolean ignore=false;
            while (st.hasMoreTokens()) {
                ignore=false;
                String s= st.nextToken();

                int nr = 0;
                try {
                    nr = Integer.parseInt(s);
                } catch (NumberFormatException e) {
                   //logger
                   ignore=true;
                }
                sum = sum+nr;
                if(!ignore)
                i++;
            }
            avg = sum/i;
            System.out.println(avg);
            } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
