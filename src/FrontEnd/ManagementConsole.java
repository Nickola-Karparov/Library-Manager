package FrontEnd;

import BackEnd.Library;

import java.util.Scanner;

public class ManagementConsole {
    public static void main(String[] args) {
        //Create an instance of the hub class
        Library library=new Library();

        //Create instance of console helper
        ConsoleHelper helper=new ConsoleHelper(library);



        System.out.println("Welcome to Library Manager 10.000! First let's create the library! \n" +
                "First enter the number of floors the library has: ");
       // helper.setNumFloors(floors=scanner.nextInt());
       // System.out.println("Next, enter the number of bookshelves: ");
       // helper.setNumShelves(shelves=scanner.nextInt());
       // System.out.println("Finally, enter the current number of users: ");
       // helper.setNumShelves(users=scanner.nextInt());

//TODO: add create lib + options

    }
}