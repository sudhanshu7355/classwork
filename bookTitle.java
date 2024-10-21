class Book {
    private String title;

    public Book(String S) {
        title = S;
    }

    String getTitle() {
        return title;
    }

    void changeTitle(String S) {
        title = S;
    }
}

public class bookTitle {

    public static void main(String[] args) {
        Book mybook = new Book("sudhanshu");
        System.out.println(mybook.getTitle());  // Correct way to call instance method
        mybook.changeTitle("yadav");
        System.out.println(mybook.getTitle());  // Correct way to call instance method
    }
}