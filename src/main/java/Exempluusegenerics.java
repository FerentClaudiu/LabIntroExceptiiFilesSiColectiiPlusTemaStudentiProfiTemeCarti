public class Exempluusegenerics {
    public static void main(String[] args) {

        Box<String> s = new Box<String>();
        s.setT("maimuta");

        Box<Integer> i = new Box<Integer>();
        i.setT(55);


        // now use diamond operator

        Box<Integer> ii = new Box<>(); //box de integers , nu mai trebe sa pun tipul si la creare
    }
}
