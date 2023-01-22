package exemple.carte;

public class WalkableTest {
    public static void main(String[] args) {
        Person[]persons = new Person[3];
        persons[0]=new Person("Jack");
        persons[1]= new Person("John");
        persons[2]= new Person("marie");

        // let everyone walk
        Walkable.letThemWalk(persons);
    }
}
