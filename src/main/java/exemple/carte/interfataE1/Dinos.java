package exemple.carte.interfataE1;

public class Dinos implements Eatable{
    private String name;

    public Dinos(String name){
        this.name= name;
    }
    public void eat(){
        System.out.println(name + "(a dino ) is eating");
    }
}
