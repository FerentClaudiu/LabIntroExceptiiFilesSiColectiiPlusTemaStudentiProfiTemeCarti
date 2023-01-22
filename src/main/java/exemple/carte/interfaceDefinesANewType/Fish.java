package exemple.carte.interfaceDefinesANewType;

public class Fish implements Swimmable{
    private String name;
    public Fish(String name) {
        this.name = name;
    }

    // Override and implement the swim() method
    public void swim() {
        System.out.println(name + " (a fish) is swimming.");
    }
    // A valid method for the class Fish. This method declaration has nothing to do
    // with the Swimmable interface's swim()
    public void swim(double distanceInYards) {
        // More code goes here
    }
}
