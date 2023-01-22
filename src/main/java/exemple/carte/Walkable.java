package exemple.carte;

public class Walkable {
    public static void letThemWalk(Person[] list){
        for (Person person: list){
            person.walk();
        }
    }
}
