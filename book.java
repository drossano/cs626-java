public class main {
    public static void main(String[] args) {
        Book expanse = new Book( "expanse", "jsa corey", "1234" );

        expanse.displayInfo();


        DigitalBook lotr = new DigitalBook("lotr", "tolkien", "456", "pdf");

        lotr.displayInfo();
        System.out.println(lotr.getFileFormat());
    }
}

class Book {
    private String title;
    private String author;
    private String isbn;

    //Constructor
    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    // Mehod to display book info
    public void displayInfo () {
        System.out.println(title + " by " + author + " - (ISBN: " + isbn + ")"); 
    }

}

class DigitalBook extends Book {
    protected String fileFormat;
    
    public DigitalBook(String title, String author, String isbn, String fileFormat) {
        super(title, author, isbn);
        this.fileFormat = fileFormat;
    }

    public String getFileFormat() {
        return fileFormat;
    }
}