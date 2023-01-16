package org.example;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Copy {

    public static void main(String[] args) {
        copyB(args[0], args[1]);
    }

    private static void copyB(String source, String dest ) {

        Path pin = null;
        InputStream is = null;
        Path pout = null;
        OutputStream os = null;

        try {
            // desch un fis sursa
            // creez un fis dest
            // sa copiez byte cu byte

            // Stream

           pin = Paths.get(source);
            is = Files.newInputStream(pin);
             pout = Paths.get(dest);
             os = Files.newOutputStream(pout);

            byte[] b = new byte[2048];
            int len;
            while((len=is.read(b))>0)
            {
                os.write(b,0,len);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if(is!=null)
                is.close();
                if(os!=null)
                os.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }




    }







    private static void copyFileUsingStream(String s, String d) {
        try {
            InputStream is = null;
            OutputStream os = null;

            File source = new File(s);
            File dest = new File(d);

            is = new FileInputStream(source);
            os = new FileOutputStream(dest);
            byte[] buffer = new byte[1024];
            int length;
            while ((length = is.read(buffer)) > 0) {
                os.write(buffer, 0, length);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
        }

    }
}
