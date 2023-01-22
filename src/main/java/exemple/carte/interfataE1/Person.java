package exemple.carte.interfataE1;

public class Person implements Eatable {
    private String name;
    public Person(String name){
        this.name= name;
    }
    public void eat(){
        System.out.println(name + "(a person) is eating");
    }

}
