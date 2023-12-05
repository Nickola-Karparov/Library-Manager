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


FINAL PROJECT SUBMISSION
1. Git
Use and understand Git! Play with Branches and undo/revert things = go back in time!
1)	Merging requests 

2)	Going back in time (reverting to previous state)  


2. UML
UML at least 3 good different big diagrams. "good" means you can pump it up artificially as written in DDD. You have 10 million $ from me! Please export the pics. I can not install all the tools to view them! Perfect would be 1) one dynamic diagram like an activity diagranm 2) one or two static diagrams as component, class or deployment and if needed a use-case diagram.
1)	Component diagram  


2)	Class diagram 
3)	Activity diagram 


3. Requirements Engineering
Describe your project or any project (e.g. one related to your work or a private project) neatly using the methods of Requirements Engineering by mapping some requirements in 2 tools (!).To do this, use the most important description attributes from the script! Approximately 5-10 requirements per tool should be sufficient. Two variants should be provided = tools. A 'self-made' version and a professional = possibly commercial version, i.e. with 2 tools! Examples of 'self-made' variants: Airtable, notion.so, Trello, etc. Examples of commercial tools: Monday, Jira, Doors, ObjectIF, Xebrio, etc. (see Miro). Instead of the professional version, you can also build a tool yourself.
4. Analysis
From all the points in the Analysis learning unit, A) come up with your own checklist (on an extra DIN A4 page) with the points that you consider relevant to your project. B. Carry out an analysis of your semester project/your favourite / start-up idea and would like to submit this analysis as part of a large documentary! Write enough about each point to create at least 2 pages. Assume that you will soon have an angel for the start-up chapter. If successful, you would get a lot of “money” to be able to do the design and implement it later. So get your start-up successfully into the race!
5. DDD
DDD Do a DDD session to find your domains! If your domain is too small, invent other domains around and document these domains (as if you have 100 Mio € from Edlich-Investment!) Develop a clear strategic design with mappings/relationships with >=8 Domains coming from an A) Event Storming. Drop your Domains into a B) Core Domain Chart and draw the C) Relations between the Domains!
6. Metrices
Metrics at least two. Sonarcube would be great. Other non-trivial metrics are also fine.
7. Clean Code Dev
Clean Code Development: A) At least 5 points you can show me with an explanation of why this is clean code in your code and/or what has improved & B) >>10 points on your personal CCD cheat sheet. E.g. a PDF.
8. Build
Build Management with any Build System as Ant, Maven, Gradle, etc. (only Travis is perhaps not enough) Do e.g. generate Docs, call tests, etc. (it could be also disconnected from the project just to learn a build tool!) and CICD
9. UnitTests
Integrate some nice unit tests in your Code to be integrated into the Build
10. IDE
Use a good IDE and get fluent with it: e.g. IntelliJ. What are your favourite key shortcuts?!
1)	For the project I chose IntelliJ community edition and these are my most used shortcuts:
•	Ctrl+f- find in current file;
•	Alt+Enter- show context actions, gives suggestions how fixing errors.
•	CTRL+E- view recent files
•	CTRL+Alt+Shift+L- Reformat file 


11. Functional Programming
prove that you have covered all functional aspects in your code as:
•	only final data structures
•	(mostly) side-effect-free functions
•	the use of higher-order functions
•	functions as parameters and return values
•	use closures / anonymous functions
•	You can also do it outside of your project. Even in other languages such as F#, Clojure, Julia, etc.


