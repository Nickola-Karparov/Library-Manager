import CreateLibrary;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        CreateLibrary Create=new CreateLibrary();
        int floors,shelves,users;
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.println("Welcome to Library Manager 10.000! First let's create the library! \n" +
                "First enter the number of floors the library has: ");
        Create.setNumFloors(floors=scanner.nextInt());
        System.out.println("Next, enter the number of bookshelves: ");
        Create.setNumShelves(shelves=scanner.nextInt());
        System.out.println("Finally, enter the current number of users: ");
        Create.setNumShelves(users=scanner.nextInt());

    }
}