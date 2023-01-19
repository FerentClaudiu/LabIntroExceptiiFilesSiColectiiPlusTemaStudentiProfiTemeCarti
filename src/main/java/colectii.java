import java.util.*;

public class colectii {

    public static void main(String[] args) {
//        List list = new ArrayList();
//        list.add("ionel este vanator");
//        list.add(2);
//        list.add(false);
//
//        Object o = list.get(0);
//        if(o instanceof Integer) {
//            int a = (Integer) list.get(0);
//            System.out.println(a);
//        }
//        else
//        if(o instanceof String) {
//            String a = (String) list.get(0);
//            System.out.println(a);
//        }


        List<String> list = new ArrayList<>();
        list.add("ana");
        list.add("ana-maria");
        list.add("66");
        list.add("maria");
        list.add("ana");
        list.add("maria");
        list.add("costel");


//        String s = list.get(3);
//        System.out.println(s);

   // traversari

        System.out.println("lista cu duplicate");
        for(String sss: list) {
            System.out.println(sss);
        }

//        for(int i=0;i<list.size();i++) {
//            System.out.println(list.get(i));
//        }
//
//        Iterator<String> i = list.iterator();
//        while(i.hasNext()) {
//            String s = i.next();
//            System.out.println(s);
//           // i.remove();
//        }

        System.out.println("lista fara duplicate");
        Set<String> noDup = new HashSet<>(list);
        for(String sss: noDup) {
            System.out.println(sss);
        }


    }
}
