package exemple.carte.interfataE1;

public interface Eatable {
public static void letThemEat(Eatable[]list){
    for(Eatable e : list){
        e.eat();
    }
}

    void eat();
}
