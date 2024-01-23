![image](https://github.com/Nickola-Karparov/Library-Manager/assets/149435602/8a0f6964-5cea-4f1b-a174-9b3cfbf99414)## 1. Git 
### Use and understand Git! Play with Branches and undo/revert things = go back in time!
![commit history ](https://github.com/Nickola-Karparov/Library-Manager/commits/final-final/)  

## 2. UML 
### UML at least 3 good different big diagrams. "good" means you can pump it up artificially as written in DDD. You have 10 million $ from me! Please export the pics. I can not install all the tools to view them! Perfect would be 1) one dynamic diagram like an activity diagram 2) one or two static diagrams as component, class or deployment and if needed a use-case diagram.

### Class diagram

![Class diagram](https://github.com/Nickola-Karparov/Library-Manager/blob/final-final/screenshots/UML/class_diagram.png) 

### Component diagram
![component diagram](https://github.com/Nickola-Karparov/Library-Manager/blob/final-final/screenshots/UML/component_diagram.png)

### Activity diagram
![activity diagram](https://github.com/Nickola-Karparov/Library-Manager/blob/final-final/screenshots/UML/activity_diagram.png)

## 3. Requirements Engineering


## 4. Analysis 
### A
![Checklist](https://github.com/Nickola-Karparov/Library-Manager/blob/final-final/screenshots/Business%20checklist)

### B
![Analysis](https://github.com/Nickola-Karparov/Library-Manager/blob/final-final/screenshots/analysis)

## 5. DDD
### Event storming 
![event_storming](https://github.com/Nickola-Karparov/Library-Manager/assets/149435602/3e6f8093-8e62-48fa-a77d-7da0d4ff72e7)

### Core domain chart
![core_domain_chart](https://github.com/Nickola-Karparov/Library-Manager/assets/149435602/37e70e17-679a-4cb0-9dcd-90f162b30509)

### Relationship diagram
![relationship](https://github.com/Nickola-Karparov/Library-Manager/assets/149435602/8cda8cf2-abd9-4fb5-b544-b7e2f7739626)

## 6.Metrics

[![Duplicated Lines (%)](https://sonarcloud.io/api/project_badges/measure?project=Nickola-Karparov_Library-Manager&metric=duplicated_lines_density)](https://sonarcloud.io/summary/new_code?id=Nickola-Karparov_Library-Manager)
[![Code Smells](https://sonarcloud.io/api/project_badges/measure?project=Nickola-Karparov_Library-Manager&metric=code_smells)](https://sonarcloud.io/summary/new_code?id=Nickola-Karparov_Library-Manager)
[![Bugs](https://sonarcloud.io/api/project_badges/measure?project=Nickola-Karparov_Library-Manager&metric=bugs)](https://sonarcloud.io/summary/new_code?id=Nickola-Karparov_Library-Manager)
[![Reliability Rating](https://sonarcloud.io/api/project_badges/measure?project=Nickola-Karparov_Library-Manager&metric=reliability_rating)](https://sonarcloud.io/summary/new_code?id=Nickola-Karparov_Library-Manager)

## 7.Clean Code Development
### A
[CCD_A.pdf](https://github.com/Nickola-Karparov/Library-Manager/files/14026979/CCD_A.pdf)

### B
[CCD_B.pdf](https://github.com/Nickola-Karparov/Library-Manager/files/14026989/CCD_B.pdf)

## 8. Build 
[build_management.pdf](https://github.com/Nickola-Karparov/Library-Manager/files/14027319/build_management.pdf)



---------------------------------
Project idea
Library management console

1.	Introduction
The project consists of a console/application used by librarians to manage users, books and their position on the various bookshelves. 
This is achieved by first creating a model of a library by entering the characteristics of the library and using the 3 object classes which are defined to describe each of the 3 relevant entities, where the state of one depends on the state of the other two. A representation of the program’s structure can be seen in figure 1.


 ![Structure](https://github.com/Nickola-Karparov/Library-Manager/assets/149435602/64d4d4bd-83cd-4821-8f2f-efc00ec9c9a4)

Fig.1 Structure of the program

2.	The main librarian console 
This serves as the user interface with the rest of the program. Librarians can select different options to manipulate the characteristics of objects. 
The following section describes the three different types of interactions, allowed by the console:
2.1	User interactions 
2.1.1	Add User- Registers a new user with their name, unique ID, register of borrowed books, a check if their subscription is paid and whether it is valid. 
2.1.2	Remove user- removes a user from the list of users and returns all books they have borrowed to their respective bookshelves. 

2.2	Book interactions
2.2.1	Display all books
2.2.2	Find book- Displays which bookshelf the book is on, the floor the shelf is located on and the ID of the book.
2.2.3	Lend book to user- assigns a book to a user
2.2.4	Return book- Removes book from the user and returns it to the bookshelf 
2.2.5	Add book- Creates a new instance of the book class and the librarian enters the characteristics of the new instance. 

2.3	Bookshelf interactions 
2.3.1	Find floor- Displays on which floor the bookshelf is located.
2.3.2	Books on shelf- Displays all books located on the selected shelf
2.3.3	Shelf letter- Displays which letter the bookshelf is assigned 
2.4	ID- Displays the IDs of all shelves that are assigned a specified letter

3.	Create library
This is the initialising function for the program. When executed, it prompts the user to enter the characteristics of the library: the initial number of books, users and bookshelves. After creating the starting population of objects, the user can manipulate them with the help of the displayed options. 

