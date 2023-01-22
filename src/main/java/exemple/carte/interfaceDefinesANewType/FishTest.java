package exemple.carte.interfaceDefinesANewType;

public class FishTest {
    public static void main(String[] args) {
        // Create an object of the Fish class
        Fish fifi = new Fish("Fifi");
        //Fish guppi = new Fish("Guppi");
        // A Fish is always Swimmable

        Swimmable hilda = new Fish("Hilda");
       /* hilda = new Turtle();
        guppi = (Fish)hilda;*/
        Fish fred = new Fish("Fred");
        /*Swimmable turti = new Turtle();
        fred = (Fish)turti;*/
        Swimmable finny = new Fish("Finny");
        finny.swim();
    }
}
