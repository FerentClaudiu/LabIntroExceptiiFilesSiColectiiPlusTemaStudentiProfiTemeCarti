package recapInterf;

import java.io.*;

public class Princ {

    public static void main(String[] args) {

//        Person p = new Person("ionel", 45);
//
//        try (FileOutputStream fos = new FileOutputStream("person.txt");
//             ObjectOutputStream oos = new ObjectOutputStream(fos))
//             {
//            oos.writeObject(p); //salvare pe disc, noi ii spunem serializare
//
//        }
//        catch(IOException ioex) {
//            ioex.printStackTrace();
//        }


        try (FileInputStream f = new FileInputStream("person.txt");
             ObjectInputStream oos = new ObjectInputStream(f))
        {
            Object o = oos.readObject(); //salvare pe disc, noi ii spunem serializare
            Person x = (Person)o;
            System.out.println(x.getName());
            System.out.println(x.getAge());

        }
        catch(IOException  | ClassNotFoundException e) {
            e.printStackTrace();
        }



    }
}
