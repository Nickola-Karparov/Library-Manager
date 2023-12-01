package BackEnd;

import java.util.SplittableRandom;

public class Library {

    //region member vars
    private int shelfCount;
    private Shelf [] shelvesArray;

    private int userCount;
    private User [] userArray;

    private int bookCount;
    private Book[] bookArray;
    private int floorCount;
    //endregion

    //region constructors
    public  Library(){

    }

    public Library(int shelfCount, Shelf[] shelvesArray, int userCount, User[] userArray, int bookCount, Book[] bookArray) {
        this.shelfCount = shelfCount;
        this.shelvesArray = shelvesArray;
        this.userCount = userCount;
        this.userArray = userArray;
        this.bookCount = bookCount;
        this.bookArray = bookArray;
    }

    //endregion

    //region getters and setters

    public int getFloorCount() {
        return floorCount;
    }

    public void setFloorCount(int floorCount) {
        this.floorCount = floorCount;
    }
    public int getShelfCount() {
        return shelfCount;
    }

    public void setShelfCount(int shelfCount) {
        this.shelfCount = shelfCount;
    }

    public Shelf[] getShelvesArray() {
        return shelvesArray;
    }

    public void setShelvesArray(Shelf[] shelvesArray) {
        this.shelvesArray = shelvesArray;
    }

    public int getUserCount() {
        return userCount;
    }

    public void setUserCount(int userCount) {
        this.userCount = userCount;
    }

    public User[] getUserArray() {
        return userArray;
    }

    public void setUserArray(User[] userArray) {
        this.userArray = userArray;
    }

    public int getBookCount() {
        return bookCount;
    }

    public void setBookCount(int bookCount) {
        this.bookCount = bookCount;
    }

    public Book[] getBookArray() {
        return bookArray;
    }

    public void setBookArray(Book[] bookArray) {
        this.bookArray = bookArray;
    }



    //endregion

    //region add new shelf

    public void addShelf(String letter,int floor,int id){
        //TODO: finish
    }
    //endregion

    //region misc
    public void shelfCountArrayInitializer(int size){
        //TODO: create initializer
    }
    public void bookCountArrayInitializer(int size){
        //TODO: create initializer
    }
    //endregion

    //region shelf interactions
    //TODO: finish
    public void setShelfFloor(int floor){

    }

    //endregion

    //region book interactions
    public void addBook(String name,String topic ,String author ,String language ,int length){
        //TODO:finish. could add random method for ID
    }

    public void assignBookToShelf(){
        //TODO: finish
    }
    public  String getBookName(){
        return "test";
        //TODO:finish
    }

    public void sortBooks(){
        for (Book book : bookArray) {
            for (Shelf shelf : shelvesArray) {
                String bookName = book.getName();
                String shelfLetter = shelf.getShelfLetter();
                if (bookName.charAt(0) == shelfLetter.charAt(0)) {
                    shelf.addBookToShelf(book);
                    //TODO: needs testing looks a bit too easy
                }
            }
        }
    }


    //endregion

    //region user interactions#
    public void createUser(String userName,boolean SubscriptionValid){

    }

    //endregion

}
