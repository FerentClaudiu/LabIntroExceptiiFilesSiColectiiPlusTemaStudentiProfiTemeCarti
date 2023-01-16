package oodoop;

import java.util.Arrays;

public class MainProg {

    public static void main(String[] args) {

        // Create a new school
        Univ babes = new Univ();

        // Create some teachers
        Teacher t1 = new Teacher("Condor", 1, Arrays.asList("Info", "Mate"));
        Teacher t2 = new Teacher("Bondor", 2, Arrays.asList("Info", "Fizica"));
        babes.addTeacher(t1);
        babes.addTeacher(t2);

        // Create some classes
        Class c1 = new Class("Mate", 1, t1);
        Class c2 = new Class("Programare", 2, t1);
        Class c3 = new Class("AI", 3, t1);

        Class c4 = new Class("Fizica cuantica", 4, t2);
        babes.addClass(c1);
        babes.addClass(c2);
        babes.addClass(c3);
        babes.addClass(c4);

        // I add some students
        Student s1 = new Student("Maria", 1, 1);
        Student s2 = new Student("Ioana", 2, 1);
        Student s3 = new Student("Ana", 3, 1);
        Student s4 = new Student("Gabriela", 4, 1);
        Student s5 = new Student("Cristina", 5, 2);
        Student s6 = new Student("Cristiana", 6, 2);
        babes.addStudent(s1);
        babes.addStudent(s2);
        babes.addStudent(s3);
        babes.addStudent(s4);
        babes.addStudent(s5);
        babes.addStudent(s6);

        // I register  students for classes
        s1.registerForMandatoryClass(c1);
        s1.registerForMandatoryClass(c2);
        s1.registerForOptionalClass(c3);

        s2.registerForMandatoryClass(c3);
        s2.registerForMandatoryClass(c4);

        s3.registerForMandatoryClass(c3);
        s3.registerForMandatoryClass(c4);

        s4.registerForMandatoryClass(c1);
        s4.registerForMandatoryClass(c2);
        s4.registerForMandatoryClass(c3);

        // Create some books
        Book b1 = new Book("C++ for beginners ", "sdfgdf", "Programare");
        Book b2 = new Book("Java", "Sebhjhgjfgjrway", "Programare");
        Book b3 = new Book("C#", "micro press", "Programare");
        Book b4 = new Book("Machine Learing", "ml guy", "Mate");
        babes.addBook(b1);
        babes.addBook(b2);
        babes.addBook(b3);
        babes.addBook(b4);

        // Give books to students
        s1.addBook(b1);
        s1.addBook(b2);
        s2.addBook(b3);
        s2.addBook(b4);
        s3.addBook(b1);
        s3.addBook(b2);
        s3.addBook(b3);
        s3.addBook(b4);
        s4.addBook(b2);
        s4.addBook(b3);


        //variuous q

        // Query the data
        System.out.println("Classes for year 3: ");
        for (Class c : babes.getClassesForYear(1)) {
            System.out.println(c.getName());
        }
        System.out.println("Classes taught by Condor");
        for (Class c : babes.getClassesForProfessor(t1)) {
            System.out.println(c.getName());
        }

        System.out.println("Classes for  Ioana: ");
        for (Class c : babes.getClassesForStudent(s2)) {
            System.out.println(c.getName());
        }
        System.out.println("Books for  Ioana: ");
        for (Book b : babes.getBooksForStudent(s2)) {
            System.out.println(b.getName() );
        }
        System.out.println("Books for year 1: ");
        for (Book b : babes.getBooksForYear(1)) {
            System.out.println(b.getName());
        }
        System.out.println("Books for Programare ");
        for (Book b : babes.getBooksForDiscipline("Programare")) {
            System.out.println(b.getName() + " by " + b.getAuthor());
        }


        // give some homework

        Homework h1 = new Homework("sa se calculeze media a n numere", "Programare");
        Homework h2 = new Homework("sa se faca un design OOP in care sa se foloseasca interfete", "Programare");
        s1.addHomework(h1);
        s1.addHomework(h2);
        s2.addHomework(h1);
        s2.addHomework(h2);
        s3.addHomework(h1);


        System.out.println("Homework for student Ioana");
        for (Homework h : s1.getHomeworks()) {
            System.out.println(h.getDescription());
        }
    }
}
