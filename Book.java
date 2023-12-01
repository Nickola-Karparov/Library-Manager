package BackEnd;

public class Book {

    //region member vars
    private int bookId;
    private int lentToUserID;
    private String name;

    private String author;
    private String Language;
    private String Topic;
    private int length;

    //endregion

    //region constructors

    public Book(){

    }

    public Book(int bookId, String name, String author, String language, String topic, int length) {
        this.bookId = bookId;
        this.name = name;
        this.author = author;
        Language = language;
        Topic = topic;
        this.length = length;
    }


    //endregion

    //region getters and setters
    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public int getLentToUserID() {
        return lentToUserID;
    }

    public void setLentToUserID(int lentToUserID) {
        this.lentToUserID = lentToUserID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getLanguage() {
        return Language;
    }

    public void setLanguage(String language) {
        Language = language;
    }

    public String getTopic() {
        return Topic;
    }

    public void setTopic(String topic) {
        Topic = topic;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }


    //endregion



}
