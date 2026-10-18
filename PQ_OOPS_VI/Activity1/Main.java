import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

abstract class Item {
    private String id;
    private String title;
    private LocalDate publicationDate;
    private int maxCheckoutDays;

    public Item(String id, String title, LocalDate publicationDate, int maxCheckoutDays) {
        this.id = id;
        this.title = title;
        this.publicationDate = publicationDate;
        this.maxCheckoutDays = maxCheckoutDays;
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public LocalDate getPublicationDate() {
        return publicationDate;
    }

    public int getMaxCheckoutDays() {
        return maxCheckoutDays;
    }
}

class Book extends Item {
    private String Author;
    private String Pages;
    private String Genre;

    public Book(String id, String title, LocalDate publicationDate, int maxCheckoutDays, String author, String pages, String genre) {
        super(id, title, publicationDate, maxCheckoutDays);
        this.Author = author;
        this.Pages = pages;
        this.Genre = genre;
    }

    public String getAuthor() {
        return Author;
    }

    public String getPages() {
        return Pages;
    }

    public String getGenre() {
        return Genre;
    }
}

class CD extends Item {
    private String Artist;
    private String Tracks;

    public CD(String id, String title, LocalDate publicationDate, int maxCheckoutDays, String artist, String tracks) {
        super(id, title, publicationDate, maxCheckoutDays);
        this.Artist = artist;
        this.Tracks = tracks;
    }

    public String getArtist() {
        return Artist;
    }

    public String getTracks() {
        return Tracks;
    }
}

class DVD extends Item {
    private String Director;
    private String runningTime;

    public DVD(String id, String title, LocalDate publicationDate, int maxCheckoutDays, String director, String runningTime) {
        super(id, title, publicationDate, maxCheckoutDays);
        this.Director = director;
        this.runningTime = runningTime;
    }

    public String getDirector() {
        return Director;
    }

    public String getRunningTime() {
        return runningTime;
    }
}

class Patron {
    private String name;
    private int id;
    private List<Item> checkedOutItems;

    public Patron(String name, int id) {
        this.name = name;
        this.id = id;
        this.checkedOutItems = new ArrayList<>();
    }

    public void checkOutItem(Item item) {
     if (checkedOutItems.size() < 10) {
            checkedOutItems.add(item);
    }
}

public void returnItem(Item item) {
        checkedOutItems.remove(item);
    }

    public int getNumItemsCheckedOut() {
        return checkedOutItems.size();
    
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public List<Item> getCheckedOutItems() {
        return checkedOutItems;
    }
}

class Main {
    public static void main(String[] args) {
        // Create some items
        Book book1 = new Book("B001", "Harry Potter", LocalDate.of(1925, 4, 10), 14, "J.K. Rowling", "309", "Fiction");
        CD cd1 = new CD("C001", "Billie Jean", LocalDate.of(1982, 11, 30), 7, "Michael Jackson", "9");
        DVD dvd1 = new DVD("D001", "The Dark Knight", LocalDate.of(2010, 7, 16), 7, "Christopher Nolan", "148");

        // Create a patron MR REESE
        Patron MR_REESE = new Patron("MR_REESE", 1234);
        MR_REESE.checkOutItem(book1);
        MR_REESE.checkOutItem(cd1);
        MR_REESE.checkOutItem(dvd1);
        System.out.println("MR_REESE's checked out items:" + MR_REESE.getCheckedOutItems());

        MR_REESE.checkOutItem(dvd1);
        System.out.println("MR_REESE's ITEMS AFRET RETURN:" + MR_REESE.getNumItemsCheckedOut());

        MR_REESE.checkOutItem(cd1);
        System.out.println("MR_REESE's Items afret checking out a cd: " + MR_REESE.getNumItemsCheckedOut());
    }
}

