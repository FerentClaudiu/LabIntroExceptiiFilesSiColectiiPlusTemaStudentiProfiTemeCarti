import java.util.*;

public class DemoSet {

    public static void main(String[] args) {

        // ana are mere si pere si ana are pere

        // k = cuv
        // val = nr de aparatii




        // esdhfghdfhfgjfgdghfg

        // mere

        // ana are si pere

        //     // ana are mere si pere si ana are pere
        //{ana=2, are=2, si=2, mere=1, pere=2} HashMap, default , neclar
        //{ana=2, are=2, mere=1, pere=2, si=2} TreeMap, alfabetic
        //{ana=2, are=2, mere=1, si=2, pere=2} LinkedHashMap, in ce ordine se citesc

        Set<String> u = new HashSet<>();
        Set<String> d = new HashSet<>();

        for(String s: args) {
           if(!u.add(s))
               d.add(s);
        }
        u.removeAll(d);

        System.out.println("elem unice:"+u);
        System.out.println("elem duplicate:"+d);

        Map<String, Integer>  nrAparitii = new LinkedHashMap<>();
        for(String s: args) {
            Integer nrAp = nrAparitii.get(s);
          nrAparitii.put (s, (nrAp==null)?1:nrAp+1);
//            if(nrAp==null)
//                nrAparitii.put(s,1);
//            else
//                nrAparitii.put(s,nrAp+1);
        }

        System.out.println(nrAparitii);
    }
}
