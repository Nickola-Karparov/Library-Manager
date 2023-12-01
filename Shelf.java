package BackEnd;

public class Shelf {

    //region member vars
    private int shelfID;
    private int floor;
    private String shelfLetter;
    Book [] bookArray;
    //endregion

    //region constructors

    public Shelf(){

    }

    public Shelf(int shelfID, int floor, String shelfLetter, Book[] bookArray) {
        this.shelfID = shelfID;
        this.floor = floor;
        this.shelfLetter = shelfLetter;
        this.bookArray = bookArray;
    }

    //endregion

    //region getters and setters
    public int getShelfID() {
        return shelfID;
    }

    public void setShelfID(int shelfID) {
        this.shelfID = shelfID;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public String getShelfLetter() {
        return shelfLetter;
    }

    public void setShelfLetter(String shelfLetter) {
        this.shelfLetter = shelfLetter;
    }

    public Book[] getBookArray() {
        return bookArray;
    }

    public void setBookArray(Book[] bookArray) {
        this.bookArray = bookArray;
    }
//endregion

    public void addBookToShelf(Book book){
        //TODO: finish
    }

    public void SortBooks(){
        //TODO: maybe sort books alphabetically
    }
    //region

}
