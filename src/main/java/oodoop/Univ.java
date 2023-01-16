package oodoop;

import java.util.ArrayList;
import java.util.List;

class Univ {
    private List<Class> classes;
    private List<Student> students;
    private List<Teacher> teachers;
    private List<Book> books;


    public Univ() {
        classes = new ArrayList<>();
        students = new ArrayList<>();
        teachers = new ArrayList<>();
        books = new ArrayList<>();
    }

    public void addClass(Class c) {
        classes.add(c);
    }

    public void addStudent(Student s) {
        students.add(s);
    }

    public void addTeacher(Teacher t) {
        teachers.add(t);
    }

    public void addBook(Book b) {
        books.add(b);
    }

    public List<Class> getClassesForYear(int year) {
        List<Class> classesForYear = new ArrayList<>();
        for (Student s : students) {
            if (s.getYearOfStudy() == year) {
                classesForYear.addAll(s.getMandatoryClasses());
                classesForYear.addAll(s.getOptionalClasses());
            }
        }
        return classesForYear;
    }

    public List<Class> getClassesForProfessor(Teacher professor) {
        return professor.getClasses();
    }

    public List<Class> getClassesForStudent(Student student) {
        List<Class> classesForStudent = new ArrayList<>();
        classesForStudent.addAll(student.getMandatoryClasses());
        classesForStudent.addAll(student.getOptionalClasses());
        return classesForStudent;
    }

    public List<Book> getBooksForStudent(Student student) {
        return student.getBooks();
    }

    public List<Book> getBooksForYear(int year) {
        List<Book> booksForYear = new ArrayList<>();
        for (Student s : students) {
            if (s.getYearOfStudy() == year) {
                booksForYear.addAll(s.getBooks());
            }
        }
        return booksForYear;
    }

    public List<Book> getBooksForDiscipline(String discipline) {
        List<Book> booksForDiscipline = new ArrayList<>();
        for (Book b : books) {
            if (b.getDiscipline().equals(discipline)) {
                booksForDiscipline.add(b);
            }
        }
        return booksForDiscipline;
    }
}