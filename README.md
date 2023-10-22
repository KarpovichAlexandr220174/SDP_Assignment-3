# SDP_Assignment-3
Assignment-3.Karpovich-A.D.
Database Adapter for Java Applications
This project demonstrates the use of the Adapter Pattern to seamlessly integrate a Java application with a simplified database interface. The main components of the project include:

1. Database Interface (Database)
The Database interface outlines the main database operations: insert, update, select, and remove.

2. Java Application Class (JavaApplication)
This class contains methods (saveObject, updateObject, loadObject, deleteObject) representing operations specific to a Java application.

3. Database Runner (DatabaseRunner)
The DatabaseRunner class serves as the entry point for the program. It creates an instance of AdapterJavaToDatabase, an adapter class connecting the database interface and the Java application.

4. Adapter Class (AdapterJavaToDatabase)
The AdapterJavaToDatabase class extends JavaApplication and implements the Database interface. It acts as a bridge between the database operations and the methods defined in the Java application class.

How it Works
The AdapterJavaToDatabase class overrides the database methods by invoking the corresponding methods from the JavaApplication class.
The DatabaseRunner class demonstrates the usage of the adapter by creating an instance of it and calling the database methods.
