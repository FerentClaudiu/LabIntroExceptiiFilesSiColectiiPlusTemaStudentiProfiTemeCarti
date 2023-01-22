package exemple.carte.interfataE1;

public class EatableTest {
    public static void main(String[] args) {
        Eatable []e = new Eatable[6];
        e[0]= new Person("Ion");
        e[1]=new Animal("leu");
        e[2]= new Person("maria");
        e[3] = new Bugs("Bee");
        e[4] = new Dinos("T rex");
        e[5]= new Monster("moooonster");
        Eatable.letThemEat(e);
    }

}
