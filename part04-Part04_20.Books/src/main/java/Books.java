public class Books {
    private String title;
    private int pages;
    private int publicationYear;

    public Books(String title, int pages, int publicationYear) {
        this.title = title;
        this.pages = pages;
        this.publicationYear = publicationYear;
    }

    public String getTitle() {
        return this.title;
    }

    public int getPages() {
        return this.pages;
    }

    public int getPublicationYear() {
        return this.publicationYear;
    }

    @Override
    public String toString() {
        return this.title + ", " + this.pages + " pages, " + this.publicationYear;
    }
}
