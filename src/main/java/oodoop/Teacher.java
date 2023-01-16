package oodoop;

import java.util.ArrayList;
import java.util.List;

class Teacher extends People {
    private List<String> disciplines;
    private List<Class> classes;

    public Teacher(String name, int id, List<String> disciplines) {
        super(name, id);
        this.disciplines = disciplines;
        this.classes = new ArrayList<>();
    }

    public void teachClass(Class c) {
        classes.add(c);
    }

    public List<String> getDisciplines() {
        return disciplines;
    }

    public List<Class> getClasses() {
        return classes;
    }
}