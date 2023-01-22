package exemple.carte.interfataE1;

public class Monster implements Eatable{
    private String name;

    public Monster (String name){
        this.name= name;
    }
    public void eat(){
        System.out.println(name + "(a monster ) eating");
    }
}
