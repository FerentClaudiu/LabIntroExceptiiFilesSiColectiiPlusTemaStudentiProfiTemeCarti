package oodoop;

import java.util.ArrayList;
import java.util.List;

class Student extends People {
    private int yearOfStudy;
    private List<Class> optionalClasses;
    private List<Class> mandatoryClasses;
    private List<Book> books;
    private List<Homework> homeworks;

    public Student(String name, int id, int yearOfStudy) {
        super(name, id);
        this.yearOfStudy = yearOfStudy;
        this.optionalClasses = new ArrayList<>();
        this.mandatoryClasses = new ArrayList<>();
        this.books = new ArrayList<>();
        this.homeworks = new ArrayList<>();
    }

    public int getYearOfStudy() {
        return yearOfStudy;
    }

    public void registerForOptionalClass(Class c) {
        optionalClasses.add(c);
    }

    public void registerForMandatoryClass(Class c) {
        mandatoryClasses.add(c);
    }

    public void addBook(Book b) {
        books.add(b);
    }

    public void addHomework(Homework h) {
        homeworks.add(h);
    }

    public List<Class> getOptionalClasses() {
        return optionalClasses;
    }

    public List<Class> getMandatoryClasses() {
        return mandatoryClasses;
    }

    public List<Book> getBooks() {
        return books;
    }

    public List<Homework> getHomeworks() {
        return homeworks;
    }
}