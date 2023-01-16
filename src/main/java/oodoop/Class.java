package oodoop;

class Class {
    private String name;
    private int id;
    private Teacher professor;

    public Class(String name, int id, Teacher professor) {
        this.name = name;
        this.id = id;
        this.professor = professor;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public Teacher getProfessor() {
        return professor;
    }
}