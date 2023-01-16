package oodoop;

class Book {
    private String name;
    private String author;
    private String discipline;

    public Book(String name, String author, String discipline) {
        this.name = name;
        this.author = author;
        this.discipline = discipline;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public String getDiscipline() {
        return discipline;
    }
}
