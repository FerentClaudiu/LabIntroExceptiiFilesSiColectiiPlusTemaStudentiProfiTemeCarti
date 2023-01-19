package demosortorder;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DemoSimpleSort {

    public static void main(String[] args) {
        Person p1 = new Person("ionel", 45);
        Person p2 = new Person("iulia", 35);
        Person p3 = new Person("ligia", 13);
        Person p4 = new Person("tatiana", 9);

        List<Person> myFamily = new ArrayList<>();
        myFamily.add(p1);
        myFamily.add(p2);
        myFamily.add(p4);
        myFamily.add(p3);

        Collections.sort(myFamily);

        for(Person x:myFamily) {
            System.out.println(x.getName()+":"+x.getAge());
        }

    }


}
