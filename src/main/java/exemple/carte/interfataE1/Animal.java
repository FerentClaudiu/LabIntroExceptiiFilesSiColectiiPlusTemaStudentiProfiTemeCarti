package exemple.carte.interfataE1;

public class Animal implements Eatable{
    private String name;

    public Animal( String name){
        this.name=name;
    }
    public void eat(){
        System.out.println(name +"(a animal) is eating");
    }
}
