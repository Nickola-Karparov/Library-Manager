package FrontEnd;

import BackEnd.Library;

import java.util.Scanner;

public class ConsoleHelper {
    //region member vars

    //Create an instance of the hub class

    Library library = new Library();
    Scanner scanner = new Scanner(System.in);

    private final String[] numbers = {"first", "second", "third", "forth", "fifth", "sixth", "seventh", "eight", "ninth", "tenth",
            "eleventh", "twelfth", "thirteenth", "fourteenth", "fifteenth", "sixteenth", "seventeenth", "eighteenth", "nineteenth", "twentieth"};

    //endregion


    //region constructors
    public ConsoleHelper() {

    }

    public ConsoleHelper(Library library) {
        library = this.library;
    }
    //endregion

    //region helper functions
    public int getInt(String prompt) {
        printMessage(prompt);
        int helper = scanner.nextInt();
        String helper2 = scanner.nextLine();
        return helper;
        //Helps to clear buffer
    }

    public String getStr(String prompt) {
        printMessage(prompt);
        return scanner.nextLine();
    }


    public void printMessage(String prompt) {
        System.out.println(prompt);
    }

//TODO: add functions to print books, shelves, etc.
    //endregion

    //region initial library state

    public void createLibrary() {
        //TODO: Create functions bellow

        //set floor count
        setFloorCount();

        //set shelf count
        setShelfCount();

        //create and populate shelves
        createAndPopulateShelves();

        //set books count
        setBooksCount();

        //create books
        createAndPopulateBooks();

        //assign books to shelves
        assignBooksToShelves();

        //set user count
        setUserCount();

        //create users
        createUsers();
    }

    private void setFloorCount() {
        library.setFloorCount(getInt("How many floors does the library have?"));
    }

    private void setShelfCount() {
        library.setShelfCount(getInt("How many shelves does the library have?"));
        int arrSize = library.getShelfCount();
        library.shelfCountArrayInitializer(arrSize);
    }

    private void createAndPopulateShelves() {
        int shelfCount = library.getShelfCount();
        for (int i = 0; i < shelfCount; i++) {
            String shelfLetter = getStr("Enter the letter of the " + numbers[i] + " shelf: ");
            int shelfFloor = getInt("Select which floor to put the shelf on: ");
            //TODO: can do with try catch

            if (shelfLetter.isEmpty()) {
                while (shelfLetter.isEmpty()) {
                    shelfLetter = getStr("Enter the letter of the " + numbers[i] + " shelf: ");
                }
            } else if (shelfFloor > library.getFloorCount() || shelfFloor < 0) {
                while (shelfFloor > library.getFloorCount() || shelfFloor < 0) {
                    shelfFloor = getInt("Invalid inout. Select floor for the shelf: ");
                }
                library.setShelfFloor(shelfFloor);
            } else {
                library.addShelf(shelfLetter, shelfFloor, i);
            }
        }

    }

    private void setBooksCount() {
        library.setBookCount(getInt("How many books does the library have?"));
        int bookCount = library.getBookCount();
        library.bookCountArrayInitializer(bookCount);
    }

    private void createAndPopulateBooks() {
        int bookCount = library.getBookCount();
        for (int i = 0; i < bookCount; i++) {
            String name = getStr("Enter name of " + numbers[i] + " the book: ");
            String topic = getStr("Enter topic of the book:");
            String author = getStr("Enter author's name:");
            String language = getStr("Enter the language of the book:");
            int length = getInt("Enter the length of the book:");
            //TODO: check if they are empty and add them to library
            //TODO: can do with try catch

            if (name.isEmpty()) {
                while (name.isEmpty()) {
                    name = getStr("Name of the book is empty. Please enter the name: ");
                }
            } else if (topic.isEmpty()) {
                while (topic.isEmpty()) {
                    topic = getStr("Topic of the book is empty. Please enter the topic: ");
                }
            } else if (author.isEmpty()) {
                while (author.isEmpty()) {
                    author = getStr("Name of author is empty. Please enter name of author: ");
                }
            } else if (language.isEmpty()) {
                while (language.isEmpty()) {
                    language = getStr("Language of the book is empty. Please enter the language: ");
                }
            } else if (length < 0) {
                while (length < 0) {
                    length = getInt("Invalid length. Enter length: ");
                }
            } else {
                library.addBook(name, topic, author, language, length);
            }

        }

    }

    private void assignBooksToShelves() {
        library.sortBooks();

    }

    private void setUserCount() {
        library.setUserCount(getInt("How many users does the library currently have?: "));
    }

    private void createUsers() {
        //TODO: finish
        String userName = getStr("What is the name of the user?: ");
        boolean subscriptionValid;
        String helper = getStr("Is the user's subscription valid? (y/n): ");
        if (userName.isEmpty()) {
            while (userName.isEmpty()) {
                userName = getStr("Please enter the name of the user: ");
            }
        }
        if (helper.isEmpty()) {
            while (helper.isEmpty()) {
                helper = getStr("Please enter if the subscription is valid (y/n): ");
            }
        }
        subscriptionValid = helper.equals("y") || helper.equals("Y");

        library.createUser(userName, subscriptionValid);

    }


    //endregion
}
