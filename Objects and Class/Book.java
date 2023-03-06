public class Book {

    int numberOfPages=1203;
    int numberOfWriters=1;
    int edition = 12;
    String author="Herbert Schildt";
    String technicalEditor = "Dr.Danny Coward";
    String title = "Java Complete Reference";

    String color = "white,yellow and orange";
    boolean isRead;


    public Book(int id) {
        int number = id;
        System.out.println("I am an outer class"+number);
    }

    public String getWriter() {
        return this.author;
    }

    public String getTitle() {
        return this.title;
    }

    public String getEditor() {
        return this.technicalEditor;
    }
}
