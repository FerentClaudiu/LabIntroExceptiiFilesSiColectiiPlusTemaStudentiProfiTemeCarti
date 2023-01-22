package exemple.carte.interfataE1;

public class Bugs implements Eatable{
    private String name;
     public Bugs ( String name){
         this.name= name;
     }
    public void eat(){
        System.out.println( name + "(a bug ) is eating");
    }

}
